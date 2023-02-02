package com.volcengine.service.vms.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.vms.IRiskService;
import com.volcengine.service.vms.RiskConfig;
import com.volcengine.service.vms.model.request.*;
import com.volcengine.service.vms.model.response.*;

import java.util.ArrayList;

public class RiskServiceImpl extends BaseServiceImpl implements IRiskService {

  protected RiskServiceImpl() {
    super(RiskConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1),
            RiskConfig.apiInfoList);
  }

  public static RiskServiceImpl getInstance() {
    return new RiskServiceImpl();
  }

    @Override
    public RiskControlResponse canCall(RiskControlReq request) throws Exception {
        RawResponse response = post("CanCall", new ArrayList<>(), Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RiskControlResponse.class);
    }
}
