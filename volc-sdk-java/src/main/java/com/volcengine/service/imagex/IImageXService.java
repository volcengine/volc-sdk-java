package com.volcengine.service.imagex;

import com.volcengine.model.request.ApplyImageUploadRequest;
import com.volcengine.model.request.CommitImageUploadRequest;
import com.volcengine.model.request.DeleteImageReq;
import com.volcengine.model.response.ApplyImageUploadResponse;
import com.volcengine.model.response.CommitImageUploadResponse;
import com.volcengine.model.response.DeleteImageResp;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.service.IBaseService;

import java.util.List;
import java.util.Map;

/**
 * The interface ImageX service.
 */
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
     * @param request the apply upload request
     * @param imageDatas image data array
     * @return the commit upload response
     * @throws Exception the exception
     */
    CommitImageUploadResponse uploadImages(ApplyImageUploadRequest request, List<byte[]> imageDatas) throws Exception;

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
    SecurityToken2 getUploadSts2(List<String> serviceIds) throws Exception;

    /**
     * Get image upload sts2 auth.
     *
     * @param serviceIds service id list allowed to upload image to
     * @param expire expire time in milliseconds
     * @return the upload sts2 auth
     * @throws Exception the exception
     */
    SecurityToken2 getUploadSts2WithExpire(List<String> serviceIds, long expire) throws Exception;

    /**
     * Delete images.
     *
     * @param req delete image req
     * @return delete image resp
     * @throws Exception the exception
     */
    DeleteImageResp deleteImages(DeleteImageReq req) throws Exception;
}
