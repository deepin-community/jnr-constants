// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-08-29 18:42:18 +0200
package jnr.constants.platform.fake;
public enum TCP implements jnr.constants.Constant {
TCP_MAX_SACK(1),
TCP_MSS(2),
TCP_MINMSS(3),
TCP_MINMSSOVERLOAD(4),
TCP_MAXWIN(5),
TCP_MAX_WINSHIFT(6),
TCP_MAXBURST(7),
TCP_MAXHLEN(8),
TCP_MAXOLEN(9),
TCP_NODELAY(10),
TCP_MAXSEG(11),
TCP_NOPUSH(12),
TCP_NOOPT(13),
TCP_KEEPALIVE(14),
TCP_NSTATES(15),
TCP_RETRANSHZ(16),
TCP_CORK(17),
TCP_DEFER_ACCEPT(18),
TCP_INFO(19),
TCP_KEEPCNT(20),
TCP_KEEPIDLE(21),
TCP_KEEPINTVL(22),
TCP_LINGER2(23),
TCP_MD5SIG(24),
TCP_QUICKACK(25),
TCP_SYNCNT(26),
TCP_WINDOW_CLAMP(27),
TCP_FASTOPEN(28),
TCP_CONGESTION(29),
TCP_COOKIE_TRANSACTIONS(30),
TCP_QUEUE_SEQ(31),
TCP_REPAIR(32),
TCP_REPAIR_OPTIONS(33),
TCP_REPAIR_QUEUE(34),
TCP_THIN_DUPACK(35),
TCP_THIN_LINEAR_TIMEOUTS(36),
TCP_TIMESTAMP(37),
TCP_USER_TIMEOUT(38);
private final long value;
private TCP(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 38L;
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}