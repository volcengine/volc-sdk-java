package com.volcengine.example.imagex.v2;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.service.imagex.v2.ImagexService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 获取 STS2 的上传密钥（离线的）
 */
public class GetUploadSts2 {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        List<String> serviceIds = new ArrayList<>(0);
        serviceIds.add("service id"); // 生成的 STS2 密钥可以用于哪些 ImageX 服务

        try {
            // 默认超时时间为 1小时，如果有需要，请调用 imagex.getUploadSts2WithExpire() 来设置超时时间
            // 您可以使用 imagex.getUploadSts2WithKeyPtn("表达式") 来限制上传的存储名格式
            //     如: "test/*" 表示上传的文件必须包含 "test/" 前缀
            HashMap<String, String> tag =  new HashMap<>();
            tag.put("UploadOverwrite", "False");
            SecurityToken2 sts2 = service.getUploadSts2(serviceIds, tag);
            System.out.println(JSON.toJSONString(sts2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
