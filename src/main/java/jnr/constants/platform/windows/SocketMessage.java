// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-08-29 19:20:40 +0200
package jnr.constants.platform.windows;
public enum SocketMessage implements jnr.constants.Constant {
MSG_OOB(0x1L),
// MSG_DONTWAIT not defined
MSG_PEEK(0x2L),
MSG_DONTROUTE(0x4L),
// MSG_EOR not defined
// MSG_TRUNC not defined
// MSG_CTRUNC not defined
MSG_WAITALL(0x8L);
// MSG_PROXY not defined
// MSG_FIN not defined
// MSG_SYN not defined
// MSG_CONFIRM not defined
// MSG_RST not defined
// MSG_ERRQUEUE not defined
// MSG_NOSIGNAL not defined
// MSG_MORE not defined
// MSG_FASTOPEN not defined
// MSG_EOF not defined
// MSG_FLUSH not defined
// MSG_HOLD not defined
// MSG_SEND not defined
// MSG_HAVEMORE not defined
// MSG_RCVMORE not defined
// MSG_COMPAT not defined
private final long value;
private SocketMessage(long value) { this.value = value; }
public static final long MIN_VALUE = 0x1L;
public static final long MAX_VALUE = 0x8L;

static final class StringTable {
  public static final java.util.Map<SocketMessage, String> descriptions = generateTable();
  public static final java.util.Map<SocketMessage, String> generateTable() {
    java.util.Map<SocketMessage, String> map = new java.util.EnumMap<SocketMessage, String>(SocketMessage.class);
  map.put(MSG_OOB, "MSG_OOB");
  map.put(MSG_PEEK, "MSG_PEEK");
  map.put(MSG_DONTROUTE, "MSG_DONTROUTE");
  map.put(MSG_WAITALL, "MSG_WAITALL");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}