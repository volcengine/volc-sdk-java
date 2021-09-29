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

  /**
   * Bind AXB.
   *
   * @param request
   * @return
   * @throws
   */
  SecretBindResponse bindAXB(BindAXBRequest request) throws Exception;

  /**
   * Select number and bind AXB.
   *
   * @param request
   * @return
   * @throws
   */
  SecretBindResponse selectNumberAndBindAXB(SelectNumberAndBindAXBRequest request) throws Exception;

  /**
   * Unbind AXB.
   *
   * @param request
   * @return
   * @throws Exception
   */
  OperationResponse unbindAXB(SpecificSubIdRequest request) throws Exception;

  /**
   * Query subscription.
   *
   * @param request
   * @return
   * @throws Exception
   */
  QuerySubscriptionResponse querySubscription(SpecificSubIdRequest request) throws Exception;

  /**
   * Query subscription for list.
   *
   * @param request
   * @return
   * @throws Exception
   */
  QuerySubscriptionForListResponse querySubscriptionForList(QuerySubscriptionForListRequest request) throws Exception;

  /**
   * Upgrade AX to AXB.
   *
   * @param request
   * @return
   * @throws Exception
   */
  SecretBindResponse upgradeAXToAXB(UpgradeAXToAXBRequest request) throws Exception;

  /**
   * Update AXB.
   *
   * @param request
   * @return
   * @throws Exception
   */
  OperationResponse updateAXB(UpdateAXBRequest request) throws Exception;

  /**
   * Bind AXN.
   *
   * @param request
   * @return
   * @throws
   */
  SecretBindResponse bindAXN(BindAXNRequest request) throws Exception;

  /**
   * Update AXN.
   *
   * @param request
   * @return
   * @throws
   */
  OperationResponse updateAXN(UpdateAXNRequest request) throws Exception;

  /**
   * Unbind AXN.
   *
   * @param request
   * @return
   * @throws Exception
   */
  OperationResponse unbindAXN(SpecificSubIdRequest request) throws Exception;
}
