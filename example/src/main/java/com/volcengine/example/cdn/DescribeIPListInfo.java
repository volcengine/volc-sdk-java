package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DescribeIPListInfo {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeIPListInfoRequest req = new CDN.DescribeIPListInfoRequest();
            req.setIpList("1.1.1.1,2.2.2.2");
            CDN.DescribeIPListInfoResponse resp = service.describeIPListInfo(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.destroy();
    }
}
