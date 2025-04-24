package com.volcengine.service.vms;

import com.volcengine.service.IBaseService;
import com.volcengine.service.vms.request.*;
import com.volcengine.service.vms.response.*;

import java.util.List;

public interface VmsService extends IBaseService {

    SecretBindResponse bindAXB(BindAXBRequest request) throws Exception;

    SecretBindResponse selectNumberAndBindAXB(SelectNumberAndBindAXBRequest request) throws Exception;

    OperationResponse unbindAXB(SpecificSubIdRequest request) throws Exception;

    QuerySubscriptionResponse querySubscription(SpecificSubIdRequest request) throws Exception;

    QuerySubscriptionForListResponse querySubscriptionForList(QuerySubscriptionForListRequest request) throws Exception;

    SecretBindResponse upgradeAXToAXB(UpgradeAXToAXBRequest request) throws Exception;

    OperationResponse updateAXB(UpdateAXBRequest request) throws Exception;

    SecretBindResponse bindAXN(BindAXNRequest request) throws Exception;

    SecretBindResponse selectNumberAndBindAXN(SelectNumberAndBindAXNRequest request) throws Exception;

    OperationResponse updateAXN(UpdateAXNRequest request) throws Exception;

    OperationResponse unbindAXN(SpecificSubIdRequest request) throws Exception;

    Click2CallResponse click2Call(Click2CallRequest request) throws Exception;

    OperationResponse cancelClick2Call(CancelClick2CallRequest request) throws Exception;

    SecretBindResponse bindAXNE(BindAXNERequest request) throws Exception;

    OperationResponse unbindAXNE(SpecificSubIdRequest request) throws Exception;

    OperationResponse updateAXNE(UpdateAXNERequest request) throws Exception;

    SecretBindResponse bindAXBForAXNE(BindAXBForAXNERequest request) throws Exception;

    SecretBindResponse bindAXYB(BindAXYBRequest request) throws Exception;

    SecretBindResponse bindYBForAXYB(BindYBForAXYBRequest request) throws Exception;

    OperationResponse unbindAXYB(SpecificSubIdRequest request) throws Exception;

    OperationResponse updateAXYB(UpdateAXYBRequest request) throws Exception;

    RouteAAuthResponse routeAAuth(RouteAAuthRequest request) throws Exception;

    AuthQueryResponse queryAuth(AuthQueryRequest request) throws Exception;

    /**
     * 查询号码池列表
     *
     * @param request
     * @return
     * @throws Exception
     */
    NumberPoolListResponse queryNumberPoolList(NumberPoolListRequest request) throws Exception;

    /**
     * 查询号码列表
     *
     * @param request
     * @return
     * @throws Exception
     */
    NumberListResponse queryNumberList(NumberListRequest request) throws Exception;

    /**
     * 新建号码池
     *
     * @param request
     * @return
     * @throws Exception
     */
    CreateNumberPoolResponse createNumberPool(CreateNumberPoolRequest request) throws Exception;

    /**
     * 更新号码池
     *
     * @param request
     * @return
     * @throws Exception
     */
    UpdateNumberPoolResponse updateNumberPool(UpdateNumberPoolRequest request) throws Exception;

    /**
     * 批量号码启用/停用
     *
     * @param request
     * @return
     * @throws Exception
     */
    EnableNumberResponse enableOrDisableNumber(EnableNumberRequest request) throws Exception;

    /**
     * 选号
     *
     * @param request
     * @return
     * @throws Exception
     */
    SelectNumberResponse selectNumber(SelectNumberRequest request) throws Exception;

    QueryCallRecordMsgResponse queryCallRecordMsg(QueryCallRecordRequest request) throws Exception;

    QueryAudioRecordFileUrlResponse queryAudioRecordFileUrl(QueryAudioRecordFileUrlRequest request) throws Exception;

    QueryAudioRecordToTextFileResponse queryAudioRecordToTextFile(QueryAudioRecordToTextFileRequest request) throws Exception;

