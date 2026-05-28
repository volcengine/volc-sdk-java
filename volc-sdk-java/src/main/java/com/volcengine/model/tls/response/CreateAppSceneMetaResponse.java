package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.META_ID_KEY;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateAppSceneMetaResponse extends CommonResponse {
    @JSONField(name = META_ID_KEY)
    private String id;

    public CreateAppSceneMetaResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateAppSceneMetaResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateAppSceneMetaResponse response = (CreateAppSceneMetaResponse) super.deSerialize(data, clazz);
        this.setId(response.getId());
        return this;
    }
}
