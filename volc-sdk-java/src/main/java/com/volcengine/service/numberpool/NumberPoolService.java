package com.volcengine.service.numberpool;

import com.volcengine.service.IBaseService;
import com.volcengine.service.numberpool.request.NumberListRequest;
import com.volcengine.service.numberpool.request.NumberPoolListRequest;
import com.volcengine.service.numberpool.response.NumberListResponse;
import com.volcengine.service.numberpool.response.NumberPoolListResponse;

public interface NumberPoolService extends IBaseService {
    /**
     * 查询号码池列表
     *
     * @param request
     * @return
     * @throws Exception
     */
    NumberPoolListResponse queryNumberPoolList(NumberPoolListRequest request) throws Exception;

    /**
     * 查询号码列表
     *
     * @param request
     * @return
     * @throws Exception
     */
    NumberListResponse queryNumberList(NumberListRequest request) throws Exception;
}
