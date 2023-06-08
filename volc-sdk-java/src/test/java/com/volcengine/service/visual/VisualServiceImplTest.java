package com.volcengine.service.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualConvertPhotoV2Request;
import com.volcengine.service.visual.model.request.VisualLensVidaVideoSubmitTaskV2Request;
import com.volcengine.service.visual.model.response.VisualConvertPhotoV2Response;
import com.volcengine.service.visual.model.response.VisualLensVidaVideoSubmitTaskV2Response;
import com.volcengine.service.visual.model.request.VisualLensVidaVideoGetResultV2Request;
import com.volcengine.service.visual.model.response.VisualLensVidaVideoGetResultV2Response;
import junit.framework.TestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import sun.misc.BASE64Encoder;

public class VisualServiceImplTest extends TestCase {

    /**
     * 图片转base64字符串
     *
     * @param imgFile 图片路径
     * @return
     */
    public static String imageToBase64Str(String imgFile) {
        byte[] data = null;
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream(imgFile);
            System.out.println("文件大小（字节）="+in.available());
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组进行Base64编码，得到Base64编码的字符串
        BASE64Encoder encoder = new BASE64Encoder();
        String base64Str = encoder.encode(data);
        return base64Str;
    }

    public void testLensVidaVideoV2() {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        //提交任务
        VisualLensVidaVideoSubmitTaskV2Request req = new VisualLensVidaVideoSubmitTaskV2Request();
        req.setReqKey("lens_vida_video");
        req.setUrl("https://xxxx");
        req.setVidaMode("vida_simple");

        try {
            VisualLensVidaVideoSubmitTaskV2Response response = visualService.lensVidaVideoSubmitTaskV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 查询任务
//        VisualLensVidaVideoGetResultV2Request req = new VisualLensVidaVideoGetResultV2Request();
//        req.setReqKey("lens_vida_video");
//        req.setTaskId("xxx");
//
//        try {
//            VisualLensVidaVideoGetResultV2Response response = visualService.lensVidaVideoGetResultV2(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public void testConvertPhotoV2() {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        VisualConvertPhotoV2Request req = new VisualConvertPhotoV2Request();
        req.setReqKey("lens_opr");

        ArrayList<String> binaryData = new ArrayList<>();
        binaryData.add(imageToBase64Str("xxx"));
        req.setBinaryDataBase64(binaryData);
        req.setIsColor(true);

        try {
            VisualConvertPhotoV2Response response = visualService.convertPhotoV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}