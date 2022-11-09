package com.volcengine.tls_android_demo;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.request.PutLogsRequest;
import com.volcengine.model.tls.response.PutLogsResponse;
import com.volcengine.service.tls.TLSLogClient;

public class PutLogExample extends Activity {
    private String endpoint = "";
    private String ak = "";
    private String sk = "";
    private String region = "";
    private String securityToken = null;
    private TLSLogClient tlsLogClient;
    private String  topicid = "";
    private int lognum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_putlog);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //初始化tls client
                initClient();
                //发送日志
                sendLog();

            }
        });


    }
    // 初始化tls客户端
    private void initClient(){
        ClientConfig clientConfig = new ClientConfig(
                this.endpoint,
                this.region,
                this.ak,
                this.sk,
                this.securityToken
        );
        try {
            this.tlsLogClient = ClientBuilder.newClient(clientConfig);
        }catch (LogException e){
            e.printStackTrace();
        }
    }
    // 发送日志
    private void sendLog() {
        PutLogsRequest oneLog = this.oneLogsRequest();
        try{
            PutLogsResponse putLogsResponse = this.tlsLogClient.putLogs(oneLog);
            Log.i("put logs success","response:" +putLogsResponse);
            this.lognum++;
            Toast.makeText(PutLogExample.this, "发送成功,累计发送"+this.lognum+"条", Toast.LENGTH_SHORT).show();
        }catch (LogException e){
            e.printStackTrace();
            Toast.makeText(PutLogExample.this, "发送失败", Toast.LENGTH_SHORT).show();
        }

    }
    // 生成一个日志请求
    private PutLogsRequest oneLogsRequest(){
        long currentTimeMillis = System.currentTimeMillis();
        //构建content
        PutLogRequest.LogContent logContent = PutLogRequest.LogContent.newBuilder().setKey("test-key-" +
                currentTimeMillis).setValue("test-value").build();
        //构建单条log
        PutLogRequest.Log log = PutLogRequest.Log.newBuilder().setTime(currentTimeMillis).
                addContents(logContent).build();
        //构建日志组
        PutLogRequest.LogGroup logGroup = PutLogRequest.LogGroup.newBuilder().
                setSource("test-source-" + currentTimeMillis).setFileName("test5.txt").addLogs(log).build();
        //构建日志列表
        PutLogRequest.LogGroupList logGroupList = PutLogRequest.LogGroupList.newBuilder().
                addLogGroups(logGroup).build();
        //包装日志请求
        PutLogsRequest putLogsRequest = new PutLogsRequest(logGroupList, this.topicid);
        //设置日志压缩方式
        putLogsRequest.setCompressType(Const.LZ4);
        return putLogsRequest;

    }
}
