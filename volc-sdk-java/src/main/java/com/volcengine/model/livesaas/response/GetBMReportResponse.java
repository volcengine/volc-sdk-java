package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetBMReportResponse {
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
        @JSONField(name = "ASRResult")
        ASRResult ASRResult;
        @JSONField(name = "RecordURL")
        String RecordURL;
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
    public static class TaskDetail {
        @JSONField(name = "TaskId")
        Long TaskId;
        @JSONField(name = "TaskName")
        String TaskName;
        @JSONField(name = "ProjectName")
        String ProjectName;
        @JSONField(name = "Extra")
        String Extra;
    }

    @Data
    public static class RuleResultDetail {
        @JSONField(name = "RuleName")
        String ruleName;
        @JSONField(name = "RuleSubType")
        String ruleSubType;
        @JSONField(name = "PricingAnalysisResult")
        PricingAnalysisResult pricingAnalysisResult;
        @JSONField(name = "PitchAnalysisResult")
        PitchAnalysisResult pitchAnalysisResult;
        @JSONField(name = "VehicleAppearanceResult")
        VehicleAppearanceResult vehicleAppearanceResult;
        @JSONField(name = "NonStandardMaterialDisplayResult")
        NonStandardMaterialDisplayResult nonStandardMaterialDisplayResult;
        @JSONField(name = "OnScreenPresenceMonitoringResult")
        OnScreenPresenceMonitoringResult onScreenPresenceMonitoringResult;
        @JSONField(name = "VehicleSalesPitchResult")
        VehicleSalesPitchResult vehicleSalesPitchResult;
    }

    @Data
    public static class PricingAnalysisResult {
        @JSONField(name = "MachineDetails")
        List<PricingAnalysisMachineDetail> machineDetails;
        @JSONField(name = "TotalCount")
        Long TotalCount;
    }

    @Data
    public static class PricingAnalysisMachineDetail {
        @JSONField(name = "StartTime")
        Long startTime;
        @JSONField(name = "EndTime")
        Long endTime;
        @JSONField(name = "TextFragment")
        String textFragment;
        @JSONField(name = "RelatedVehicleModel")
        String relatedVehicleModel;
        @JSONField(name = "Identifier")
        Integer identifier;
        @JSONField(name = "ASRText")
        String asrText;
        @JSONField(name = "VehicleInformation")
        String vehicleInformation;
        @JSONField(name = "MinimumQuotation")
        String minimumQuotation;
        @JSONField(name = "PaymentMethod")
        String paymentMethod;
        @JSONField(name = "Discount")
        String Discount;
        @JSONField(name = "Amount")
        String Amount;
        @JSONField(name = "QuotationType")
        String QuotationType;
        @JSONField(name = "SubsidyType")
        String SubsidyType;
        @JSONField(name = "GiftPackageType")
        String GiftPackageType;
    }

    @Data
    public static class PitchAnalysisResult {
        @JSONField(name = "MachineDetails")
        List<PitchAnalysisMachineDetail> machineDetails;
        @JSONField(name = "Summary")
        String Summary;
    }

    @Data
    public static class PitchAnalysisMachineDetail {
        @JSONField(name = "StartTime")
        Long startTime;
        @JSONField(name = "EndTime")
        Long endTime;
        @JSONField(name = "Category")
        String category;
        @JSONField(name = "RelatedVehicleModel")
        String relatedVehicleModel;
        @JSONField(name = "Duration")
        Integer duration;
        @JSONField(name = "DurationRatio")
        Integer durationRatio;
    }

    @Data
    public static class VehicleAppearanceResult {
        @JSONField(name = "MachineDetails")
        List<VehicleAppearanceMachineDetail> machineDetails;
        @JSONField(name = "TotalCount")
        Long TotalCount;
    }

    @Data
    public static class VehicleAppearanceMachineDetail {
        @JSONField(name = "StartTime")
        Long startTime;
        @JSONField(name = "EndTime")
        Long endTime;
        @JSONField(name = "ScreenshotURLs")
        List<String> screenshotURLs;
        @JSONField(name = "Duration")
        Integer duration;
        @JSONField(name = "RelatedVehicleModel")
        String relatedVehicleModel;
    }

    @Data
    public static class NonStandardMaterialDisplayResult {
        @JSONField(name = "MachineDetails")
        List<NonStandardMaterialDisplayDetail> machineDetails;
        @JSONField(name = "TotalCount")
        Long TotalCount;
    }

    @Data
    public static class NonStandardMaterialDisplayDetail {
        @JSONField(name = "StartTime")
        Long startTime;
        @JSONField(name = "EndTime")
        Long endTime;
        @JSONField(name = "ScreenshotURLs")
        List<String> screenshotURLs;
        @JSONField(name = "Reason")
        String reason;
    }

    @Data
    public static class OnScreenPresenceMonitoringResult {
        @JSONField(name = "MachineDetails")
        List<OnScreenPresenceMonitoringDetail> machineDetails;
        @JSONField(name = "TotalDuration")
        Long TotalDuration;
    }

    @Data
    public static class OnScreenPresenceMonitoringDetail {
        @JSONField(name = "StartTime")
        Long startTime;
        @JSONField(name = "EndTime")
        Long endTime;
        @JSONField(name = "ScreenshotURLs")
        List<String> screenshotURLs;
        @JSONField(name = "Reason")
        String reason;
    }

    @Data
    public static class VehicleSalesPitchResult {
        @JSONField(name = "MachineDetails")
        List<VehicleSalesPitchDetail> machineDetails;
        @JSONField(name = "TotalCount")
        Long TotalCount;
    }

    @Data
    public static class VehicleSalesPitchDetail {
        @JSONField(name = "StartTime")
        Long startTime;
        @JSONField(name = "EndTime")
        Long endTime;
        @JSONField(name = "TextFragment")
        String textFragment;
        @JSONField(name = "Reason")
        String reason;
    }
}