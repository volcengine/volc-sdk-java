package com.volcengine.example.contentCustom;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.contentCustom.ExportReportsRequest;
import com.volcengine.model.contentCustom.ExportReportsResponse;
import com.volcengine.model.contentCustom.UserDurationExport;
import com.volcengine.service.contentCustom.ExportReportsService;
import com.volcengine.service.contentCustom.impl.ExportReportsServiceImpl;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExportReportsDemo {
    public static void main(String[] args) {
        ExportReportsService exportReportsService = ExportReportsServiceImpl.getInstance();

        exportReportsService.setAccessKey("ak");
        exportReportsService.setSecretKey("sk");

        String utmSource = "server_sdk_demo_default_content";
        String reportType = "user_duration";
        String date = "20240323";
        ExportReportsRequest request = new ExportReportsRequest();
        request.setUtmSource(utmSource);
        request.setReportType(reportType);
        request.setUserDurationExport(new UserDurationExport());
        request.getUserDurationExport().setDate(date);

        ExportReportsResponse response = new ExportReportsResponse();
        try {
            response = exportReportsService.exportReports(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (response.getReportData() == null) {
            System.out.println("Export report failed!");
            return;
        }
        String reportPath = String.format("yourpath/%s_report_%s.csv", reportType, date);
        try {
            FileOutputStream outputStream = new FileOutputStream(reportPath);
            outputStream.write(response.getReportData());
            outputStream.close();
            System.out.println("Export report successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
