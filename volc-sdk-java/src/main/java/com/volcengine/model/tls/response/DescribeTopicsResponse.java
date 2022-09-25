package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.TopicInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeTopicsResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    int total;
    @JSONField(name = Const.TOPICS_LIST_KEY)
    List<TopicInfo> topic;

    public DescribeTopicsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeTopicsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeTopicsResponse response = (DescribeTopicsResponse) super.deSerialize(data, clazz);
        this.setTotal(response.getTotal());
        this.setTopic(response.getTopic());
        return this;
    }
}
