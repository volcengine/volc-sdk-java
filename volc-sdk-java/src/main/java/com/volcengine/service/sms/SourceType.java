package com.volcengine.service.sms;

import lombok.Getter;

@Getter
public enum SourceType {
    SourceTypeText("text/string"),
    SourceTypeImageJPG("image/jpg"),
    SourceTypeImagePNG("image/png"),
    SourceTypeImageGIF("image/gif"),
    SourceTypeVideo("video/mp4"),
    SourceTypeAudio("audio/mp3");
    private String type;

    SourceType(String type){
        this.type=type;
    }
}

