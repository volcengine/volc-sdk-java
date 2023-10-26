package com.volcengine.service.maas;


import com.volcengine.model.maas.api.Api;
import com.volcengine.service.IBaseService;

import java.util.stream.Stream;


/**
 * The interface maas service.
 */
public interface MaasService extends IBaseService {
    Api.ChatResp chat(Api.ChatReq req) throws MaasException;

    Stream<Api.ChatResp> streamChat(Api.ChatReq req) throws MaasException;

    Api.TokenizeResp tokenization(Api.TokenizeReq req) throws MaasException;

    Api.ClassificationResp classification(Api.ClassificationReq req) throws MaasException;
}
