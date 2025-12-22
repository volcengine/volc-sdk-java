package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.KeyValueInfo;
import com.volcengine.model.tls.ValueInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.util.StringUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;

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
    @JSONField(name = USER_INNER_KEY_VALUE)
    List<KeyValueInfo> userInnerKeyValue;
    @JSONField(name = CREATE_TIME)
    String createTime;
    @JSONField(name = MODIFY_TIME)
    String modifyTime;
    @JSONField(name = ENABLE_AUTO_INDEX)
    Boolean enableAutoIndex;
    @JSONField(name = MAX_TEXT_LEN)
    Integer maxTextLen;

    public DescribeIndexResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeIndexResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeIndexResponse response = (DescribeIndexResponse) super.deSerialize(data, clazz);
        this.setTopicId(response.getTopicId());
//        html unescape
        FullTextInfo fullTextInfo = response.getFullTextInfo();
        if (fullTextInfo != null && StringUtils.isNotEmpty(fullTextInfo.getDelimiter())) {
            String delimiter = fullTextInfo.getDelimiter();
            fullTextInfo.setDelimiter(StringUtil.replaceWhiteSpaceCharacter(delimiter));
        }
        this.setFullTextInfo(fullTextInfo);
        List<KeyValueInfo> keyValue = response.getKeyValue();
        if (keyValue != null && keyValue.size() > 0) {
            for (KeyValueInfo kv : keyValue) {
                ValueInfo value = kv.getValue();
                if (value != null && StringUtils.isNotEmpty(value.getDelimiter())) {
                    String delimiter = value.getDelimiter();
                    value.setDelimiter(StringUtil.replaceWhiteSpaceCharacter(delimiter));
                }
            }
        }
        this.setKeyValue(keyValue);
        this.setUserInnerKeyValue(response.getUserInnerKeyValue());
        this.setCreateTime(response.getCreateTime());
        this.setModifyTime(response.getModifyTime());
        this.setEnableAutoIndex(response.getEnableAutoIndex());
        this.setMaxTextLen(response.getMaxTextLen());
        return this;
    }
}