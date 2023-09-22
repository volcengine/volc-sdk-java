package com.volcengine.example.live;


import com.volcengine.model.live.DescribeLiveSnapshotDataBody;
import com.volcengine.model.live.DescribeLiveSnapshotDataRes;
import com.volcengine.service.live.LiveServiceNew;

public class DescribeLiveSnapshotDataExample {
    public static void main(String[] args) {
        LiveServiceNew service = LiveServiceNew.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeLiveSnapshotDataBody body = new DescribeLiveSnapshotDataBody();

        try {
            DescribeLiveSnapshotDataRes resp = service.describeLiveSnapshotData(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
