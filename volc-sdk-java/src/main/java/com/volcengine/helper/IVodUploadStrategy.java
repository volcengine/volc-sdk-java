package com.volcengine.helper;

import com.github.rholder.retry.Retryer;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.business.VodHeaderPair;

import java.io.File;
import java.util.List;

public interface IVodUploadStrategy {

    void directUpload(VodServiceImpl vodService, String host, String oid, String auth, List<VodHeaderPair> uploadHeaderList, File file, Retryer retryer, int storageClass, com.volcengine.helper.VodUploadProgressListener listener) throws Exception;

    void chunkUpload(VodServiceImpl vodService, String host, String oid, String auth, List<com.volcengine.service.vod.model.business.VodHeaderPair> uploadHeaderList, File file, boolean isLargeFile, Retryer retryer, int storageClass, com.volcengine.helper.VodUploadProgressListener listener) throws Exception;

}
