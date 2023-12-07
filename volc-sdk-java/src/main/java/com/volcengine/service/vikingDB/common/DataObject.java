package com.volcengine.service.vikingDB.common;

import java.util.HashMap;
import java.util.Map;

import com.volcengine.service.vikingDB.VikingDBException;

import lombok.Data;
@Data
public class DataObject {
    private Object id = null;
    private HashMap<String, Object> fields = null;
    private String timestamp = null;
    private Integer TTL = null;
    private Double score = null;
    private Integer isBuild = 0;
    public DataObject(){}
    public DataObject setId(Object id) {
        this.id = id;
        return this;
    }
    public DataObject setFields(HashMap<String, Object> fields) {
        this.fields = fields;
        return this;
    }
    public DataObject setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public DataObject setTTL(Integer TTL) {
        this.TTL = TTL;
        return this;
    }
    public DataObject setScore(Double score) {
        this.score = score;
        return this;
    }
    public DataObject build() throws Exception{
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if(this.fields == null){
            throw vikingDBException.getErrorCodeException(1000030, null, "Fields does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
