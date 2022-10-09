// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2019-09-24 00:13:53 +0000
package jnr.constants.platform.dragonflybsd;
public enum SocketOption implements jnr.constants.Constant {
SO_DEBUG(0x1L),
SO_ACCEPTCONN(0x2L),
SO_REUSEADDR(0x4L),
SO_KEEPALIVE(0x8L),
SO_DONTROUTE(0x10L),
SO_BROADCAST(0x20L),
SO_USELOOPBACK(0x40L),
SO_LINGER(0x80L),
SO_OOBINLINE(0x100L),
SO_REUSEPORT(0x200L),
SO_TIMESTAMP(0x400L),
SO_ACCEPTFILTER(0x1000L),
// SO_DONTTRUNC not defined
// SO_WANTMORE not defined
// SO_WANTOOBFLAG not defined
SO_SNDBUF(0x1001L),
SO_RCVBUF(0x1002L),
SO_SNDLOWAT(0x1003L),
SO_RCVLOWAT(0x1004L),
SO_SNDTIMEO(0x1005L),
SO_RCVTIMEO(0x1006L),
SO_ERROR(0x1007L),
SO_TYPE(0x1008L),
// SO_NREAD not defined
// SO_NKE not defined
SO_NOSIGPIPE(0x800L);
// SO_NOADDRERR not defined
// SO_NWRITE not defined
// SO_REUSESHAREUID not defined
// SO_LABEL not defined
// SO_PEERLABEL not defined
// SO_ATTACH_FILTER not defined
// SO_BINDTODEVICE not defined
// SO_DETACH_FILTER not defined
// SO_NO_CHECK not defined
// SO_PASSCRED not defined
// SO_PEERCRED not defined
// SO_PEERNAME not defined
// SO_PRIORITY not defined
// SO_SECURITY_AUTHENTICATION not defined
// SO_SECURITY_ENCRYPTION_NETWORK not defined
// SO_SECURITY_ENCRYPTION_TRANSPORT not defined
private final long value;
private SocketOption(long value) { this.value = value; }
public static final long MIN_VALUE = 0x1L;
public static final long MAX_VALUE = 0x1008L;

static final class StringTable {
  public static final java.util.Map<SocketOption, String> descriptions = generateTable();
  public static final java.util.Map<SocketOption, String> generateTable() {
    java.util.Map<SocketOption, String> map = new java.util.EnumMap<SocketOption, String>(SocketOption.class);
  map.put(SO_DEBUG, "SO_DEBUG");
  map.put(SO_ACCEPTCONN, "SO_ACCEPTCONN");
  map.put(SO_REUSEADDR, "SO_REUSEADDR");
  map.put(SO_KEEPALIVE, "SO_KEEPALIVE");
  map.put(SO_DONTROUTE, "SO_DONTROUTE");
  map.put(SO_BROADCAST, "SO_BROADCAST");
  map.put(SO_USELOOPBACK, "SO_USELOOPBACK");
  map.put(SO_LINGER, "SO_LINGER");
  map.put(SO_OOBINLINE, "SO_OOBINLINE");
  map.put(SO_REUSEPORT, "SO_REUSEPORT");
  map.put(SO_TIMESTAMP, "SO_TIMESTAMP");
  map.put(SO_ACCEPTFILTER, "SO_ACCEPTFILTER");
  map.put(SO_SNDBUF, "SO_SNDBUF");
  map.put(SO_RCVBUF, "SO_RCVBUF");
  map.put(SO_SNDLOWAT, "SO_SNDLOWAT");
  map.put(SO_RCVLOWAT, "SO_RCVLOWAT");
  map.put(SO_SNDTIMEO, "SO_SNDTIMEO");
  map.put(SO_RCVTIMEO, "SO_RCVTIMEO");
  map.put(SO_ERROR, "SO_ERROR");
  map.put(SO_TYPE, "SO_TYPE");
  map.put(SO_NOSIGPIPE, "SO_NOSIGPIPE");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
