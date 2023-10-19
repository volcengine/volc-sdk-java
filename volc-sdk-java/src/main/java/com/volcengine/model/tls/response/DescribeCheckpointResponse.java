package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeCheckpointResponse extends CommonResponse {
    @JSONField(name = SHARD_ID_UPPERCASE)
    int shardID;
    @JSONField(name = CHECKPOINT)
    String checkpoint;
    @JSONField(name = UPDATE_TIME)
    int updateTime;
    @JSONField(name = CONSUMER)
    String consumer;

    public DescribeCheckpointResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeCheckpointResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeCheckpointResponse response = (DescribeCheckpointResponse) super.deSerialize(data, clazz);
        this.setShardID(response.getShardID());
        this.setCheckpoint(response.getCheckpoint());
        this.setUpdateTime(response.getUpdateTime());
        this.setConsumer(response.getConsumer());

        return this;
    }
}
