// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-03 01:01:41 +0200
package jnr.constants.platform;
public enum IPv6 implements jnr.constants.Constant {
IPV6_JOIN_GROUP,
IPV6_LEAVE_GROUP,
IPV6_MULTICAST_HOPS,
IPV6_MULTICAST_IF,
IPV6_MULTICAST_LOOP,
IPV6_UNICAST_HOPS,
IPV6_V6ONLY,
IPV6_CHECKSUM,
IPV6_DONTFRAG,
IPV6_DSTOPTS,
IPV6_HOPLIMIT,
IPV6_HOPOPTS,
IPV6_NEXTHOP,
IPV6_PATHMTU,
IPV6_PKTINFO,
IPV6_RECVDSTOPTS,
IPV6_RECVHOPLIMIT,
IPV6_RECVHOPOPTS,
IPV6_RECVPKTINFO,
IPV6_RECVRTHDR,
IPV6_RECVTCLASS,
IPV6_RTHDR,
IPV6_RTHDRDSTOPTS,
IPV6_RTHDR_TYPE_0,
IPV6_RECVPATHMTU,
IPV6_TCLASS,
IPV6_USE_MIN_MTU,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<IPv6> resolver = 
ConstantResolver.getResolver(IPv6.class, 20000, 29999);
public final int value() { return (int) resolver.longValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return resolver.defined(this); }
public final String toString() { return description(); }
public static IPv6 valueOf(long value) { 
    return resolver.valueOf(value);
}
}
