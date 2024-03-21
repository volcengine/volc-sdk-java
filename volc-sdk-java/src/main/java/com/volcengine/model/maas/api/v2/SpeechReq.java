
package com.volcengine.model.maas.api.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.Map;


/**
 * Usage
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "req_id",
    "input",
    "voice",
    "response_format",
    "speed",
    "extra"
})
@Generated("jsonschema2pojo")
public class SpeechReq {

    /**
     * Req Id
     * <p>
     * 
     * 
     */
    @JsonProperty("req_id")
    private String reqId;
    /**
     * Input
     * <p>
     * 
     * 
     */
    @JsonProperty("input")
    private String input;
    /**
     * Voice
     * <p>
     * 
     * 
     */
    @JsonProperty("voice")
    private String voice;
    /**
     * Response Format
     * <p>
     *
     *
     */
    @JsonProperty("response_format")
    private String responseFormat;
    /**
     * Speed
     * <p>
     *
     *
     */
    @JsonProperty("speed")
    private Float speed;
    /**
     * Extra
     * <p>
     * 
     * 
     */
    @JsonProperty("extra")
    private Map<String, String> extra;

    /**
     * Input
     * <p>
     *
     *
     */
    @JsonProperty("input")
    public String getInput() {
        return input;
    }

    /**
     * Input
     * <p>
     *
     *
     */
    @JsonProperty("input")
    public void setInput(String input) {
        this.input = input;
    }

    public SpeechReq withInput(String input) {
        this.input = input;
        return this;
    }


    /**
     * Voice
     * <p>
     * 
     * 
     */
    @JsonProperty("voice")
    public String getVoice() {
        return voice;
    }

    /**
     * Voice
     * <p>
     * 
     * 
     */
    @JsonProperty("voice")
    public void setVoice(String voice) {
        this.voice = voice;
    }

    public SpeechReq withVoice(String voice) {
        this.voice = voice;
        return this;
    }

    /**
     * Response Format
     * <p>
     *
     *
     */
    @JsonProperty("response_format")
    public String getResponseFormat() {
        return responseFormat;
    }

    /**
     * Response Format
     * <p>
     *
     *
     */
    @JsonProperty("response_format")
    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public SpeechReq withResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }

    /**
     * Speed
     * <p>
     *
     *
     */
    @JsonProperty("speed")
    public Float getSpeed() {
        return speed;
    }

    /**
     * Speed
     * <p>
     *
     *
     */
    @JsonProperty("speed")
    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public SpeechReq withSpeed(Float speed) {
        this.speed = speed;
        return this;
    }

    /**
     * Extra
     * <p>
     *
     *
     */
    @JsonProperty("extra")
    public Map<String, String> getExtra() {
        return extra;
    }

    /**
     * Extra
     * <p>
     *
     *
     */
    @JsonProperty("extra")
    public void setExtra(Map<String, String> extra) {
        this.extra = extra;
    }

    public SpeechReq withExtra(Map<String, String> extra) {
        this.extra = extra;
        return this;
    }

}
