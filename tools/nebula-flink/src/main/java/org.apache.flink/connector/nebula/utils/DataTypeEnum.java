/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package org.apache.flink.connector.nebula.utils;

public enum DataTypeEnum {
    VERTEX("VERTEX"),

    EDGE("EDGE");

    private String type;

    DataTypeEnum(String type){
        this.type = type;
    }

    public boolean isVertex(){
        if(VERTEX.type.equals(this.type)){
            return true;
        }
        return false;
    }
}
