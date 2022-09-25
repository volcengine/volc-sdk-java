package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static com.volcengine.model.tls.Const.TOPIC_ID;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateIndexResponse extends CommonResponse {
    @JSONField(name = TOPIC_ID)
    String topicId;

    public CreateIndexResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateIndexResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateIndexResponse response = (CreateIndexResponse) super.deSerialize(data, clazz);
        this.setTopicId(response.getTopicId());
        return this;
    }

}
