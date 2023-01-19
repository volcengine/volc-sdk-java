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
import org.apache.http.NameValuePair;

import java.util.Collections;
import java.util.List;

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
    RawResponse response = formPost("BindAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public SecretBindResponse selectNumberAndBindAXB(SelectNumberAndBindAXBRequest request)
      throws Exception {
    RawResponse response = formPost("SelectNumberAndBindAXB",
        Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public OperationResponse unbindAXB(SpecificSubIdRequest request) throws Exception {
    RawResponse response = formPost("UnbindAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

  @Override
  public QuerySubscriptionResponse querySubscription(SpecificSubIdRequest request)
      throws Exception {
    RawResponse response = formPost("QuerySubscription",
        Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), QuerySubscriptionResponse.class);
  }

  @Override
  public QuerySubscriptionForListResponse querySubscriptionForList(
      QuerySubscriptionForListRequest request) throws Exception {
    RawResponse response = formPost("QuerySubscriptionForList",
        Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), QuerySubscriptionForListResponse.class);
  }

  @Override
  public SecretBindResponse upgradeAXToAXB(UpgradeAXToAXBRequest request) throws Exception {
    RawResponse response = formPost("UpgradeAXToAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public OperationResponse updateAXB(UpdateAXBRequest request) throws Exception {
    RawResponse response = formPost("UpdateAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

  @Override
  public SecretBindResponse bindAXN(BindAXNRequest request) throws Exception {
    RawResponse response = formPost("BindAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public SecretBindResponse selectNumberAndBindAXN(SelectNumberAndBindAXNRequest request) throws Exception {
    RawResponse response = formPost("SelectNumberAndBindAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public OperationResponse updateAXN(UpdateAXNRequest request) throws Exception {
    RawResponse response = formPost("UpdateAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

  @Override
  public OperationResponse unbindAXN(SpecificSubIdRequest request) throws Exception {
    RawResponse response = formPost("UnbindAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

  @Override
  public Click2CallResponse click2Call(Click2CallRequest request) throws Exception {
    RawResponse response = formPost("Click2Call", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), Click2CallResponse.class);
  }

  @Override
  public OperationResponse cancelClick2Call(CancelClick2CallRequest request) throws Exception {
    RawResponse response = formPost("CancelClick2Call", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

    @Override
    public SecretBindResponse bindAXNE(BindAXNERequest request) throws Exception {
        RawResponse response = formPost("BindAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public OperationResponse unbindAXNE(SpecificSubIdRequest request) throws Exception {
        RawResponse response = formPost("UnbindAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public OperationResponse updateAXNE(UpdateAXNERequest request) throws Exception {
        RawResponse response = formPost("UpdateAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public SecretBindResponse bindAXBForAXNE(BindAXBForAXNERequest request) throws Exception {
        RawResponse response = formPost("BindAXBForAXNE", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public SecretBindResponse bindAXYB(BindAXYBRequest request) throws Exception {
        RawResponse response = formPost("BindAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public SecretBindResponse bindYBForAXYB(BindYBForAXYBRequest request) throws Exception {
        RawResponse response = formPost("BindYBForAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecretBindResponse.class);
    }

    @Override
    public OperationResponse unbindAXYB(SpecificSubIdRequest request) throws Exception {
        RawResponse response = formPost("UnbindAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    @Override
    public OperationResponse updateAXYB(UpdateAXYBRequest request) throws Exception {
        RawResponse response = formPost("UpdateAXYB", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), OperationResponse.class);
    }

    private RawResponse formPost(String api, List<NameValuePair> nameValuePairs) {
        return post(api, Collections.emptyList(), nameValuePairs);
    }
}
