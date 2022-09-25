package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.Shard;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import static com.volcengine.model.tls.Const.SHARDS;
import static com.volcengine.model.tls.Const.TOTAL_KEY;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeShardsResponse extends CommonResponse {
    @JSONField(name = TOTAL_KEY)
    int total;
    @JSONField(name = SHARDS)
    List<Shard> shards;

    public DescribeShardsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeShardsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeShardsResponse response = (DescribeShardsResponse) super.deSerialize(data, clazz);
        this.setShards(response.getShards());
        this.setTotal(response.getTotal());
        return this;
    }
}
