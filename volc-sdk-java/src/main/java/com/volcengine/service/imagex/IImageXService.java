package com.volcengine.service.imagex;

import com.volcengine.model.imagex.*;
import com.volcengine.model.imagex.data.*;
import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.service.IBaseService;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * The interface ImageX service.
 */
@SuppressWarnings("unused")
public interface IImageXService extends IBaseService {

    /**
     * Apply upload image.
     *
     * @param applyUploadRequest the apply upload request
     * @return the apply upload response
     * @throws Exception the exception
     */
    ApplyImageUploadResponse applyImageUpload(ApplyImageUploadRequest applyUploadRequest) throws Exception;

    /**
     * Commit upload image.
     *
     * @param commitUploadRequest the commit upload request
     * @return the commit upload response
     * @throws Exception the exception
     */
    CommitImageUploadResponse commitImageUpload(CommitImageUploadRequest commitUploadRequest) throws Exception;

    /**
     * Upload image data.
     *
     * @param request    the apply upload request
     * @param imageDatas image data array
     * @return the commit upload response
     * @throws Exception the exception
     */
    CommitImageUploadResponse uploadImages(ApplyImageUploadRequest request, List<byte[]> imageDatas) throws Exception;

    /**
     * Upload image data.
     *
     * @param request upload request
     * @param content image data
     * @param size    image size
     * @return the commit upload response
     * @throws Exception the exception
     */
    CommitImageUploadResponse uploadImages(ApplyImageUploadRequest request, List<InputStream> content, List<Long> size) throws Exception;

    /**
     * Fetch Image
     *
     * @param request url to fetch
     * @return result
     * @throws Exception the exception
     */
    FetchImageUrlResponse fetchImageUrl(FetchImageUrlRequest request) throws Exception;

    /**
     * Fetch Image
     *
     * @param request url to fetch
     * @return result
     * @throws Exception the exception
     */
    GetUrlFetchTaskResponse getUrlFetchTask(GetUrlFetchTaskRequest request) throws Exception;

    /**
     * Get image upload token.
     *
     * @param params the params
     * @return the upload token
     * @throws Exception the exception
     */
    String getUploadToken(Map<String, String> params) throws Exception;

    /**
     * Get image upload sts2 auth with default expire time (1 hour).
     *
     * @param serviceIds service id list allowed to upload image to
     * @return the upload sts2 auth
     * @throws Exception the exception
     */
    SecurityToken2 getUploadSts2(List<String> serviceIds, Map<String, String> tag) throws Exception;

    SecurityToken2 getUploadSts2(List<String> serviceIds) throws Exception;

    /**
     * Get image upload sts2 auth.
     *
     * @param serviceIds service id list allowed to upload image to
     * @param expire     expire time in milliseconds
     * @return the upload sts2 auth
     * @throws Exception the exception
     */
    SecurityToken2 getUploadSts2WithExpire(List<String> serviceIds, long expire) throws Exception;

    /**
     * Get image upload sts2 auth.
     *
     * @param serviceIds service id list allowed to upload image to
     * @param expire     expire time in milliseconds
     * @param keyPtn     upload store key pattern, * for no restriction. default to empty.
     * @return the upload sts2 auth
     * @throws Exception the exception
     */
    SecurityToken2 getUploadSts2WithKeyPtn(List<String> serviceIds, long expire, String keyPtn, Map<String, String> tag) throws Exception;

    /**
     * Delete images.
     *
     * @param req delete image req
     * @return delete image resp
     * @throws Exception the exception
     */
    DeleteImageResp deleteImages(DeleteImageReq req) throws Exception;

    /**
     * Resource a file
     *
     * @param req args
     * @return file info
     * @throws Exception the exception
     */
    GetImageUploadFileResponse getImageUploadFile(GetImageUploadFileRequest req) throws Exception;

    /**
     * List files
     *
     * @param req args
     * @return files info
     * @throws Exception the exception
     */
    GetImageUploadFilesResponse getImageUploadFiles(GetImageUploadFilesRequest req) throws Exception;

    /**
     * Update storage ttl
     *
     * @param req args
     * @return update result
     * @throws Exception the exception
     */
    UpdateImageStorageTTLResponse updateImageStorageTTL(UpdateImageStorageTTLRequest req) throws Exception;

    /**
     * create image content task
     *
     * @param req update image urls req
     * @return udpate image urls resp
     * @throws Exception the exception
     */
    CreateImageContentTaskResp createImageContentTask(CreateImageContentTaskReq req) throws Exception;

