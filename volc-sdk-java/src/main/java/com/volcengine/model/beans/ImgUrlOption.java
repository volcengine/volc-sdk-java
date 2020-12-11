package com.volcengine.model.beans;

import com.volcengine.helper.Const;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ImgUrlOption {
    boolean isHttps;
    String fomat;
    String sigKey;
    String tpl;
    int w;
    int h;
    Map<String, List<String>> kv;

    public void setVodTplObj() {
        this.tpl = Const.VOD_TPL_OBJ;
    }

    public void setVodTplNoop() {
        this.tpl = Const.VOD_TPL_NOOP;
    }

    public void setVodTplCenterCrop(int width, int height) {
        this.w = width;
        this.h = height;
        this.tpl = Const.VOD_TPL_CENTER_CROP;
    }

    public void setVodTplSmartCrop(int width, int height) {
        this.w = width;
        this.h = height;
        this.tpl = Const.VOD_TPL_SMART_CROP;
    }

    public void setVodTplResize(int width, int height) {
        this.w = width;
        this.h = height;
        this.tpl = Const.VOD_TPL_RESIZE;
    }
}
