// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-20 11:35:39 -0500
package jnr.constants.platform.darwin;
public enum ProtocolFamily implements jnr.constants.Constant {
PF_UNSPEC(0L),
PF_LOCAL(1L),
PF_UNIX(1L),
PF_INET(2L),
PF_IMPLINK(3L),
PF_PUP(4L),
PF_CHAOS(5L),
PF_NS(6L),
PF_ISO(7L),
PF_OSI(7L),
PF_ECMA(8L),
PF_DATAKIT(9L),
PF_CCITT(10L),
PF_SNA(11L),
PF_DECnet(12L),
PF_DLI(13L),
PF_LAT(14L),
PF_HYLINK(15L),
PF_APPLETALK(16L),
PF_ROUTE(17L),
PF_LINK(18L),
PF_XTP(19L),
PF_COIP(20L),
PF_CNT(21L),
PF_SIP(24L),
PF_IPX(23L),
PF_RTIP(22L),
PF_PIP(25L),
PF_NDRV(27L),
PF_ISDN(28L),
PF_KEY(29L),
PF_INET6(30L),
PF_NATM(31L),
PF_SYSTEM(32L),
PF_NETBIOS(33L),
PF_PPP(34L),
// PF_ATM not defined
// PF_NETGRAPH not defined
PF_MAX(40L);
private final long value;
private ProtocolFamily(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 40L;

static final class StringTable {
  public static final java.util.Map<ProtocolFamily, String> descriptions = generateTable();
  public static final java.util.Map<ProtocolFamily, String> generateTable() {
    java.util.Map<ProtocolFamily, String> map = new java.util.EnumMap<ProtocolFamily, String>(ProtocolFamily.class);
  map.put(PF_UNSPEC, "PF_UNSPEC");
  map.put(PF_LOCAL, "PF_LOCAL");
  map.put(PF_UNIX, "PF_UNIX");
  map.put(PF_INET, "PF_INET");
  map.put(PF_IMPLINK, "PF_IMPLINK");
  map.put(PF_PUP, "PF_PUP");
  map.put(PF_CHAOS, "PF_CHAOS");
  map.put(PF_NS, "PF_NS");
  map.put(PF_ISO, "PF_ISO");
  map.put(PF_OSI, "PF_OSI");
  map.put(PF_ECMA, "PF_ECMA");
  map.put(PF_DATAKIT, "PF_DATAKIT");
  map.put(PF_CCITT, "PF_CCITT");
  map.put(PF_SNA, "PF_SNA");
  map.put(PF_DECnet, "PF_DECnet");
  map.put(PF_DLI, "PF_DLI");
  map.put(PF_LAT, "PF_LAT");
  map.put(PF_HYLINK, "PF_HYLINK");
  map.put(PF_APPLETALK, "PF_APPLETALK");
  map.put(PF_ROUTE, "PF_ROUTE");
  map.put(PF_LINK, "PF_LINK");
  map.put(PF_XTP, "PF_XTP");
  map.put(PF_COIP, "PF_COIP");
  map.put(PF_CNT, "PF_CNT");
  map.put(PF_SIP, "PF_SIP");
  map.put(PF_IPX, "PF_IPX");
  map.put(PF_RTIP, "PF_RTIP");
  map.put(PF_PIP, "PF_PIP");
  map.put(PF_NDRV, "PF_NDRV");
  map.put(PF_ISDN, "PF_ISDN");
  map.put(PF_KEY, "PF_KEY");
  map.put(PF_INET6, "PF_INET6");
  map.put(PF_NATM, "PF_NATM");
  map.put(PF_SYSTEM, "PF_SYSTEM");
  map.put(PF_NETBIOS, "PF_NETBIOS");
  map.put(PF_PPP, "PF_PPP");
  map.put(PF_MAX, "PF_MAX");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
