package com.volcengine.example.visual;

import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;

public class FinanceOCRDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        String base64="";

//         增值税发票
//         OCRVatInvoiceRequest req = new OCRVatInvoiceRequest();
//         req.setImageBase64(base64);
//         try {
//             OCRVatInvoiceResponse response = visualService.vatInvoice(req);
//             System.out.println(JSON.toJSONString(response));
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
    }
}