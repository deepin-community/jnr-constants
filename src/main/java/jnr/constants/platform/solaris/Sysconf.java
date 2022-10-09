// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-20 19:13:07 +0200
package jnr.constants.platform.solaris;
public enum Sysconf implements jnr.constants.Constant {
_SC_ARG_MAX(1L),
_SC_CHILD_MAX(2L),
_SC_CLK_TCK(3L),
_SC_NGROUPS_MAX(4L),
_SC_OPEN_MAX(5L),
_SC_JOB_CONTROL(6L),
_SC_SAVED_IDS(7L),
_SC_VERSION(8L),
_SC_BC_BASE_MAX(54L),
_SC_BC_DIM_MAX(55L),
_SC_BC_SCALE_MAX(56L),
_SC_BC_STRING_MAX(57L),
_SC_COLL_WEIGHTS_MAX(58L),
_SC_EXPR_NEST_MAX(59L),
_SC_LINE_MAX(60L),
_SC_RE_DUP_MAX(61L),
_SC_2_VERSION(53L),
_SC_2_C_BIND(45L),
_SC_2_C_DEV(46L),
_SC_2_CHAR_TERM(66L),
_SC_2_FORT_DEV(48L),
_SC_2_FORT_RUN(49L),
_SC_2_LOCALEDEF(50L),
_SC_2_SW_DEV(51L),
_SC_2_UPE(52L),
_SC_STREAM_MAX(16L),
_SC_TZNAME_MAX(17L),
_SC_ASYNCHRONOUS_IO(21L),
_SC_PAGESIZE(11L),
_SC_MEMLOCK(25L),
_SC_MEMLOCK_RANGE(26L),
_SC_MEMORY_PROTECTION(27L),
_SC_MESSAGE_PASSING(28L),
_SC_PRIORITIZED_IO(31L),
_SC_PRIORITY_SCHEDULING(32L),
_SC_REALTIME_SIGNALS(33L),
_SC_SEMAPHORES(35L),
_SC_FSYNC(23L),
_SC_SHARED_MEMORY_OBJECTS(38L),
_SC_SYNCHRONIZED_IO(42L),
_SC_TIMERS(43L),
_SC_AIO_LISTIO_MAX(18L),
_SC_AIO_MAX(19L),
_SC_AIO_PRIO_DELTA_MAX(20L),
_SC_DELAYTIMER_MAX(22L),
_SC_MQ_OPEN_MAX(29L),
_SC_MAPPED_FILES(24L),
_SC_RTSIG_MAX(34L),
_SC_SEM_NSEMS_MAX(36L),
_SC_SEM_VALUE_MAX(37L),
_SC_SIGQUEUE_MAX(39L),
_SC_TIMER_MAX(44L),
_SC_NPROCESSORS_CONF(14L),
_SC_NPROCESSORS_ONLN(15L),
_SC_2_PBS(724L),
_SC_2_PBS_ACCOUNTING(725L),
_SC_2_PBS_CHECKPOINT(726L),
_SC_2_PBS_LOCATE(728L),
_SC_2_PBS_MESSAGE(729L),
_SC_2_PBS_TRACK(730L),
_SC_ADVISORY_INFO(731L),
_SC_BARRIERS(732L),
_SC_CLOCK_SELECTION(733L),
_SC_CPUTIME(734L),
// _SC_FILE_LOCKING not defined
_SC_GETGR_R_SIZE_MAX(569L),
_SC_GETPW_R_SIZE_MAX(570L),
_SC_HOST_NAME_MAX(735L),
_SC_LOGIN_NAME_MAX(571L),
_SC_MONOTONIC_CLOCK(736L),
_SC_MQ_PRIO_MAX(30L),
_SC_READER_WRITER_LOCKS(737L),
_SC_REGEXP(738L),
_SC_SHELL(739L),
_SC_SPAWN(740L),
_SC_SPIN_LOCKS(741L),
_SC_SPORADIC_SERVER(742L),
_SC_THREAD_ATTR_STACKADDR(577L),
_SC_THREAD_ATTR_STACKSIZE(578L),
_SC_THREAD_CPUTIME(745L),
_SC_THREAD_DESTRUCTOR_ITERATIONS(568L),
_SC_THREAD_KEYS_MAX(572L),
_SC_THREAD_PRIO_INHERIT(580L),
_SC_THREAD_PRIO_PROTECT(581L),
_SC_THREAD_PRIORITY_SCHEDULING(579L),
_SC_THREAD_PROCESS_SHARED(582L),
_SC_THREAD_SAFE_FUNCTIONS(583L),
_SC_THREAD_SPORADIC_SERVER(746L),
_SC_THREAD_STACK_MIN(573L),
_SC_THREAD_THREADS_MAX(574L),
_SC_TIMEOUTS(747L),
_SC_THREADS(576L),
_SC_TRACE(748L),
_SC_TRACE_EVENT_FILTER(749L),
_SC_TRACE_INHERIT(751L),
_SC_TRACE_LOG(752L),
_SC_TTY_NAME_MAX(575L),
_SC_TYPED_MEMORY_OBJECTS(756L),
_SC_V6_ILP32_OFF32(757L),
_SC_V6_ILP32_OFFBIG(758L),
_SC_V6_LP64_OFF64(759L),
_SC_V6_LPBIG_OFFBIG(760L),
_SC_IPV6(762L),
_SC_RAW_SOCKETS(763L),
_SC_SYMLOOP_MAX(744L),
_SC_ATEXIT_MAX(76L),
_SC_IOV_MAX(77L),
_SC_PAGE_SIZE(11L),
_SC_XOPEN_CRYPT(62L),
_SC_XOPEN_ENH_I18N(63L),
_SC_XOPEN_LEGACY(717L),
_SC_XOPEN_REALTIME(718L),
_SC_XOPEN_REALTIME_THREADS(719L),
_SC_XOPEN_SHM(64L),
_SC_XOPEN_STREAMS(761L),
_SC_XOPEN_UNIX(78L),
_SC_XOPEN_VERSION(12L),
_SC_XOPEN_XCU_VERSION(67L),
_SC_XBS5_ILP32_OFF32(720L),
_SC_XBS5_ILP32_OFFBIG(721L),
_SC_XBS5_LP64_OFF64(722L),
_SC_XBS5_LPBIG_OFFBIG(723L),
_SC_SS_REPL_MAX(743L),
_SC_TRACE_EVENT_NAME_MAX(750L),
_SC_TRACE_NAME_MAX(753L),
_SC_TRACE_SYS_MAX(754L),
_SC_TRACE_USER_EVENT_MAX(755L),
_SC_PASS_MAX(9L);
private final long value;
private Sysconf(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 763L;

static final class StringTable {
  public static final java.util.Map<Sysconf, String> descriptions = generateTable();
  public static final java.util.Map<Sysconf, String> generateTable() {
    java.util.Map<Sysconf, String> map = new java.util.EnumMap<Sysconf, String>(Sysconf.class);
  map.put(_SC_ARG_MAX, "_SC_ARG_MAX");
  map.put(_SC_CHILD_MAX, "_SC_CHILD_MAX");
  map.put(_SC_CLK_TCK, "_SC_CLK_TCK");
  map.put(_SC_NGROUPS_MAX, "_SC_NGROUPS_MAX");
  map.put(_SC_OPEN_MAX, "_SC_OPEN_MAX");
  map.put(_SC_JOB_CONTROL, "_SC_JOB_CONTROL");
  map.put(_SC_SAVED_IDS, "_SC_SAVED_IDS");
  map.put(_SC_VERSION, "_SC_VERSION");
  map.put(_SC_BC_BASE_MAX, "_SC_BC_BASE_MAX");
  map.put(_SC_BC_DIM_MAX, "_SC_BC_DIM_MAX");
  map.put(_SC_BC_SCALE_MAX, "_SC_BC_SCALE_MAX");
  map.put(_SC_BC_STRING_MAX, "_SC_BC_STRING_MAX");
  map.put(_SC_COLL_WEIGHTS_MAX, "_SC_COLL_WEIGHTS_MAX");
  map.put(_SC_EXPR_NEST_MAX, "_SC_EXPR_NEST_MAX");
  map.put(_SC_LINE_MAX, "_SC_LINE_MAX");
  map.put(_SC_RE_DUP_MAX, "_SC_RE_DUP_MAX");
  map.put(_SC_2_VERSION, "_SC_2_VERSION");
  map.put(_SC_2_C_BIND, "_SC_2_C_BIND");
  map.put(_SC_2_C_DEV, "_SC_2_C_DEV");
  map.put(_SC_2_CHAR_TERM, "_SC_2_CHAR_TERM");
  map.put(_SC_2_FORT_DEV, "_SC_2_FORT_DEV");
  map.put(_SC_2_FORT_RUN, "_SC_2_FORT_RUN");
  map.put(_SC_2_LOCALEDEF, "_SC_2_LOCALEDEF");
  map.put(_SC_2_SW_DEV, "_SC_2_SW_DEV");
  map.put(_SC_2_UPE, "_SC_2_UPE");
  map.put(_SC_STREAM_MAX, "_SC_STREAM_MAX");
  map.put(_SC_TZNAME_MAX, "_SC_TZNAME_MAX");
  map.put(_SC_ASYNCHRONOUS_IO, "_SC_ASYNCHRONOUS_IO");
  map.put(_SC_PAGESIZE, "_SC_PAGESIZE");
  map.put(_SC_MEMLOCK, "_SC_MEMLOCK");
  map.put(_SC_MEMLOCK_RANGE, "_SC_MEMLOCK_RANGE");
  map.put(_SC_MEMORY_PROTECTION, "_SC_MEMORY_PROTECTION");
  map.put(_SC_MESSAGE_PASSING, "_SC_MESSAGE_PASSING");
  map.put(_SC_PRIORITIZED_IO, "_SC_PRIORITIZED_IO");
  map.put(_SC_PRIORITY_SCHEDULING, "_SC_PRIORITY_SCHEDULING");
  map.put(_SC_REALTIME_SIGNALS, "_SC_REALTIME_SIGNALS");
  map.put(_SC_SEMAPHORES, "_SC_SEMAPHORES");
  map.put(_SC_FSYNC, "_SC_FSYNC");
  map.put(_SC_SHARED_MEMORY_OBJECTS, "_SC_SHARED_MEMORY_OBJECTS");
  map.put(_SC_SYNCHRONIZED_IO, "_SC_SYNCHRONIZED_IO");
  map.put(_SC_TIMERS, "_SC_TIMERS");
  map.put(_SC_AIO_LISTIO_MAX, "_SC_AIO_LISTIO_MAX");
  map.put(_SC_AIO_MAX, "_SC_AIO_MAX");
  map.put(_SC_AIO_PRIO_DELTA_MAX, "_SC_AIO_PRIO_DELTA_MAX");
  map.put(_SC_DELAYTIMER_MAX, "_SC_DELAYTIMER_MAX");
  map.put(_SC_MQ_OPEN_MAX, "_SC_MQ_OPEN_MAX");
  map.put(_SC_MAPPED_FILES, "_SC_MAPPED_FILES");
  map.put(_SC_RTSIG_MAX, "_SC_RTSIG_MAX");
  map.put(_SC_SEM_NSEMS_MAX, "_SC_SEM_NSEMS_MAX");
  map.put(_SC_SEM_VALUE_MAX, "_SC_SEM_VALUE_MAX");
  map.put(_SC_SIGQUEUE_MAX, "_SC_SIGQUEUE_MAX");
  map.put(_SC_TIMER_MAX, "_SC_TIMER_MAX");
  map.put(_SC_NPROCESSORS_CONF, "_SC_NPROCESSORS_CONF");
  map.put(_SC_NPROCESSORS_ONLN, "_SC_NPROCESSORS_ONLN");
  map.put(_SC_2_PBS, "_SC_2_PBS");
  map.put(_SC_2_PBS_ACCOUNTING, "_SC_2_PBS_ACCOUNTING");
  map.put(_SC_2_PBS_CHECKPOINT, "_SC_2_PBS_CHECKPOINT");
  map.put(_SC_2_PBS_LOCATE, "_SC_2_PBS_LOCATE");
  map.put(_SC_2_PBS_MESSAGE, "_SC_2_PBS_MESSAGE");
  map.put(_SC_2_PBS_TRACK, "_SC_2_PBS_TRACK");
  map.put(_SC_ADVISORY_INFO, "_SC_ADVISORY_INFO");
  map.put(_SC_BARRIERS, "_SC_BARRIERS");
  map.put(_SC_CLOCK_SELECTION, "_SC_CLOCK_SELECTION");
  map.put(_SC_CPUTIME, "_SC_CPUTIME");
  map.put(_SC_GETGR_R_SIZE_MAX, "_SC_GETGR_R_SIZE_MAX");
  map.put(_SC_GETPW_R_SIZE_MAX, "_SC_GETPW_R_SIZE_MAX");
  map.put(_SC_HOST_NAME_MAX, "_SC_HOST_NAME_MAX");
  map.put(_SC_LOGIN_NAME_MAX, "_SC_LOGIN_NAME_MAX");
  map.put(_SC_MONOTONIC_CLOCK, "_SC_MONOTONIC_CLOCK");
  map.put(_SC_MQ_PRIO_MAX, "_SC_MQ_PRIO_MAX");
  map.put(_SC_READER_WRITER_LOCKS, "_SC_READER_WRITER_LOCKS");
  map.put(_SC_REGEXP, "_SC_REGEXP");
  map.put(_SC_SHELL, "_SC_SHELL");
  map.put(_SC_SPAWN, "_SC_SPAWN");
  map.put(_SC_SPIN_LOCKS, "_SC_SPIN_LOCKS");
  map.put(_SC_SPORADIC_SERVER, "_SC_SPORADIC_SERVER");
  map.put(_SC_THREAD_ATTR_STACKADDR, "_SC_THREAD_ATTR_STACKADDR");
  map.put(_SC_THREAD_ATTR_STACKSIZE, "_SC_THREAD_ATTR_STACKSIZE");
  map.put(_SC_THREAD_CPUTIME, "_SC_THREAD_CPUTIME");
  map.put(_SC_THREAD_DESTRUCTOR_ITERATIONS, "_SC_THREAD_DESTRUCTOR_ITERATIONS");
  map.put(_SC_THREAD_KEYS_MAX, "_SC_THREAD_KEYS_MAX");
  map.put(_SC_THREAD_PRIO_INHERIT, "_SC_THREAD_PRIO_INHERIT");
  map.put(_SC_THREAD_PRIO_PROTECT, "_SC_THREAD_PRIO_PROTECT");
  map.put(_SC_THREAD_PRIORITY_SCHEDULING, "_SC_THREAD_PRIORITY_SCHEDULING");
  map.put(_SC_THREAD_PROCESS_SHARED, "_SC_THREAD_PROCESS_SHARED");
  map.put(_SC_THREAD_SAFE_FUNCTIONS, "_SC_THREAD_SAFE_FUNCTIONS");
  map.put(_SC_THREAD_SPORADIC_SERVER, "_SC_THREAD_SPORADIC_SERVER");
  map.put(_SC_THREAD_STACK_MIN, "_SC_THREAD_STACK_MIN");
  map.put(_SC_THREAD_THREADS_MAX, "_SC_THREAD_THREADS_MAX");
  map.put(_SC_TIMEOUTS, "_SC_TIMEOUTS");
  map.put(_SC_THREADS, "_SC_THREADS");
  map.put(_SC_TRACE, "_SC_TRACE");
  map.put(_SC_TRACE_EVENT_FILTER, "_SC_TRACE_EVENT_FILTER");
  map.put(_SC_TRACE_INHERIT, "_SC_TRACE_INHERIT");
  map.put(_SC_TRACE_LOG, "_SC_TRACE_LOG");
  map.put(_SC_TTY_NAME_MAX, "_SC_TTY_NAME_MAX");
  map.put(_SC_TYPED_MEMORY_OBJECTS, "_SC_TYPED_MEMORY_OBJECTS");
  map.put(_SC_V6_ILP32_OFF32, "_SC_V6_ILP32_OFF32");
  map.put(_SC_V6_ILP32_OFFBIG, "_SC_V6_ILP32_OFFBIG");
  map.put(_SC_V6_LP64_OFF64, "_SC_V6_LP64_OFF64");
  map.put(_SC_V6_LPBIG_OFFBIG, "_SC_V6_LPBIG_OFFBIG");
  map.put(_SC_IPV6, "_SC_IPV6");
  map.put(_SC_RAW_SOCKETS, "_SC_RAW_SOCKETS");
  map.put(_SC_SYMLOOP_MAX, "_SC_SYMLOOP_MAX");
  map.put(_SC_ATEXIT_MAX, "_SC_ATEXIT_MAX");
  map.put(_SC_IOV_MAX, "_SC_IOV_MAX");
  map.put(_SC_PAGE_SIZE, "_SC_PAGE_SIZE");
  map.put(_SC_XOPEN_CRYPT, "_SC_XOPEN_CRYPT");
  map.put(_SC_XOPEN_ENH_I18N, "_SC_XOPEN_ENH_I18N");
  map.put(_SC_XOPEN_LEGACY, "_SC_XOPEN_LEGACY");
  map.put(_SC_XOPEN_REALTIME, "_SC_XOPEN_REALTIME");
  map.put(_SC_XOPEN_REALTIME_THREADS, "_SC_XOPEN_REALTIME_THREADS");
  map.put(_SC_XOPEN_SHM, "_SC_XOPEN_SHM");
  map.put(_SC_XOPEN_STREAMS, "_SC_XOPEN_STREAMS");
  map.put(_SC_XOPEN_UNIX, "_SC_XOPEN_UNIX");
  map.put(_SC_XOPEN_VERSION, "_SC_XOPEN_VERSION");
  map.put(_SC_XOPEN_XCU_VERSION, "_SC_XOPEN_XCU_VERSION");
  map.put(_SC_XBS5_ILP32_OFF32, "_SC_XBS5_ILP32_OFF32");
  map.put(_SC_XBS5_ILP32_OFFBIG, "_SC_XBS5_ILP32_OFFBIG");
  map.put(_SC_XBS5_LP64_OFF64, "_SC_XBS5_LP64_OFF64");
  map.put(_SC_XBS5_LPBIG_OFFBIG, "_SC_XBS5_LPBIG_OFFBIG");
  map.put(_SC_SS_REPL_MAX, "_SC_SS_REPL_MAX");
  map.put(_SC_TRACE_EVENT_NAME_MAX, "_SC_TRACE_EVENT_NAME_MAX");
  map.put(_SC_TRACE_NAME_MAX, "_SC_TRACE_NAME_MAX");
  map.put(_SC_TRACE_SYS_MAX, "_SC_TRACE_SYS_MAX");
  map.put(_SC_TRACE_USER_EVENT_MAX, "_SC_TRACE_USER_EVENT_MAX");
  map.put(_SC_PASS_MAX, "_SC_PASS_MAX");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}