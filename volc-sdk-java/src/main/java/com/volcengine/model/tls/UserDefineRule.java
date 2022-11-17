package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDefineRule {
    @JSONField(name=PARSE_PATH_RULE)
    ParsePathRule parsePathRule;
    @JSONField(name=SHARD_HASH_KEY)
    ShardHashKey shardHashKey;
    @JSONField(name=ENABLE_RAW_LOG)
    Boolean enableRawLog;
    @JSONField(name=FIELDS)
    Map<String,String> fields;
}
