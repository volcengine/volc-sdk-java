package com.volcengine.service.maas.v2.impl.audio;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.helper.Const;
import com.volcengine.model.maas.api.v2.SpeechReq;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.response.BinaryResponseContent;
import com.volcengine.service.maas.v2.impl.MaasServiceImpl;
import org.apache.http.HttpResponse;

import java.io.IOException;
import java.io.InputStream;

public class Speech {

    private MaasServiceImpl service;

    public Speech(MaasServiceImpl service) {
        this.service = service;
    }

    public BinaryResponseContent create(String endpointId, SpeechReq req) throws MaasException {

        HttpResponse response;
        String logId = this.service.genReqId();
        String apikey = this.service.getApikey();

        try {
            response = this.service.jsonWithHttpResponse(endpointId, Const.MaasApiAudioSpeech, new ObjectMapper().writeValueAsString(req), apikey);
        } catch (Exception e) {
            throw new MaasException(e, logId);
        }

        InputStream is;
        try {
            is = response.getEntity().getContent();
        } catch (IOException e) {
            throw new MaasException(e, logId);
        }

        return new BinaryResponseContent(is, logId);
    }
}
