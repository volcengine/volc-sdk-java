package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author wangyang
 * @date 2021/3/12
 */
@Data
public class QualificationMainInfoFormDO {
    /**
     * 资质id
     */
    @JSONField(name = "QualificationId")
    private Integer qualificationId;

    /**
     * 资质编号
     */
    @JSONField(name = "QualificationNo")
    private String qualificationNo;

    /**
     * 资质主体
     */
    @JSONField(name = "QualificationEntity")
    private String qualificationEntity;

    /**
     * 三证是否合一 是 1 否 0
     */
    @JSONField(name = "CertificateThreeInOne")
    private Integer certificateThreeInOne;

    /**
     * 企业地址
     */
    @JSONField(name = "EnterpriseAddress")
    private String enterpriseAddress;

    /**
     * 法人代表姓名
     */
    @JSONField(name = "LegalRepresentativeName")
    private String legalRepresentativeName;

    /**
     * 法人代表身份证号码
     */
    @JSONField(name = "LegalRepresentativeId")
    private String legalRepresentativeId;

    /**
     * 三证合一时统一社会信用代码
     */
    @JSONField(name = "UnitSocialCreditCode")
    private String unitSocialCreditCode;

    /**
     * 组织机构号码
     */
    @JSONField(name = "CodeOfOrganizationCertificate")
    private String codeOfOrganizationCertificate;

    /**
     * 法人代表身份证（正）TOS文件名
     */
    @JSONField(name = "LegalRepresentativeFrontIdPhotoFileCode")
    private String legalRepresentativeFrontIdPhotoFileCode;

    /**
     * 法人代表身份证（反）TOS文件名
     */
    @JSONField(name = "LegalRepresentativeBackIdPhotoFileCode")
    private String legalRepresentativeBackIdPhotoFileCode;

    /**
     * 入网信息：号码申请公函 TOS文件名
     */
    @JSONField(name = "DocOfNumberApplyPhotoFileCode")
    private String docOfNumberApplyPhotoFileCode;

    /**
     * 入网信息：入网承诺书 TOS文件名
     */
    @JSONField(name = "CommitmentLetterOfNetAccessPhotoFileCode")
    private String commitmentLetterOfNetAccessPhotoFileCode;

    /**
     * 三证合一时证明文件为营业执照（url) TOS文件名
     */
    @JSONField(name = "ThreeInOneBusinessLicensePhotoFileCode")
    private String threeInOneBusinessLicensePhotoFileCode;

    /**
     * 非三证合一：企业法人营业执照 TOS文件名
     */
    @JSONField(name = "BusinessLicensePhotoFileCode")
    private String businessLicensePhotoFileCode;

    /**
     * 非三证合一：组织机构代码证 TOS文件名
     */
    @JSONField(name = "CertificateOfOrganizationCodesPhotoFileCode")
    private String certificateOfOrganizationCodesPhotoFileCode;

    /**
     * 非三证合一：税务登记证 TOS文件名
     */
    @JSONField(name = "CertificateOfTaxationRegistrationPhotoFileCode")
    private String certificateOfTaxationRegistrationPhotoFileCode;

    @JSONField(name = "ReqSourceType")
    private Integer reqSourceType=3;
}
