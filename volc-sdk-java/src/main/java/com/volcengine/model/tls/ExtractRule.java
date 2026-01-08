package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ExtractRule {
    @JSONField(name = DELIMITER)
    String delimiter;
    @JSONField(name = QUOTE)
    String quote;
    @JSONField(name = BEGIN_REGEX)
    String beginRegex;
    @JSONField(name = LOG_REGEX)
    String logRegex;
    @JSONField(name = KEYS)
    List<String> keys;
    @JSONField(name = TIME_KEY)
    String timeKey;
    @JSONField(name = TIME_FORMAT)
    String timeFormat;
    @JSONField(name = FILTER_KEY_REGEX)
    List<FilterKeyRegex> filterKeyRegex;
    @JSONField(name = UN_MATCH_UP_LOAD_SWITCH)
    boolean unMatchUpLoadSwitch;
    @JSONField(name = UN_MATCH_LOG_KEY)
    String unMatchLogKey;
    @JSONField(name = LOG_TEMPLATE)
    LogTemplate logTemplate;
    @JSONField(name = TIME_ZONE)
    String timeZone;
    @JSONField(name = TIME_EXTRACT_REGEX)
    String timeExtractRegex;
    @JSONField(name = ENABLE_NANOSECOND)
    boolean enableNanosecond;
    @JSONField(name = TIME_SAMPLE)
    String timeSample;

    /**
     * @return 日志分隔符
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * @param delimiter 日志分隔符
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * @return 引用符
     */
    public String getQuote() {
        return quote;
    }

    /**
     * @param quote 引用符
     */
    public void setQuote(String quote) {
        this.quote = quote;
    }

    /**
     * @return 第一行日志需要匹配的正则表达式
     */
    public String getBeginRegex() {
        return beginRegex;
    }

    /**
     * @param beginRegex 第一行日志需要匹配的正则表达式
     */
    public void setBeginRegex(String beginRegex) {
        this.beginRegex = beginRegex;
    }

    /**
     * @return 整条日志需要匹配的正则表达式
     */
    public String getLogRegex() {
        return logRegex;
    }

    /**
     * @param logRegex 整条日志需要匹配的正则表达式
     */
    public void setLogRegex(String logRegex) {
        this.logRegex = logRegex;
    }

    /**
     * @return 日志字段名称
     */
    public List<String> getKeys() {
        return keys;
    }

    /**
     * @param keys 日志字段名称
     */
    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    /**
     * @return 日志时间字段的字段名称
     */
    public String getTimeKey() {
        return timeKey;
    }

    /**
     * @param timeKey 日志时间字段的字段名称
     */
    public void setTimeKey(String timeKey) {
        this.timeKey = timeKey;
    }

    /**
     * @return 时间字段的解析格式
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * @param timeFormat 时间字段的解析格式
     */
    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    /**
     * @return 过滤规则列表
     */
    public List<FilterKeyRegex> getFilterKeyRegex() {
        return filterKeyRegex;
    }

    /**
     * @param filterKeyRegex 过滤规则列表
     */
    public void setFilterKeyRegex(List<FilterKeyRegex> filterKeyRegex) {
        this.filterKeyRegex = filterKeyRegex;
    }

    /**
     * @return 是否上传解析失败的日志
     */
    public boolean isUnMatchUpLoadSwitch() {
        return unMatchUpLoadSwitch;
    }

    /**
     * @param unMatchUpLoadSwitch 是否上传解析失败的日志
     */
    public void setUnMatchUpLoadSwitch(boolean unMatchUpLoadSwitch) {
        this.unMatchUpLoadSwitch = unMatchUpLoadSwitch;
    }

    /**
     * @return 当上传解析失败的日志时，解析失败的日志的 key 名称
     */
    public String getUnMatchLogKey() {
        return unMatchLogKey;
    }

    /**
     * @param unMatchLogKey 当上传解析失败的日志时，解析失败的日志的 key 名称
     */
    public void setUnMatchLogKey(String unMatchLogKey) {
        this.unMatchLogKey = unMatchLogKey;
    }

    /**
     * @return 根据指定的日志模板自动提取日志字段
     */
    public LogTemplate getLogTemplate() {
        return logTemplate;
    }

    /**
     * @param logTemplate 根据指定的日志模板自动提取日志字段
     */
    public void setLogTemplate(LogTemplate logTemplate) {
        this.logTemplate = logTemplate;
    }

    /**
     * @return 时区
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone 时区
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * @return 提取时间的正则表达式
     */
    public String getTimeExtractRegex() {
        return timeExtractRegex;
    }

    /**
     * @param timeExtractRegex 提取时间的正则表达式
     */
    public void setTimeExtractRegex(String timeExtractRegex) {
        this.timeExtractRegex = timeExtractRegex;
    }

    /**
     * @return 是否启用纳秒精度时间功能
     */
    public boolean isEnableNanosecond() {
        return enableNanosecond;
    }

    /**
     * @param enableNanosecond 是否启用纳秒精度时间功能
     */
    public void setEnableNanosecond(boolean enableNanosecond) {
        this.enableNanosecond = enableNanosecond;
    }

    /**
     * @return 时间样例
     */
    public String getTimeSample() {
        return timeSample;
    }

    /**
     * @param timeSample 时间样例
     */
    public void setTimeSample(String timeSample) {
        this.timeSample = timeSample;
    }
}
