
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Parameters
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "max_prompt_tokens",
    "max_new_tokens",
    "min_new_tokens",
    "max_tokens",
    "temperature",
    "top_p",
    "top_k",
    "presence_penalty",
    "frequency_penalty",
    "repetition_penalty",
    "do_sample",
    "logprobs",
    "stop",
    "logit_bias",
    "guidance"
})
@Generated("jsonschema2pojo")
public class Parameters {

    /**
     * Max Prompt Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("max_prompt_tokens")
    private Integer maxPromptTokens;
    /**
     * Max New Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("max_new_tokens")
    private Integer maxNewTokens;
    /**
     * Min New Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("min_new_tokens")
    private Integer minNewTokens;
    /**
     * Max Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("max_tokens")
    private Integer maxTokens;
    /**
     * Temperature
     * <p>
     * 
     * 
     */
    @JsonProperty("temperature")
    private Float temperature;
    /**
     * Top P
     * <p>
     * 
     * 
     */
    @JsonProperty("top_p")
    private Float topP;
    /**
     * Top K
     * <p>
     * 
     * 
     */
    @JsonProperty("top_k")
    private Integer topK;
    /**
     * Presence Penalty
     * <p>
     * 
     * 
     */
    @JsonProperty("presence_penalty")
    private Float presencePenalty;
    /**
     * Frequency Penalty
     * <p>
     * 
     * 
     */
    @JsonProperty("frequency_penalty")
    private Float frequencyPenalty;
    /**
     * Repetition Penalty
     * <p>
     * 
     * 
     */
    @JsonProperty("repetition_penalty")
    private Float repetitionPenalty;
    /**
     * Do Sample
     * <p>
     * 
     * 
     */
    @JsonProperty("do_sample")
    private Boolean doSample;
    /**
     * Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("logprobs")
    private Integer logprobs;
    /**
     * Stop
     * <p>
     * 
     * 
     */
    @JsonProperty("stop")
    private List<String> stop = new ArrayList<String>();
    /**
     * Logit Bias
     * <p>
     * 
     * 
     */
    @JsonProperty("logit_bias")
    private Map<Integer, Float> logitBias;
    /**
     * Guidance
     * <p>
     * 
     * 
     */
    @JsonProperty("guidance")
    private Boolean guidance;

    /**
     * Max Prompt Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("max_prompt_tokens")
    public Integer getMaxPromptTokens() {
        return maxPromptTokens;
    }

    /**
     * Max Prompt Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("max_prompt_tokens")
    public void setMaxPromptTokens(Integer maxPromptTokens) {
        this.maxPromptTokens = maxPromptTokens;
    }

    public Parameters withMaxPromptTokens(Integer maxPromptTokens) {
        this.maxPromptTokens = maxPromptTokens;
        return this;
    }

    /**
     * Max New Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("max_new_tokens")
    public Integer getMaxNewTokens() {
        return maxNewTokens;
    }

    /**
     * Max New Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("max_new_tokens")
    public void setMaxNewTokens(Integer maxNewTokens) {
        this.maxNewTokens = maxNewTokens;
    }

    public Parameters withMaxNewTokens(Integer maxNewTokens) {
        this.maxNewTokens = maxNewTokens;
        return this;
    }

    /**
     * Min New Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("min_new_tokens")
    public Integer getMinNewTokens() {
        return minNewTokens;
    }

    /**
     * Min New Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("min_new_tokens")
    public void setMinNewTokens(Integer minNewTokens) {
        this.minNewTokens = minNewTokens;
    }

    public Parameters withMinNewTokens(Integer minNewTokens) {
        this.minNewTokens = minNewTokens;
        return this;
    }

    /**
     * Max Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("max_tokens")
    public Integer getMaxTokens() {
        return maxTokens;
    }

    /**
     * Max Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("max_tokens")
    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public Parameters withMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    /**
     * Temperature
     * <p>
     * 
     * 
     */
    @JsonProperty("temperature")
    public Float getTemperature() {
        return temperature;
    }

