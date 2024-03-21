
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
    "num_inference_steps"
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
    private Double strength;
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
    public Double getStrength() {
        return strength;
    }

    /**
     * Strength
     * <p>
     * 
     * 
     */
    @JsonProperty("strength")
    public void setStrength(Double strength) {
        this.strength = strength;
    }

    public ImagesParameters withStrength(Double strength) {
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
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.seed == null)? 0 :this.seed.hashCode()));
        result = ((result* 31)+((this.strength == null)? 0 :this.strength.hashCode()));
        result = ((result* 31)+((this.numInferenceSteps == null)? 0 :this.numInferenceSteps.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
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
        return ((((((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width)))&&((this.seed == rhs.seed)||((this.seed!= null)&&this.seed.equals(rhs.seed))))&&((this.strength == rhs.strength)||((this.strength!= null)&&this.strength.equals(rhs.strength))))&&((this.numInferenceSteps == rhs.numInferenceSteps)||((this.numInferenceSteps!= null)&&this.numInferenceSteps.equals(rhs.numInferenceSteps))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

}
