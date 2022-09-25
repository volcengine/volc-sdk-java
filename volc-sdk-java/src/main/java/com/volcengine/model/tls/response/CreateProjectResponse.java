package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static com.volcengine.model.tls.Const.PROJECT_ID;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateProjectResponse extends CommonResponse {
    @JSONField(name = PROJECT_ID)
    String projectId;

    public CreateProjectResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateProjectResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateProjectResponse response = (CreateProjectResponse) super.deSerialize(data, clazz);
        this.setProjectId(response.getProjectId());
        return this;
    }

}
