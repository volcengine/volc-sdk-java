
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ImagesRequest
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
        "control_image_list",
        "seed",
        "strength",
        "height",
        "width",
        "num_inference_steps",
        "sampler_name",
        "scheduler",
        "cfg_scale",
        "plugin"
})
@Generated("jsonschema2pojo")
public class ImagesRequest {

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
    private String initImage;
    /**
     * Control Image List
     * <p>
     *
     *
     */
    @JsonProperty("control_image_list")
    private List<byte[]> controlImageList = new ArrayList<byte[]>();
    /**
     * Seed
     * <p>
     *
     *
     */
    @JsonProperty("seed")
    private Integer seed;
    /**
     * Strength
     * <p>
     *
     *
     */
    @JsonProperty("strength")
    private Float strength;
    /**
     * Height
     * <p>
     *
     *
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * Width
     * <p>
     *
     *
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * Num Inference Steps
     * <p>
     *
     *
     */
    @JsonProperty("num_inference_steps")
    private Integer numInferenceSteps;
    /**
     * Sampler Name
     * <p>
     *
     *
     */
    @JsonProperty("sampler_name")
    private String samplerName;
    /**
     * Scheduler
     * <p>
     *
     *
     */
    @JsonProperty("scheduler")
    private String scheduler;
    /**
     * Cfg Scale
     * <p>
     *
     *
     */
    @JsonProperty("cfg_scale")
    private Float cfgScale;
    /**
     * Plugin
     * <p>
     *
     *
     */
    @JsonProperty("plugin")
    private Map<String, Object> plugin;

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

