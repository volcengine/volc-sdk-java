package com.volcengine.service.im;


import com.volcengine.model.im.AddBlackListBody;
import com.volcengine.model.im.AddBlackListBodyBlackListInfosItem;
import com.volcengine.model.im.AddBlackListRes;

import java.util.ArrayList;
import java.util.List;

public class AddBlackListExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        AddBlackListBody body = new AddBlackListBody();
        body.setAppId(666675);
        body.setUserId(1001L);
        body.setInboxType(0);
        List<AddBlackListBodyBlackListInfosItem> blockList = new ArrayList<>();
        AddBlackListBodyBlackListInfosItem blockItem = new AddBlackListBodyBlackListInfosItem();
        blockItem.setBlackListUserId(19999L);
        blockList.add(blockItem);
        body.setBlackListInfos(blockList);

        try {
            AddBlackListRes resp = service.addBlackList(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
