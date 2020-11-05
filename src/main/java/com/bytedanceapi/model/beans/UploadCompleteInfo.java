package com.bytedanceapi.model.beans;

import lombok.Data;

@Data
public class UploadCompleteInfo {
    String oid;
    String sessionKey;

    public UploadCompleteInfo(String oid, String sessionKey) {
        this.oid = oid;
        this.sessionKey = sessionKey;
    }
}
