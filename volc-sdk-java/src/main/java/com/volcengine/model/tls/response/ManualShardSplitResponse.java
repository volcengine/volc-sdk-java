package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

/**
 * ManualShardSplit response model.
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
public final class ManualShardSplitResponse extends CommonResponse {
    /**
     * 日志分区的范围等详细信息.
     */
    @JSONField(name = "Shards")
    private List<ShardQueryResponse> shards;

    /**
     * Constructor.
     * @param headers response headers
     */
    public ManualShardSplitResponse(final Header[] headers) {
        super(headers);
    }

    @Override
    public ManualShardSplitResponse deSerialize(final byte[] data, 
                                               final Class clazz) throws LogException {
        ManualShardSplitResponse response = (ManualShardSplitResponse) 
            super.deSerialize(data, clazz);
        this.setShards(response.getShards());
        return this;
    }
}
