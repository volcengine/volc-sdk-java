package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePadStreamListResResult
 */
@lombok.Data
public final class DescribeLivePadStreamListResResult  {

    /**
     * <p>流列表，包含每个流的详细信息。每个流对象包含以下属性：</p>
     *
     * <p>- `Vhost`：虚拟主机名称；</p>
     *
     * <p>- `App`：应用程序的名称；</p>
     *
     * <p>- `Stream`：流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamList")
    private List<DescribeLivePadStreamListResResultStreamListItem> streamList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