    /**
     * get image content task detail
     *
     * @param req update image urls req
     * @return udpate image urls resp
     * @throws Exception the exception
     */
    GetImageContentTaskDetailResp getImageContentTaskDetail(GetImageContentTaskDetailReq req) throws Exception;

    /**
     * get image content block list
     *
     * @param req update image urls req
     * @return udpate image urls resp
     * @throws Exception the exception
     */
    GetImageContentBlockListResp getImageContentBlockList(GetImageContentBlockListReq req) throws Exception;

    /**
     * Request ImageX api with method GET.
     *
     * @param action api action name
     * @param param  api query param
     * @return api response
     * @throws Exception the exception
     */
    CommonResponse getImageX(String action, Map<String, String> param) throws Exception;

    /**
     * Request ImageX api with method POST.
     *
     * @param action api action name
     * @param param  api query param
     * @param req    api json param
     * @return api response
     * @throws Exception the exception
     */
    CommonResponse postImageX(String action, Map<String, String> param, Object req) throws Exception;

    /**
     * Request ImageX api with method GET.
     *
     * @param action   api action name
     * @param param    api query param
     * @param respType return type
     * @return api response
     * @throws Exception the exception
     */
    <T> GenericCommonResponse<T> getImageX(String action, Map<String, String> param, Class<T> respType) throws Exception;

    /**
     * Request ImageX api with method POST.
     *
     * @param action   api action name
     * @param param    api query param
     * @param req      api json param
     * @param respType return type
     * @return api response
     * @throws Exception the exception
     */
    <T> GenericCommonResponse<T> postImageX(String action, Map<String, String> param, Object req, Class<T> respType) throws Exception;

    /**
     * Request ImageX api with method POST.
     *
     * @param param api query param
     * @return api response
     * @throws Exception the exception
     */
    GetImageOCRResponse getImageOCRV2(GetImageOCRRequest param) throws Exception;

    /**
     * Request ImageX api with method POST.
     *
     * @param req embed image hm request
     * @return image store uri
     * @throws Exception the exception
     */
    EmbedImageHmResponse embedImageHm(EmbedImageHmRequest req) throws Exception;

    /**
     * Request ImageX api with method POST.
     *
     * @param req extract hidden mark from image
     * @return embedded info
     * @throws Exception the exception
     */
    ExtractImageHmResponse extractImageHm(ExtractImageHmRequest req) throws Exception;

    /**
     * Request ImageX api with method POST.
     *
     * @param req get image segment request
     * @return image store uri
     * @throws Exception the exception
     */
    GetImageSegmentResponse getImageSegment(GetImageSegmentRequest req) throws Exception;

    /**
     * Request ImageX api with method GET.
     *
     * @param req get image erase models request
     * @return models array
     * @throws Exception the exception
     */
    GetImageEraseModelsResponse getImageEraseModels(GetImageEraseModelsRequest req) throws Exception;

    /**
     * Request ImageX api with method POST.
     *
     * @param req get image erase result
     * @return image store uri
     * @throws Exception the exception
     */
    GetImageEraseResultResponse getImageEraseResult(GetImageEraseResultRequest req) throws Exception;

    /**
     * Get image quality
     *
     * @param req request args
     * @return image quality metrics
     * @throws Exception the exception
     */
    GetImageQualityResponse getImageQuality(GetImageQualityRequest req) throws Exception;

    /**
     * Extend image
     *
     * @param req request args
     * @return extended image
     * @throws Exception the exception
     */
    GetImageBgFillResultResponse getImageBgFillResult(GetImageBgFillResultRequest req) throws Exception;

    /**
     * Detect duplicate image
     *
     * @param req request args
     * @return detection result
     * @throws Exception the exception
     */
    GetImageDuplicateDetectionSyncResponse getImageDuplicateDetectionSync(GetImageDuplicateDetectionSyncRequest req) throws Exception;

    /**
     * Detect duplicate image
     *
     * @param req request args
     * @return detection task id
     * @throws Exception the exception
     */
    GetImageDuplicateDetectionAsyncResponse getImageDuplicateDetectionAsync(GetImageDuplicateDetectionAsyncRequest req) throws Exception;

    /**
     * Retrieve duplicate detection task status
     *
     * @param req request args
     * @return detection status and result
     * @throws Exception the exception
     */
    GetDeduplicateTaskStatusResponse getDeduplicateTaskStatus(GetDeduplicateTaskStatusRequest req) throws Exception;

