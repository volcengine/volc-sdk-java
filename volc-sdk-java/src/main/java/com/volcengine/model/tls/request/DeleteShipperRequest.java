package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.SHIPPER_ID;

@Data
@NoArgsConstructor
public class DeleteShipperRequest {
    @JSONField(name = SHIPPER_ID)
    private String shipperId;

    /**
     * @param shipperId 投递配置 ID
     */
    public DeleteShipperRequest(String shipperId) {
        this.shipperId = shipperId;
    }

    /**
     * @return 投递配置 ID
     */
    public String getShipperId() {
        return shipperId;
    }

    /**
     * @param shipperId 投递配置 ID
     */
    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public boolean CheckValidation() {
        return this.shipperId != null && !this.shipperId.isEmpty();
    }
}