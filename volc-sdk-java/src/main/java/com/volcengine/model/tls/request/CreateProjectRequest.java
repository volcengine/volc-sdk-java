package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

import static com.volcengine.model.tls.Const.*;

@Data
@AllArgsConstructor
public class CreateProjectRequest {
    @JSONField(name = PROJECT_NAME)
    private String projectName;
    @JSONField(name = REGION)
    private String region;
    @JSONField(name = DESCRIPTION)
    private String description;

    public boolean CheckValidation() {
        if (this.projectName == null || this.region == null) {
            return false;
        }
        return true;
    }
}
