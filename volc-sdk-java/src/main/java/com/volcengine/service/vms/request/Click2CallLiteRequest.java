package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Click2CallLiteRequest {

    /** 主叫 */
    private String caller;

    /** 被叫 */
    private String callee;

    /** 号码池编号 */
    private String numberPoolNo;

    /** 是否需要录音 */
    private Integer audioRecordFlag;

    private String userData;

    private String idempotentId;
}
