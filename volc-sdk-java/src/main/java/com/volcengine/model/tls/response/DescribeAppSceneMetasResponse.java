package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.AppSceneMetaInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.ITEMS;
import static com.volcengine.model.tls.Const.PAGE_CONTEXT;
import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeAppSceneMetasResponse extends CommonResponse {
    @JSONField(name = PAGE_CONTEXT)
    private String pageContext;
    @JSONField(name = TOTAL)
    private long total;
    @JSONField(name = ITEMS)
    private List<AppSceneMetaInfo.DescribeAppSceneMetasRes> items;

    public DescribeAppSceneMetasResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeAppSceneMetasResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeAppSceneMetasResponse response = (DescribeAppSceneMetasResponse) super.deSerialize(data, clazz);
        this.setPageContext(response.getPageContext());
        this.setTotal(response.getTotal());
        this.setItems(response.getItems());
        return this;
    }
}
