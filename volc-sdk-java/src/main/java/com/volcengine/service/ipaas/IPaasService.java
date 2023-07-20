package com.volcengine.service.ipaas;

import com.volcengine.model.ipaas.request.DetailInstanceRequest;
import com.volcengine.model.ipaas.request.ListHostRequest;
import com.volcengine.model.ipaas.request.ListInstanceRequest;
import com.volcengine.model.ipaas.response.DetailInstanceResponse;
import com.volcengine.model.ipaas.response.ListHostResponse;
import com.volcengine.model.ipaas.response.ListInstanceResponse;
import com.volcengine.service.IBaseService;

public interface IPaasService extends IBaseService {
    // host
    ListHostResponse listHost(ListHostRequest listHostRequest) throws Exception;

    // instance
    ListInstanceResponse listInstance(ListInstanceRequest listInstanceRequest) throws Exception;
    DetailInstanceResponse detailInstance(DetailInstanceRequest detailInstanceRequest) throws Exception;
}
