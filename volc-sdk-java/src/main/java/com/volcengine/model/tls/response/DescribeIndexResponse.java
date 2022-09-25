package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.KeyValueInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeIndexResponse extends CommonResponse {

    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = FULL_TEXT)
    FullTextInfo fullTextInfo;
    @JSONField(name = KEY_VALUE)
    List<KeyValueInfo> keyValue;
    @JSONField(name = CREATE_TIME)
    String createTime;
    @JSONField(name = MODIFY_TIME)
    String modifyTime;

    public DescribeIndexResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeIndexResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeIndexResponse response = (DescribeIndexResponse) super.deSerialize(data, clazz);
        this.setTopicId(response.getTopicId());
        this.setFullTextInfo(response.getFullTextInfo());
        this.setKeyValue(response.getKeyValue());
        this.setCreateTime(response.getCreateTime());
        this.setModifyTime(response.getModifyTime());
        return this;
    }
}
