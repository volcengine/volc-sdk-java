package com.volcengine.service.maas.v2.impl.images;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.maas.api.v2.ImagesQuickGenRequest;
import com.volcengine.model.maas.api.v2.ImagesQuickGenResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.v2.impl.MaasServiceImpl;

import java.nio.charset.StandardCharsets;

public class Images {

    private MaasServiceImpl service;

    public Images(MaasServiceImpl service) {
        this.service = service;
    }

    public ImagesQuickGenResponse ImagesQuickGen(String endpointId, ImagesQuickGenRequest req) throws MaasException {

        String logId = this.service.genReqId();
        RawResponse response = null;
        String apikey = this.service.getApikey();
        try {
            response = this.service.json(endpointId, Const.MaasApiImagesQuickGen, logId, new ObjectMapper().writeValueAsString(req), apikey);
        } catch (JsonProcessingException e) {
            throw new MaasException(e, null);
        }

        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            ImagesQuickGenResponse resp;
            try {
                resp = convertJsonBytesToImagesQuickGenResponse(response.getException().getMessage().getBytes());
            } catch (MaasException ignored) {
                throw new MaasException(response.getException(), logId);
            }
            throw new MaasException(resp.getError(), logId);
        }

        return convertJsonBytesToImagesQuickGenResponse(response.getData());
    }

    private static ImagesQuickGenResponse convertJsonBytesToImagesQuickGenResponse(byte[] data) throws MaasException {
        try {
            return new ObjectMapper().readValue(new String(data, StandardCharsets.UTF_8), ImagesQuickGenResponse.class);
        } catch (Exception e) {
            throw new MaasException(e, "");
        }
    }
}
