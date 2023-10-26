package com.volcengine.service.stream;

import com.volcengine.model.stream.SearchGroupResponse;
import com.volcengine.model.stream.SearchGroupResponseV2;
import com.volcengine.model.stream.SearchRequest;
import com.volcengine.service.IBaseService;

public interface SearchService extends IBaseService {
    void SetNeedMonitor(boolean open);

    /**
     * 获取列表页(已废弃)
     *
     * @param request
     * @return com.volcengine.model.stream.SearchGroupResponse
     * @author lumeng.lim
     */
    SearchGroupResponse searchGroup(SearchRequest request) throws Exception;

    /**
     * 获取列表页
     *
     * @param request
     * @return com.volcengine.model.stream.SearchGroupResponse
     * @author lumeng.lim
     */
    SearchGroupResponseV2 searchGroupV2(SearchRequest request) throws Exception;
}
