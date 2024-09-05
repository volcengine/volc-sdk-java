package com.volcengine.example.imp.job;

import com.volcengine.service.imp.IImpService;
import com.volcengine.service.imp.impl.ImpServiceImpl;
import com.volcengine.service.imp.model.request.*;
import com.volcengine.service.imp.model.business.*;
import com.volcengine.service.imp.model.response.*;


public class ImpSubmitJobDemo {

    public static void main(String[] args) throws Exception {
        IImpService impService = ImpServiceImpl.getInstance();

        // call below method if you don't set ak and sk
        impService.setAccessKey("your ak");
        impService.setSecretKey("your sk");

        try {
            InputPath.Builder input = InputPath.newBuilder();
            input.setType("VOD");
            input.setVodSpaceName("your space name");
            input.setFileId("your file id");

            ImpSubmitJobRequest.Builder submitJobRequest = ImpSubmitJobRequest.newBuilder();
            submitJobRequest.setInputPath(input.build());
            submitJobRequest.setTemplateId("your template id");
            submitJobRequest.setCallbackArgs("your call back args");
            submitJobRequest.setEnableLowPriority("false");

            Params.Builder params = Params.newBuilder();
            OverrideParams.Builder overrideParams = OverrideParams.newBuilder();
            // SmartEraseOverrideParams
            SmartEraseOverrideParams.Builder smartEraseOverrideParams = SmartEraseOverrideParams.newBuilder();
            Watermark.Builder watermark = Watermark.newBuilder();
            DetectRect.Builder watermarkDetectRect = DetectRect.newBuilder();
            watermarkDetectRect.setX1(0);
            watermarkDetectRect.setX2(1);
            watermarkDetectRect.setY1(0);
            watermarkDetectRect.setY2(1);
            watermark.addDetectRect(0, watermarkDetectRect.build());
            OCR.Builder ocr = OCR.newBuilder();
            DetectRect.Builder ocrDetectRect = DetectRect.newBuilder();
            ocrDetectRect.setX1(0);
            ocrDetectRect.setX2(1);
            ocrDetectRect.setY1(0);
            ocrDetectRect.setY2(1);
            ocr.addDetectRect(0, ocrDetectRect.build());
            smartEraseOverrideParams.addActivityId("*");
            smartEraseOverrideParams.setWatermark(watermark.build());
            smartEraseOverrideParams.setOCR(ocr.build());
            overrideParams.addSmartErase(0, smartEraseOverrideParams.build());
            // OutputOverrideParams
            OutputOverrideParams.Builder outputOverrideParams = OutputOverrideParams.newBuilder();
            OutputPath.Builder outputPath = OutputPath.newBuilder();
            outputPath.setType("your storage type");
            outputPath.setVodSpaceName("your vod spaceName");
            outputPath.setTosBucket("your tos bucketName");
            outputPath.setFileName("output FileName");
            outputOverrideParams.addActivityId("*");
            outputOverrideParams.setOutputPath(outputPath.build());
            overrideParams.addOutput(0, outputOverrideParams.build());
            params.setOverrideParams(overrideParams.build());
            submitJobRequest.setParams(params.build());

            ImpSubmitJobResponse resp =  impService.SubmitJob(submitJobRequest.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}