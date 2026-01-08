package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeShipperRequest {
    private String shipperId;

    /**
     * @param shipperId 待查询的投递配置 ID
     */
    public DescribeShipperRequest(String shipperId) {
        this.shipperId = shipperId;
    }

    /**
     * @return 待查询的投递配置 ID
     */
    public String getShipperId() {
        return shipperId;
    }

    /**
     * @param shipperId 待查询的投递配置 ID
     */
    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.shipperId == null || this.shipperId.isEmpty()) {
            return false;
        }
        return true;
    }
}