package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.List;

@Data
public class CreateCollectionParam {
    private String collectionName = null;
    private List<Field> fields = null;
    private String description = "";
    private List<VectorizeTuple> vectorize = null;
    private String project = "default";
    private Integer isBuild = 0;

    public CreateCollectionParam() {
    }

    public CreateCollectionParam setCollectionName(String collection_name) {
        this.collectionName = collection_name;
        return this;
    }

    public CreateCollectionParam setFields(List<Field> fields) {
        this.fields = fields;
        return this;
    }

    public CreateCollectionParam setDescription(String description) {
        this.description = description;
        return this;
    }

    public CreateCollectionParam SetProject(String project) {
        this.project = project;
        return this;
    }

    public CreateCollectionParam setVectorize(List<VectorizeTuple> vectorize) {
        this.vectorize = vectorize;
        return this;
    }

    public CreateCollectionParam build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.collectionName == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "CollectionName does not exist");
        } else if (this.fields == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "Fields does not exist");
        } else if (this.vectorize != null && this.vectorize.size() > 1) {
            throw vikingDBException.getErrorCodeException(1000030, null, "Vectorize size does not support more than 1 yet");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
