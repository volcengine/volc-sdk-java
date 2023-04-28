package com.volcengine.helper;

public class VodUploadProgressEvent {
    private final long byteSize;
    private final VodUploadProgressEventType eventType;

    public VodUploadProgressEvent(VodUploadProgressEventType eventType) {
        this(eventType, 0L);
    }

    public VodUploadProgressEvent(VodUploadProgressEventType eventType, long byteSize) {
        this.byteSize = byteSize;
        this.eventType = eventType;
    }

    public long getByteSize() {
        return byteSize;
    }

    public VodUploadProgressEventType getEventType() {
        return eventType;
    }

    @Override
    public String toString() {
        return "VodUploadProgressEvent{" +
                "byteSize=" + byteSize +
                ", eventType=" + eventType +
                '}';
    }
}
