package com.volcengine.service.numberpool;

import com.volcengine.service.IBaseService;
import com.volcengine.service.numberpool.request.CreateNumberPoolRequest;
import com.volcengine.service.numberpool.request.EnableNumberRequest;
import com.volcengine.service.numberpool.request.NumberListRequest;
import com.volcengine.service.numberpool.request.NumberPoolListRequest;
import com.volcengine.service.numberpool.request.SelectNumberRequest;
import com.volcengine.service.numberpool.request.UpdateNumberPoolRequest;
import com.volcengine.service.numberpool.response.CreateNumberPoolResponse;
import com.volcengine.service.numberpool.response.EnableNumberResponse;
import com.volcengine.service.numberpool.response.NumberListResponse;
import com.volcengine.service.numberpool.response.NumberPoolListResponse;
import com.volcengine.service.numberpool.response.SelectNumberResponse;
import com.volcengine.service.numberpool.response.UpdateNumberPoolResponse;

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

    /**
     * 新建号码池
     *
     * @param request
     * @return
     * @throws Exception
     */
    CreateNumberPoolResponse createNumberPool(CreateNumberPoolRequest request) throws Exception;

    /**
     * 更新号码池
     *
     * @param request
     * @return
     * @throws Exception
     */
    UpdateNumberPoolResponse updateNumberPool(UpdateNumberPoolRequest request) throws Exception;

    /**
     * 批量号码启用/停用
     *
     * @param request
     * @return
     * @throws Exception
     */
    EnableNumberResponse enableOrDisableNumber(EnableNumberRequest request) throws Exception;

    /**
     * 选号
     *
     * @param request
     * @return
     * @throws Exception
     */
    SelectNumberResponse selectNumber(SelectNumberRequest request) throws Exception;
}
