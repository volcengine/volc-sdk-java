package com.volcengine.service.notify;

import com.volcengine.service.IBaseService;
import com.volcengine.service.notify.model.request.*;
import com.volcengine.service.notify.model.response.*;

/**
 * notify service interface
 */
public interface NotifyService extends IBaseService {
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
}
