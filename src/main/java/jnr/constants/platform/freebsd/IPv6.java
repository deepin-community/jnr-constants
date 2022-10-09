// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-19 00:15:33 +0000
package jnr.constants.platform.freebsd;
public enum IPv6 implements jnr.constants.Constant {
IPV6_JOIN_GROUP(12L),
IPV6_LEAVE_GROUP(13L),
IPV6_MULTICAST_HOPS(10L),
IPV6_MULTICAST_IF(9L),
IPV6_MULTICAST_LOOP(11L),
IPV6_UNICAST_HOPS(4L),
IPV6_V6ONLY(27L),
IPV6_CHECKSUM(26L),
IPV6_DONTFRAG(62L),
IPV6_DSTOPTS(50L),
IPV6_HOPLIMIT(47L),
IPV6_HOPOPTS(49L),
IPV6_NEXTHOP(48L),
IPV6_PATHMTU(44L),
IPV6_PKTINFO(46L),
IPV6_RECVDSTOPTS(40L),
IPV6_RECVHOPLIMIT(37L),
IPV6_RECVHOPOPTS(39L),
IPV6_RECVPKTINFO(36L),
IPV6_RECVRTHDR(38L),
IPV6_RECVTCLASS(57L),
IPV6_RTHDR(51L),
IPV6_RTHDRDSTOPTS(35L),
IPV6_RTHDR_TYPE_0(0L),
IPV6_RECVPATHMTU(43L),
IPV6_TCLASS(61L),
IPV6_USE_MIN_MTU(42L);
private final long value;
private IPv6(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 62L;

static final class StringTable {
  public static final java.util.Map<IPv6, String> descriptions = generateTable();
  public static final java.util.Map<IPv6, String> generateTable() {
    java.util.Map<IPv6, String> map = new java.util.EnumMap<IPv6, String>(IPv6.class);
  map.put(IPV6_JOIN_GROUP, "IPV6_JOIN_GROUP");
  map.put(IPV6_LEAVE_GROUP, "IPV6_LEAVE_GROUP");
  map.put(IPV6_MULTICAST_HOPS, "IPV6_MULTICAST_HOPS");
  map.put(IPV6_MULTICAST_IF, "IPV6_MULTICAST_IF");
  map.put(IPV6_MULTICAST_LOOP, "IPV6_MULTICAST_LOOP");
  map.put(IPV6_UNICAST_HOPS, "IPV6_UNICAST_HOPS");
  map.put(IPV6_V6ONLY, "IPV6_V6ONLY");
  map.put(IPV6_CHECKSUM, "IPV6_CHECKSUM");
  map.put(IPV6_DONTFRAG, "IPV6_DONTFRAG");
  map.put(IPV6_DSTOPTS, "IPV6_DSTOPTS");
  map.put(IPV6_HOPLIMIT, "IPV6_HOPLIMIT");
  map.put(IPV6_HOPOPTS, "IPV6_HOPOPTS");
  map.put(IPV6_NEXTHOP, "IPV6_NEXTHOP");
  map.put(IPV6_PATHMTU, "IPV6_PATHMTU");
  map.put(IPV6_PKTINFO, "IPV6_PKTINFO");
  map.put(IPV6_RECVDSTOPTS, "IPV6_RECVDSTOPTS");
  map.put(IPV6_RECVHOPLIMIT, "IPV6_RECVHOPLIMIT");
  map.put(IPV6_RECVHOPOPTS, "IPV6_RECVHOPOPTS");
  map.put(IPV6_RECVPKTINFO, "IPV6_RECVPKTINFO");
  map.put(IPV6_RECVRTHDR, "IPV6_RECVRTHDR");
  map.put(IPV6_RECVTCLASS, "IPV6_RECVTCLASS");
  map.put(IPV6_RTHDR, "IPV6_RTHDR");
  map.put(IPV6_RTHDRDSTOPTS, "IPV6_RTHDRDSTOPTS");
  map.put(IPV6_RTHDR_TYPE_0, "IPV6_RTHDR_TYPE_0");
  map.put(IPV6_RECVPATHMTU, "IPV6_RECVPATHMTU");
  map.put(IPV6_TCLASS, "IPV6_TCLASS");
  map.put(IPV6_USE_MIN_MTU, "IPV6_USE_MIN_MTU");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
