package com.volcengine.service.vms.response;

import lombok.Data;

/**
 * @author wangyang
 * @date 2021/3/12
 */
@Data
public class QualificationAdminInfoVO {
    /**
     * 资质id
     */
    private Integer qualificationId;

    /**
     * 审批实例号
     */
    private String approvalInstanceCode;

    /**
     * 账号id
     */
    private String accountId;

    /**
     * 管理员姓名
     */
    private String name;

    /**
     * 联系方式
     */
    private String contactNumber;

    /**
     * 身份证号
     */
    private String idCardNumber;

    /**
     * 身份证正面照片tos文件名
     */
    private String idCardFrontPhotoURL;

    /**
     * 身份证反面照片tos文件名
     */
    private String idCardBackPhotoURL;

    /**
     * 手持身份证照片tos文件名
     */
    private String idCardPhotoWithPeopleURL;
}
