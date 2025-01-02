package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.Map;

@Data
public class EmbModel {
    private String modelName = null;
    private Map<String, Object> params = null;
    private Integer isBuild = 0;

    public EmbModel setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public EmbModel setParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }

    public EmbModel build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.modelName == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "ModelName does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
