/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class SetPartitionsStatsRequest implements org.apache.thrift.TBase<SetPartitionsStatsRequest, SetPartitionsStatsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SetPartitionsStatsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SetPartitionsStatsRequest");

  private static final org.apache.thrift.protocol.TField COL_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("colStats", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField NEED_MERGE_FIELD_DESC = new org.apache.thrift.protocol.TField("needMerge", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField WRITE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("writeId", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField VALID_WRITE_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("validWriteIdList", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ENGINE_FIELD_DESC = new org.apache.thrift.protocol.TField("engine", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SetPartitionsStatsRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SetPartitionsStatsRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<ColumnStatistics> colStats; // required
  private boolean needMerge; // optional
  private long writeId; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String validWriteIdList; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String engine; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COL_STATS((short)1, "colStats"),
    NEED_MERGE((short)2, "needMerge"),
    WRITE_ID((short)3, "writeId"),
    VALID_WRITE_ID_LIST((short)4, "validWriteIdList"),
    ENGINE((short)5, "engine");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COL_STATS
          return COL_STATS;
        case 2: // NEED_MERGE
          return NEED_MERGE;
        case 3: // WRITE_ID
          return WRITE_ID;
        case 4: // VALID_WRITE_ID_LIST
          return VALID_WRITE_ID_LIST;
        case 5: // ENGINE
          return ENGINE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NEEDMERGE_ISSET_ID = 0;
  private static final int __WRITEID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NEED_MERGE,_Fields.WRITE_ID,_Fields.VALID_WRITE_ID_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COL_STATS, new org.apache.thrift.meta_data.FieldMetaData("colStats", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnStatistics.class))));
    tmpMap.put(_Fields.NEED_MERGE, new org.apache.thrift.meta_data.FieldMetaData("needMerge", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.WRITE_ID, new org.apache.thrift.meta_data.FieldMetaData("writeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VALID_WRITE_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("validWriteIdList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENGINE, new org.apache.thrift.meta_data.FieldMetaData("engine", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SetPartitionsStatsRequest.class, metaDataMap);
  }

  public SetPartitionsStatsRequest() {
    this.writeId = -1L;

  }

  public SetPartitionsStatsRequest(
    java.util.List<ColumnStatistics> colStats,
    java.lang.String engine)
  {
    this();
    this.colStats = colStats;
    this.engine = engine;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetPartitionsStatsRequest(SetPartitionsStatsRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetColStats()) {
      java.util.List<ColumnStatistics> __this__colStats = new java.util.ArrayList<ColumnStatistics>(other.colStats.size());
      for (ColumnStatistics other_element : other.colStats) {
        __this__colStats.add(new ColumnStatistics(other_element));
      }
      this.colStats = __this__colStats;
    }
    this.needMerge = other.needMerge;
    this.writeId = other.writeId;
    if (other.isSetValidWriteIdList()) {
      this.validWriteIdList = other.validWriteIdList;
    }
    if (other.isSetEngine()) {
      this.engine = other.engine;
    }
  }

  public SetPartitionsStatsRequest deepCopy() {
    return new SetPartitionsStatsRequest(this);
  }

  @Override
  public void clear() {
    this.colStats = null;
    setNeedMergeIsSet(false);
    this.needMerge = false;
    this.writeId = -1L;

    this.validWriteIdList = null;
    this.engine = null;
  }

  public int getColStatsSize() {
    return (this.colStats == null) ? 0 : this.colStats.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<ColumnStatistics> getColStatsIterator() {
    return (this.colStats == null) ? null : this.colStats.iterator();
  }

  public void addToColStats(ColumnStatistics elem) {
    if (this.colStats == null) {
      this.colStats = new java.util.ArrayList<ColumnStatistics>();
    }
    this.colStats.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<ColumnStatistics> getColStats() {
    return this.colStats;
  }

  public void setColStats(@org.apache.thrift.annotation.Nullable java.util.List<ColumnStatistics> colStats) {
    this.colStats = colStats;
  }

  public void unsetColStats() {
    this.colStats = null;
  }

  /** Returns true if field colStats is set (has been assigned a value) and false otherwise */
  public boolean isSetColStats() {
    return this.colStats != null;
  }

  public void setColStatsIsSet(boolean value) {
    if (!value) {
      this.colStats = null;
    }
  }

  public boolean isNeedMerge() {
    return this.needMerge;
  }

  public void setNeedMerge(boolean needMerge) {
    this.needMerge = needMerge;
    setNeedMergeIsSet(true);
  }

  public void unsetNeedMerge() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NEEDMERGE_ISSET_ID);
  }

  /** Returns true if field needMerge is set (has been assigned a value) and false otherwise */
  public boolean isSetNeedMerge() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NEEDMERGE_ISSET_ID);
  }

  public void setNeedMergeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NEEDMERGE_ISSET_ID, value);
  }

  public long getWriteId() {
    return this.writeId;
  }

  public void setWriteId(long writeId) {
    this.writeId = writeId;
    setWriteIdIsSet(true);
  }

  public void unsetWriteId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  /** Returns true if field writeId is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  public void setWriteIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WRITEID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getValidWriteIdList() {
    return this.validWriteIdList;
  }

  public void setValidWriteIdList(@org.apache.thrift.annotation.Nullable java.lang.String validWriteIdList) {
    this.validWriteIdList = validWriteIdList;
  }

  public void unsetValidWriteIdList() {
    this.validWriteIdList = null;
  }

  /** Returns true if field validWriteIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetValidWriteIdList() {
    return this.validWriteIdList != null;
  }

  public void setValidWriteIdListIsSet(boolean value) {
    if (!value) {
      this.validWriteIdList = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getEngine() {
    return this.engine;
  }

  public void setEngine(@org.apache.thrift.annotation.Nullable java.lang.String engine) {
    this.engine = engine;
  }

  public void unsetEngine() {
    this.engine = null;
  }

  /** Returns true if field engine is set (has been assigned a value) and false otherwise */
  public boolean isSetEngine() {
    return this.engine != null;
  }

  public void setEngineIsSet(boolean value) {
    if (!value) {
      this.engine = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COL_STATS:
      if (value == null) {
        unsetColStats();
      } else {
        setColStats((java.util.List<ColumnStatistics>)value);
      }
      break;

    case NEED_MERGE:
      if (value == null) {
        unsetNeedMerge();
      } else {
        setNeedMerge((java.lang.Boolean)value);
      }
      break;

    case WRITE_ID:
      if (value == null) {
        unsetWriteId();
      } else {
        setWriteId((java.lang.Long)value);
      }
      break;

    case VALID_WRITE_ID_LIST:
      if (value == null) {
        unsetValidWriteIdList();
      } else {
        setValidWriteIdList((java.lang.String)value);
      }
      break;

    case ENGINE:
      if (value == null) {
        unsetEngine();
      } else {
        setEngine((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COL_STATS:
      return getColStats();

    case NEED_MERGE:
      return isNeedMerge();

    case WRITE_ID:
      return getWriteId();

    case VALID_WRITE_ID_LIST:
      return getValidWriteIdList();

    case ENGINE:
      return getEngine();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COL_STATS:
      return isSetColStats();
    case NEED_MERGE:
      return isSetNeedMerge();
    case WRITE_ID:
      return isSetWriteId();
    case VALID_WRITE_ID_LIST:
      return isSetValidWriteIdList();
    case ENGINE:
      return isSetEngine();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SetPartitionsStatsRequest)
      return this.equals((SetPartitionsStatsRequest)that);
    return false;
  }

  public boolean equals(SetPartitionsStatsRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_colStats = true && this.isSetColStats();
    boolean that_present_colStats = true && that.isSetColStats();
    if (this_present_colStats || that_present_colStats) {
      if (!(this_present_colStats && that_present_colStats))
        return false;
      if (!this.colStats.equals(that.colStats))
        return false;
    }

    boolean this_present_needMerge = true && this.isSetNeedMerge();
    boolean that_present_needMerge = true && that.isSetNeedMerge();
    if (this_present_needMerge || that_present_needMerge) {
      if (!(this_present_needMerge && that_present_needMerge))
        return false;
      if (this.needMerge != that.needMerge)
        return false;
    }

    boolean this_present_writeId = true && this.isSetWriteId();
    boolean that_present_writeId = true && that.isSetWriteId();
    if (this_present_writeId || that_present_writeId) {
      if (!(this_present_writeId && that_present_writeId))
        return false;
      if (this.writeId != that.writeId)
        return false;
    }

    boolean this_present_validWriteIdList = true && this.isSetValidWriteIdList();
    boolean that_present_validWriteIdList = true && that.isSetValidWriteIdList();
    if (this_present_validWriteIdList || that_present_validWriteIdList) {
      if (!(this_present_validWriteIdList && that_present_validWriteIdList))
        return false;
      if (!this.validWriteIdList.equals(that.validWriteIdList))
        return false;
    }

    boolean this_present_engine = true && this.isSetEngine();
    boolean that_present_engine = true && that.isSetEngine();
    if (this_present_engine || that_present_engine) {
      if (!(this_present_engine && that_present_engine))
        return false;
      if (!this.engine.equals(that.engine))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetColStats()) ? 131071 : 524287);
    if (isSetColStats())
      hashCode = hashCode * 8191 + colStats.hashCode();

    hashCode = hashCode * 8191 + ((isSetNeedMerge()) ? 131071 : 524287);
    if (isSetNeedMerge())
      hashCode = hashCode * 8191 + ((needMerge) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetWriteId()) ? 131071 : 524287);
    if (isSetWriteId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(writeId);

    hashCode = hashCode * 8191 + ((isSetValidWriteIdList()) ? 131071 : 524287);
    if (isSetValidWriteIdList())
      hashCode = hashCode * 8191 + validWriteIdList.hashCode();

    hashCode = hashCode * 8191 + ((isSetEngine()) ? 131071 : 524287);
    if (isSetEngine())
      hashCode = hashCode * 8191 + engine.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SetPartitionsStatsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetColStats()).compareTo(other.isSetColStats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColStats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colStats, other.colStats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNeedMerge()).compareTo(other.isSetNeedMerge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNeedMerge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.needMerge, other.needMerge);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWriteId()).compareTo(other.isSetWriteId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeId, other.writeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetValidWriteIdList()).compareTo(other.isSetValidWriteIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidWriteIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validWriteIdList, other.validWriteIdList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEngine()).compareTo(other.isSetEngine());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEngine()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.engine, other.engine);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SetPartitionsStatsRequest(");
    boolean first = true;

    sb.append("colStats:");
    if (this.colStats == null) {
      sb.append("null");
    } else {
      sb.append(this.colStats);
    }
    first = false;
    if (isSetNeedMerge()) {
      if (!first) sb.append(", ");
      sb.append("needMerge:");
      sb.append(this.needMerge);
      first = false;
    }
    if (isSetWriteId()) {
      if (!first) sb.append(", ");
      sb.append("writeId:");
      sb.append(this.writeId);
      first = false;
    }
    if (isSetValidWriteIdList()) {
      if (!first) sb.append(", ");
      sb.append("validWriteIdList:");
      if (this.validWriteIdList == null) {
        sb.append("null");
      } else {
        sb.append(this.validWriteIdList);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("engine:");
    if (this.engine == null) {
      sb.append("null");
    } else {
      sb.append(this.engine);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetColStats()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'colStats' is unset! Struct:" + toString());
    }

    if (!isSetEngine()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'engine' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SetPartitionsStatsRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SetPartitionsStatsRequestStandardScheme getScheme() {
      return new SetPartitionsStatsRequestStandardScheme();
    }
  }

  private static class SetPartitionsStatsRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<SetPartitionsStatsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SetPartitionsStatsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COL_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list316 = iprot.readListBegin();
                struct.colStats = new java.util.ArrayList<ColumnStatistics>(_list316.size);
                @org.apache.thrift.annotation.Nullable ColumnStatistics _elem317;
                for (int _i318 = 0; _i318 < _list316.size; ++_i318)
                {
                  _elem317 = new ColumnStatistics();
                  _elem317.read(iprot);
                  struct.colStats.add(_elem317);
                }
                iprot.readListEnd();
              }
              struct.setColStatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NEED_MERGE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.needMerge = iprot.readBool();
              struct.setNeedMergeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WRITE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.writeId = iprot.readI64();
              struct.setWriteIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VALID_WRITE_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.validWriteIdList = iprot.readString();
              struct.setValidWriteIdListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ENGINE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.engine = iprot.readString();
              struct.setEngineIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SetPartitionsStatsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.colStats != null) {
        oprot.writeFieldBegin(COL_STATS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.colStats.size()));
          for (ColumnStatistics _iter319 : struct.colStats)
          {
            _iter319.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetNeedMerge()) {
        oprot.writeFieldBegin(NEED_MERGE_FIELD_DESC);
        oprot.writeBool(struct.needMerge);
        oprot.writeFieldEnd();
      }
      if (struct.isSetWriteId()) {
        oprot.writeFieldBegin(WRITE_ID_FIELD_DESC);
        oprot.writeI64(struct.writeId);
        oprot.writeFieldEnd();
      }
      if (struct.validWriteIdList != null) {
        if (struct.isSetValidWriteIdList()) {
          oprot.writeFieldBegin(VALID_WRITE_ID_LIST_FIELD_DESC);
          oprot.writeString(struct.validWriteIdList);
          oprot.writeFieldEnd();
        }
      }
      if (struct.engine != null) {
        oprot.writeFieldBegin(ENGINE_FIELD_DESC);
        oprot.writeString(struct.engine);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetPartitionsStatsRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SetPartitionsStatsRequestTupleScheme getScheme() {
      return new SetPartitionsStatsRequestTupleScheme();
    }
  }

  private static class SetPartitionsStatsRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<SetPartitionsStatsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SetPartitionsStatsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.colStats.size());
        for (ColumnStatistics _iter320 : struct.colStats)
        {
          _iter320.write(oprot);
        }
      }
      oprot.writeString(struct.engine);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNeedMerge()) {
        optionals.set(0);
      }
      if (struct.isSetWriteId()) {
        optionals.set(1);
      }
      if (struct.isSetValidWriteIdList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetNeedMerge()) {
        oprot.writeBool(struct.needMerge);
      }
      if (struct.isSetWriteId()) {
        oprot.writeI64(struct.writeId);
      }
      if (struct.isSetValidWriteIdList()) {
        oprot.writeString(struct.validWriteIdList);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SetPartitionsStatsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list321 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.colStats = new java.util.ArrayList<ColumnStatistics>(_list321.size);
        @org.apache.thrift.annotation.Nullable ColumnStatistics _elem322;
        for (int _i323 = 0; _i323 < _list321.size; ++_i323)
        {
          _elem322 = new ColumnStatistics();
          _elem322.read(iprot);
          struct.colStats.add(_elem322);
        }
      }
      struct.setColStatsIsSet(true);
      struct.engine = iprot.readString();
      struct.setEngineIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.needMerge = iprot.readBool();
        struct.setNeedMergeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.writeId = iprot.readI64();
        struct.setWriteIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.validWriteIdList = iprot.readString();
        struct.setValidWriteIdListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
