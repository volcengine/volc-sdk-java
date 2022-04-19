package com.volcengine.service.notify.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.notify.NotifyConfig;
import com.volcengine.service.notify.NotifyService;
import com.volcengine.service.notify.model.request.*;
import com.volcengine.service.notify.model.response.*;
import com.volcengine.model.NameValuePair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NotifyServiceImpl extends BaseServiceImpl implements NotifyService {


    protected NotifyServiceImpl() {
        super(NotifyConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1),
                NotifyConfig.apiInfoList);
    }


    public static NotifyServiceImpl getInstance(){
        return new NotifyServiceImpl();
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
        return doQuery("PauseTask",Arrays.asList(new NameValuePair("TaskOpenId",taskOpenId)), new TypeReference<CommonResponse>(){});
    }

    @Override
    public CommonResponse resumeTask(String taskOpenId) throws Exception{
        return doQuery("ResumeTask",Arrays.asList(new NameValuePair("TaskOpenId",taskOpenId)), new TypeReference<CommonResponse>(){});
    }

    @Override
    public CommonResponse stopTask(String taskOpenId) throws Exception{
        return doQuery("StopTask",Arrays.asList(new NameValuePair("TaskOpenId",taskOpenId)), new TypeReference<CommonResponse>(){});
    }

    @Override
    public CommonResponse<SingleAppendResult> singleBatchAppend(SingleAppendRequest request) throws Exception {
        return doJson("SingleBatchAppend", request, new TypeReference<CommonResponse<SingleAppendResult>>(){});
    }

    @Override
    public CommonResponse<SingleInfo> singleInfo(String singleOpenId) throws Exception {
        return doQuery("SingleInfo",Arrays.asList(new NameValuePair("SingleOpenId",singleOpenId)), new TypeReference<CommonResponse<SingleInfo>>(){});

    }

    @Override
    public CommonResponse singleCancel(String singleOpenId) throws Exception {
        return doQuery("SingleCancel",Arrays.asList(new NameValuePair("SingleOpenId",singleOpenId)), new TypeReference<CommonResponse>(){});
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
        return doQuery("OpenDeleteResource", Collections.singletonList(new NameValuePair("ResourceKey", resourceKey)), new TypeReference<CommonResponse<BasicResourceResult>>(){});
    }

    @Override
    public CommonResponse<BasicResourceResult> generateVoiceResourceUploadUrl(UploadVoiceResourceRequest request) throws Exception {
        return doJson("GetResourceUploadUrl", request, new TypeReference<CommonResponse<BasicResourceResult>>(){});
    }

    @Override
    public CommonResponse<BasicResourceResult> commitVoiceResourceUpload(UploadVoiceResourceRequest request) throws Exception {
        return doJson("CommitResourceUpload", request, new TypeReference<CommonResponse<BasicResourceResult>>(){});
    }
}
