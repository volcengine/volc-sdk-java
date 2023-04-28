package com.volcengine.helper;

public class VodUploadMediaProcessListener implements VodUploadProgressListener {
    /**
     * 已成功上传总字节数
     */
    private long bytesUploaded = 0;
    /**
     * 原文件大小
     */
    private long fileSize = -1;


    @Override
    public void progressChanged(VodUploadProgressEvent progressEvent) {
        long bytes = progressEvent.getByteSize();
        VodUploadProgressEventType eventType = progressEvent.getEventType();
        switch (eventType) {
            // 文件总大小通知
            case FILE_SIZE_EVENT:
                this.fileSize = bytes;
                // business logic ....
                System.out.println("file size is " + this.fileSize);
                break;
            // 已上传分片通知，bytes为上传的分片的字节数
            case UPLOAD_BYTES_EVENT:
                this.bytesUploaded += bytes;
                if (this.bytesUploaded != this.fileSize - 1) {
                    int percent = (int) (this.bytesUploaded * 100.0 / this.fileSize);
                    System.out.println("uploaded " + percent + "%");
                } else {
                    int percent = 99;
                    System.out.println("uploaded " + percent + "%");
                }
                // business logic ....
                break;
            default:
                break;
        }
    }
}
