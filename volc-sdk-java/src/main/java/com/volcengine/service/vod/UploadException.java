package com.volcengine.service.vod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadException extends RuntimeException {
    private int code;
    private int errorCode;
    private String message;
}
