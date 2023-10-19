package com.volcengine.model.tls.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.SHARDS;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ConsumerHeartbeatResponse extends CommonResponse {
    @JSONField(name = SHARDS)
    List<ConsumeShard> shards;

    public ConsumerHeartbeatResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public ConsumerHeartbeatResponse deSerialize(byte[] data, Class clazz) throws LogException {
        ConsumerHeartbeatResponse response = (ConsumerHeartbeatResponse) super.deSerialize(data, clazz);
        this.setShards(response.getShards());
        return this;
    }
}