    /**
     * Temperature
     * <p>
     * 
     * 
     */
    @JsonProperty("temperature")
    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Parameters withTemperature(Float temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * Top P
     * <p>
     * 
     * 
     */
    @JsonProperty("top_p")
    public Float getTopP() {
        return topP;
    }

    /**
     * Top P
     * <p>
     * 
     * 
     */
    @JsonProperty("top_p")
    public void setTopP(Float topP) {
        this.topP = topP;
    }

    public Parameters withTopP(Float topP) {
        this.topP = topP;
        return this;
    }

    /**
     * Top K
     * <p>
     * 
     * 
     */
    @JsonProperty("top_k")
    public Integer getTopK() {
        return topK;
    }

    /**
     * Top K
     * <p>
     * 
     * 
     */
    @JsonProperty("top_k")
    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    public Parameters withTopK(Integer topK) {
        this.topK = topK;
        return this;
    }

    /**
     * Presence Penalty
     * <p>
     * 
     * 
     */
    @JsonProperty("presence_penalty")
    public Float getPresencePenalty() {
        return presencePenalty;
    }

    /**
     * Presence Penalty
     * <p>
     * 
     * 
     */
    @JsonProperty("presence_penalty")
    public void setPresencePenalty(Float presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    public Parameters withPresencePenalty(Float presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }

    /**
     * Frequency Penalty
     * <p>
     * 
     * 
     */
    @JsonProperty("frequency_penalty")
    public Float getFrequencyPenalty() {
        return frequencyPenalty;
    }

    /**
     * Frequency Penalty
     * <p>
     * 
     * 
     */
    @JsonProperty("frequency_penalty")
    public void setFrequencyPenalty(Float frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    public Parameters withFrequencyPenalty(Float frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }

    /**
     * Repetition Penalty
     * <p>
     * 
     * 
     */
    @JsonProperty("repetition_penalty")
    public Float getRepetitionPenalty() {
        return repetitionPenalty;
    }

    /**
     * Repetition Penalty
     * <p>
     * 
     * 
     */
    @JsonProperty("repetition_penalty")
    public void setRepetitionPenalty(Float repetitionPenalty) {
        this.repetitionPenalty = repetitionPenalty;
    }

    public Parameters withRepetitionPenalty(Float repetitionPenalty) {
        this.repetitionPenalty = repetitionPenalty;
        return this;
    }

    /**
     * Do Sample
     * <p>
     * 
     * 
     */
    @JsonProperty("do_sample")
    public Boolean getDoSample() {
        return doSample;
    }

    /**
     * Do Sample
     * <p>
     * 
     * 
     */
    @JsonProperty("do_sample")
    public void setDoSample(Boolean doSample) {
        this.doSample = doSample;
    }

    public Parameters withDoSample(Boolean doSample) {
        this.doSample = doSample;
        return this;
    }

    /**
     * Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("logprobs")
    public Integer getLogprobs() {
        return logprobs;
    }

    /**
     * Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("logprobs")
    public void setLogprobs(Integer logprobs) {
        this.logprobs = logprobs;
    }

    public Parameters withLogprobs(Integer logprobs) {
        this.logprobs = logprobs;
        return this;
    }

    /**
     * Stop
     * <p>
     * 
     * 
     */
    @JsonProperty("stop")
    public List<String> getStop() {
        return stop;
    }

    /**
     * Stop
     * <p>
     * 
     * 
     */
    @JsonProperty("stop")
    public void setStop(List<String> stop) {
        this.stop = stop;
    }

    public Parameters withStop(List<String> stop) {
        this.stop = stop;
        return this;
    }

    /**
     * Logit Bias
     * <p>
     * 
     * 
     */
    @JsonProperty("logit_bias")
    public Map<Integer, Float> getLogitBias() {
        return logitBias;
    }

    /**
     * Logit Bias
     * <p>
     * 
     * 
     */
    @JsonProperty("logit_bias")
    public void setLogitBias(Map<Integer, Float> logitBias) {
        this.logitBias = logitBias;
    }

    public Parameters withLogitBias(Map<Integer, Float> logitBias) {
        this.logitBias = logitBias;
        return this;
    }

    /**
     * Guidance
     * <p>
     * 
     * 
     */
    @JsonProperty("guidance")
    public Boolean getGuidance() {
        return guidance;
    }

    /**
     * Guidance
     * <p>
     * 
     * 
     */
    @JsonProperty("guidance")
    public void setGuidance(Boolean guidance) {
        this.guidance = guidance;
    }

    public Parameters withGuidance(Boolean guidance) {
        this.guidance = guidance;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Parameters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxPromptTokens");
        sb.append('=');
        sb.append(((this.maxPromptTokens == null)?"<null>":this.maxPromptTokens));
        sb.append(',');
        sb.append("maxNewTokens");
        sb.append('=');
        sb.append(((this.maxNewTokens == null)?"<null>":this.maxNewTokens));
        sb.append(',');
        sb.append("minNewTokens");
        sb.append('=');
        sb.append(((this.minNewTokens == null)?"<null>":this.minNewTokens));
        sb.append(',');
        sb.append("maxTokens");
        sb.append('=');
        sb.append(((this.maxTokens == null)?"<null>":this.maxTokens));
        sb.append(',');
        sb.append("temperature");
        sb.append('=');
        sb.append(((this.temperature == null)?"<null>":this.temperature));
        sb.append(',');
        sb.append("topP");
        sb.append('=');
        sb.append(((this.topP == null)?"<null>":this.topP));
        sb.append(',');
        sb.append("topK");
        sb.append('=');
        sb.append(((this.topK == null)?"<null>":this.topK));
        sb.append(',');
        sb.append("presencePenalty");
        sb.append('=');
        sb.append(((this.presencePenalty == null)?"<null>":this.presencePenalty));
        sb.append(',');
        sb.append("frequencyPenalty");
        sb.append('=');
        sb.append(((this.frequencyPenalty == null)?"<null>":this.frequencyPenalty));
        sb.append(',');
        sb.append("repetitionPenalty");
        sb.append('=');
        sb.append(((this.repetitionPenalty == null)?"<null>":this.repetitionPenalty));
        sb.append(',');
        sb.append("doSample");
        sb.append('=');
        sb.append(((this.doSample == null)?"<null>":this.doSample));
        sb.append(',');
        sb.append("logprobs");
        sb.append('=');
        sb.append(((this.logprobs == null)?"<null>":this.logprobs));
        sb.append(',');
        sb.append("stop");
        sb.append('=');
        sb.append(((this.stop == null)?"<null>":this.stop));
        sb.append(',');
        sb.append("logitBias");
        sb.append('=');
        sb.append(((this.logitBias == null)?"<null>":this.logitBias));
        sb.append(',');
        sb.append("guidance");
        sb.append('=');
        sb.append(((this.guidance == null)?"<null>":this.guidance));
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
        result = ((result* 31)+((this.topK == null)? 0 :this.topK.hashCode()));
        result = ((result* 31)+((this.doSample == null)? 0 :this.doSample.hashCode()));
        result = ((result* 31)+((this.maxNewTokens == null)? 0 :this.maxNewTokens.hashCode()));
        result = ((result* 31)+((this.topP == null)? 0 :this.topP.hashCode()));
        result = ((result* 31)+((this.logprobs == null)? 0 :this.logprobs.hashCode()));
        result = ((result* 31)+((this.maxPromptTokens == null)? 0 :this.maxPromptTokens.hashCode()));
        result = ((result* 31)+((this.presencePenalty == null)? 0 :this.presencePenalty.hashCode()));
        result = ((result* 31)+((this.minNewTokens == null)? 0 :this.minNewTokens.hashCode()));
        result = ((result* 31)+((this.stop == null)? 0 :this.stop.hashCode()));
        result = ((result* 31)+((this.guidance == null)? 0 :this.guidance.hashCode()));
        result = ((result* 31)+((this.maxTokens == null)? 0 :this.maxTokens.hashCode()));
        result = ((result* 31)+((this.temperature == null)? 0 :this.temperature.hashCode()));
        result = ((result* 31)+((this.repetitionPenalty == null)? 0 :this.repetitionPenalty.hashCode()));
        result = ((result* 31)+((this.logitBias == null)? 0 :this.logitBias.hashCode()));
        result = ((result* 31)+((this.frequencyPenalty == null)? 0 :this.frequencyPenalty.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parameters) == false) {
            return false;
        }
        Parameters rhs = ((Parameters) other);
        return ((((((((((((((((this.topK == rhs.topK)||((this.topK!= null)&&this.topK.equals(rhs.topK)))&&((this.doSample == rhs.doSample)||((this.doSample!= null)&&this.doSample.equals(rhs.doSample))))&&((this.maxNewTokens == rhs.maxNewTokens)||((this.maxNewTokens!= null)&&this.maxNewTokens.equals(rhs.maxNewTokens))))&&((this.topP == rhs.topP)||((this.topP!= null)&&this.topP.equals(rhs.topP))))&&((this.logprobs == rhs.logprobs)||((this.logprobs!= null)&&this.logprobs.equals(rhs.logprobs))))&&((this.maxPromptTokens == rhs.maxPromptTokens)||((this.maxPromptTokens!= null)&&this.maxPromptTokens.equals(rhs.maxPromptTokens))))&&((this.presencePenalty == rhs.presencePenalty)||((this.presencePenalty!= null)&&this.presencePenalty.equals(rhs.presencePenalty))))&&((this.minNewTokens == rhs.minNewTokens)||((this.minNewTokens!= null)&&this.minNewTokens.equals(rhs.minNewTokens))))&&((this.stop == rhs.stop)||((this.stop!= null)&&this.stop.equals(rhs.stop))))&&((this.guidance == rhs.guidance)||((this.guidance!= null)&&this.guidance.equals(rhs.guidance))))&&((this.maxTokens == rhs.maxTokens)||((this.maxTokens!= null)&&this.maxTokens.equals(rhs.maxTokens))))&&((this.temperature == rhs.temperature)||((this.temperature!= null)&&this.temperature.equals(rhs.temperature))))&&((this.repetitionPenalty == rhs.repetitionPenalty)||((this.repetitionPenalty!= null)&&this.repetitionPenalty.equals(rhs.repetitionPenalty))))&&((this.logitBias == rhs.logitBias)||((this.logitBias!= null)&&this.logitBias.equals(rhs.logitBias))))&&((this.frequencyPenalty == rhs.frequencyPenalty)||((this.frequencyPenalty!= null)&&this.frequencyPenalty.equals(rhs.frequencyPenalty))));
    }

}
