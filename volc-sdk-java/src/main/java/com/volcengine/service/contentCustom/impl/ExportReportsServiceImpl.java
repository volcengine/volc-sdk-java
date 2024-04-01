package com.volcengine.service.contentCustom.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.contentCustom.ExportReportsRequest;
import com.volcengine.model.contentCustom.ExportReportsResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.contentCustom.ExportReportsConfig;
import com.volcengine.service.contentCustom.ExportReportsService;
import org.apache.http.HttpHost;

public class ExportReportsServiceImpl extends BaseServiceImpl implements ExportReportsService {
    static HttpHost Mproxy;
    //单例
    private volatile static ExportReportsServiceImpl instance = null;

    private ExportReportsServiceImpl() {
        super(ExportReportsConfig.serviceInfo, ExportReportsConfig.apiInfoList);
    }

    private ExportReportsServiceImpl(HttpHost proxy) {
        super(ExportReportsConfig.serviceInfo, ExportReportsConfig.apiInfoList);
    }

    public static ExportReportsServiceImpl getInstance() {
        if (instance == null) {
            synchronized (ExportReportsServiceImpl.class) {
                if (instance == null) {
                    instance = new ExportReportsServiceImpl();
                }
            }
        }
        return instance;
    }

    public static ExportReportsServiceImpl getInstance(HttpHost proxy) {
        if (instance == null) {
            synchronized (ExportReportsServiceImpl.class) {
                if (instance == null) {
                    instance = new ExportReportsServiceImpl(proxy);
                    Mproxy = proxy;
                }
            }
        }
        return instance;
    }

    @Override
    public ExportReportsResponse exportReports(ExportReportsRequest request) throws Exception {
        RawResponse response = json(Const.ExportReports, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        ExportReportsResponse res = new ExportReportsResponse();
        try {
            res = JSON.parseObject(response.getData(), ExportReportsResponse.class);
        } catch (Exception e) {
            res.setReportData(response.getData());
        }
        return res;
    }
}
