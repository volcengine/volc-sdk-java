package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class AddCdnCertificate {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.AddCdnCertificateRequest req = new CDN.AddCdnCertificateRequest()
                    .setCertificate(new CDN.Certificate()
                        .setCertificate("-----BEGIN CERTIFICATE-----\\r\\nHmU2w=\\r\\n-----END CERTIFICATE-----\\r\\n-----BEGIN CERTIFICATE-----\\r\\nMIIElg==\\r\\n-----END CERTIFICATE-----\\r\\n-----BEGIN CERTIFICATE-----\\r\\nMIIDV5Adg\\r\\n06O/nVsJ8dWd4=\\r\\n-----END CERTIFICATE-----")
                        .setPrivateKey("-----BEGIN RSA PRIVATE KEY-----\nMIIE6\nBNtw==\n-----END RSA PRIVATE KEY-----"))
                    .setCertInfo(new CDN.AddCdnCertInfo()
                        .setDesc("MyCert"))
                    .setSource("volc_cert_center");
            CDN.AddCdnCertificateResponse resp = service.addCdnCertificate(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.destroy();
    }
}
