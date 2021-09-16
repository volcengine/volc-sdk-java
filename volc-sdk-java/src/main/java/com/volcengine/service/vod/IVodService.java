
// Code generated by protoc-gen-volcengine-sdk
// source: vod/service/service_vod.proto
// DO NOT EDIT!

package com.volcengine.service.vod;

/**
 * The interface Vod service.
 */
public interface IVodService extends com.volcengine.service.IBaseService {
     
    /**
	 * Gets private drm auth token.
	 *
	 * @param input the params
	 * @param expireSeconds the params
	 * @return the private drm auth token
	 * @throws Exception the exception
	 */
	String getPrivateDrmAuthToken(com.volcengine.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest input, Long expireSeconds) throws Exception;
    
    /**
     * Gets hls auth token.
     *
     * @param expireSeconds the params
     * @return the hls auth token
     * @throws Exception the exception
     */
    String createSha1HlsDrmAuthToken(Long expireSeconds) throws Exception;

    /**
     * Gets subtitle auth token.
     *
     * @param input the params
     * @return the play auth token
     * @throws Exception the exception
     */
    String getSubtitleAuthToken(com.volcengine.service.vod.model.request.VodGetSubtitleInfoListRequest input, Long expireSeconds) throws Exception;
	
    /**
     * Gets play auth token.
     *
     * @param input the params
     * @return the play auth token
     * @throws Exception the exception
     */
    String getPlayAuthToken(com.volcengine.service.vod.model.request.VodGetPlayInfoRequest input, Long expireSeconds) throws Exception;

    /**
     * Get Upload Sts2 token.
     *
     * @return com.volcengine.model.sts2.SecurityToken2
     * @throws Exception the exception
     */
    com.volcengine.model.sts2.SecurityToken2 getUploadSts2() throws Exception;

    /**
     * Get Upload Sts2 token with expired time.
     *
     * @param expire long
     * @return com.volcengine.model.sts2.SecurityToken2
     * @throws Exception the exception
     */
    com.volcengine.model.sts2.SecurityToken2 getUploadSts2WithExpire(long expire) throws Exception;

    /**
     * uploadMedia
     *
     * @param vodUploadMediaRequest com.volcengine.service.vod.model.request.VodUploadMediaRequest
     * @return com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse
     * @throws Exception the exception
     */
    com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse uploadMedia(com.volcengine.service.vod.model.request.VodUploadMediaRequest vodUploadMediaRequest) throws Exception;

    /**
	 * uploadMaterial
	 *
	 * @param vodUploadMaterialRequest
	 * @return
	 * @throws Exception
	 */
	com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse uploadMaterial(com.volcengine.service.vod.model.request.VodUploadMaterialRequest vodUploadMaterialRequest) throws Exception;



