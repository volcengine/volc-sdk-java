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

    SecretBindResponse selectNumberAndBindAXN(SelectNumberAndBindAXNRequest request) throws Exception;

    OperationResponse updateAXN(UpdateAXNRequest request) throws Exception;

    OperationResponse unbindAXN(SpecificSubIdRequest request) throws Exception;

    Click2CallResponse click2Call(Click2CallRequest request) throws Exception;

    OperationResponse cancelClick2Call(CancelClick2CallRequest request) throws Exception;

    SecretBindResponse bindAXNE(BindAXNERequest request) throws Exception;

    OperationResponse unbindAXNE(SpecificSubIdRequest request) throws Exception;

    OperationResponse updateAXNE(UpdateAXNERequest request) throws Exception;

    SecretBindResponse bindAXBForAXNE(BindAXBForAXNERequest request) throws Exception;

    SecretBindResponse bindAXYB(BindAXYBRequest request) throws Exception;

    SecretBindResponse bindYBForAXYB(BindYBForAXYBRequest request) throws Exception;

    OperationResponse unbindAXYB(SpecificSubIdRequest request) throws Exception;

    OperationResponse updateAXYB(UpdateAXYBRequest request) throws Exception;
}
