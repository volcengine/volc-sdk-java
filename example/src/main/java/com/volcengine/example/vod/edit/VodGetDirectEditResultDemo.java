package com.volcengine.example.vod.edit;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.business.GetDirectEditResult;
import com.volcengine.service.vod.model.request.VodGetDirectEditResultRequest;
import com.volcengine.service.vod.model.response.VodGetDirectEditResultResponse;

import java.util.Map;

public class VodGetDirectEditResultDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");


        VodGetDirectEditResultRequest vodGetDirectEditResultRequest = VodGetDirectEditResultRequest.newBuilder()
                .addReqIds("your reqId")
                .build();

        try {
            VodGetDirectEditResultResponse vodGetDirectEditResultResponse = vodService.getDirectEditResult(vodGetDirectEditResultRequest);
            if (vodGetDirectEditResultResponse.getResponseMetadata().hasError()) {
                System.out.println(vodGetDirectEditResultResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            //获取EditParam中的Track
            for (GetDirectEditResult value : vodGetDirectEditResultResponse.getResultList()) {
                for (Value track :value.getEditParam().getTrackList()){
                    for (Value v:track.getListValue().getValuesList()) {
                        Struct structValue = v.getStructValue();
                        Map<String, Value> fieldsMap = structValue.getFieldsMap();
                        for (String key : fieldsMap.keySet()){
                            Value vv = fieldsMap.get(key);
                            Map<Descriptors.FieldDescriptor, Object> allFields = vv.getAllFields();
                            for (Descriptors.FieldDescriptor field: allFields.keySet()) {
                                System.out.println(key+":"+allFields.get(field));
                            }
                        }
                    }
                }
            }
            System.out.println(vodGetDirectEditResultResponse.toString()); // 如有汉字，请采用UTF8编码方式
            System.out.println(vodGetDirectEditResultResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
