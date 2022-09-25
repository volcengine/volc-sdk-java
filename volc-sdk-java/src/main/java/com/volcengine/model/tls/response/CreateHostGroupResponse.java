package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static com.volcengine.model.tls.Const.HOST_GROUP_ID;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateHostGroupResponse extends CommonResponse {
    @JSONField(name = HOST_GROUP_ID)
    String hostGroupId;

    public CreateHostGroupResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateHostGroupResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateHostGroupResponse response = (CreateHostGroupResponse) super.deSerialize(data, clazz);
        this.setHostGroupId(response.getHostGroupId());
        return this;
    }
}
