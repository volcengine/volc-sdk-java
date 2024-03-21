package com.volcengine.service.maas.v2;


import com.volcengine.model.maas.api.v2.*;
import com.volcengine.service.IBaseService;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.v2.impl.audio.Audio;
import com.volcengine.service.maas.v2.impl.images.Images;

import java.util.stream.Stream;


/**
 * The interface maas service.
 */
public interface MaasService extends IBaseService {
    ChatResp chat(String endpointId, ChatReq req) throws MaasException;

    Stream<ChatResp> streamChat(String endpointId, ChatReq req) throws MaasException;

    TokenizeResp tokenization(String endpointId, TokenizeReq req) throws MaasException;

    ClassificationResp classification(String endpointId, ClassificationReq req) throws MaasException;

    EmbeddingsResp embeddings(String endpointId, EmbeddingsReq req) throws MaasException;

    Audio audio();

    Images images();

    void setApikey(String apikey);

    String getApikey();
}
