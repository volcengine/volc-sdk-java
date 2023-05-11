package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualCertConfigInitRequest;
import com.volcengine.service.visual.model.request.VisualCertQueryProRequest;
import com.volcengine.service.visual.model.request.VisualCertTokenProRequest;
import com.volcengine.service.visual.model.response.VisualCertQueryProResponse;
import com.volcengine.service.visual.model.response.VisualCertTokenProResponse;
import com.volcengine.service.visual.model.response.VisualCertConfigInitResponse;
import com.volcengine.service.visual.model.request.VisualCertVerifyProRequest;
import com.volcengine.service.visual.model.response.VisualCertVerifyProResponse;

public class CertVerifyProDemo {

    public static void main(String[] args) {

//        sts获取临时ak/sk
//        ISTSService stsService = STSServiceImpl.getInstance();
//
//        stsService.setAccessKey("your ak");
//        stsService.setSecretKey("your sk");
//
//        AssumeRoleRequest request = new AssumeRoleRequest();
//        request.setRoleSessionName("just_for_test");
//        request.setDurationSeconds(900);
//        request.setRoleTrn("trn:iam::yourAccountID:role/yourRoleName");
//
//        AssumeRoleResponse resp = stsService.assumeRole(request);
//        System.out.println(JSON.toJSONString(resp));


        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you don't set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("your-ak");
        visualService.setSecretKey("your-sk");
//        visualService.setSessionToken("123123123");

//        certTokenPro调用示例
        VisualCertTokenProRequest req = new VisualCertTokenProRequest();
        req.setReqKey("cert_pro_token");
        req.setStsToken("123123123");
//        req.setTosInfo();
        req.setRefSource("1");  // 0：无源，1：有源
        req.setIdcardName("xxx");
        req.setIdcardNo("xxx");

//        VisualCertTokenProRequest.RiskMotionList riskMotionList = new VisualCertTokenProRequest.RiskMotionList();
//        ArrayList<String> freeList = new ArrayList<>(Arrays.asList("0", "1"));
//        riskMotionList.setFree(freeList);
//        ArrayList<String> lowList = new ArrayList<>(Arrays.asList("0", "1", "2", "3"));
//        riskMotionList.setFree(freeList);
//        ArrayList<String> mediumList = new ArrayList<>(Arrays.asList("0", "1", "2", "3"));
//        riskMotionList.setFree(freeList);
//        ArrayList<String> highList = new ArrayList<>(Arrays.asList("0", "1", "2", "3"));
//        riskMotionList.setFree(freeList);
//        riskMotionList.setLow(lowList);
//        riskMotionList.setMedium(mediumList);
//        riskMotionList.setHigh(highList);
//
//        req.setRiskMotionList(riskMotionList);
//        req.setRefImage("/9xx");
//        req.setMaxLivenessTrial(10);
//        req.setLivenessTimeout(10);

//        req.setCallBackInfo();

        System.out.println(req.getRiskMotionCount());

        try {
            VisualCertTokenProResponse response = visualService.certTokenPro(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

////        VerifyPro接口请求示例
//        VisualCertVerifyProRequest req = new VisualCertVerifyProRequest();
//        req.setReqKey("cert_pro_src_verify");
//        req.setBytedToken("20230506135020D02A036A32BD74A4E9BF");
//        req.setRiskInfo("xxx");
//        req.setSdkData("xx");
//
//        try {
//            VisualCertVerifyProResponse response = visualService.certVerifyPro(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//        QueryPro接口请求示例
//        VisualCertQueryProRequest req = new VisualCertQueryProRequest();
//        req.setReqKey("cert_verify_query");
//        req.setBytedToken("202305052223121E819D0179C229AFFA52");
//        req.setOmitData(false);
////        req.setOmitImageData(false);
////        req.setOmitVideoData(false);
//
//        try {
//            VisualCertQueryProResponse response = visualService.certQueryPro(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//      Config接口调用示例
//        VisualCertConfigInitRequest req = new VisualCertConfigInitRequest();
//        req.setReqKey("cert_config_init");
//        req.setConfigName("test1");
//
//        VisualCertConfigInitRequest.TokenApiConfig tokenApiConfig = new VisualCertConfigInitRequest.TokenApiConfig();
//        tokenApiConfig.setRefSource("1");
//        tokenApiConfig.setLivenessType("motion");

//        req.setTokenApiConfig(tokenApiConfig);

//        try {
//            VisualCertConfigInitResponse response = visualService.certConfigInit(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//}
}