	/**
     * getPlayInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetPlayInfoRequest
     * @return com.volcengine.service.vod.model.response.VodGetPlayInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetPlayInfoResponse getPlayInfo(com.volcengine.service.vod.model.request.VodGetPlayInfoRequest input) throws Exception;
	
	/**
     * getPrivateDrmPlayAuth.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest
     * @return com.volcengine.service.vod.model.response.VodGetPrivateDrmPlayAuthResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetPrivateDrmPlayAuthResponse getPrivateDrmPlayAuth(com.volcengine.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest input) throws Exception;
	
	/**
     * getHlsDecryptionKey.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetHlsDecryptionKeyRequest
     * @return com.volcengine.service.vod.model.response.VodGetHlsDecryptionKeyResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetHlsDecryptionKeyResponse getHlsDecryptionKey(com.volcengine.service.vod.model.request.VodGetHlsDecryptionKeyRequest input) throws Exception;
	
	/**
     * uploadMediaByUrl.
     *
     * @param input com.volcengine.service.vod.model.request.VodUrlUploadRequest
     * @return com.volcengine.service.vod.model.response.VodUrlUploadResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUrlUploadResponse uploadMediaByUrl(com.volcengine.service.vod.model.request.VodUrlUploadRequest input) throws Exception;
	
	/**
     * queryUploadTaskInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodQueryUploadTaskInfoRequest
     * @return com.volcengine.service.vod.model.response.VodQueryUploadTaskInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodQueryUploadTaskInfoResponse queryUploadTaskInfo(com.volcengine.service.vod.model.request.VodQueryUploadTaskInfoRequest input) throws Exception;
	
	/**
     * applyUploadInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest
     * @return com.volcengine.service.vod.model.response.VodApplyUploadInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodApplyUploadInfoResponse applyUploadInfo(com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest input) throws Exception;
	
	/**
     * commitUploadInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodCommitUploadInfoRequest
     * @return com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse commitUploadInfo(com.volcengine.service.vod.model.request.VodCommitUploadInfoRequest input) throws Exception;
	
	/**
     * updateMediaInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodUpdateMediaInfoRequest
     * @return com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse updateMediaInfo(com.volcengine.service.vod.model.request.VodUpdateMediaInfoRequest input) throws Exception;
	
	/**
     * updateMediaPublishStatus.
     *
     * @param input com.volcengine.service.vod.model.request.VodUpdateMediaPublishStatusRequest
     * @return com.volcengine.service.vod.model.response.VodUpdateMediaPublishStatusResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUpdateMediaPublishStatusResponse updateMediaPublishStatus(com.volcengine.service.vod.model.request.VodUpdateMediaPublishStatusRequest input) throws Exception;
	
	/**
     * getMediaInfos.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetMediaInfosRequest
     * @return com.volcengine.service.vod.model.response.VodGetMediaInfosResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetMediaInfosResponse getMediaInfos(com.volcengine.service.vod.model.request.VodGetMediaInfosRequest input) throws Exception;
	
	/**
     * getRecommendedPoster.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetRecommendedPosterRequest
     * @return com.volcengine.service.vod.model.response.VodGetRecommendedPosterResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetRecommendedPosterResponse getRecommendedPoster(com.volcengine.service.vod.model.request.VodGetRecommendedPosterRequest input) throws Exception;
	
	/**
     * deleteMedia.
     *
     * @param input com.volcengine.service.vod.model.request.VodDeleteMediaRequest
     * @return com.volcengine.service.vod.model.response.VodDeleteMediaResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodDeleteMediaResponse deleteMedia(com.volcengine.service.vod.model.request.VodDeleteMediaRequest input) throws Exception;
	
	/**
     * deleteTranscodes.
     *
     * @param input com.volcengine.service.vod.model.request.VodDeleteTranscodesRequest
     * @return com.volcengine.service.vod.model.response.VodDeleteTranscodesResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodDeleteTranscodesResponse deleteTranscodes(com.volcengine.service.vod.model.request.VodDeleteTranscodesRequest input) throws Exception;
	
	/**
     * getMediaList.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetMediaListRequest
     * @return com.volcengine.service.vod.model.response.VodGetMediaListResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetMediaListResponse getMediaList(com.volcengine.service.vod.model.request.VodGetMediaListRequest input) throws Exception;
	
	/**
     * getSubtitleInfoList.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetSubtitleInfoListRequest
     * @return com.volcengine.service.vod.model.response.VodGetSubtitleInfoListResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetSubtitleInfoListResponse getSubtitleInfoList(com.volcengine.service.vod.model.request.VodGetSubtitleInfoListRequest input) throws Exception;
	
	/**
     * updateSubtitleStatus.
     *
     * @param input com.volcengine.service.vod.model.request.VodUpdateSubtitleStatusRequest
     * @return com.volcengine.service.vod.model.response.VodUpdateSubtitleStatusResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUpdateSubtitleStatusResponse updateSubtitleStatus(com.volcengine.service.vod.model.request.VodUpdateSubtitleStatusRequest input) throws Exception;
	
	/**
     * updateSubtitleInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodUpdateSubtitleInfoRequest
     * @return com.volcengine.service.vod.model.response.VodUpdateSubtitleInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUpdateSubtitleInfoResponse updateSubtitleInfo(com.volcengine.service.vod.model.request.VodUpdateSubtitleInfoRequest input) throws Exception;
	
	/**
     * StartWorkflow.
     *
     * @param input com.volcengine.service.vod.model.request.VodStartWorkflowRequest
     * @return com.volcengine.service.vod.model.response.VodStartWorkflowResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodStartWorkflowResponse StartWorkflow(com.volcengine.service.vod.model.request.VodStartWorkflowRequest input) throws Exception;
	
}  // end of service interface
