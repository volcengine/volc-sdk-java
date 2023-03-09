package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualCertConfigInitRequest;
import com.volcengine.service.visual.model.response.VisualCertConfigInitResponse;

public class CertVerifyDemo {

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
        visualService.setAccessKey("sts-ak");
        visualService.setSecretKey("sts-sk");
        visualService.setSessionToken("sts-token");

////        certToken调用示例
//        VisualCertTokenRequest req = new VisualCertTokenRequest();
//        req.setReqKey("cert_token");
//        req.setStsToken("sts-token");
////        req.setTosInfo();
//        req.setRefSource("1");
//        req.setLivenessType("motion");
//        req.setIdcardName("");
//        req.setIdcardNo("");
////        req.setRefImage("");
//        req.setLivenessTimeout(10);
//
//        ArrayList<String> motionList = new ArrayList<>();
//        motionList.add("0");
//        motionList.add("1");
//        motionList.add("2");
//        motionList.add("3");
//
//        req.setMotionList(motionList);
//
//        ArrayList<String> fixMotionList = new ArrayList<>();
//        fixMotionList.add("0");
//        fixMotionList.add("1");
//        fixMotionList.add("2");
//        fixMotionList.add("3");
//
//        req.setFixedMotionList(fixMotionList);
//        req.setMotionCount(4);
//        req.setMaxLivenessTrial(10);
////        req.setCallBackInfo();
//
//        try {
//            VisualCertTokenResponse response = visualService.certToken(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//        Query接口请求示例
//        VisualCertVerifyQueryRequest req = new VisualCertVerifyQueryRequest();
//        req.setReqKey("cert_verify_query");
//        req.setBytedToken("202303031539536D3FBEF9B4F8220E743E");
//        req.setOmitData(false);
//
//        try {
//            VisualCertVerifyQueryResponse response = visualService.certVerifyQuery(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//      Config接口调用示例
        VisualCertConfigInitRequest req = new VisualCertConfigInitRequest();
        req.setReqKey("cert_config_init");
        req.setConfigName("test1");

        VisualCertConfigInitRequest.TokenApiConfig tokenApiConfig = new VisualCertConfigInitRequest.TokenApiConfig();
        tokenApiConfig.setRefSource("1");
        tokenApiConfig.setLivenessType("motion");

        VisualCertConfigInitRequest.H5Config h5Config = new VisualCertConfigInitRequest.H5Config();
        h5Config.setSource(1);
        h5Config.setType(0);


        req.setTokenApiConfig(tokenApiConfig);
        req.setH5Config(h5Config);


        try {
            VisualCertConfigInitResponse response = visualService.certConfigInit(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}