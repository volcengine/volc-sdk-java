package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: chenhui
 * @Date: 2024/03/26
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UploadQualificationFileRequest {
    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文件byte数组
     */
    private byte[] file;

    /**
     * 文件名称
     */
    private String fileName;
}