    /**
     * Noise reduction
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    GetDenoisingImageResponse getDenoisingImage(GetDenoisingImageRequest req) throws Exception;

    /**
     * Comicize an image
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    GetImageComicResultResponse getImageComicResult(GetImageComicResultRequest req) throws Exception;

    /**
     * Super resolution
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    GetImageSuperResolutionResultResponse getImageSuperResolutionResult(GetImageSuperResolutionResultRequest req) throws Exception;

    /**
     * Smart crop
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    GetImageSmartCropResultResponse getImageSmartCropResult(GetImageSmartCropResultRequest req) throws Exception;

    /**
     * License plate detection
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    GetLicensePlateDetectionResponse getLicensePlateDetection(GetLicensePlateDetectionRequest req) throws Exception;

    /**
     * Image modified detection
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    GetImagePSDetectionResponse getImagePSDetection(GetImagePSDetectionRequest req) throws Exception;

    /**
     * Private content detection
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    GetPrivateImageTypeResponse getPrivateImageType(GetPrivateImageTypeRequest req) throws Exception;

    /**
     * Enhance image
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    GetImageEnhanceResultResponse getImageEnhanceResult(GetImageEnhanceResultRequest req) throws Exception;

    /**
     * Image style
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    GetImageStyleResultResponse getImageStyleResult(GetImageStyleResultRequest req) throws Exception;

    /**
     * Image Migrate
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    CreateImageMigrateTaskResp createImageMigrateTask(CreateImageMigrateTaskReq req) throws Exception;

    /**
     * Image Migrate
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    GetImageMigrateTasksResp getImageMigrateTask(GetImageMigrateTasksReq req) throws Exception;

    ExportFailedMigrateTaskResp exportFailedMigrateTask(ExportFailedMigrateTaskReq req) throws Exception;


    /**
     * Image Transcode
     *
     * @param req request args
     * @return result
     * @throws Exception the exception
     */
    CreateImageTranscodeTaskResp createImageTranscodeTask(CreateImageTranscodeTaskReq req) throws Exception;

    GetImageTranscodeDetailsResp getImageTranscodeDetails(GetImageTranscodeDetailsReq req) throws Exception;

    CreateImageTranscodeCallbackResp createImageTranscodeCallback(CreateImageTranscodeCallbackReq req) throws Exception;

    DeleteImageTranscodeDetailResp deleteImageTranscodeDetail(DeleteImageTranscodeDetailReq req) throws Exception;

    CreateImageCompressTaskResp createImageCompressTask(CreateImageCompressTaskReq req) throws Exception;

    GetCompressTaskInfoResp getCompressTaskInfo(GetCompressTaskInfoReq req) throws Exception;

    UpdateImageFileKeyResp updateImageFileKey(UpdateImageFileKeyReq req) throws Exception;


    public DescribeImageXDomainTrafficDataResp describeImageXDomainTrafficData(DescribeImageXDomainTrafficDataReq req) throws Exception;

    public DescribeImageXDomainBandwidthDataResp describeImageXDomainBandwidthData(DescribeImageXDomainBandwidthDataReq req) throws Exception;

    public DescribeImageXBucketUsageResp describeImageXBucketUsage(DescribeImageXBucketUsageReq req) throws Exception;

    public DescribeImageXRequestCntUsageResp describeImageXRequestCntUsage(DescribeImageXRequestCntUsageReq req) throws Exception;

    public DescribeImageXBaseOpUsageResp describeImageXBaseOpUsage(DescribeImageXBaseOpUsageReq req) throws Exception;

    public DescribeImageXCompressUsageResp describeImageXCompressUsage(DescribeImageXCompressUsageReq req) throws Exception;

    public DescribeImageXEdgeRequestResp describeImageXEdgeRequest(DescribeImageXEdgeRequestReq req) throws Exception;

    public DescribeImageXHitRateTrafficDataResp describeImageXHitRateTrafficData(DescribeImageXHitRateTrafficDataReq req) throws Exception;

    public DescribeImageXHitRateRequestDataResp describeImageXHitRateRequestData(DescribeImageXHitRateRequestDataReq req) throws Exception;

    public DescribeImageXCDNTopRequestDataResp describeImageXCDNTopRequestData(DescribeImageXCDNTopRequestDataReq req) throws Exception;

