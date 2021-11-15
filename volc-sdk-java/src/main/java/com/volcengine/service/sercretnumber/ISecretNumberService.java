package com.volcengine.service.sercretnumber;

import com.volcengine.service.IBaseService;
import com.volcengine.service.sercretnumber.model.request.BindAXBRequest;
import com.volcengine.service.sercretnumber.model.request.BindAXNRequest;
import com.volcengine.service.sercretnumber.model.request.QuerySubscriptionForListRequest;
import com.volcengine.service.sercretnumber.model.request.SelectNumberAndBindAXBRequest;
import com.volcengine.service.sercretnumber.model.request.SpecificSubIdRequest;
import com.volcengine.service.sercretnumber.model.request.UpdateAXBRequest;
import com.volcengine.service.sercretnumber.model.request.UpdateAXNRequest;
import com.volcengine.service.sercretnumber.model.request.UpgradeAXToAXBRequest;
import com.volcengine.service.sercretnumber.model.response.OperationResponse;
import com.volcengine.service.sercretnumber.model.response.QuerySubscriptionForListResponse;
import com.volcengine.service.sercretnumber.model.response.QuerySubscriptionResponse;
import com.volcengine.service.sercretnumber.model.response.SecretBindResponse;

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
}
