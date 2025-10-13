package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.GetSignatureIdentListRequest;
import com.volcengine.model.response.ApplySignatureIdentResponse;
import com.volcengine.model.response.GetSignatureIdentListResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class GetSignatureIdentListDemo {
    public static void main(String[] args) {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");
        try {
            GetSignatureIdentListResponse response = smsService.getSignatureIdentList(getGetSignatureIdentListRequest());
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static GetSignatureIdentListRequest getGetSignatureIdentListRequest() {
        GetSignatureIdentListRequest request = new GetSignatureIdentListRequest();
        request.setId(9149);// 资质id
        request.setMaterialName("");// 资质名称
        request.setOperatorPersonName("");// 证件名
        request.setResponsiblePersonName("");// 证件名
        request.setBusinessCertificateName("");// 营业证件名称
        request.setEffectSignatures("");// 生效签名范围
        List<Integer> status =  new ArrayList<>();
        status.add(1);
        status.add(2);
        status.add(3);
        request.setStatus(status);// 审核状态
        request.setPageIndex(1);
        request.setPageSize(10);
        List<Long> ids = new ArrayList<>();
        ids.add(9149L);
        request.setIds(ids);// 资质id列表
        return request;
    }
}