    public DescribeImageXSummaryResp describeImageXSummary(DescribeImageXSummaryReq req) throws Exception;

    public DescribeImageXEdgeRequestBandwidthResp describeImageXEdgeRequestBandwidth(DescribeImageXEdgeRequestBandwidthReq req) throws Exception;

    public DescribeImageXEdgeRequestTrafficResp describeImageXEdgeRequestTraffic(DescribeImageXEdgeRequestTrafficReq req) throws Exception;

    public DescribeImageXEdgeRequestRegionsResp describeImageXEdgeRequestRegions(DescribeImageXEdgeRequestRegionsReq req) throws Exception;

    public DescribeImageXServiceQualityResp describeImageXServiceQuality(DescribeImageXServiceQualityReq req) throws Exception;

    public GetImageXQueryAppsResp getImageXQueryApps(GetImageXQueryAppsReq req) throws Exception;

    public GetImageXQueryRegionsResp getImageXQueryRegions(GetImageXQueryRegionsReq req) throws Exception;

    public GetImageXQueryDimsResp getImageXQueryDims(GetImageXQueryDimsReq req) throws Exception;

    public GetImageXQueryValsResp getImageXQueryVals(GetImageXQueryValsReq req) throws Exception;

    public DescribeImageXMirrorRequestTrafficResp describeImageXMirrorRequestTraffic(DescribeImageXMirrorRequestTrafficReq req) throws Exception;

    public DescribeImageXMirrorRequestBandwidthResp describeImageXMirrorRequestBandwidth(DescribeImageXMirrorRequestBandwidthReq req) throws Exception;

    public DescribeImageXMirrorRequestHttpCodeByTimeResp describeImageXMirrorRequestHttpCodeByTime(DescribeImageXMirrorRequestHttpCodeByTimeReq req) throws Exception;

    public DescribeImageXMirrorRequestHttpCodeOverviewResp describeImageXMirrorRequestHttpCodeOverview(DescribeImageXMirrorRequestHttpCodeOverviewReq req) throws Exception;

    public DescribeImageXUploadSuccessRateByTimeResp describeImageXUploadSuccessRateByTime(DescribeImageXUploadSuccessRateByTimeReq req) throws Exception;

    public DescribeImageXUploadErrorCodeAllResp describeImageXUploadErrorCodeAll(DescribeImageXUploadErrorCodeAllReq req) throws Exception;

    public DescribeImageXUploadErrorCodeByTimeResp describeImageXUploadErrorCodeByTime(DescribeImageXUploadErrorCodeByTimeReq req) throws Exception;

    public DescribeImageXUploadCountByTimeResp describeImageXUploadCountByTime(DescribeImageXUploadCountByTimeReq req) throws Exception;

    public DescribeImageXUploadFileSizeResp describeImageXUploadFileSize(DescribeImageXUploadFileSizeReq req) throws Exception;

    public DescribeImageXUploadSpeedResp describeImageXUploadSpeed(DescribeImageXUploadSpeedReq req) throws Exception;

    public DescribeImageXUploadDurationResp describeImageXUploadDuration(DescribeImageXUploadDurationReq req) throws Exception;

    public DescribeImageXUploadSegmentSpeedByTimeResp describeImageXUploadSegmentSpeedByTime(DescribeImageXUploadSegmentSpeedByTimeReq req) throws Exception;

    public DescribeImageXCdnSuccessRateByTimeResp describeImageXCdnSuccessRateByTime(DescribeImageXCdnSuccessRateByTimeReq req) throws Exception;

    public DescribeImageXCdnSuccessRateAllResp describeImageXCdnSuccessRateAll(DescribeImageXCdnSuccessRateAllReq req) throws Exception;

    public DescribeImageXCdnErrorCodeByTimeResp describeImageXCdnErrorCodeByTime(DescribeImageXCdnErrorCodeByTimeReq req) throws Exception;

    public DescribeImageXCdnErrorCodeAllResp describeImageXCdnErrorCodeAll(DescribeImageXCdnErrorCodeAllReq req) throws Exception;

    public DescribeImageXCdnDurationDetailByTimeResp describeImageXCdnDurationDetailByTime(DescribeImageXCdnDurationDetailByTimeReq req) throws Exception;

    public DescribeImageXCdnDurationAllResp describeImageXCdnDurationAll(DescribeImageXCdnDurationAllReq req) throws Exception;

    public DescribeImageXCdnReuseRateByTimeResp describeImageXCdnReuseRateByTime(DescribeImageXCdnReuseRateByTimeReq req) throws Exception;

