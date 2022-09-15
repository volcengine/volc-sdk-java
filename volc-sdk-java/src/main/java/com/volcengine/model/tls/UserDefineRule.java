package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.PARSE_PATH_RULE;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDefineRule {
    @JSONField(name=PARSE_PATH_RULE)
    ParsePathRule parsePathRule;
}
