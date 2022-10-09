// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-03 01:01:40 +0200
package jnr.constants.platform;
public enum InterfaceInfo implements jnr.constants.Constant {
IFF_802_1Q_VLAN,
IFF_ALLMULTI,
IFF_ALTPHYS,
IFF_AUTOMEDIA,
IFF_BONDING,
IFF_BRIDGE_PORT,
IFF_BROADCAST,
IFF_CANTCONFIG,
IFF_DEBUG,
IFF_DISABLE_NETPOLL,
IFF_DONT_BRIDGE,
IFF_DORMANT,
IFF_DRV_OACTIVE,
IFF_DRV_RUNNING,
IFF_DYING,
IFF_DYNAMIC,
IFF_EBRIDGE,
IFF_ECHO,
IFF_ISATAP,
IFF_LINK0,
IFF_LINK1,
IFF_LINK2,
IFF_LIVE_ADDR_CHANGE,
IFF_LOOPBACK,
IFF_LOWER_UP,
IFF_MACVLAN_PORT,
IFF_MASTER,
IFF_MASTER_8023AD,
IFF_MASTER_ALB,
IFF_MASTER_ARPMON,
IFF_MONITOR,
IFF_MULTICAST,
IFF_NOARP,
IFF_NOTRAILERS,
IFF_OACTIVE,
IFF_OVS_DATAPATH,
IFF_POINTOPOINT,
IFF_PORTSEL,
IFF_PPROMISC,
IFF_PROMISC,
IFF_RENAMING,
IFF_ROUTE,
IFF_RUNNING,
IFF_SIMPLEX,
IFF_SLAVE,
IFF_SLAVE_INACTIVE,
IFF_SLAVE_NEEDARP,
IFF_SMART,
IFF_STATICARP,
IFF_SUPP_NOFCS,
IFF_TEAM_PORT,
IFF_TX_SKB_SHARING,
IFF_UNICAST_FLT,
IFF_UP,
IFF_WAN_HDLC,
IFF_XMIT_DST_RELEASE,
IFF_VOLATILE,
IFF_CANTCHANGE,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<InterfaceInfo> resolver = 
ConstantResolver.getResolver(InterfaceInfo.class, 20000, 29999);
public final int value() { return (int) resolver.longValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return resolver.defined(this); }
public final String toString() { return description(); }
public static InterfaceInfo valueOf(long value) { 
    return resolver.valueOf(value);
}
}