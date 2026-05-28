package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.APP_INSTANCE_ID_UPPER;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateAppInstanceResponse extends CommonResponse {
    @JSONField(name = APP_INSTANCE_ID_UPPER)
    private String instanceID;

    public CreateAppInstanceResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateAppInstanceResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateAppInstanceResponse response = (CreateAppInstanceResponse) super.deSerialize(data, clazz);
        this.setInstanceID(response.getInstanceID());
        return this;
    }
}
