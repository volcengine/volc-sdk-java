package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

import static com.volcengine.model.tls.Const.PROJECT_ID;

@Data
@AllArgsConstructor
public class DeleteProjectRequest {
    @JSONField(name = PROJECT_ID)
    private String projectId;

    public boolean CheckValidation() {
        if (this.projectId == null) {
            return false;
        }
        return true;
    }
}
