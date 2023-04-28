package com.volcengine.helper;

public class VodUploadProgressListenerHelper {
    public static void sendVodUploadEvent(com.volcengine.helper.VodUploadProgressListener listener, VodUploadProgressEventType eventType, long bytesSize) {
        if (listener != null) {
            listener.progressChanged(new VodUploadProgressEvent(eventType, bytesSize));
        }
    }
}
