//package com.volcengine.example.live;
//
//import com.alibaba.fastjson.JSON;
//import com.volcengine.model.live.request.*;
//import com.volcengine.model.live.response.*;
//import com.volcengine.service.live.LiveService;
//import com.volcengine.service.live.impl.LiveServiceImpl;
//
///**
// * 与Domain相关的Demo
// */
//public class LiveDomainDemo {
//    public static void main(String[] args) {
//        LiveService liveService = LiveServiceImpl.getInstance();
//        liveService.setAccessKey("your accessKey");
//        liveService.setSecretKey("your secretKey");
//        //添加域名
//        createDomainDemo(liveService);
//        //删除域名
//        deleteDomainDemo(liveService);
//        //查询域名列表
//        listDomainDetailDemo(liveService);
//        //查询域名信息
//        describeDomainDemo(liveService);
//        //启用域名
//        enableDomainDemo(liveService);
//        //停用域名
//        disableDomainDemo(liveService);
//        //管理推拉流域名绑定
//        managerPullPushDomainBindDemo(liveService);
//    }
//
//    /**
//     * 添加域名
//     *
//     * @param liveService
//     */
//    private static void createDomainDemo(LiveService liveService) {
//        CreateDomainRequest request = new CreateDomainRequest();
//        request.setDomain("your domain");
//        request.setType("your type");
//        try {
//            CreateDomainResponse response = liveService.createDomain(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 删除域名
//     *
//     * @param liveService
//     */
//    private static void deleteDomainDemo(LiveService liveService) {
//        DeleteDomainRequest request = new DeleteDomainRequest();
//        //first disable
//        request.setDomain("your domain");
//        try {
//            DeleteDomainResponse response = liveService.deleteDomain(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 查询域名列表
//     *
//     * @param liveService
//     */
//    private static void listDomainDetailDemo(LiveService liveService) {
//        ListDomainDetailRequest request = new ListDomainDetailRequest();
//        request.setPageNum(1);
//        request.setPageSize(10);
//        try {
//            ListDomainDetailResponse response = liveService.listDomainDetail(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 查询域名信息
//     *
//     * @param liveService
//     */
//    private static void describeDomainDemo(LiveService liveService) {
//        DescribeDomainRequest request = new DescribeDomainRequest();
//        request.setDomainList(new String[]{"your domain list"});
//        try {
//            DescribeDomainResponse response = liveService.describeDomain(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 启用域名
//     *
//     * @param liveService
//     */
//    private static void enableDomainDemo(LiveService liveService) {
//        EnableDomainRequest request = new EnableDomainRequest();
//        request.setDomain("your domain");
//        try {
//            EnableDomainResponse response = liveService.enableDomain(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 停用域名
//     *
//     * @param liveService
//     */
//    private static void disableDomainDemo(LiveService liveService) {
//        DisableDomainRequest request = new DisableDomainRequest();
//        request.setDomain("your domain");
//        try {
//            DisableDomainResponse response = liveService.disableDomain(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 通过请求参数区分这两个服务
//     * 拉流域名绑定推流域名
//     * 删除拉流域名绑定推流域名
//     *
//     * @param liveService
//     */
//    private static void managerPullPushDomainBindDemo(LiveService liveService) {
//        ManagerPullPushDomainBindRequest request = new ManagerPullPushDomainBindRequest();
//        request.setPullDomain("your push domain");
//        request.setPullDomain("your Pull domain");
//        try {
//            ManagerPullPushDomainBindResponse response = liveService.managerPullPushDomainBind(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
