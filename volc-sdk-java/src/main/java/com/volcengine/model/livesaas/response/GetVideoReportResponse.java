package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetVideoReportResponse {
    @JSONField(name = "ResponseMetadata")
    public ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    public GetVideoReportResponseBody result;

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public GetVideoReportResponseBody getResult() {
        return result;
    }

    public void setResult(GetVideoReportResponseBody result) {
        this.result = result;
    }

    @Data
    public static class GetVideoReportResponseBody {
        @JSONField(name = "TaskDetail")
        public GetReportResponse.TaskDetail TaskDetail;
        @JSONField(name = "TaskResult")
        public GetReportResponse.TaskResult TaskResult;
        @JSONField(name = "RuleResultDetails")
        public List<RuleResultDetail> RuleResultDetails;

        public GetReportResponse.TaskDetail getTaskDetail() {
            return TaskDetail;
        }

        public void setTaskDetail(GetReportResponse.TaskDetail taskDetail) {
            TaskDetail = taskDetail;
        }

        public GetReportResponse.TaskResult getTaskResult() {
            return TaskResult;
        }

        public void setTaskResult(GetReportResponse.TaskResult taskResult) {
            TaskResult = taskResult;
        }

        public List<RuleResultDetail> getRuleResultDetails() {
            return RuleResultDetails;
        }

        public void setRuleResultDetails(List<RuleResultDetail> ruleResultDetails) {
            RuleResultDetails = ruleResultDetails;
        }
    }

    @Data
    public static class RuleResultDetail {
        @JSONField(name = "RuleId")
        public Long RuleId;
        @JSONField(name = "RuleName")
        public String RuleName;
        @JSONField(name = "FinalManualStatus")
        public Integer FinalManualStatus;
        @JSONField(name = "ManualDetails")
        public List<GetReportResponse.ManualDetail> ManualDetails;
        @JSONField(name = "FinalMachineStatus")
        public Integer FinalMachineStatus;
        @JSONField(name = "MachineDetails")
        public MachineDetail MachineDetails;
        @JSONField(name = "RuleType")
        public Integer RuleType;
        @JSONField(name = "ViolationType")
        public Integer ViolationType;

        public Long getRuleId() {
            return RuleId;
        }

        public void setRuleId(Long ruleId) {
            RuleId = ruleId;
        }

        public String getRuleName() {
            return RuleName;
        }

        public void setRuleName(String ruleName) {
            RuleName = ruleName;
        }

        public Integer getFinalManualStatus() {
            return FinalManualStatus;
        }

        public void setFinalManualStatus(Integer finalManualStatus) {
            FinalManualStatus = finalManualStatus;
        }

        public List<GetReportResponse.ManualDetail> getManualDetails() {
            return ManualDetails;
        }

        public void setManualDetails(List<GetReportResponse.ManualDetail> manualDetails) {
            ManualDetails = manualDetails;
        }

        public Integer getFinalMachineStatus() {
            return FinalMachineStatus;
        }

        public void setFinalMachineStatus(Integer finalMachineStatus) {
            FinalMachineStatus = finalMachineStatus;
        }

        public MachineDetail getMachineDetails() {
            return MachineDetails;
        }

        public void setMachineDetails(MachineDetail machineDetails) {
            MachineDetails = machineDetails;
        }

        public Integer getRuleType() {
            return RuleType;
        }

        public void setRuleType(Integer ruleType) {
            RuleType = ruleType;
        }

        public Integer getViolationType() {
            return ViolationType;
        }

        public void setViolationType(Integer violationType) {
            ViolationType = violationType;
        }
    }

    @Data
    public static class MachineDetail {
        @JSONField(name = "MachineType")
        public Integer MachineType;
        @JSONField(name = "AnalysisTexts")
        public List<AnalysisText> AnalysisTexts;
        @JSONField(name = "AnalysisImages")
        public List<AnalysisImage> AnalysisImages;
        @JSONField(name = "CustomSensitiveResults")
        public List<CustomSensitiveResult> CustomSensitiveResults;
        @JSONField(name = "SystemSensitiveResults")
        public List<SystemSensitiveResult> SystemSensitiveResults;
        @JSONField(name = "OCRTextRecognitionResults")
        public List<OCRTextRecognitionResult> OCRTextRecognitionResults;
        @JSONField(name = "OCRBottomSubtitleResults")
        public List<OCRBottomSubtitleResult> OCRBottomSubtitleResults;

        public Integer getMachineType() {
            return MachineType;
        }

        public void setMachineType(Integer machineType) {
            MachineType = machineType;
        }

        public List<AnalysisText> getAnalysisTexts() {
            return AnalysisTexts;
        }

        public void setAnalysisTexts(List<AnalysisText> analysisTexts) {
            AnalysisTexts = analysisTexts;
        }

        public List<AnalysisImage> getAnalysisImages() {
            return AnalysisImages;
        }

        public void setAnalysisImages(List<AnalysisImage> analysisImages) {
            AnalysisImages = analysisImages;
        }

        public List<CustomSensitiveResult> getCustomSensitiveResults() {
            return CustomSensitiveResults;
        }

        public void setCustomSensitiveResults(List<CustomSensitiveResult> customSensitiveResults) {
            CustomSensitiveResults = customSensitiveResults;
        }

        public List<SystemSensitiveResult> getSystemSensitiveResults() {
            return SystemSensitiveResults;
        }

        public void setSystemSensitiveResults(List<SystemSensitiveResult> systemSensitiveResults) {
            SystemSensitiveResults = systemSensitiveResults;
        }

        public List<OCRTextRecognitionResult> getOCRTextRecognitionResults() {
            return OCRTextRecognitionResults;
        }

        public void setOCRTextRecognitionResults(List<OCRTextRecognitionResult> OCRTextRecognitionResults) {
            this.OCRTextRecognitionResults = OCRTextRecognitionResults;
        }

        public List<OCRBottomSubtitleResult> getOCRBottomSubtitleResults() {
            return OCRBottomSubtitleResults;
        }

        public void setOCRBottomSubtitleResults(List<OCRBottomSubtitleResult> OCRBottomSubtitleResults) {
            this.OCRBottomSubtitleResults = OCRBottomSubtitleResults;
        }
    }

    @Data
    public static class AnalysisText {
        @JSONField(name = "MessageId")
        public Long MessageId;
        @JSONField(name = "Text")
        public String Text;
        @JSONField(name = "Type")
        public String Type;
        @JSONField(name = "StartTime")
        public Long StartTime;
        @JSONField(name = "EndTime")
        public Long EndTime;
        @JSONField(name = "Description")
        public String Description;

        public Long getMessageId() {
            return MessageId;
        }

        public void setMessageId(Long messageId) {
            MessageId = messageId;
        }

        public String getText() {
            return Text;
        }

        public void setText(String text) {
            Text = text;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }

        public Long getStartTime() {
            return StartTime;
        }

        public void setStartTime(Long startTime) {
            StartTime = startTime;
        }

        public Long getEndTime() {
            return EndTime;
        }

        public void setEndTime(Long endTime) {
            EndTime = endTime;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }
    }

    @Data
    public static class AnalysisImage {
        @JSONField(name = "MessageId")
        public Long MessageId;
        @JSONField(name = "ImageURLs")
        public List<String> ImageURLs;
        @JSONField(name = "Type")
        public String Type;
        @JSONField(name = "StartTime")
        public Long StartTime;
        @JSONField(name = "EndTime")
        public Long EndTime;
        @JSONField(name = "Description")
        public String Description;

        public Long getMessageId() {
            return MessageId;
        }

        public void setMessageId(Long messageId) {
            MessageId = messageId;
        }

        public List<String> getImageURLs() {
            return ImageURLs;
        }

        public void setImageURLs(List<String> imageURLs) {
            ImageURLs = imageURLs;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }

        public Long getStartTime() {
            return StartTime;
        }

        public void setStartTime(Long startTime) {
            StartTime = startTime;
        }

        public Long getEndTime() {
            return EndTime;
        }

        public void setEndTime(Long endTime) {
            EndTime = endTime;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }
    }

    @Data
    public static class CustomSensitiveResult {
        @JSONField(name = "MessageId")
        public Long MessageId;
        @JSONField(name = "SensitiveWord")
        public String SensitiveWord;
        @JSONField(name = "Text")
        public String Text;
        @JSONField(name = "StartTime")
        public Long StartTime;

        public Long getMessageId() {
            return MessageId;
        }

        public void setMessageId(Long messageId) {
            MessageId = messageId;
        }

        public String getSensitiveWord() {
            return SensitiveWord;
        }

        public void setSensitiveWord(String sensitiveWord) {
            SensitiveWord = sensitiveWord;
        }

        public String getText() {
            return Text;
        }

        public void setText(String text) {
            Text = text;
        }

        public Long getStartTime() {
            return StartTime;
        }

        public void setStartTime(Long startTime) {
            StartTime = startTime;
        }
    }

    @Data
    public static class SystemSensitiveResult {
        @JSONField(name = "MessageId")
        public Long MessageId;
        @JSONField(name = "Text")
        public String Text;
        @JSONField(name = "StartTime")
        public Long StartTime;

        public Long getMessageId() {
            return MessageId;
        }

        public void setMessageId(Long messageId) {
            MessageId = messageId;
        }

        public String getText() {
            return Text;
        }

        public void setText(String text) {
            Text = text;
        }

        public Long getStartTime() {
            return StartTime;
        }

        public void setStartTime(Long startTime) {
            StartTime = startTime;
        }
    }

    @Data
    public static class OCRTextRecognitionResult {
        @JSONField(name = "MessageId")
        public Long MessageId;
        @JSONField(name = "ImageURLs")
        public List<String> ImageURLs;
        @JSONField(name = "StartTime")
        public Long StartTime;
        @JSONField(name = "EndTime")
        public Long EndTime;
        @JSONField(name = "Description")
        public String Description;
        @JSONField(name = "Type")
        public String Type;

        public Long getMessageId() {
            return MessageId;
        }

        public void setMessageId(Long messageId) {
            MessageId = messageId;
        }

        public List<String> getImageURLs() {
            return ImageURLs;
        }

        public void setImageURLs(List<String> imageURLs) {
            ImageURLs = imageURLs;
        }

        public Long getStartTime() {
            return StartTime;
        }

        public void setStartTime(Long startTime) {
            StartTime = startTime;
        }

        public Long getEndTime() {
            return EndTime;
        }

        public void setEndTime(Long endTime) {
            EndTime = endTime;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }
    }

    @Data
    public static class OCRBottomSubtitleResult {
        @JSONField(name = "MessageId")
        public Long MessageId;
        @JSONField(name = "ImageURLs")
        public List<String> ImageURLs;
        @JSONField(name = "StartTime")
        public Long StartTime;
        @JSONField(name = "EndTime")
        public Long EndTime;
        @JSONField(name = "Description")
        public String Description;
        @JSONField(name = "Type")
        public String Type;

        public Long getMessageId() {
            return MessageId;
        }

        public void setMessageId(Long messageId) {
            MessageId = messageId;
        }

        public List<String> getImageURLs() {
            return ImageURLs;
        }

        public void setImageURLs(List<String> imageURLs) {
            ImageURLs = imageURLs;
        }

        public Long getStartTime() {
            return StartTime;
        }

        public void setStartTime(Long startTime) {
            StartTime = startTime;
        }

        public Long getEndTime() {
            return EndTime;
        }

        public void setEndTime(Long endTime) {
            EndTime = endTime;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }
    }
}
