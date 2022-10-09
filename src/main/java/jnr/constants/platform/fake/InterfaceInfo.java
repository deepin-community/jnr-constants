// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-03 01:01:56 +0200
package jnr.constants.platform.fake;
public enum InterfaceInfo implements jnr.constants.Constant {
IFF_802_1Q_VLAN(1),
IFF_ALLMULTI(2),
IFF_ALTPHYS(3),
IFF_AUTOMEDIA(4),
IFF_BONDING(5),
IFF_BRIDGE_PORT(6),
IFF_BROADCAST(7),
IFF_CANTCONFIG(8),
IFF_DEBUG(9),
IFF_DISABLE_NETPOLL(10),
IFF_DONT_BRIDGE(11),
IFF_DORMANT(12),
IFF_DRV_OACTIVE(13),
IFF_DRV_RUNNING(14),
IFF_DYING(15),
IFF_DYNAMIC(16),
IFF_EBRIDGE(17),
IFF_ECHO(18),
IFF_ISATAP(19),
IFF_LINK0(20),
IFF_LINK1(21),
IFF_LINK2(22),
IFF_LIVE_ADDR_CHANGE(23),
IFF_LOOPBACK(24),
IFF_LOWER_UP(25),
IFF_MACVLAN_PORT(26),
IFF_MASTER(27),
IFF_MASTER_8023AD(28),
IFF_MASTER_ALB(29),
IFF_MASTER_ARPMON(30),
IFF_MONITOR(31),
IFF_MULTICAST(32),
IFF_NOARP(33),
IFF_NOTRAILERS(34),
IFF_OACTIVE(35),
IFF_OVS_DATAPATH(36),
IFF_POINTOPOINT(37),
IFF_PORTSEL(38),
IFF_PPROMISC(39),
IFF_PROMISC(40),
IFF_RENAMING(41),
IFF_ROUTE(42),
IFF_RUNNING(43),
IFF_SIMPLEX(44),
IFF_SLAVE(45),
IFF_SLAVE_INACTIVE(46),
IFF_SLAVE_NEEDARP(47),
IFF_SMART(48),
IFF_STATICARP(49),
IFF_SUPP_NOFCS(50),
IFF_TEAM_PORT(51),
IFF_TX_SKB_SHARING(52),
IFF_UNICAST_FLT(53),
IFF_UP(54),
IFF_WAN_HDLC(55),
IFF_XMIT_DST_RELEASE(56),
IFF_VOLATILE(57),
IFF_CANTCHANGE(58);
private final long value;
private InterfaceInfo(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 58L;
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}