package com.volcengine.service.gameProtect;

import com.volcengine.model.request.GameProtectRiskResultRequest;
import com.volcengine.model.response.GameProtectRiskReusltResponse;
import com.volcengine.service.IBaseService;

/**
 * The interface game protect service.
 */
public interface GameProtectService extends IBaseService {
    /**
     * Game Protect
     *
     * @param gameProtectRiskResultRequest game protect request
     * @return game protect response
     * @throws Exception the exception
     */
    GameProtectRiskReusltResponse RiskResult(GameProtectRiskResultRequest gameProtectRiskResultRequest) throws Exception;
}
