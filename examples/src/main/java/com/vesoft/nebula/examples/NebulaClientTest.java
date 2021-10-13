/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.examples;

import com.vesoft.nebula.client.graph.NebulaPoolConfig;
import com.vesoft.nebula.client.graph.data.HostAddress;
import com.vesoft.nebula.client.graph.data.ResultSet;
import com.vesoft.nebula.client.graph.net.NebulaPool;
import com.vesoft.nebula.client.graph.net.Session;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * if test transaction, then config：
 * 1 nicole "begin;INSERT VERTEX test(p1, p2, p3, p4) VALUES \"test01\":(1, 1.2, True,\"test01\")
 * ; INSERT VERTEX test(p1, p2, p3, p4) VALUES \"test02\":(2, 2.2, False, \"test02\");commit;"
 *
 * <p>1 nicole "begin;INSERT VERTEX test(p1, p2, p3, p4) VALUES \"test01\":(1, 1.2, True,
 * \"test01\"); INSERT VERTEX test(p1, p2, p3, p4) VALUES \"test02\":(2, 2.2, False, \"test02\");
 * rollback;"
 *
 * <p>if test transaction's rc, then config:
 * 2 nicole "begin;INSERT VERTEX test(p1, p2, p3, p4) VALUES \"test01\":(1, 1.2, True,
 * \"test01\");commit;" "begin;INSERT VERTEX test(p1, p2, p3, p4) VALUES \"test02\":(2, 2.2,
 * False, \"test02\");commit;" 10000
 */
public class NebulaClientTest {
    private static final Logger log = LoggerFactory.getLogger(NebulaClientTest.class);

    public static void main(String[] args) {
        if (args.length < 3) {
            throw new IllegalArgumentException("argument lost");
        }

        NebulaPool pool = new NebulaPool();
        Session session = null;
        try {
            NebulaPoolConfig nebulaPoolConfig = new NebulaPoolConfig();
            nebulaPoolConfig.setMaxConnSize(100);
            List<HostAddress> addresses = Arrays.asList(new HostAddress("127.0.0.1", 9669),
                    new HostAddress("127.0.0.1", 9670));
            pool.init(addresses, nebulaPoolConfig);
            session = pool.getSession("root", "nebula", false);
        } catch (Exception e) {
            log.error("get graph connection failed, ", e);
        }

        String flag = args[0];
        if (flag.trim().equalsIgnoreCase("1")) {
            String space = args[1].trim();
            String ngql = args[2].trim();
            testTransaction(session, space, ngql);
        }
        if (flag.trim().equalsIgnoreCase("2")) {
            String space = args[1].trim();
            String ngql1 = args[2].trim();
            String ngql2 = args[3].trim();
            String time = args[4].trim();
            testRC(session, space, ngql1, ngql2, Long.parseLong(time));
        }
        System.exit(0);
    }


    public static void testTransaction(Session session, String space, String ngql) {
        try {
            ResultSet switchSpace = session.execute("USE " + space);
            if (!switchSpace.isSucceeded()) {
                log.error("use space failed {}", switchSpace.getErrorMessage());
                return;
            }
        } catch (Exception e) {
            log.error("use space error, ", e);
            return;
        }

        try {
            ResultSet resultSet = session.execute(ngql, true);
            if (resultSet == null) {
                log.info("execute result is SUCCESS.");
            } else {
                if (resultSet.isSucceeded()) {
                    log.info("execute result is SUCCESS");
                } else {
                    log.info("execute result is {}", resultSet.getErrorMessage());
                }
            }
        } catch (Exception e) {
            log.error("failed to execute ngql {}", ngql, e);
        }
    }


    /**
     * test rc
     */
    public static void testRC(Session session, String space, String ngql1, String ngql2,
                              long time) {
        try {
            ResultSet switchSpace = session.execute("USE " + space);
            if (!switchSpace.isSucceeded()) {
                log.error("use space failed {}", switchSpace.getErrorMessage());
                return;
            }
        } catch (Exception e) {
            log.error("use space error, ", e);
            return;
        }

        try {
            ResultSet resultSet = session.execute(ngql1, true);

            if (resultSet == null) {
                log.info("execute result for ngql {} is {}", ngql1, "SUCCESS");
            } else if (resultSet.isSucceeded()) {
                log.info("execute result for ngql {} is {}", ngql1, "SUCCESS");
            } else {
                log.info("execute result for ngql {} is {}", ngql1, resultSet.getErrorMessage());
            }

            Thread.sleep(time);

            ResultSet resultSet1 = session.execute(ngql2, true);
            if (resultSet1 == null) {
                log.info("execute result for ngql {} is {}", ngql2, "SUCCESS");
            } else if (resultSet1.isSucceeded()) {
                log.info("execute result for ngql {} is {}", ngql2, "SUCCESS");
            } else {
                log.info("execute result for ngql {} is {}", ngql2, resultSet1.getErrorMessage());
            }
        } catch (Exception e) {
            log.error("execute failed, ", e);
        }
    }
}
