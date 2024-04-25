
package com.volcengine.model.maas.api.v2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ImagesParameters
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "seed",
    "strength",
    "height",
    "width",
    "num_inference_steps",
    "sampler_name",
    "scheduler",
    "cfg_scale"
})
@Generated("jsonschema2pojo")
public class ImagesParameters {

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

    public ImagesParameters withSeed(Integer seed) {
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

    public ImagesParameters withStrength(Float strength) {
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

    public ImagesParameters withHeight(Integer height) {
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

    public ImagesParameters withWidth(Integer width) {
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

    public ImagesParameters withNumInferenceSteps(Integer numInferenceSteps) {
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

    public ImagesParameters withSamplerName(String samplerName) {
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

    public ImagesParameters withScheduler(String scheduler) {
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

    public ImagesParameters withCfgScale(Float cfgScale) {
        this.cfgScale = cfgScale;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImagesParameters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.scheduler == null)? 0 :this.scheduler.hashCode()));
        result = ((result* 31)+((this.seed == null)? 0 :this.seed.hashCode()));
        result = ((result* 31)+((this.strength == null)? 0 :this.strength.hashCode()));
        result = ((result* 31)+((this.numInferenceSteps == null)? 0 :this.numInferenceSteps.hashCode()));
        result = ((result* 31)+((this.cfgScale == null)? 0 :this.cfgScale.hashCode()));
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        result = ((result* 31)+((this.samplerName == null)? 0 :this.samplerName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImagesParameters) == false) {
            return false;
        }
        ImagesParameters rhs = ((ImagesParameters) other);
        return (((((((((this.scheduler == rhs.scheduler)||((this.scheduler!= null)&&this.scheduler.equals(rhs.scheduler)))&&((this.seed == rhs.seed)||((this.seed!= null)&&this.seed.equals(rhs.seed))))&&((this.strength == rhs.strength)||((this.strength!= null)&&this.strength.equals(rhs.strength))))&&((this.numInferenceSteps == rhs.numInferenceSteps)||((this.numInferenceSteps!= null)&&this.numInferenceSteps.equals(rhs.numInferenceSteps))))&&((this.cfgScale == rhs.cfgScale)||((this.cfgScale!= null)&&this.cfgScale.equals(rhs.cfgScale))))&&((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))))&&((this.samplerName == rhs.samplerName)||((this.samplerName!= null)&&this.samplerName.equals(rhs.samplerName))));
    }

}
