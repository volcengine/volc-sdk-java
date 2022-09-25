package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ExtractRule {
    @JSONField(name=DELIMITER)
    String delimiter;
    @JSONField(name=BEGIN_REGEX)
    String beginRegex;
    @JSONField(name=LOG_REGEX)
    String logRegex;
    @JSONField(name=KEYS)
    List<String> keys;
    @JSONField(name=TIME_KEY)
    String timeKey;
    @JSONField(name=TIME_FORMAT)
    String timeFormat;
    @JSONField(name=FILTER_KEY_REGEX)
    List<FilterKeyRegex> filterKeyRegex;
    @JSONField(name=UN_MATCH_UP_LOAD_SWITCH)
    boolean unMatchUpLoadSwitch;
    @JSONField(name=UN_MATCH_LOG_KEY)
    String unMatchLogKey;
}
