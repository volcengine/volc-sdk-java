package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModifyProjectRequest {
    @JSONField(name = PROJECT_ID)
    private String projectId;
    @JSONField(name = PROJECT_NAME)
    private String projectName;
    @JSONField(name = DESCRIPTION)
    private String description;

    public boolean CheckValidation() {
        if (this.projectId == null) {
            return false;
        }
        return true;
    }
}