    /**
     * create task
     * @param request — request
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse<TaskAppendResult> createTask(CreateTaskRequest request) throws Exception;

    /**
     * append phone to task
     * @param request — request
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse<TaskAppendResult> batchAppend(BatchAppendRequest request) throws Exception;

    /**
     * update task info
     * @param request — request
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse<TaskAppendResult> updateTask(EditTaskRequest request) throws Exception;

    /**
     * pause task
     * @param taskOpenId — task id
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse pauseTask(String taskOpenId) throws Exception;

    /**
     * resume task
     * @param taskOpenId — task id
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse resumeTask(String taskOpenId) throws Exception;

    /**
     * stop task
     * @param taskOpenId — task id
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse stopTask(String taskOpenId) throws Exception;

    /**
     * create a single call
     * @param request — request
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse<SingleAppendResult> singleBatchAppend(SingleAppendRequest request) throws Exception;

    /**
     * query a single call info
     * @param singleOpenId — singleId
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse<SingleInfo> singleInfo(String singleOpenId) throws Exception;

    /**
     * cancel a single call
     * @param singleOpenId — singleId
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse singleCancel(String singleOpenId) throws Exception;



    /**
     * fetch voice resource from public url
     * @param request -- request
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse<BasicResourceResult> fetchVoiceResourceByUrl(FetchVoiceResourceRequest request) throws Exception;


    /**
     * create tts resource
     * @param request — request
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse<BasicResourceResult> createTtsResource(CreateTtsResourceRequest request) throws Exception;


    /**
     * delete resource by key
     * @param resourceKey — key
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse<BasicResourceResult> deleteResourceByResourceKey(String resourceKey) throws Exception;



    /**
     * get a signed url
     *
     * use with commitVoiceResourceUpload
     *
     * 1、get a signed url;
     * 2、upload a voice resource — send a put http request to generated url;
     * 3、invoke function of commitVoiceResourceUpload to commit request
     *
     * @param request — request
     * @return CommonResponse
     * @throws Exception exception
     */
    CommonResponse<BasicResourceResult> generateVoiceResourceUploadUrl(UploadVoiceResourceRequest request) throws Exception;


    /**
     * commit upload request
     *
     * you should get a signed url and then send a http request by this signed url,
     * finally you can invoke this function to commit your request
     *
     * @param request
     * @return
     * @throws Exception
     */
    CommonResponse<BasicResourceResult> commitVoiceResourceUpload(UploadVoiceResourceRequest request) throws Exception;

    /**
     * update resource name
     * @param resourceKey
     * @param name
     * @return
     * @throws Exception
     */
    CommonResponse<BasicResourceResult> openUpdateResource(String resourceKey, String name) throws Exception;

    /**
     * query usable resource
     * @param type
     * @return
     * @throws Exception
     */
    CommonResponse<List<ResourceResult>> queryUsableResource(Integer type) throws Exception;

    /**
     * query resource by form
     * @param request
     * @return
     * @throws Exception
     */
    CommonResponse<QueryOpenGetResourceResult> queryOpenGetResource(QueryResourceRequest request) throws Exception;

    RiskControlResponse canCall(RiskControlReq request) throws Exception;

    /**
     * 资质图片上传接口
     *
     * @param request
     * @return
     * @throws Exception
     */
    UploadQualificationFileResponse uploadQualificationFile(UploadQualificationFileRequest request) throws Exception;

    /**
     * 添加资质
     *
     * @param request
     * @return
     * @throws Exception
     */
    AddQualificationResponse addQualification(QualificationInfoOperateRequest request) throws Exception;

    /**
     * 更新资质
     *
     * @param request
     * @return
     * @throws Exception
     */
    UpdateQualificationResponse updateQualification(QualificationInfoOperateRequest request) throws Exception;

    /**
     * 查询资质
     *
     * @param request
     * @return
     * @throws Exception
     */
    QualificationInfoQueryResponse queryQualification(QualificationInfoQueryRequest request) throws Exception;
}
