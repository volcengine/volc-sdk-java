package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.HASH_KEY;

@Data
@NoArgsConstructor
public class ShardHashKey {
    @JSONField(name = HASH_KEY)
    String hashKey;
}
