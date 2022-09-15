package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.KEY;
import static com.volcengine.model.tls.Const.REGEX;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilterKeyRegex {
    @JSONField(name = KEY)
    String key;
    @JSONField(name = REGEX)
    String regex;

}
