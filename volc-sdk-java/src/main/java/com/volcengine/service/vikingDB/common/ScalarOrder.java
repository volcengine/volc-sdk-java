package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

@Data
public class ScalarOrder {
    private String fieldName = null;
    private String order = null;
    private Integer isBuild = 0;

    public ScalarOrder(String fieldName, String order) {
        this.fieldName = fieldName;
        this.order = order;
    }

    public ScalarOrder build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.fieldName == null && this.order == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "fieldName and order do not exist together");

        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
