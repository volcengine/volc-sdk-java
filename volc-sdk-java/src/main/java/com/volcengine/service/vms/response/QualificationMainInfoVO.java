package com.volcengine.service.vms.response;

import lombok.Data;

/**
 * @author wangyang
 * @date 2021/2/28
 */
@Data
public class QualificationMainInfoVO {

    /**
     * 资质id
     */
    private Integer qualificationId;

    /**
     * 资质编号
     */
    private String qualificationNo;

    /**
     * 账号id
     */
    private String accountId;

    /**
     * 审核状态 审核中 1 审核通过 2 审核失败 3
     */
    private Integer approvalStatus;

    /**
     * 审核结果说明
     */
    private String approvalDoneReason;

    /**
     * 资质主体
     */
    private String qualificationEntity;

    /**
     * 资质主体是否涉及第三方 是 1 否 0
     */
    private Integer qualificationRelatedToThirdParty;

    /**
     * 创建审批流状态 成功 1 失败 0 未知 -1
     */
    private Integer createApprovalStatus;

    /**
     * 三证是否合一 是 1 否 0
     */
    private Integer certificateThreeInOne;

    /**
     * 三证是否合一描述 是 否
     */
    private String certificateThreeInOneStr;

    /**
     * 企业地址
     */
    private String enterpriseAddress;

    /**
     * 法人代表姓名
     */
    private String legalRepresentativeName;

    /**
     * 法人代表身份证号码
     */
    private String legalRepresentativeId;

    /**
     * 三证合一时统一社会信用代码
     */
    private String unitSocialCreditCode;

    /**
     * 组织机构号码
     */
    private String codeOfOrganizationCertificate;

    /**
     * 法人代表身份证（正）TOS文件名
     */
    private String legalRepresentativeFrontIdPhotoURL;

    /**
     * 法人代表身份证（反）TOS文件名
     */
    private String legalRepresentativeBackIdPhotoURL;

    /**
     * 入网信息：号码申请公函 TOS文件名
     */
    private String docOfNumberApplyPhotoURL;

    /**
     * 入网信息：入网承诺书 TOS文件名
     */
    private String commitmentLetterOfNetAccessPhotoURL;

    /**
     * 三证合一时证明文件为营业执照（url) TOS文件名
     */
    private String threeInOneBusinessLicensePhotoURL;

    /**
     * 非三证合一：企业法人营业执照 TOS文件名
     */
    private String businessLicensePhotoURL;

    /**
     * 非三证合一：组织机构代码证 TOS文件名
     */
    private String certificateOfOrganizationCodesPhotoURL;

    /**
     * 非三证合一：税务登记证 TOS文件名
     */
    private String certificateOfTaxationRegistrationPhotoURL;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;
}
