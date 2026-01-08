package com.volcengine.model.tls.enumration;

/**
 * 定时 SQL 任务的执行周期类型.
 */
public enum ScheduleCycleType {

    /** 周期执行. */
    Period("Period"),

    /** 固定时间执行. */
    Fixed("Fixed"),

    /** Cron 表达式执行. */
    Cron("Cron");

    /** 枚举对应的字符串值. */
    private final String value;

    ScheduleCycleType(final String valueParam) {
        this.value = valueParam;
    }

    /**
     * 获取枚举对应的字符串值.
     *
     * @return 字符串值
     */
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
