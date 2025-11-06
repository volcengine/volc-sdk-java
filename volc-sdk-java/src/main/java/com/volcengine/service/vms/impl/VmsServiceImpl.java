package com.volcengine.service.vms.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.vms.VmsConfig;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.request.*;
import com.volcengine.service.vms.response.*;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VmsServiceImpl extends BaseServiceImpl implements VmsService {

    protected VmsServiceImpl() {
        super(VmsConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1),
            VmsConfig.apiInfoList);
    }

    public static VmsServiceImpl getInstance() {
        return new VmsServiceImpl();
    }

    @Override
    public SecretBindResponse bindAXB(BindAXBRequest request) throws Exception {
        RawResponse response = formPostWithRetry("BindAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public SecretBindResponse selectNumberAndBindAXB(SelectNumberAndBindAXBRequest request)
        throws Exception {
        RawResponse response = formPostWithRetry("SelectNumberAndBindAXB",
            Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public OperationResponse unbindAXB(SpecificSubIdRequest request) throws Exception {
        RawResponse response = formPostWithRetry("UnbindAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public QuerySubscriptionResponse querySubscription(SpecificSubIdRequest request)
        throws Exception {
        RawResponse response = formPostWithRetry("QuerySubscription",
            Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), QuerySubscriptionResponse.class);
    }

    @Override
    public QuerySubscriptionForListResponse querySubscriptionForList(
        QuerySubscriptionForListRequest request) throws Exception {
        RawResponse response = formPostWithRetry("QuerySubscriptionForList",
            Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), QuerySubscriptionForListResponse.class);
    }

    @Override
    public SecretBindResponse upgradeAXToAXB(UpgradeAXToAXBRequest request) throws Exception {
        RawResponse response = formPostWithRetry("UpgradeAXToAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public OperationResponse updateAXB(UpdateAXBRequest request) throws Exception {
        RawResponse response = formPostWithRetry("UpdateAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public SecretBindResponse bindAXN(BindAXNRequest request) throws Exception {
        RawResponse response = formPostWithRetry("BindAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public SecretBindResponse selectNumberAndBindAXN(SelectNumberAndBindAXNRequest request) throws Exception {
        RawResponse response = formPostWithRetry("SelectNumberAndBindAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public OperationResponse updateAXN(UpdateAXNRequest request) throws Exception {
        RawResponse response = formPostWithRetry("UpdateAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public OperationResponse unbindAXN(SpecificSubIdRequest request) throws Exception {
        RawResponse response = formPostWithRetry("UnbindAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public Click2CallResponse click2Call(Click2CallRequest request) throws Exception {
        RawResponse response = formPost("Click2Call", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), Click2CallResponse.class);
    }

    @Override
    public OperationResponse cancelClick2Call(CancelClick2CallRequest request) throws Exception {
        RawResponse response = formPost("CancelClick2Call", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public SecretBindResponse bindAXNE(BindAXNERequest request) throws Exception {
        RawResponse response = formPostWithRetry("BindAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public OperationResponse unbindAXNE(SpecificSubIdRequest request) throws Exception {
        RawResponse response = formPostWithRetry("UnbindAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public OperationResponse updateAXNE(UpdateAXNERequest request) throws Exception {
        RawResponse response = formPostWithRetry("UpdateAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public SecretBindResponse bindAXBForAXNE(BindAXBForAXNERequest request) throws Exception {
        RawResponse response = formPostWithRetry("BindAXBForAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public SecretBindResponse bindAXYB(BindAXYBRequest request) throws Exception {
        RawResponse response = formPostWithRetry("BindAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public SecretBindResponse bindYBForAXYB(BindYBForAXYBRequest request) throws Exception {
        RawResponse response = formPostWithRetry("BindYBForAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public OperationResponse unbindAXYB(SpecificSubIdRequest request) throws Exception {
        RawResponse response = formPostWithRetry("UnbindAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public OperationResponse updateAXYB(UpdateAXYBRequest request) throws Exception {
        RawResponse response = formPostWithRetry("UpdateAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public SecretBindResponse bindAXG(BindAXGRequest request) throws Exception {
        return doJson("BindAXG", request, new TypeReference<SecretBindResponse>(){});
    }

    @Override
    public OperateResponse unbindAXG(UnbindAXGRequest request) throws Exception {
        return doJson("UnbindAXG", request, new TypeReference<OperateResponse>(){});
    }

    @Override
    public OperateResponse updateAXG(UpdateAXGRequest request) throws Exception {
        return doJson("UpdateAXG", request, new TypeReference<OperateResponse>(){});
    }

    @Override
    public CreateAXGGroupResponse createAXGGroup(CreateAXGGroupRequest request) throws Exception {
        return doJson("CreateAXGGroup", request, new TypeReference<CreateAXGGroupResponse>(){});
    }

    @Override
    public OperateResponse deleteAXGGroup(DeleteAXGGroupRequest request) throws Exception {
        return doJson("DeleteAXGGroup", request, new TypeReference<OperateResponse>(){});
    }

    @Override
    public OperateResponse updateAXGGroup(UpdateAXGGroupRequest request) throws Exception {
        return doJson("UpdateAXGGroup", request, new TypeReference<OperateResponse>(){});
    }

    @Override
    public RouteAAuthResponse routeAAuth(RouteAAuthRequest request) throws Exception {
        RawResponse response = formPostWithRetry("RouteAAuth", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RouteAAuthResponse.class);
    }

    @Override
    public AuthQueryResponse queryAuth(AuthQueryRequest request) throws Exception {
        RawResponse response = formPostWithRetry("QueryAuth", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), AuthQueryResponse.class);
    }

    @Override
    public NumberPoolListResponse queryNumberPoolList(NumberPoolListRequest request) throws Exception {
        RawResponse response = formPostWithRetry("NumberPoolList", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), NumberPoolListResponse.class);
    }

    @Override
    public NumberListResponse queryNumberList(NumberListRequest request) throws Exception {
        RawResponse response = formPostWithRetry("NumberList", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), NumberListResponse.class);
    }

    @Override
    public CreateNumberPoolResponse createNumberPool(CreateNumberPoolRequest request) throws Exception {
        RawResponse response = formPost("CreateNumberPool", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CreateNumberPoolResponse.class);
    }

    @Override
    public UpdateNumberPoolResponse updateNumberPool(UpdateNumberPoolRequest request) throws Exception {
        RawResponse response = formPost("UpdateNumberPool", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), UpdateNumberPoolResponse.class);
    }

    @Override
    public EnableNumberResponse enableOrDisableNumber(EnableNumberRequest request) throws Exception {
        RawResponse response = formPost("EnableOrDisableNumber", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), EnableNumberResponse.class);
    }

    @Override
    public SelectNumberResponse selectNumber(SelectNumberRequest request) throws Exception {
        RawResponse response = query("SelectNumber", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SelectNumberResponse.class);
    }

    @Override
    public QueryCallRecordMsgResponse queryCallRecordMsg(QueryCallRecordRequest request) throws Exception {
        RawResponse response = formPost("QueryCallRecordMsg", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), QueryCallRecordMsgResponse.class);
    }

    @Override
    public QueryAudioRecordFileUrlResponse queryAudioRecordFileUrl(QueryAudioRecordFileUrlRequest request) throws Exception {
        RawResponse response = formPostWithRetry("QueryAudioRecordFileUrl", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), QueryAudioRecordFileUrlResponse.class);
    }

    @Override
    public QueryAudioRecordToTextFileResponse queryAudioRecordToTextFile(QueryAudioRecordToTextFileRequest request) throws Exception {
        RawResponse response = formPostWithRetry("QueryAudioRecordToTextFileUrl", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), QueryAudioRecordToTextFileResponse.class);
    }

    @Override
    public CommonResponse<TaskAppendResult> createTask(CreateTaskRequest request) throws Exception{
        return doJson("CreateTask", request, new TypeReference<CommonResponse<TaskAppendResult>>(){});
    }

    @Override
    public CommonResponse<TaskAppendResult> batchAppend(BatchAppendRequest request) throws Exception{
        return doJson("BatchAppend", request, new TypeReference<CommonResponse<TaskAppendResult>>(){});
    }

    @Override
    public CommonResponse<TaskAppendResult> updateTask(EditTaskRequest request) throws Exception {
        return doJson("UpdateTask", request, new TypeReference<CommonResponse<TaskAppendResult>>(){});
    }

    @Override
    public CommonResponse pauseTask(String taskOpenId) throws Exception{
        return doQuery("PauseTask", Arrays.asList(new BasicNameValuePair("TaskOpenId",taskOpenId)), new TypeReference<CommonResponse>(){});
    }

    @Override
    public CommonResponse resumeTask(String taskOpenId) throws Exception{
        return doQuery("ResumeTask",Arrays.asList(new BasicNameValuePair("TaskOpenId",taskOpenId)), new TypeReference<CommonResponse>(){});
    }

    @Override
    public CommonResponse stopTask(String taskOpenId) throws Exception{
        return doQuery("StopTask",Arrays.asList(new BasicNameValuePair("TaskOpenId",taskOpenId)), new TypeReference<CommonResponse>(){});
    }

    @Override
    public CommonResponse<SingleAppendResult> singleBatchAppend(SingleAppendRequest request) throws Exception {
        return doJson("SingleBatchAppend", request, new TypeReference<CommonResponse<SingleAppendResult>>(){});
    }

    @Override
    public CommonResponse<SingleInfo> singleInfo(String singleOpenId) throws Exception {
        return doQuery("SingleInfo",Arrays.asList(new BasicNameValuePair("SingleOpenId",singleOpenId)), new TypeReference<CommonResponse<SingleInfo>>(){});

    }

    @Override
    public CommonResponse singleCancel(String singleOpenId) throws Exception {
        return doQuery("SingleCancel",Arrays.asList(new BasicNameValuePair("SingleOpenId",singleOpenId)), new TypeReference<CommonResponse>(){});
    }


    @Override
    public CommonResponse<BasicResourceResult> fetchVoiceResourceByUrl(FetchVoiceResourceRequest request) throws Exception {
        return doJson("FetchResource", request, new TypeReference<CommonResponse<BasicResourceResult>>(){});
    }

    @Override
    public CommonResponse<BasicResourceResult> createTtsResource(CreateTtsResourceRequest request) throws Exception {
        return doJson("OpenCreateTts", request, new TypeReference<CommonResponse<BasicResourceResult>>(){});
    }

    @Override
    public CommonResponse<BasicResourceResult> deleteResourceByResourceKey(String resourceKey) throws Exception {
        return doQuery("OpenDeleteResource", Collections.singletonList(new BasicNameValuePair("ResourceKey", resourceKey)), new TypeReference<CommonResponse<BasicResourceResult>>(){});
    }

    @Override
    public CommonResponse<BasicResourceResult> generateVoiceResourceUploadUrl(UploadVoiceResourceRequest request) throws Exception {
        return doJson("GetResourceUploadUrl", request, new TypeReference<CommonResponse<BasicResourceResult>>(){});
    }

    @Override
    public CommonResponse<BasicResourceResult> commitVoiceResourceUpload(UploadVoiceResourceRequest request) throws Exception {
        return doJson("CommitResourceUpload", request, new TypeReference<CommonResponse<BasicResourceResult>>(){});
    }

    @Override
    public CommonResponse<BasicResourceResult> openUpdateResource(String resourceKey, String name) throws Exception {
        return doQuery("OpenUpdateResource", Arrays.asList(new BasicNameValuePair("ResourceKey",resourceKey), new BasicNameValuePair("Name",name)),
            new TypeReference<CommonResponse<BasicResourceResult>>() {});
    }

    @Override
    public CommonResponse<List<ResourceResult>> queryUsableResource(Integer type) throws Exception {
        return doQuery("QueryUsableResource", Arrays.asList(new BasicNameValuePair("Type", String.valueOf(type))), new TypeReference<CommonResponse<List<ResourceResult>>>() {});
    }

    @Override
    public CommonResponse<QueryOpenGetResourceResult> queryOpenGetResource(QueryResourceRequest request) throws Exception {
        return doJson("QueryOpenGetResource", request, new TypeReference<CommonResponse<QueryOpenGetResourceResult>>() {});
    }

    @Override
    public RiskControlResponse canCall(RiskControlReq request) throws Exception {
        RawResponse response = post("QueryCanCall", new ArrayList<>(), Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RiskControlResponse.class);
    }

    @Override
    public UploadQualificationFileResponse uploadQualificationFile(UploadQualificationFileRequest request)
        throws Exception {
        List<NameValuePair> fromData = new ArrayList<>();
        fromData.add(new BasicNameValuePair("fileType", request.getFileType()));

        RawResponse response =
            postFileMultiPart("UploadQualificationFile", fromData, "file", request.getFileName(), request.getFile());
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), UploadQualificationFileResponse.class);
    }

    @Override
    public AddQualificationResponse addQualification(QualificationInfoOperateRequest request) throws Exception {
        return doJson("AddQualification", request, new TypeReference<AddQualificationResponse>(){});
    }

    @Override
    public UpdateQualificationResponse updateQualification(QualificationInfoOperateRequest request) throws Exception {
        return doJson("UpdateQualification", request, new TypeReference<UpdateQualificationResponse>(){});
    }

    @Override
    public QualificationInfoQueryResponse queryQualification(QualificationInfoQueryRequest request) throws Exception {
        return doJson("QueryQualification", request, new TypeReference<QualificationInfoQueryResponse>(){});
    }

    private RawResponse formPostWithRetry(String api, List<NameValuePair> nameValuePairs) {
        RawResponse rawResponse = post(api, Collections.emptyList(), nameValuePairs);
        if (SdkError.EHTTP.getNumber() == rawResponse.getCode()) {
            rawResponse = post(api, Collections.emptyList(), nameValuePairs);
        }
        return rawResponse;
    }


    private RawResponse formPost(String api, List<NameValuePair> nameValuePairs) {
        return post(api, Collections.emptyList(), nameValuePairs);
    }

    private <T> T doJson(String action, Object request, TypeReference<T> typeReference) throws Exception{
        RawResponse response = json(action, new ArrayList<>(), JSONObject.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), typeReference.getType());
    }


    private <T> T doQuery(String action, List<NameValuePair> params, TypeReference<T> typeReference) throws Exception{
        RawResponse response = query(action, params);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), typeReference.getType());
    }
}