    public ImagesRequest withReqId(String reqId) {
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

    public ImagesRequest withPrompt(String prompt) {
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

    public ImagesRequest withNegativePrompt(String negativePrompt) {
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
    public String getInitImage() {
        return initImage;
    }

    /**
     * Init Image
     * <p>
     *
     *
     */
    @JsonProperty("init_image")
    public void setInitImage(String initImage) {
        this.initImage = initImage;
    }

    public ImagesRequest withInitImage(String initImage) {
        this.initImage = initImage;
        return this;
    }

    /**
     * Control Image List
     * <p>
     *
     *
     */
    @JsonProperty("control_image_list")
    public List<byte[]> getControlImageList() {
        return controlImageList;
    }

    /**
     * Control Image List
     * <p>
     *
     *
     */
    @JsonProperty("control_image_list")
    public void setControlImageList(List<byte[]> controlImageList) {
        this.controlImageList = controlImageList;
    }

    public ImagesRequest withControlImageList(List<byte[]> controlImageList) {
        this.controlImageList = controlImageList;
        return this;
    }

    /**
     * Seed
     * <p>
     *
     *
     */
    @JsonProperty("seed")
    public Integer getSeed() {
        return seed;
    }

    /**
     * Seed
     * <p>
     *
     *
     */
    @JsonProperty("seed")
    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public ImagesRequest withSeed(Integer seed) {
        this.seed = seed;
        return this;
    }

    /**
     * Strength
     * <p>
     *
     *
     */
    @JsonProperty("strength")
    public Float getStrength() {
        return strength;
    }

    /**
     * Strength
     * <p>
     *
     *
     */
    @JsonProperty("strength")
    public void setStrength(Float strength) {
        this.strength = strength;
    }

    public ImagesRequest withStrength(Float strength) {
        this.strength = strength;
        return this;
    }

    /**
     * Height
     * <p>
     *
     *
     */
    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    /**
     * Height
     * <p>
     *
     *
     */
    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    public ImagesRequest withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Width
     * <p>
     *
     *
     */
    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    /**
     * Width
     * <p>
     *
     *
     */
    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    public ImagesRequest withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * Num Inference Steps
     * <p>
     *
     *
     */
    @JsonProperty("num_inference_steps")
    public Integer getNumInferenceSteps() {
        return numInferenceSteps;
    }

    /**
     * Num Inference Steps
     * <p>
     *
     *
     */
    @JsonProperty("num_inference_steps")
    public void setNumInferenceSteps(Integer numInferenceSteps) {
        this.numInferenceSteps = numInferenceSteps;
    }

    public ImagesRequest withNumInferenceSteps(Integer numInferenceSteps) {
        this.numInferenceSteps = numInferenceSteps;
        return this;
    }

    /**
     * Sampler Name
     * <p>
     *
     *
     */
    @JsonProperty("sampler_name")
    public String getSamplerName() {
        return samplerName;
    }

    /**
     * Sampler Name
     * <p>
     *
     *
     */
    @JsonProperty("sampler_name")
    public void setSamplerName(String samplerName) {
        this.samplerName = samplerName;
    }

    public ImagesRequest withSamplerName(String samplerName) {
        this.samplerName = samplerName;
        return this;
    }

    /**
     * Scheduler
     * <p>
     *
     *
     */
    @JsonProperty("scheduler")
    public String getScheduler() {
        return scheduler;
    }

    /**
     * Scheduler
     * <p>
     *
     *
     */
    @JsonProperty("scheduler")
    public void setScheduler(String scheduler) {
        this.scheduler = scheduler;
    }

    public ImagesRequest withScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    /**
     * Cfg Scale
     * <p>
     *
     *
     */
    @JsonProperty("cfg_scale")
    public Float getCfgScale() {
        return cfgScale;
    }

    /**
     * Cfg Scale
     * <p>
     *
     *
     */
    @JsonProperty("cfg_scale")
    public void setCfgScale(Float cfgScale) {
        this.cfgScale = cfgScale;
    }

    public ImagesRequest withCfgScale(Float cfgScale) {
        this.cfgScale = cfgScale;
        return this;
    }

    /**
     * Plugin
     * <p>
     *
     *
     */
    @JsonProperty("plugin")
    public Map<String, Object> getPlugin() {
        return plugin;
    }

    /**
     * Plugin
     * <p>
     *
     *
     */
    @JsonProperty("plugin")
    public void setPlugin(Map<String, Object> plugin) {
        this.plugin = plugin;
    }

    public ImagesRequest withPlugin(Map<String, Object> plugin) {
        this.plugin = plugin;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImagesRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("controlImageList");
        sb.append('=');
        sb.append(((this.controlImageList == null)?"<null>":this.controlImageList));
        sb.append(',');
        sb.append("seed");
        sb.append('=');
        sb.append(((this.seed == null)?"<null>":this.seed));
        sb.append(',');
        sb.append("strength");
        sb.append('=');
        sb.append(((this.strength == null)?"<null>":this.strength));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("numInferenceSteps");
        sb.append('=');
        sb.append(((this.numInferenceSteps == null)?"<null>":this.numInferenceSteps));
        sb.append(',');
        sb.append("samplerName");
        sb.append('=');
        sb.append(((this.samplerName == null)?"<null>":this.samplerName));
        sb.append(',');
        sb.append("scheduler");
        sb.append('=');
        sb.append(((this.scheduler == null)?"<null>":this.scheduler));
        sb.append(',');
        sb.append("cfgScale");
        sb.append('=');
        sb.append(((this.cfgScale == null)?"<null>":this.cfgScale));
        sb.append(',');
        sb.append("plugin");
        sb.append('=');
        sb.append(((this.plugin == null)?"<null>":this.plugin));
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
        result = ((result* 31)+((this.seed == null)? 0 :this.seed.hashCode()));
        result = ((result* 31)+((this.strength == null)? 0 :this.strength.hashCode()));
        result = ((result* 31)+((this.reqId == null)? 0 :this.reqId.hashCode()));
        result = ((result* 31)+((this.negativePrompt == null)? 0 :this.negativePrompt.hashCode()));
        result = ((result* 31)+((this.samplerName == null)? 0 :this.samplerName.hashCode()));
        result = ((result* 31)+((this.scheduler == null)? 0 :this.scheduler.hashCode()));
        result = ((result* 31)+((this.controlImageList == null)? 0 :this.controlImageList.hashCode()));
        result = ((result* 31)+((this.plugin == null)? 0 :this.plugin.hashCode()));
        result = ((result* 31)+((this.numInferenceSteps == null)? 0 :this.numInferenceSteps.hashCode()));
        result = ((result* 31)+((this.cfgScale == null)? 0 :this.cfgScale.hashCode()));
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.prompt == null)? 0 :this.prompt.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImagesRequest) == false) {
            return false;
        }
        ImagesRequest rhs = ((ImagesRequest) other);
        return (((((((((((((((this.initImage == rhs.initImage)||((this.initImage!= null)&&this.initImage.equals(rhs.initImage)))&&((this.seed == rhs.seed)||((this.seed!= null)&&this.seed.equals(rhs.seed))))&&((this.strength == rhs.strength)||((this.strength!= null)&&this.strength.equals(rhs.strength))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))))&&((this.negativePrompt == rhs.negativePrompt)||((this.negativePrompt!= null)&&this.negativePrompt.equals(rhs.negativePrompt))))&&((this.samplerName == rhs.samplerName)||((this.samplerName!= null)&&this.samplerName.equals(rhs.samplerName))))&&((this.scheduler == rhs.scheduler)||((this.scheduler!= null)&&this.scheduler.equals(rhs.scheduler))))&&((this.controlImageList == rhs.controlImageList)||((this.controlImageList!= null)&&this.controlImageList.equals(rhs.controlImageList))))&&((this.plugin == rhs.plugin)||((this.plugin!= null)&&this.plugin.equals(rhs.plugin))))&&((this.numInferenceSteps == rhs.numInferenceSteps)||((this.numInferenceSteps!= null)&&this.numInferenceSteps.equals(rhs.numInferenceSteps))))&&((this.cfgScale == rhs.cfgScale)||((this.cfgScale!= null)&&this.cfgScale.equals(rhs.cfgScale))))&&((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width))))&&((this.prompt == rhs.prompt)||((this.prompt!= null)&&this.prompt.equals(rhs.prompt))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

}
