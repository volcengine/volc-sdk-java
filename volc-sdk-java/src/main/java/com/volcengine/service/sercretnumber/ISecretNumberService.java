package com.volcengine.service.sercretnumber;

import com.volcengine.service.IBaseService;
import com.volcengine.service.sercretnumber.model.request.*;
import com.volcengine.service.sercretnumber.model.response.*;

/**
 * The interface secret number service.
 */
public interface ISecretNumberService extends IBaseService {

  SecretBindResponse bindAXB(BindAXBRequest request) throws Exception;

  SecretBindResponse selectNumberAndBindAXB(SelectNumberAndBindAXBRequest request) throws Exception;

  OperationResponse unbindAXB(SpecificSubIdRequest request) throws Exception;

  QuerySubscriptionResponse querySubscription(SpecificSubIdRequest request) throws Exception;

  QuerySubscriptionForListResponse querySubscriptionForList(QuerySubscriptionForListRequest request) throws Exception;

  SecretBindResponse upgradeAXToAXB(UpgradeAXToAXBRequest request) throws Exception;

  OperationResponse updateAXB(UpdateAXBRequest request) throws Exception;

  SecretBindResponse bindAXN(BindAXNRequest request) throws Exception;

  OperationResponse updateAXN(UpdateAXNRequest request) throws Exception;

  OperationResponse unbindAXN(SpecificSubIdRequest request) throws Exception;

  Click2CallResponse click2Call(Click2CallRequest request) throws Exception;

  OperationResponse cancelClick2Call(CancelClick2CallRequest request) throws Exception;
}
