package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class PageDataObject {
    private List<DataObject> items = null;
    private HashMap<String, Object> pagination  = null;
    private Integer isBuild = 0;

    public PageDataObject() {
    }

    public PageDataObject setItems(List<DataObject> items) {
        this.items = items;
        return this;
    }

    public PageDataObject setPagination(HashMap<String, Object> pagination) {
        this.pagination = pagination;
        return this;
    }

    public PageDataObject build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.items == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "items does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
