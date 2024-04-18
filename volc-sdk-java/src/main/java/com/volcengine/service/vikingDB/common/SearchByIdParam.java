package com.volcengine.service.vikingDB.common;

import java.util.List;
import java.util.Map;

import com.volcengine.service.vikingDB.VikingDBException;

import lombok.Data;
@Data
public class SearchByIdParam {
    private Object id = null;
    private Map<String, Object> filter = null;
    private Integer limit = 10;
    private List<String> outputFields = null;
    private Object partition = "default";
    private Integer isBuild = 0;
    private Double denseWeight = null;
    public SearchByIdParam setId(Object id){
        this.id = id;
        return this;
    }
    public SearchByIdParam setFilter(Map<String, Object> filter){
        this.filter = filter;
        return this;
    }
    public SearchByIdParam setLimit(Integer limit){
        this.limit = limit;
        return this;
    }
    public SearchByIdParam setOutputFields(List<String> outputFields){
        this.outputFields = outputFields;
        return this;
    }
    public SearchByIdParam setPartition(Object partition){
        this.partition = partition;
        return this;
    }
    public SearchByIdParam setDenseWeight(Double denseWeight){
        this.denseWeight = denseWeight;
        return this;
    }
    public SearchByIdParam build() throws Exception{
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if(this.id == null){
            throw vikingDBException.getErrorCodeException(1000030, null, "ID does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
