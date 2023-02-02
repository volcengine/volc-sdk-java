package com.volcengine.service.vms;

import com.volcengine.service.IBaseService;
import com.volcengine.service.vms.model.request.*;
import com.volcengine.service.vms.model.response.*;

/**
 * The interface secret number service.
 */
public interface IRiskService extends IBaseService {

    RiskControlResponse canCall(RiskControlReq request) throws Exception;
}
