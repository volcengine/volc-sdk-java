package com.volcengine.service.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.*;
import com.volcengine.service.visual.model.response.*;
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
        req.setIfColor(1);

        try {
            VisualConvertPhotoV2Response response = visualService.convertPhotoV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testFaceSwap() {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        VisualFaceSwapRequest req = new VisualFaceSwapRequest();
//        req.setImageBase64("image_base64");
        req.setImageUrl("http://xxxx");
//        req.setTemplateBase64("template_base64");
        req.setTemplateUrl("http://xxx");

//        req.setTemplateUrl("http://tosv.byted.org/obj/labcv-serveralgo/tobapi/duorenlian_1.jpg");
        req.setActionId("faceswap");
        req.setVersion("2.0");
        req.setDoRisk(false);
//        req.setType("l2r");
//
//        ArrayList<VisualFaceSwapRequest.MergeInfos> mergeInfos = new ArrayList<>();
//        VisualFaceSwapRequest.MergeInfos mergeInfo1 = new VisualFaceSwapRequest.MergeInfos();
//        mergeInfo1.setImageUrl("http://xxxx");
//        mergeInfo1.setLocation(1);
//        mergeInfo1.setTemplateLocation(1);
//
//        VisualFaceSwapRequest.MergeInfos mergeInfo2 = new VisualFaceSwapRequest.MergeInfos();
//        mergeInfo2.setImageUrl("http://xxxx");
//        mergeInfo2.setLocation(2);
//        mergeInfo2.setTemplateLocation(2);
//
//        VisualFaceSwapRequest.MergeInfos mergeInfo3 = new VisualFaceSwapRequest.MergeInfos();
//        mergeInfo3.setImageUrl("http://xxxx");
//        mergeInfo3.setLocation(3);
//        mergeInfo3.setTemplateLocation(3);
//
//        mergeInfos.add(mergeInfo1);
//        mergeInfos.add(mergeInfo2);
//        mergeInfos.add(mergeInfo3);
//
//        req.setMergeInfos(JSON.toJSONString(mergeInfos));


        try {
            VisualFaceSwapResponse response = visualService.faceSwap(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testJPCartoon() {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        VisualJPCartoonRequest req = new VisualJPCartoonRequest();
        req.setImageBase64("image_base64");
        // req.setCartoonType("jpcartoon_head"); // jpcartoon_head | jpcartoon | hkcartoon
        // req.setRotation(1);

        try {
            VisualJPCartoonResponse response = visualService.jpCartoon(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testFaceFusion() {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        //视频人脸融合同步接口
        VisualFaceFusionMovieSyncRequest req = new VisualFaceFusionMovieSyncRequest();
        req.setReqKey("facefusionmovie_standard");
        req.setImage_url("https://xxx, https://xxx");
        req.setVideo_url("http://xxx");
        req.setEnableFaceBeautify(false);
        req.setRefImgUrl("https://xxx, https://xxxx");
        req.setSourceSimilarity("1");

        try {
            VisualFaceFusionMovieSyncResponse response = visualService.faceFusionMovieSync(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void testAIGufeng() {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        VisualAIGufengRequest req = new VisualAIGufengRequest();
        req.setReqKey("ai_gufeng");
//        ArrayList<String> binaryData = new ArrayList<>();
//        binaryData.add("image_base64");
//        req.setBinaryDataBase64(binaryData);
        ArrayList<String> imageUrls = new ArrayList<>();
        imageUrls.add("http://xxxx");
        req.setImage_urls(imageUrls);

        try {
            VisualAIGufengResponse response = visualService.aiGufeng(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}