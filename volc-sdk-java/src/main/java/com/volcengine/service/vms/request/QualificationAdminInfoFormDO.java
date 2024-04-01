package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author wangyang
 * @date 2021/3/12
 */
@Data
public class QualificationAdminInfoFormDO {
    /**
     * 资质id
     */
    @JSONField(name = "QualificationId")
    private Integer qualificationId;


    /**
     * 审批实例号
     */
    @JSONField(name = "ApprovalInstanceCode")
    private String approvalInstanceCode;

    /**
     * 管理员姓名
     */
    @JSONField(name = "Name")
    private String name;

    /**
     * 联系方式
     */
    @JSONField(name = "ContactNumber")
    private String contactNumber;

    /**
     * 身份证号
     */
    @JSONField(name = "IdCardNumber")
    private String idCardNumber;

    /**
     * 身份证正面照片
     */
    @JSONField(name = "IdCardFrontPhotoFileCode")
    private String idCardFrontPhotoFileCode;

    /**
     * 身份证反面照片
     */
    @JSONField(name = "IdCardBackPhotoFileCode")
    private String idCardBackPhotoFileCode;

    /**
     * 手持身份证照片
     */
    @JSONField(name = "IdCardPhotoWithPeopleFileCode")
    private String idCardPhotoWithPeopleFileCode;
}
