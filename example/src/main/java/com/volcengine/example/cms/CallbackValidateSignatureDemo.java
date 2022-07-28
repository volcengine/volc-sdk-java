package com.volcengine.example.cms;

import com.volcengine.helper.Utils;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

public class CallbackValidateSignatureDemo {

    // get secureKey from cms platform
    public static final String SecureKey = "secure_key";

    public static void main(String[] args) {
        // get timestamp, nonce, signature from http request header
        String timestamp = "1658285156";
        String nonce = "7782450";
        String signature = "21ce5895b592e330589ceadc367be14c05b4609c4494b66f4d80f595d551991c";
        // get payload from http request body
        String payload = "{\"EventType\":\"push_task\",\"EventTime\":\"2022-07-20T10:45:56+08:00\",\"Version\":\"1.0\",\"Data\":{\"GroupId\":0,\"SourceName\":\"\",\"PushAbstract\":\"测试摘要\",\"TargetPeople\":\"all\",\"TargetAppId\":0,\"TargetAppName\":\"\",\"TaskName\":\"测试任务\",\"TaskId\":7122280492321211934,\"GenerateType\":\"\",\"PushTitle\":\"测试标题\",\"ExpectExecuteTime\":1658285156}}";
        try {
            System.out.println(validate(timestamp, nonce, payload, SecureKey, signature));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean validate(String timestamp, String nonce, String payload, String secureKey, String signature) throws Exception {
        String content = timestamp + nonce + payload;
        String generateSignature = Hex.encodeHexString(Utils.hmacSHA256(secureKey.getBytes(StandardCharsets.UTF_8), content));
        return generateSignature.equals(signature);
    }

}
