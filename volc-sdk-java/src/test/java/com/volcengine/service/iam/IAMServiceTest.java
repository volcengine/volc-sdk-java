package com.volcengine.service.iam;

import com.volcengine.model.request.AssumeRoleRequest;
import com.volcengine.model.request.iam.*;
import com.volcengine.model.response.AssumeRoleResponse;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.iam.RoleGetResponse;
import com.volcengine.model.response.iam.RoleListResponse;
import com.volcengine.service.iam.impl.IamServiceImpl;
import com.volcengine.service.sts.ISTSService;
import com.volcengine.service.sts.impl.STSServiceImpl;
import junit.framework.TestCase;

public class IAMServiceTest extends TestCase {

    public void testRole() throws Exception {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("AKTPNjgyZDI5M2ZjMjk1NDExY2E2OWVjNGQ1ODA3MTcwMDI");
        iamService.setSecretKey("WW1ReFpEUTNaRGRtTVdSbU5ESTRNbUZpTkdObE5HWXdZMk5oTXpGbU16WQ==");
        iamService.setSessionToken("STSeyJBY2NvdW50SWQiOjIwMDAwMDI3NjAsIklkZW50aXR5VHlwZSI6NCwiSWRlbnRpdHlJZCI6MTAxMjk2NywiQ2hhbm5lbCI6IlVzZXIiLCJBY2Nlc3NLZXlJZCI6IkFLVFBOamd5WkRJNU0yWmpNamsxTkRFeFkyRTJPV1ZqTkdRMU9EQTNNVGN3TURJIiwiU2lnbmVkU2VjcmV0QWNjZXNzS2V5IjoiM1JzTXR0eGdRSm93NU10enVQU0JBQmMxZVlSQW1McDdhZG5oa1dsVzF4MXZvZGE5K3phMlFFL2MyOGRBbnljSDlHUnV5eHhrVmpINkxWSytnYlNqb1E9PSIsIkV4cGlyZWRUaW1lIjoxNjQ2MzA4MTY1LCJQb2xpY3lTdHJpbmciOiIiLCJTaWduYXR1cmUiOiIyNDgxODdmNGJjMjE1NzliMDk4OTgwMmUxOGMzY2RkZjk2MDMxYWZjYmNhODIyNmVmMWUyOTNiNTkyM2Y2ZGViIiwiU2Vzc2lvbk5hbWUiOiJ0ZXN0QXNzdW1lUm9sZSJ9");

//        RoleGetResponse resp = iamService.createRole(new RoleCreateRequest() {{
//            setRoleName("testRole2");
//            setDescription("testRole");
//            setDisplayName("testRole");
//            setTrustPolicyDocument("{\n" +
//                    "    \"Statement\": [\n" +
//                    "        {\n" +
//                    "            \"Effect\": \"Allow\",\n" +
//                    "            \"Action\": [\n" +
//                    "                \"sts:AssumeRole\"\n" +
//                    "            ],\n" +
//                    "            \"Principal\": {\n" +
//                    "                \"IAM\": [\n" +
//                    "                    \"trn:iam::2000002760:user/asdfghjkl\"\n" +
//                    "                ]\n" +
//                    "            }\n" +
//                    "        }\n" +
//                    "    ]\n" +
//                    "}");
//        }});
//        System.out.println(resp.toString());

//        CommonResponse uresp = iamService.updateRole(new RoleUpdateRequest() {{
//            setRoleName("testRole2");
//            setDisplayName("我又改回来了");
//            setMaxSessionDuration(9000);
//        }});
//        System.out.println(uresp);

//        RoleGetResponse resp = iamService.getRole(new RoleGetRequest() {{
//            setRoleName("testRole2");
//        }});
//
//        System.out.println(resp);

        RoleListResponse response = iamService.listRoles(new RoleListRequest(){{
            setLimit(100);
        }});
        System.out.println(response);

//        CommonResponse resp = iamService.deleteRole(new RoleDeleteRequest() {{
//            setRoleName("testRole2");
//        }});
//        System.out.println(resp);

//        ISTSService sts = STSServiceImpl.getInstance();
//        sts.setAccessKey("AKLTMmUwNWIwMDU1ZGE3NDU2NDlhMWFlMmZlZTM0MjMwNzQ");
//        sts.setSecretKey("TUdOak1XWXpNV0l5TXpJeE5HWTJOemxtWVRFd056WmtOV1ptWkRabVpHTQ==");
//        AssumeRoleResponse resp = sts.assumeRole(new AssumeRoleRequest() {{
//            setRoleTrn("trn:iam::2000002760:role/testRole1");
//            setRoleSessionName("testAssumeRole");
//        }});
//        System.out.println(resp);
    }
}
