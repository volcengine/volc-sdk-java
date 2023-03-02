package com.volcengine.model.response;

import lombok.Data;

@Data
public class GetApplyResult {
    private int status;
    private String reason;
    private String carrier;
}
