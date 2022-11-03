package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateImageFilesRequest {
    @JSONField(name = "ServiceId")
    String serviceId;

    @JSONField(name = "Action")
    Integer action;

    @JSONField(name = "ImageUrls")
    List<String> imageUrls;

    public void setAction(Action action) {
        this.action = action.getVal();
    }

    public void setAction(int action) {
        this.action = action;
    }

    public enum Action {
        REFRESH(0),
        DISABLE(1),
        ENABLE(2),
        PRELOAD(4),
        REFRESH_DIR(5),
        REFRESH_STYLE(6);

        private final int val;

        Action(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }
}
