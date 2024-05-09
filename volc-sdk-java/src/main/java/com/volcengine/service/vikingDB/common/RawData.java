package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;

import lombok.Data;

@Data
public class RawData {
    private String dataType = null;
    private String text = null;
    private String image = null;
    private Integer isBuild = 0;
    public RawData setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public RawData setText(String text) {
        this.text = text;
        return this;
    }
    public RawData setImage(String image) {
        this.image = image;
        return this;
    }
    public RawData build() throws Exception{
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if(this.dataType == null){
            throw vikingDBException.getErrorCodeException(1000030, null, "DataType do not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
