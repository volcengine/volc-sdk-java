package com.volcengine.service.maas.v2.impl.images;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.maas.api.v2.*;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.v2.impl.MaasServiceImpl;

import java.nio.charset.StandardCharsets;

public class Images {

    private MaasServiceImpl service;

    private static final ObjectMapper mapper = new ObjectMapper();

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
            try {
                ErrorResp resp = json_parse(response.getException().getMessage().getBytes(StandardCharsets.UTF_8), ErrorResp.class);
                throw new MaasException(resp.getError(), logId);
            } catch (JsonProcessingException ignored) {
                throw new MaasException(response.getException(), logId);
            }
        }

        try {
            ImagesQuickGenResponse resp = json_parse(response.getData(), ImagesQuickGenResponse.class);
            resp.setRequestId(logId);
            return resp;
        } catch (JsonProcessingException e) {
            throw new MaasException(e, logId);
        }
    }

    public ImagesResponse ImagesFlexGen(String endpointId, ImagesRequest req) throws MaasException {

        String reqId = this.service.genReqId();
        RawResponse response = null;
        String apikey = this.service.getApikey();
        try {
            response = this.service.json(endpointId, Const.MaasApiImagesFlexGen, reqId, new ObjectMapper().writeValueAsString(req), apikey);
        } catch (JsonProcessingException e) {
            throw new MaasException(e, null);
        }

        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            try {
                ErrorResp resp = json_parse(response.getException().getMessage().getBytes(StandardCharsets.UTF_8), ErrorResp.class);
                throw new MaasException(resp.getError(), reqId);
            } catch (JsonProcessingException ignored) {
                throw new MaasException(response.getException(), reqId);
            }
        }

        try {
            ImagesResponse resp = json_parse(response.getData(), ImagesResponse.class);
            resp.setRequestId(reqId);
            return resp;
        } catch (JsonProcessingException e) {
            throw new MaasException(e, reqId);
        }
    }

    private static <T> T json_parse(byte[] data, Class<T> valueType) throws JsonProcessingException {
        return mapper.readValue(new String(data, StandardCharsets.UTF_8), valueType);
    }
}
