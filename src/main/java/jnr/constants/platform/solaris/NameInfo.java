// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-20 19:13:11 +0200
package jnr.constants.platform.solaris;
public enum NameInfo implements jnr.constants.Constant {
NI_MAXHOST(1025L),
NI_MAXSERV(32L),
NI_NOFQDN(1L),
NI_NUMERICHOST(2L),
NI_NAMEREQD(4L),
NI_NUMERICSERV(8L),
NI_DGRAM(16L),
NI_WITHSCOPEID(32L);
private final long value;
private NameInfo(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 1025L;

static final class StringTable {
  public static final java.util.Map<NameInfo, String> descriptions = generateTable();
  public static final java.util.Map<NameInfo, String> generateTable() {
    java.util.Map<NameInfo, String> map = new java.util.EnumMap<NameInfo, String>(NameInfo.class);
  map.put(NI_MAXHOST, "NI_MAXHOST");
  map.put(NI_MAXSERV, "NI_MAXSERV");
  map.put(NI_NOFQDN, "NI_NOFQDN");
  map.put(NI_NUMERICHOST, "NI_NUMERICHOST");
  map.put(NI_NAMEREQD, "NI_NAMEREQD");
  map.put(NI_NUMERICSERV, "NI_NUMERICSERV");
  map.put(NI_DGRAM, "NI_DGRAM");
  map.put(NI_WITHSCOPEID, "NI_WITHSCOPEID");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}