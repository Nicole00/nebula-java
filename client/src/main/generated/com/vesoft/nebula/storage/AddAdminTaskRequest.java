/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class AddAdminTaskRequest implements TBase, java.io.Serializable, Cloneable, Comparable<AddAdminTaskRequest> {
  private static final TStruct STRUCT_DESC = new TStruct("AddAdminTaskRequest");
  private static final TField CMD_FIELD_DESC = new TField("cmd", TType.I32, (short)1);
  private static final TField JOB_ID_FIELD_DESC = new TField("job_id", TType.I32, (short)2);
  private static final TField TASK_ID_FIELD_DESC = new TField("task_id", TType.I32, (short)3);
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)4);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.LIST, (short)5);
  private static final TField INDEX_ID_FIELD_DESC = new TField("index_id", TType.I32, (short)6);
  private static final TField DELAY_MS_FIELD_DESC = new TField("delay_ms", TType.I64, (short)7);
  private static final TField CONCURRENT_FIELD_DESC = new TField("concurrent", TType.I32, (short)8);

  /**
   * 
   * @see com.vesoft.nebula.AdminCmd
   */
  public int cmd;
  public int job_id;
  public int task_id;
  public int space_id;
  public List<Integer> parts;
  public int index_id;
  public long delay_ms;
  public int concurrent;
  public static final int CMD = 1;
  public static final int JOB_ID = 2;
  public static final int TASK_ID = 3;
  public static final int SPACE_ID = 4;
  public static final int PARTS = 5;
  public static final int INDEX_ID = 6;
  public static final int DELAY_MS = 7;
  public static final int CONCURRENT = 8;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __CMD_ISSET_ID = 0;
  private static final int __JOB_ID_ISSET_ID = 1;
  private static final int __TASK_ID_ISSET_ID = 2;
  private static final int __SPACE_ID_ISSET_ID = 3;
  private static final int __INDEX_ID_ISSET_ID = 4;
  private static final int __DELAY_MS_ISSET_ID = 5;
  private static final int __CONCURRENT_ISSET_ID = 6;
  private BitSet __isset_bit_vector = new BitSet(7);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(CMD, new FieldMetaData("cmd", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(JOB_ID, new FieldMetaData("job_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(TASK_ID, new FieldMetaData("task_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(INDEX_ID, new FieldMetaData("index_id", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(DELAY_MS, new FieldMetaData("delay_ms", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(CONCURRENT, new FieldMetaData("concurrent", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(AddAdminTaskRequest.class, metaDataMap);
  }

  public AddAdminTaskRequest() {
  }

  public AddAdminTaskRequest(
    int cmd,
    int job_id,
    int task_id,
    int space_id)
  {
    this();
    this.cmd = cmd;
    setCmdIsSet(true);
    this.job_id = job_id;
    setJob_idIsSet(true);
    this.task_id = task_id;
    setTask_idIsSet(true);
    this.space_id = space_id;
    setSpace_idIsSet(true);
  }

  public AddAdminTaskRequest(
    int cmd,
    int job_id,
    int task_id,
    int space_id,
    List<Integer> parts,
    int index_id,
    long delay_ms,
    int concurrent)
  {
    this();
    this.cmd = cmd;
    setCmdIsSet(true);
    this.job_id = job_id;
    setJob_idIsSet(true);
    this.task_id = task_id;
    setTask_idIsSet(true);
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.index_id = index_id;
    setIndex_idIsSet(true);
    this.delay_ms = delay_ms;
    setDelay_msIsSet(true);
    this.concurrent = concurrent;
    setConcurrentIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddAdminTaskRequest(AddAdminTaskRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.cmd = TBaseHelper.deepCopy(other.cmd);
    this.job_id = TBaseHelper.deepCopy(other.job_id);
    this.task_id = TBaseHelper.deepCopy(other.task_id);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    this.index_id = TBaseHelper.deepCopy(other.index_id);
    this.delay_ms = TBaseHelper.deepCopy(other.delay_ms);
    this.concurrent = TBaseHelper.deepCopy(other.concurrent);
  }

  public AddAdminTaskRequest deepCopy() {
    return new AddAdminTaskRequest(this);
  }

  @Deprecated
  public AddAdminTaskRequest clone() {
    return new AddAdminTaskRequest(this);
  }

  /**
   * 
   * @see com.vesoft.nebula.AdminCmd
   */
  public int  getCmd() {
    return this.cmd;
  }

  /**
   * 
   * @see com.vesoft.nebula.AdminCmd
   */
  public AddAdminTaskRequest setCmd(int cmd) {
    this.cmd = cmd;
    setCmdIsSet(true);
    return this;
  }

  public void unsetCmd() {
    __isset_bit_vector.clear(__CMD_ISSET_ID);
  }

  // Returns true if field cmd is set (has been assigned a value) and false otherwise
  public boolean isSetCmd() {
    return __isset_bit_vector.get(__CMD_ISSET_ID);
  }

  public void setCmdIsSet(boolean value) {
    __isset_bit_vector.set(__CMD_ISSET_ID, value);
  }

  public int  getJob_id() {
    return this.job_id;
  }

  public AddAdminTaskRequest setJob_id(int job_id) {
    this.job_id = job_id;
    setJob_idIsSet(true);
    return this;
  }

  public void unsetJob_id() {
    __isset_bit_vector.clear(__JOB_ID_ISSET_ID);
  }

  // Returns true if field job_id is set (has been assigned a value) and false otherwise
  public boolean isSetJob_id() {
    return __isset_bit_vector.get(__JOB_ID_ISSET_ID);
  }

  public void setJob_idIsSet(boolean value) {
    __isset_bit_vector.set(__JOB_ID_ISSET_ID, value);
  }

  public int  getTask_id() {
    return this.task_id;
  }

  public AddAdminTaskRequest setTask_id(int task_id) {
    this.task_id = task_id;
    setTask_idIsSet(true);
    return this;
  }

  public void unsetTask_id() {
    __isset_bit_vector.clear(__TASK_ID_ISSET_ID);
  }

  // Returns true if field task_id is set (has been assigned a value) and false otherwise
  public boolean isSetTask_id() {
    return __isset_bit_vector.get(__TASK_ID_ISSET_ID);
  }

  public void setTask_idIsSet(boolean value) {
    __isset_bit_vector.set(__TASK_ID_ISSET_ID, value);
  }

  public int  getSpace_id() {
    return this.space_id;
  }

  public AddAdminTaskRequest setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, value);
  }

  public List<Integer>  getParts() {
    return this.parts;
  }

  public AddAdminTaskRequest setParts(List<Integer> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean value) {
    if (!value) {
      this.parts = null;
    }
  }

  public int  getIndex_id() {
    return this.index_id;
  }

  public AddAdminTaskRequest setIndex_id(int index_id) {
    this.index_id = index_id;
    setIndex_idIsSet(true);
    return this;
  }

  public void unsetIndex_id() {
    __isset_bit_vector.clear(__INDEX_ID_ISSET_ID);
  }

  // Returns true if field index_id is set (has been assigned a value) and false otherwise
  public boolean isSetIndex_id() {
    return __isset_bit_vector.get(__INDEX_ID_ISSET_ID);
  }

  public void setIndex_idIsSet(boolean value) {
    __isset_bit_vector.set(__INDEX_ID_ISSET_ID, value);
  }

  public long  getDelay_ms() {
    return this.delay_ms;
  }

  public AddAdminTaskRequest setDelay_ms(long delay_ms) {
    this.delay_ms = delay_ms;
    setDelay_msIsSet(true);
    return this;
  }

  public void unsetDelay_ms() {
    __isset_bit_vector.clear(__DELAY_MS_ISSET_ID);
  }

  // Returns true if field delay_ms is set (has been assigned a value) and false otherwise
  public boolean isSetDelay_ms() {
    return __isset_bit_vector.get(__DELAY_MS_ISSET_ID);
  }

  public void setDelay_msIsSet(boolean value) {
    __isset_bit_vector.set(__DELAY_MS_ISSET_ID, value);
  }

  public int  getConcurrent() {
    return this.concurrent;
  }

  public AddAdminTaskRequest setConcurrent(int concurrent) {
    this.concurrent = concurrent;
    setConcurrentIsSet(true);
    return this;
  }

  public void unsetConcurrent() {
    __isset_bit_vector.clear(__CONCURRENT_ISSET_ID);
  }

  // Returns true if field concurrent is set (has been assigned a value) and false otherwise
  public boolean isSetConcurrent() {
    return __isset_bit_vector.get(__CONCURRENT_ISSET_ID);
  }

  public void setConcurrentIsSet(boolean value) {
    __isset_bit_vector.set(__CONCURRENT_ISSET_ID, value);
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case CMD:
      if (value == null) {
        unsetCmd();
      } else {
        setCmd((Integer)value);
      }
      break;

    case JOB_ID:
      if (value == null) {
        unsetJob_id();
      } else {
        setJob_id((Integer)value);
      }
      break;

    case TASK_ID:
      if (value == null) {
        unsetTask_id();
      } else {
        setTask_id((Integer)value);
      }
      break;

    case SPACE_ID:
      if (value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)value);
      }
      break;

    case PARTS:
      if (value == null) {
        unsetParts();
      } else {
        setParts((List<Integer>)value);
      }
      break;

    case INDEX_ID:
      if (value == null) {
        unsetIndex_id();
      } else {
        setIndex_id((Integer)value);
      }
      break;

    case DELAY_MS:
      if (value == null) {
        unsetDelay_ms();
      } else {
        setDelay_ms((Long)value);
      }
      break;

    case CONCURRENT:
      if (value == null) {
        unsetConcurrent();
      } else {
        setConcurrent((Integer)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case CMD:
      return getCmd();

    case JOB_ID:
      return new Integer(getJob_id());

    case TASK_ID:
      return new Integer(getTask_id());

    case SPACE_ID:
      return new Integer(getSpace_id());

    case PARTS:
      return getParts();

    case INDEX_ID:
      return new Integer(getIndex_id());

    case DELAY_MS:
      return new Long(getDelay_ms());

    case CONCURRENT:
      return new Integer(getConcurrent());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case CMD:
      return isSetCmd();
    case JOB_ID:
      return isSetJob_id();
    case TASK_ID:
      return isSetTask_id();
    case SPACE_ID:
      return isSetSpace_id();
    case PARTS:
      return isSetParts();
    case INDEX_ID:
      return isSetIndex_id();
    case DELAY_MS:
      return isSetDelay_ms();
    case CONCURRENT:
      return isSetConcurrent();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddAdminTaskRequest)
      return this.equals((AddAdminTaskRequest)that);
    return false;
  }

  public boolean equals(AddAdminTaskRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cmd = true;
    boolean that_present_cmd = true;
    if (this_present_cmd || that_present_cmd) {
      if (!(this_present_cmd && that_present_cmd))
        return false;
      if (!TBaseHelper.equalsNobinary(this.cmd, that.cmd))
        return false;
    }

    boolean this_present_job_id = true;
    boolean that_present_job_id = true;
    if (this_present_job_id || that_present_job_id) {
      if (!(this_present_job_id && that_present_job_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.job_id, that.job_id))
        return false;
    }

    boolean this_present_task_id = true;
    boolean that_present_task_id = true;
    if (this_present_task_id || that_present_task_id) {
      if (!(this_present_task_id && that_present_task_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.task_id, that.task_id))
        return false;
    }

    boolean this_present_space_id = true;
    boolean that_present_space_id = true;
    if (this_present_space_id || that_present_space_id) {
      if (!(this_present_space_id && that_present_space_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id))
        return false;
    }

    boolean this_present_parts = true && this.isSetParts();
    boolean that_present_parts = true && that.isSetParts();
    if (this_present_parts || that_present_parts) {
      if (!(this_present_parts && that_present_parts))
        return false;
      if (!TBaseHelper.equalsNobinary(this.parts, that.parts))
        return false;
    }

    boolean this_present_index_id = true && this.isSetIndex_id();
    boolean that_present_index_id = true && that.isSetIndex_id();
    if (this_present_index_id || that_present_index_id) {
      if (!(this_present_index_id && that_present_index_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.index_id, that.index_id))
        return false;
    }

    boolean this_present_delay_ms = true && this.isSetDelay_ms();
    boolean that_present_delay_ms = true && that.isSetDelay_ms();
    if (this_present_delay_ms || that_present_delay_ms) {
      if (!(this_present_delay_ms && that_present_delay_ms))
        return false;
      if (!TBaseHelper.equalsNobinary(this.delay_ms, that.delay_ms))
        return false;
    }

    boolean this_present_concurrent = true && this.isSetConcurrent();
    boolean that_present_concurrent = true && that.isSetConcurrent();
    if (this_present_concurrent || that_present_concurrent) {
      if (!(this_present_concurrent && that_present_concurrent))
        return false;
      if (!TBaseHelper.equalsNobinary(this.concurrent, that.concurrent))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_cmd = true;
    builder.append(present_cmd);
    if (present_cmd)
      builder.append(cmd);

    boolean present_job_id = true;
    builder.append(present_job_id);
    if (present_job_id)
      builder.append(job_id);

    boolean present_task_id = true;
    builder.append(present_task_id);
    if (present_task_id)
      builder.append(task_id);

    boolean present_space_id = true;
    builder.append(present_space_id);
    if (present_space_id)
      builder.append(space_id);

    boolean present_parts = true && (isSetParts());
    builder.append(present_parts);
    if (present_parts)
      builder.append(parts);

    boolean present_index_id = true && (isSetIndex_id());
    builder.append(present_index_id);
    if (present_index_id)
      builder.append(index_id);

    boolean present_delay_ms = true && (isSetDelay_ms());
    builder.append(present_delay_ms);
    if (present_delay_ms)
      builder.append(delay_ms);

    boolean present_concurrent = true && (isSetConcurrent());
    builder.append(present_concurrent);
    if (present_concurrent)
      builder.append(concurrent);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(AddAdminTaskRequest other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCmd()).compareTo(other.isSetCmd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(cmd, other.cmd);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetJob_id()).compareTo(other.isSetJob_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(job_id, other.job_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetTask_id()).compareTo(other.isSetTask_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(task_id, other.task_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSpace_id()).compareTo(other.isSetSpace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_id, other.space_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetParts()).compareTo(other.isSetParts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(parts, other.parts);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetIndex_id()).compareTo(other.isSetIndex_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(index_id, other.index_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDelay_ms()).compareTo(other.isSetDelay_ms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(delay_ms, other.delay_ms);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetConcurrent()).compareTo(other.isSetConcurrent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(concurrent, other.concurrent);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case CMD:
          if (field.type == TType.I32) {
            this.cmd = iprot.readI32();
            setCmdIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case JOB_ID:
          if (field.type == TType.I32) {
            this.job_id = iprot.readI32();
            setJob_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TASK_ID:
          if (field.type == TType.I32) {
            this.task_id = iprot.readI32();
            setTask_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SPACE_ID:
          if (field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PARTS:
          if (field.type == TType.LIST) {
            {
              TList _list240 = iprot.readListBegin();
              this.parts = new ArrayList<Integer>(Math.max(0, _list240.size));
              for (int _i241 = 0; 
                   (_list240.size < 0) ? iprot.peekList() : (_i241 < _list240.size); 
                   ++_i241)
              {
                int _elem242;
                _elem242 = iprot.readI32();
                this.parts.add(_elem242);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case INDEX_ID:
          if (field.type == TType.I32) {
            this.index_id = iprot.readI32();
            setIndex_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DELAY_MS:
          if (field.type == TType.I64) {
            this.delay_ms = iprot.readI64();
            setDelay_msIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CONCURRENT:
          if (field.type == TType.I32) {
            this.concurrent = iprot.readI32();
            setConcurrentIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(CMD_FIELD_DESC);
    oprot.writeI32(this.cmd);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
    oprot.writeI32(this.job_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
    oprot.writeI32(this.task_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      if (isSetParts()) {
        oprot.writeFieldBegin(PARTS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.parts.size()));
          for (int _iter243 : this.parts)          {
            oprot.writeI32(_iter243);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (isSetIndex_id()) {
      oprot.writeFieldBegin(INDEX_ID_FIELD_DESC);
      oprot.writeI32(this.index_id);
      oprot.writeFieldEnd();
    }
    if (isSetDelay_ms()) {
      oprot.writeFieldBegin(DELAY_MS_FIELD_DESC);
      oprot.writeI64(this.delay_ms);
      oprot.writeFieldEnd();
    }
    if (isSetConcurrent()) {
      oprot.writeFieldBegin(CONCURRENT_FIELD_DESC);
      oprot.writeI32(this.concurrent);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("AddAdminTaskRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("cmd");
    sb.append(space);
    sb.append(":").append(space);
    String cmd_name = com.vesoft.nebula.AdminCmd.VALUES_TO_NAMES.get(this. getCmd());
    if (cmd_name != null) {
      sb.append(cmd_name);
      sb.append(" (");
    }
    sb.append(this. getCmd());
    if (cmd_name != null) {
      sb.append(")");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("job_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getJob_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("task_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getTask_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (isSetParts())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("parts");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getParts() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getParts(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetIndex_id())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("index_id");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getIndex_id(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetDelay_ms())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("delay_ms");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getDelay_ms(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetConcurrent())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("concurrent");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getConcurrent(), indent + 1, prettyPrint));
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCmd() && !com.vesoft.nebula.AdminCmd.VALID_VALUES.contains(cmd)){
      throw new TProtocolException("The field 'cmd' has been assigned the invalid value " + cmd);
    }
  }

}

