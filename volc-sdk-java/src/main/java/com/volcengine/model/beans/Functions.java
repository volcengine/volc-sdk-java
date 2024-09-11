package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Functions {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "Input")
    Object input;

    public static Functions GetMetaFunction() {
        return new Functions("GetMeta", null);
    }

    public static Functions SnapShotFunction(double snapShot) {
        return new Functions("Snapshot", new FunctionsSnapshotInput(snapShot));
    }

    public static Functions AddOptionInfoFunction(String title, String tags, String description) {
        return new Functions("AddOptionInfo", new FunctionsOptionInfo(title, tags, description, "", 1, "", 0, false));
    }

    public static Functions AddOptionInfoFunction(String title, String tags, String description, long classificationId) {
        return new Functions("AddOptionInfo", new FunctionsOptionInfo(title, tags, description, "", 1, "", classificationId, false));
    }

    public static Functions AddOptionInfoFunction(String title, String tags, String description, long classificationId, boolean isHlsIndexOnly) {
        return new Functions("AddOptionInfo", new FunctionsOptionInfo(title, tags, description, "", 1, "", classificationId, isHlsIndexOnly));
    }

    public static Functions AddOptionInfoFunction(String title, String tags, String description, String category, String format) {
        return new Functions("AddOptionInfo", new FunctionsOptionInfo(title, tags, description, category, 2, format, 0, false));
    }

    public static Functions StartWorkFlowFunction(String templateId) {
        return new Functions("StartWorkflow", new FunctionsWorkflowInput(templateId, null));
    }

    public static Functions StartWorkFlowFunction(List<FunctionsWorkflowTemplate> templates) {
        return new Functions("StartWorkflow", new FunctionsWorkflowInput("", templates));
    }

    public static Functions CaptionUploadFunction(FunctionsCaptionInput input) {
        return new Functions("CaptionUpload", input);
    }

}
