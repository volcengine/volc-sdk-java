package com.volcengine.service.gameProtect.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.GameProtectRiskResultRequest;
import com.volcengine.model.response.GameProtectRiskReusltResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.gameProtect.GameProtectConfig;
import com.volcengine.service.gameProtect.GameProtectService;

public class GameProtectServiceImpl extends BaseServiceImpl implements GameProtectService {
    private GameProtectServiceImpl() {super(GameProtectConfig.serviceInfo, GameProtectConfig.apiInfoList);}

    public static GameProtectService getInstance() {return new GameProtectServiceImpl();}

    @Override
    public GameProtectRiskReusltResponse RiskResult(GameProtectRiskResultRequest gameProtectRiskResultRequest) throws Exception {
        gameProtectRiskResultRequest.setService("anti_plugin");
        RawResponse response = query(Const.GameProtect, Utils.mapToPairList(Utils.paramsToMap(gameProtectRiskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GameProtectRiskReusltResponse.class);
    }

}
