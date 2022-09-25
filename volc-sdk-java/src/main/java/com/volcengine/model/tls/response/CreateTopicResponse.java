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
public class CreateTopicResponse extends CommonResponse {
    @JSONField(name = TOPIC_ID)
    String topicId;

    public CreateTopicResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateTopicResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateTopicResponse response = (CreateTopicResponse) super.deSerialize(data, clazz);
        this.setTopicId(response.getTopicId());
        return this;
    }
}
