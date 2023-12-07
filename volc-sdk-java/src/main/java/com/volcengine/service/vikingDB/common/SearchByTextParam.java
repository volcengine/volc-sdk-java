package com.volcengine.service.vikingDB.common;

import java.util.List;
import java.util.Map;

import com.volcengine.service.vikingDB.VikingDBException;

import lombok.Data;
@Data
public class SearchByTextParam {
    private Text text= null;
    private Map<String, Object> filter = null;
    private Integer limit = 10;
    private List<String> outputFields = null;
    private Object partition = "default";
    private Integer isBuild = 0;
    public SearchByTextParam setText(Text text){
        this.text = text;
        return this;
    }
    public SearchByTextParam setFilter(Map<String, Object> filter){
        this.filter = filter;
        return this;
    }
    public SearchByTextParam setLimit(Integer limit){
        this.limit = limit;
        return this;
    }
    public SearchByTextParam setOutputFields(List<String> outputFields){
        this.outputFields = outputFields;
        return this;
    }
    public SearchByTextParam setPartition(Object partition){
        this.partition = partition;
        return this;
    }
    public SearchByTextParam build() throws Exception{
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if(this.text == null){
            throw vikingDBException.getErrorCodeException(1000030, null, "Vector does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
