package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Tag;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetReportResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetReportResponseBody result;

    @Data
    public static class GetReportResponseBody {
        @JSONField(name = "TaskDetail")
        TaskDetail TaskDetail;
        @JSONField(name = "TaskResult")
        TaskResult TaskResult;
        @JSONField(name = "RuleResultDetails")
        List<RuleResultDetail> RuleResultDetails;
    }

    @Data
    public static class PieChart {
        @JSONField(name = "Title")
        String Title;
        @JSONField(name = "Count")
        Integer Count;
    }

    @Data
    public static class StatisticalData {
        @JSONField(name = "ViolationList")
        List<PieChart> ViolationList;
        @JSONField(name = "ImageLlMAnalysisList")
        List<PieChart> ImageLlMAnalysisList;
        @JSONField(name = "TextLlMAnalysisList")
        List<PieChart> TextLlMAnalysisList;
    }

    @Data
    public static class ManualDetail {
        @JSONField(name = "ManualComment")
        String ManualComment;
        @JSONField(name = "Auditor")
        String Auditor;
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "ManualSource")
        Integer ManualSource;
        @JSONField(name = "CreatedTime")
        Long CreatedTime;
        @JSONField(name = "ManualStatus")
        Integer ManualStatus;
    }

    @Data
    public static class TaskResult {
        @JSONField(name = "MachineStartTime")
        Long MachineStartTime;
        @JSONField(name = "MachineEndTime")
        Long MachineEndTime;
        @JSONField(name = "Cost")
        Integer Cost;
        @JSONField(name = "ManualEndTime")
        Long ManualEndTime;
        @JSONField(name = "ASRResult")
        ASRResult ASRResult;
        @JSONField(name = "RecordURL")
        String RecordURL;
        @JSONField(name = "StatisticalData")
        StatisticalData StatisticalData;
        @JSONField(name = "ManualDetails")
        List<ManualDetail> ManualDetails;
        @JSONField(name = "FinalManualStatus")
        Integer FinalManualStatus;
    }

    @Data
    public static class Utterance {
        @JSONField(name = "StartTime")
        Integer StartTime;
        @JSONField(name = "EndTime")
        Integer EndTime;
        @JSONField(name = "Text")
        public String Text;
    }

    @Data
    public static class ASRResult {
        @JSONField(name = "Text")
        String Text;
        @JSONField(name = "Utterances")
        Utterance[] Utterances;
    }

    @Data
    public static class MachineDetail {
        @JSONField(name = "MachineType")
        Integer MachineType;
        @JSONField(name = "AnalysisTexts")
        List<AnalysisText> AnalysisTexts;
        @JSONField(name = "AnalysisImages")
        List<AnalysisImage> AnalysisImages;
        @JSONField(name = "CustomSensitiveResults")
        List<CustomSensitiveResult> CustomSensitiveResults;
        @JSONField(name = "SystemSensitiveResults")
        List<SystemSensitiveResult> SystemSensitiveResults;
//        @JSONField(name = "OCRTextRecognitionResults")
//        List<OCRTextRecognitionResult> OCRTextRecognitionResults;
//        @JSONField(name = "OCRBottomSubtitleResults")
//        List<SystemSensitiveResult> OCRBottomSubtitleResults;
//        @JSONField(name = "PresetScriptResult")
//        PresetScriptResult PresetScriptResult;
    }

    @Data
    public static class OCRTextRecognitionResult {
        @JSONField(name = "ImageURLs")
        List<String> ImageURLs;
        @JSONField(name = "AbsoluteStartTime")
        Long AbsoluteStartTime;
        @JSONField(name = "AbsoluteEndTime")
        Long AbsoluteEndTime;
        @JSONField(name = "Description")
        String Description;
    }

    @Data
    public static class OCRBottomSubtitleResult {
        @JSONField(name = "ImageURLs")
        List<String> ImageURLs;
        @JSONField(name = "AbsoluteStartTime")
        Long AbsoluteStartTime;
        @JSONField(name = "AbsoluteEndTime")
        Long AbsoluteEndTime;
        @JSONField(name = "Description")
        String Description;
    }

    @Data
    public static class PresetScriptResult {
        @JSONField(name = "ASRText")
        String ASRText;
        @JSONField(name = "ScriptSimilarity")
        Integer ScriptSimilarity;
        @JSONField(name = "PresetScriptText")
        Integer PresetScriptText;
    }

    @Data
    public static class AnalysisText {
        @JSONField(name = "Text")
        String Text;
        @JSONField(name = "Type")
        String Type;
        @JSONField(name = "AbsoluteStartTime")
        Long AbsoluteStartTime;
        @JSONField(name = "AbsoluteEndTime")
        Long AbsoluteEndTime;
    }

    @Data
    public static class AnalysisImage {
        @JSONField(name = "ImageURLs")
        List<String> ImageURLs;
        @JSONField(name = "Type")
        String Type;
        @JSONField(name = "AbsoluteStartTime")
        Long AbsoluteStartTime;
        @JSONField(name = "AbsoluteEndTime")
        Long AbsoluteEndTime;
    }

    @Data
    public static class CustomSensitiveResult {
        @JSONField(name = "SensitiveWord")
        String SensitiveWord;
        @JSONField(name = "Text")
        String Text;
        @JSONField(name = "AbsoluteStartTime")
        Long AbsoluteStartTime;
        @JSONField(name = "StartTime")
        Long StartTime;
    }

    @Data
    public static class SystemSensitiveResult {
        @JSONField(name = "Text")
        String Text;
        @JSONField(name = "AbsoluteStartTime")
        Long AbsoluteStartTime;
        @JSONField(name = "StartTime")
        Long StartTime;
    }

    @Data
    public static class RuleResultDetail {
        @JSONField(name = "RuleId")
        Long RuleId;
        @JSONField(name = "RuleName")
        String RuleName;
        @JSONField(name = "FinalManualStatus")
        Integer FinalManualStatus;
        @JSONField(name = "ManualDetails")
        List<ManualDetail> ManualDetails;
        @JSONField(name = "FinalMachineStatus")
        Integer FinalMachineStatus;
        @JSONField(name = "MachineDetails")
        MachineDetail MachineDetails;
        @JSONField(name = "RuleType")
        Integer RuleType;
        @JSONField(name = "ViolationType")
        Integer ViolationType;
    }

    @Data
    public static class TaskDetail {
        @JSONField(name = "TaskId")
        Long TaskId;
        @JSONField(name = "TaskName")
        String TaskName;
        @JSONField(name = "ProjectName")
        String ProjectName;
        @JSONField(name = "TaskType")
        Integer TaskType;
        @JSONField(name = "TaskTypeDesc")
        String TaskTypeDesc;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "ScenarioId")
        Long ScenarioId;
        @JSONField(name = "LivePullURL")
        String LivePullURL;
        @JSONField(name = "CreatedTime")
        Long CreatedTime;
        @JSONField(name = "UpdatedTime")
        Long UpdatedTime;
        @JSONField(name = "CallbackURL")
        String CallbackURL;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "Tags")
        List<Tag> Tags;
    }
}