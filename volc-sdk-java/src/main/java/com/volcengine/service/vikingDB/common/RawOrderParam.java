package com.volcengine.service.vikingDB.common;
import lombok.Data;

@Data
public class RawOrderParam {
   private String text;
   private String image; // 或 String base64Image;
   private Boolean needInstruction;
   // 其他 SearchWithMultiModalParam 和 SearchByTextParam 共有的字段也可以考虑放在这里


   public RawOrderParam setText(String text) {
       this.text = text;
       return this;
   }

   public RawOrderParam setImage(String image) {
       this.image = image;
       return this;
   }

   public RawOrderParam setNeedInstruction(Boolean needInstruction) {
       this.needInstruction = needInstruction;
       return this;
   }
}