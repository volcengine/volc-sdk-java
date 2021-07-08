package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ProductAPIs {
      @JSONField(name = "EnableFloating")
      Boolean EnableFloating;
      @JSONField(name = "Product")
      List<ProductMsgAPI> Product;
}
