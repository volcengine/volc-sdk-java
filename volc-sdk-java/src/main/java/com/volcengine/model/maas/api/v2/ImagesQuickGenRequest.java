
package com.volcengine.model.maas.api.v2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MaasImagesQuickGenRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "req_id",
    "prompt",
    "negative_prompt",
    "init_image",
    "control_image",
    "parameters"
})
@Generated("jsonschema2pojo")
public class ImagesQuickGenRequest {

    /**
     * Req Id
     * <p>
     * 
     * 
     */
    @JsonProperty("req_id")
    private String reqId;
    /**
     * Prompt
     * <p>
     * 
     * 
     */
    @JsonProperty("prompt")
    private String prompt;
    /**
     * Negative Prompt
     * <p>
     * 
     * 
     */
    @JsonProperty("negative_prompt")
    private String negativePrompt;
    /**
     * Init Image
     * <p>
     * 
     * 
     */
    @JsonProperty("init_image")
    private byte[] initImage;
    /**
     * Control Image
     * <p>
     * 
     * 
     */
    @JsonProperty("control_image")
    private byte[] controlImage;
    /**
     * ImagesParameters
     * <p>
     * 
     * 
     */
    @JsonProperty("parameters")
    private ImagesParameters parameters;

    /**
     * Req Id
     * <p>
     * 
     * 
     */
    @JsonProperty("req_id")
    public String getReqId() {
        return reqId;
    }

    /**
     * Req Id
     * <p>
     * 
     * 
     */
    @JsonProperty("req_id")
    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public ImagesQuickGenRequest withReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }

    /**
     * Prompt
     * <p>
     * 
     * 
     */
    @JsonProperty("prompt")
    public String getPrompt() {
        return prompt;
    }

    /**
     * Prompt
     * <p>
     * 
     * 
     */
    @JsonProperty("prompt")
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public ImagesQuickGenRequest withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * Negative Prompt
     * <p>
     * 
     * 
     */
    @JsonProperty("negative_prompt")
    public String getNegativePrompt() {
        return negativePrompt;
    }

    /**
     * Negative Prompt
     * <p>
     * 
     * 
     */
    @JsonProperty("negative_prompt")
    public void setNegativePrompt(String negativePrompt) {
        this.negativePrompt = negativePrompt;
    }

    public ImagesQuickGenRequest withNegativePrompt(String negativePrompt) {
        this.negativePrompt = negativePrompt;
        return this;
    }

    /**
     * Init Image
     * <p>
     * 
     * 
     */
    @JsonProperty("init_image")
    public byte[] getInitImage() {
        return initImage;
    }

    /**
     * Init Image
     * <p>
     * 
     * 
     */
    @JsonProperty("init_image")
    public void setInitImage(byte[] initImage) {
        this.initImage = initImage;
    }

    public ImagesQuickGenRequest withInitImage(byte[] initImage) {
        this.initImage = initImage;
        return this;
    }

    /**
     * Control Image
     * <p>
     * 
     * 
     */
    @JsonProperty("control_image")
    public byte[] getControlImage() {
        return controlImage;
    }

    /**
     * Control Image
     * <p>
     * 
     * 
     */
    @JsonProperty("control_image")
    public void setControlImage(byte[] controlImage) {
        this.controlImage = controlImage;
    }

    public ImagesQuickGenRequest withControlImage(byte[] controlImage) {
        this.controlImage = controlImage;
        return this;
    }

    /**
     * ImagesParameters
     * <p>
     * 
     * 
     */
    @JsonProperty("parameters")
    public ImagesParameters getParameters() {
        return parameters;
    }

    /**
     * ImagesParameters
     * <p>
     * 
     * 
     */
    @JsonProperty("parameters")
    public void setParameters(ImagesParameters parameters) {
        this.parameters = parameters;
    }

    public ImagesQuickGenRequest withParameters(ImagesParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImagesQuickGenRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqId");
        sb.append('=');
        sb.append(((this.reqId == null)?"<null>":this.reqId));
        sb.append(',');
        sb.append("prompt");
        sb.append('=');
        sb.append(((this.prompt == null)?"<null>":this.prompt));
        sb.append(',');
        sb.append("negativePrompt");
        sb.append('=');
        sb.append(((this.negativePrompt == null)?"<null>":this.negativePrompt));
        sb.append(',');
        sb.append("initImage");
        sb.append('=');
        sb.append(((this.initImage == null)?"<null>":this.initImage));
        sb.append(',');
        sb.append("controlImage");
        sb.append('=');
        sb.append(((this.controlImage == null)?"<null>":this.controlImage));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.initImage == null)? 0 :this.initImage.hashCode()));
        result = ((result* 31)+((this.controlImage == null)? 0 :this.controlImage.hashCode()));
        result = ((result* 31)+((this.prompt == null)? 0 :this.prompt.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        result = ((result* 31)+((this.reqId == null)? 0 :this.reqId.hashCode()));
        result = ((result* 31)+((this.negativePrompt == null)? 0 :this.negativePrompt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImagesQuickGenRequest) == false) {
            return false;
        }
        ImagesQuickGenRequest rhs = ((ImagesQuickGenRequest) other);
        return (((((((this.initImage == rhs.initImage)||((this.initImage!= null)&&this.initImage.equals(rhs.initImage)))&&((this.controlImage == rhs.controlImage)||((this.controlImage!= null)&&this.controlImage.equals(rhs.controlImage))))&&((this.prompt == rhs.prompt)||((this.prompt!= null)&&this.prompt.equals(rhs.prompt))))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))))&&((this.negativePrompt == rhs.negativePrompt)||((this.negativePrompt!= null)&&this.negativePrompt.equals(rhs.negativePrompt))));
    }

}
