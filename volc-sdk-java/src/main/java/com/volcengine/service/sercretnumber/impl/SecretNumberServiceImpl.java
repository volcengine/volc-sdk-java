package com.volcengine.service.sercretnumber.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.sercretnumber.ISecretNumberService;
import com.volcengine.service.sercretnumber.SecretNumberConfig;
import com.volcengine.service.sercretnumber.model.request.*;
import com.volcengine.service.sercretnumber.model.response.*;

public class SecretNumberServiceImpl extends BaseServiceImpl implements ISecretNumberService {

  protected SecretNumberServiceImpl() {
    super(SecretNumberConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1),
        SecretNumberConfig.apiInfoList);
  }

  public static SecretNumberServiceImpl getInstance() {
    return new SecretNumberServiceImpl();
  }

  @Override
  public SecretBindResponse bindAXB(BindAXBRequest request) throws Exception {
    RawResponse response = query("BindAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public SecretBindResponse selectNumberAndBindAXB(SelectNumberAndBindAXBRequest request)
      throws Exception {
    RawResponse response = query("SelectNumberAndBindAXB",
        Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public OperationResponse unbindAXB(SpecificSubIdRequest request) throws Exception {
    RawResponse response = query("UnbindAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

  @Override
  public QuerySubscriptionResponse querySubscription(SpecificSubIdRequest request)
      throws Exception {
    RawResponse response = query("QuerySubscription",
        Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), QuerySubscriptionResponse.class);
  }

  @Override
  public QuerySubscriptionForListResponse querySubscriptionForList(
      QuerySubscriptionForListRequest request) throws Exception {
    RawResponse response = query("QuerySubscriptionForList",
        Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), QuerySubscriptionForListResponse.class);
  }

  @Override
  public SecretBindResponse upgradeAXToAXB(UpgradeAXToAXBRequest request) throws Exception {
    RawResponse response = query("UpgradeAXToAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public OperationResponse updateAXB(UpdateAXBRequest request) throws Exception {
    RawResponse response = query("UpdateAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

  @Override
  public SecretBindResponse bindAXN(BindAXNRequest request) throws Exception {
    RawResponse response = query("BindAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public SecretBindResponse selectNumberAndBindAXN(SelectNumberAndBindAXNRequest request) throws Exception {
    RawResponse response = query("SelectNumberAndBindAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public OperationResponse updateAXN(UpdateAXNRequest request) throws Exception {
    RawResponse response = query("UpdateAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

  @Override
  public OperationResponse unbindAXN(SpecificSubIdRequest request) throws Exception {
    RawResponse response = query("UnbindAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

  @Override
  public Click2CallResponse click2Call(Click2CallRequest request) throws Exception {
    RawResponse response = query("Click2Call", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), Click2CallResponse.class);
  }

  @Override
  public OperationResponse cancelClick2Call(CancelClick2CallRequest request) throws Exception {
    RawResponse response = query("CancelClick2Call", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

    @Override
    public SecretBindResponse bindAXNE(BindAXNERequest request) throws Exception {
        RawResponse response = query("BindAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public OperationResponse unbindAXNE(SpecificSubIdRequest request) throws Exception {
        RawResponse response = query("UnbindAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public OperationResponse updateAXNE(UpdateAXNERequest request) throws Exception {
        RawResponse response = query("UpdateAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public SecretBindResponse bindAXBForAXNE(BindAXBForAXNERequest request) throws Exception {
        RawResponse response = query("BindAXBForAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public SecretBindResponse bindAXYB(BindAXYBRequest request) throws Exception {
        RawResponse response = query("BindAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public SecretBindResponse bindYBForAXYB(BindYBForAXYBRequest request) throws Exception {
        RawResponse response = query("BindYBForAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public OperationResponse unbindAXYB(SpecificSubIdRequest request) throws Exception {
        RawResponse response = query("UnbindAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public OperationResponse updateAXYB(UpdateAXYBRequest request) throws Exception {
        RawResponse response = query("UpdateAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

}
