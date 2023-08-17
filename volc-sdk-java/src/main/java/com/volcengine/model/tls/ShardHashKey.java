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

    /**
     * @param hashKey 日志组的 HashKey
     */
    public ShardHashKey(String hashKey) {
        this.hashKey = hashKey;
    }

    /**
     * @return 日志组的 HashKey
     */
    public String getHashKey() {
        return hashKey;
    }

    /**
     * @param hashKey 日志组的 HashKey
     */
    public void setHashKey(String hashKey) {
        this.hashKey = hashKey;
    }
}