    public DescribeImageXCdnReuseRateAllResp describeImageXCdnReuseRateAll(DescribeImageXCdnReuseRateAllReq req) throws Exception;

    public DescribeImageXCdnProtocolRateByTimeResp describeImageXCdnProtocolRateByTime(DescribeImageXCdnProtocolRateByTimeReq req) throws Exception;

    public DescribeImageXClientErrorCodeAllResp describeImageXClientErrorCodeAll(DescribeImageXClientErrorCodeAllReq req) throws Exception;

    public DescribeImageXClientErrorCodeByTimeResp describeImageXClientErrorCodeByTime(DescribeImageXClientErrorCodeByTimeReq req) throws Exception;

    public DescribeImageXClientDecodeSuccessRateByTimeResp describeImageXClientDecodeSuccessRateByTime(DescribeImageXClientDecodeSuccessRateByTimeReq req) throws Exception;

    public DescribeImageXClientDecodeDurationByTimeResp describeImageXClientDecodeDurationByTime(DescribeImageXClientDecodeDurationByTimeReq req) throws Exception;

    public DescribeImageXClientQueueDurationByTimeResp describeImageXClientQueueDurationByTime(DescribeImageXClientQueueDurationByTimeReq req) throws Exception;

    public DescribeImageXClientLoadDurationAllResp describeImageXClientLoadDurationAll(DescribeImageXClientLoadDurationAllReq req) throws Exception;

    public DescribeImageXClientLoadDurationResp describeImageXClientLoadDuration(DescribeImageXClientLoadDurationReq req) throws Exception;

    public DescribeImageXClientFailureRateResp describeImageXClientFailureRate(DescribeImageXClientFailureRateReq req) throws Exception;

    public DescribeImageXClientSdkVerByTimeResp describeImageXClientSdkVerByTime(DescribeImageXClientSdkVerByTimeReq req) throws Exception;

    public DescribeImageXClientFileSizeResp describeImageXClientFileSize(DescribeImageXClientFileSizeReq req) throws Exception;

    public DescribeImageXClientTopFileSizeResp describeImageXClientTopFileSize(DescribeImageXClientTopFileSizeReq req) throws Exception;

    public DescribeImageXClientCountByTimeResp describeImageXClientCountByTime(DescribeImageXClientCountByTimeReq req) throws Exception;

    public DescribeImageXClientScoreByTimeResp describeImageXClientScoreByTime(DescribeImageXClientScoreByTimeReq req) throws Exception;

    public DescribeImageXClientDemotionRateByTimeResp describeImageXClientDemotionRateByTime(DescribeImageXClientDemotionRateByTimeReq req) throws Exception;

    public DescribeImageXClientTopDemotionURLResp describeImageXClientTopDemotionURL(DescribeImageXClientTopDemotionURLReq req) throws Exception;

    public DescribeImageXClientQualityRateByTimeResp describeImageXClientQualityRateByTime(DescribeImageXClientQualityRateByTimeReq req) throws Exception;

    public DescribeImageXClientTopQualityURLResp describeImageXClientTopQualityURL(DescribeImageXClientTopQualityURLReq req) throws Exception;

    public DescribeImageXSensibleCountByTimeResp describeImageXSensibleCountByTime(DescribeImageXSensibleCountByTimeReq req) throws Exception;

    public DescribeImageXSensibleCacheHitRateByTimeResp describeImageXSensibleCacheHitRateByTime(DescribeImageXSensibleCacheHitRateByTimeReq req) throws Exception;

    public DescribeImageXSensibleTopSizeURLResp describeImageXSensibleTopSizeURL(DescribeImageXSensibleTopSizeURLReq req) throws Exception;

    public DescribeImageXSensibleTopRamURLResp describeImageXSensibleTopRamURL(DescribeImageXSensibleTopRamURLReq req) throws Exception;

    public DescribeImageXSensibleTopResolutionURLResp describeImageXSensibleTopResolutionURL(DescribeImageXSensibleTopResolutionURLReq req) throws Exception;

    public DescribeImageXSensibleTopUnknownURLResp describeImageXSensibleTopUnknownURL(DescribeImageXSensibleTopUnknownURLReq req) throws Exception;


    public DescribeImageVolcCdnAccessLogResp describeImageVolcCdnAccessLog(DescribeImageVolcCdnAccessLogReq req) throws Exception;
}
