package com.volcengine.service.businessSecurity.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.businessSecurity.BusinessSecurityConfig;
import com.volcengine.service.businessSecurity.BusinessSecurityService;
import com.volcengine.util.AesUtil;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;

public class BusinessSecurityServiceImpl extends BaseServiceImpl implements BusinessSecurityService {

    private static final Integer PART_FILE_SIZE = 7340032;
    private BusinessSecurityServiceImpl() {
        super(BusinessSecurityConfig.serviceInfo, BusinessSecurityConfig.apiInfoList);
    }
    private BusinessSecurityServiceImpl(String service) {
        super(BusinessSecurityConfig.serviceInfoMapping.get(service), BusinessSecurityConfig.apiInfoList);
    } 

    private static final BusinessSecurityServiceImpl businessSecurityInstance = new BusinessSecurityServiceImpl();
    private static final BusinessSecurityServiceImpl businessSecurityOpenapiInstance = new BusinessSecurityServiceImpl("risk_console");

    public static BusinessSecurityService getInstance() {
        return businessSecurityInstance;
    }

    public static BusinessSecurityService getInstanceOpenapi() {
        return businessSecurityOpenapiInstance;
    }

    @Override
    public DeviceIdResponse DeviceId(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.DeviceId, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DeviceIdResponse.class);
    }

    @Override
    public ActivationRiskUploadSampleDataResponse ActivationRiskUploadSampleData(ActivationRiskUploadSampleDataRequest request) throws Exception {
        RawResponse response = json(Const.ActivationRiskUploadSampleData, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode()!= SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ActivationRiskUploadSampleDataResponse.class);
    }

    @Override
    public ActivationRiskUploadBasePackageResponse ActivationRiskUploadBasePackage(ActivationRiskUploadBasePackageRequest request) throws Exception {
        RawResponse response = json(Const.ActivationRiskUploadBasePackage, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode()!= SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ActivationRiskUploadBasePackageResponse.class);
    }

    @Override
    public ActivationRiskCompleteBasePackageResponse ActivationRiskCompleteBasePackage(ActivationRiskCompleteBasePackageRequest request) throws Exception {
        RawResponse response = json(Const.ActivationRiskCompleteBasePackage, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode()!= SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ActivationRiskCompleteBasePackageResponse.class);
    }

    @Override
    public ActivationRiskCompleteSampleDataResponse ActivationRiskCompleteSampleData(ActivationRiskCompleteSampleDataRequest request) throws Exception {

        RawResponse response = json(Const.ActivationRiskCompleteSampleData, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode()!= SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ActivationRiskCompleteSampleDataResponse.class);
    }

    @Override
    public ActivationRiskDetectRiskResponse ActivationRiskDetectRisk(ActivationRiskDetectRiskRequest request) throws Exception {
        RawResponse response = json(Const.ActivationRiskDetectRisk, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode()!= SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ActivationRiskDetectRiskResponse.class);
    }

    @Override
    public ActivationRiskAsyncDetectRiskResponse ActivationRiskAsyncDetectRisk(ActivationRiskAsyncDetectRiskRequest request) throws Exception {
        RawResponse response = json(Const.ActivationRiskAsyncDetectRisk, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode()!= SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ActivationRiskAsyncDetectRiskResponse.class);
    }

    @Override
    public ActivationRiskCancelAsyncDetectRiskResponse ActivationRiskCancelAsyncDetectRisk(ActivationRiskCancelAsyncDetectRiskRequest request) throws Exception {
        RawResponse response = json(Const.ActivationRiskCancelAsyncDetectRisk, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode()!= SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ActivationRiskCancelAsyncDetectRiskResponse.class);
    }

    @Override
    public RiskDetectionResponse RiskDetection(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.RiskDetection, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }


        return JSON.parseObject(response.getData(), RiskDetectionResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse AsyncRiskDetection(AsyncRiskDetectionRequest asyncRiskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AsyncRiskDetection, new ArrayList<>(), JSON.toJSONString(asyncRiskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public RiskResultResponse RiskResult(RiskResultRequest riskResultRequest) throws Exception {
        RawResponse response = query(Const.RiskResult, Utils.mapToPairList(Utils.paramsToMap(riskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), RiskResultResponse.class);
    }

    @Override
    public DataReportResponse DataReport(DataReportRequest dataReportRequest) throws Exception {
        RawResponse response = json(Const.DataReport, new ArrayList<>(), JSON.toJSONString(dataReportRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DataReportResponse.class);
    }

    @Override
    public RiskDetectionResponse AccountRisk(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AccountRisk, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), RiskDetectionResponse.class);
    }



    @Override
    public MobileStatusResponseV2 MobileStatusV2(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.MobileStatusV2, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), MobileStatusResponseV2.class);
    }



    @Override
    public ElementVerifyResponseV2 ElementVerifyV2(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.ElementVerifyV2, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ElementVerifyResponseV2.class);
    }

    @Override
    public ElementVerifyResponseV2 ElementVerifyEncrypted(String key, String encryptedType, RiskDetectionRequest riskDetectionRequest) throws Exception {
        String parameters = AesUtil.aesCBCEncryptWithBase64(riskDetectionRequest.getParameters(), key);
        riskDetectionRequest.setParameters(parameters);
        riskDetectionRequest.setEncryptedType(encryptedType);

        RawResponse response = json(Const.ElementVerifyEncrypted, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ElementVerifyResponseV2.class);
    }

    @Override
    public RiskStatResponse.CommonRiskStatResponse SimpleRiskStat(RiskStatRequest.CommonProductStatisticsReq commonProductStatisticsReq) throws Exception {
        RawResponse response = json(Const.SimpleRiskStat, new ArrayList<>(), JSON.toJSONString(commonProductStatisticsReq));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), RiskStatResponse.CommonRiskStatResponse.class);
    }

    @Override
    public RiskStatResponse.CommonRiskStatResponse ContentRiskStat(RiskStatRequest.CommonProductStatisticsReq commonProductStatisticsReq) throws Exception {
        RawResponse response = json(Const.ContentRiskStat, new ArrayList<>(), JSON.toJSONString(commonProductStatisticsReq));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RiskStatResponse.CommonRiskStatResponse.class);
    }

    @Override
    public RiskVConsoleResponse.GetUploadIdResult GetUploadId(GetUploadIdRequest request) throws Exception {
        RawResponse response = json(Const.GetUploadId, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(),RiskVConsoleResponse.GetUploadIdResult.class);
    }


    @Override
    public RiskVConsoleResponse.UploadFileResult UploadFile(UploadFileRequest request) throws Exception {
        List<NameValuePair> fromData = new ArrayList<>();
        fromData.add(new BasicNameValuePair("app_id", String.valueOf(request.getAppId())));
        fromData.add(new BasicNameValuePair("upload_id", String.valueOf(request.getUploadId())));
        fromData.add(new BasicNameValuePair("part_size", String.valueOf(request.getPartSize())));
        fromData.add(new BasicNameValuePair("part_num", String.valueOf(request.getPartNum())));

        RawResponse response = postFileMultiPart(Const.UploadFile,fromData, "content", request.getFileName(),request.getContent());
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(),RiskVConsoleResponse.UploadFileResult.class);
    }

    @Override
    public RiskVConsoleResponse.CompleteUploadFileResult CompleteUploadFile(CompleteUploadFileRequest request) throws Exception {
        RawResponse response = json(Const.CompleteUploadFile, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(),RiskVConsoleResponse.CompleteUploadFileResult.class);
    }

    @Override
    public RiskVConsoleResponse.GetUploadedPartListResult GetUploadedPartList(GetUploadedPartListRequest request) throws Exception {
        RawResponse response = json(Const.GetUploadedPartList, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(),RiskVConsoleResponse.GetUploadedPartListResult.class);
    }


    public PushTrafficRiskDataResponse PushTrafficRiskData(PushTrafficRiskDataRequest request)throws  Exception{
        FileInfo fileInfo = getFileInfo(request.getFilePath());
        String fileName = request.getFilePath().substring(request.getFilePath().lastIndexOf("/")+1);
        GetUploadIdRequest getUploadIdRequest =  new GetUploadIdRequest();
        getUploadIdRequest.setAppId(request.getAppId());
        getUploadIdRequest.setFileName(fileName);
        getUploadIdRequest.setFileHash(fileInfo.getFileHash());
        getUploadIdRequest.setPartSize(PART_FILE_SIZE);
        RiskVConsoleResponse.GetUploadIdResult response = GetUploadId(getUploadIdRequest);
        String uploadId = response.getResult().getData().getUploadId() ;
        FileInputStream fis = new FileInputStream(request.getFilePath());
        GetUploadedPartListRequest getUploadedPartListRequest = new GetUploadedPartListRequest();
        getUploadedPartListRequest.setUploadId(uploadId);
        getUploadedPartListRequest.setAppId(request.getAppId());
        RiskVConsoleResponse.GetUploadedPartListResult uploadedPartListResult = GetUploadedPartList(getUploadedPartListRequest);
        List<Integer> uploadedPartList = uploadedPartListResult.getResult().getData();
        Set<Integer> set = new HashSet<>();
        if(uploadedPartList != null){
            set.addAll(uploadedPartList);
        }
        byte[] buffer = new byte[PART_FILE_SIZE]; // 每次读取的字节数
        int bytesRead;
        int partNum = 1;
        while ((bytesRead = fis.read(buffer)) != -1) {
            if(set.contains(partNum)){
                partNum++;
                continue;
            }
            UploadFileRequest uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setAppId(request.getAppId());
            uploadFileRequest.setFileName(fileName);
            uploadFileRequest.setUploadId(uploadId);
            uploadFileRequest.setPartNum(partNum++);
            uploadFileRequest.setPartSize(bytesRead);
            if(bytesRead == PART_FILE_SIZE) {
                uploadFileRequest.setContent(buffer);
            }else {
                byte[] newBuffer = new byte[bytesRead];
                System.arraycopy(buffer,0,newBuffer,0,bytesRead);
                uploadFileRequest.setContent(newBuffer);
            }
            RiskVConsoleResponse.UploadFileResult result = UploadFile(uploadFileRequest);
            if(!"0".equals(result.getResult().getErrCode())){
                return PushTrafficRiskDataResponse.builder().success(false).build();
            }
        }
        CompleteUploadFileRequest completeUploadFileRequest = new CompleteUploadFileRequest();
        completeUploadFileRequest.setAppId(request.getAppId());
        completeUploadFileRequest.setUploadId(uploadId);
        completeUploadFileRequest.setBusinessType(request.getBusinessType());
        completeUploadFileRequest.setDataType(request.getDataType());
        completeUploadFileRequest.setScene(request.getScene());
        RiskVConsoleResponse.CompleteUploadFileResult completeUploadFileResult = CompleteUploadFile(completeUploadFileRequest);
        return PushTrafficRiskDataResponse.builder().success(true).packageId(completeUploadFileResult.getResult().getData()).build();
    }

    @Override
    public GetDailyMarketingPackageResponse GetDailyMarketingPackage(GetDailyMarketingPackageRequest request) throws Exception {
        RawResponse response = json(Const.GetDailyMarketingPackage, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetDailyMarketingPackageResponse.class);
    }

    @Override
    public ActivateRiskResultResponse ActivateRiskResult(ActivateRiskResultRequest request) throws Exception {
        RawResponse response = json(Const.ActivateRiskResult, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ActivateRiskResultResponse.class);
    }

    @Override
    public CancelActivateRiskResultResponse CancelActivateRiskResult(CancelActivateRiskResultRequest request) throws Exception {
        RawResponse response = json(Const.CancelActivateRiskResult, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CancelActivateRiskResultResponse.class);
    }

    @Override
    public ActivateRiskSampleDataResponse ActivateRiskSampleData(ActivateRiskSampleDataRequest request) throws Exception {
        RawResponse response = json(Const.ActivateRiskSampleData, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ActivateRiskSampleDataResponse.class);
    }

    @Override
    public ActivateRiskBasePackageResponse ActivateRiskBasePackage(ActivateRiskBasePackageRequest request) throws Exception {
        RawResponse response = json(Const.ActivateRiskBasePackage, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ActivateRiskBasePackageResponse.class);
    }

    @Data
    static class FileInfo{
        private long fileSize;

        private String fileName;

        private String filePath;

        private String fileHash;

        private int partNum;

    }

    private FileInfo getFileInfo(String filePath) throws Exception {
        if (StringUtils.isBlank(filePath)) {
            throw new Exception("filePath is null");
        }
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(filePath);
        fileInfo.setFileName(filePath.substring(filePath.lastIndexOf("/") + 1));
        long fileSize = 0l;
        int partNum = 0;
        MessageDigest md = MessageDigest.getInstance("MD5"); // 选择哈希算法，这里选择MD5

        FileInputStream fis = new FileInputStream(filePath);
        byte[] buffer = new byte[PART_FILE_SIZE]; // 每次读取的字节数
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            partNum++;
            fileSize += bytesRead;
            md.update(buffer, 0, bytesRead); // 更新哈希值
        }
        fis.close();

        byte[] hash = md.digest(); // 计算最终的哈希值

        // 将哈希值转换为十六进制字符串
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        fileInfo.setPartNum(partNum);
        fileInfo.setFileHash(hexString.toString());
        fileInfo.setFileSize(fileSize);
        return fileInfo;


    }

    @Override
    public CreateAppResponse.CommonCreateAppResponse CreateApp(CreateAppRequest createAppRequest) throws Exception {
        RawResponse response = query(Const.CreateApp, Utils.mapToPairList(Utils.paramsToMap(createAppRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateAppResponse.CommonCreateAppResponse.class);
    }

    @Override
    public ListAppsResponse.CommonListAppsResponse ListApps(ListAppsRequest listAppsRequest) throws Exception {
        RawResponse response = query(Const.ListApps, Utils.mapToPairList(Utils.paramsToMap(listAppsRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListAppsResponse.CommonListAppsResponse.class);
    }
}
