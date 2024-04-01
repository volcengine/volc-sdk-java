package com.volcengine.service.contentCustom;

import com.volcengine.model.contentCustom.ExportReportsRequest;
import com.volcengine.model.contentCustom.ExportReportsResponse;
import com.volcengine.service.IBaseService;

public interface ExportReportsService extends IBaseService {
    /**
     * 导出报表
     *
     * @param request
     * @return com.volcengine.model.report.ExportReportsResponse
     * @author liqi.0117
     */
    ExportReportsResponse exportReports(ExportReportsRequest request) throws Exception;
}
