
package com.volcengine.model.maas.api.v2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MaasChatChoice
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "index",
    "message",
    "finish_reason",
    "logprobs",
    "action",
    "observation",
    "thought"
})
@Generated("jsonschema2pojo")
public class Choice {

    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("index")
    private Integer index;
    /**
     * MaasChatMessage
     * <p>
     * 
     * 
     */
    @JsonProperty("message")
    private Message message;
    /**
     * Finish Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("finish_reason")
    private String finishReason;
    /**
     * Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("logprobs")
    private Logprobs logprobs;
    /**
     * MaasChatChoiceLog
     * <p>
     * 
     * 
     */
    @JsonProperty("action")
    private ChoiceLog action;
    /**
     * MaasChatChoiceLog
     * <p>
     * 
     * 
     */
    @JsonProperty("observation")
    private ChoiceLog observation;
    /**
     * MaasChatChoiceLog
     * <p>
     * 
     * 
     */
    @JsonProperty("thought")
    private ChoiceLog thought;

    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Choice withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * MaasChatMessage
     * <p>
     * 
     * 
     */
    @JsonProperty("message")
    public Message getMessage() {
        return message;
    }

    /**
     * MaasChatMessage
     * <p>
     * 
     * 
     */
    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    public Choice withMessage(Message message) {
        this.message = message;
        return this;
    }

    /**
     * Finish Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("finish_reason")
    public String getFinishReason() {
        return finishReason;
    }

    /**
     * Finish Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("finish_reason")
    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

    public Choice withFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }

    /**
     * Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("logprobs")
    public Logprobs getLogprobs() {
        return logprobs;
    }

    /**
     * Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("logprobs")
    public void setLogprobs(Logprobs logprobs) {
        this.logprobs = logprobs;
    }

    public Choice withLogprobs(Logprobs logprobs) {
        this.logprobs = logprobs;
        return this;
    }

    /**
     * MaasChatChoiceLog
     * <p>
     * 
     * 
     */
    @JsonProperty("action")
    public ChoiceLog getAction() {
        return action;
    }

    /**
     * MaasChatChoiceLog
     * <p>
     * 
     * 
     */
    @JsonProperty("action")
    public void setAction(ChoiceLog action) {
        this.action = action;
    }

    public Choice withAction(ChoiceLog action) {
        this.action = action;
        return this;
    }

    /**
     * MaasChatChoiceLog
     * <p>
     * 
     * 
     */
    @JsonProperty("observation")
    public ChoiceLog getObservation() {
        return observation;
    }

    /**
     * MaasChatChoiceLog
     * <p>
     * 
     * 
     */
    @JsonProperty("observation")
    public void setObservation(ChoiceLog observation) {
        this.observation = observation;
    }

    public Choice withObservation(ChoiceLog observation) {
        this.observation = observation;
        return this;
    }

    /**
     * MaasChatChoiceLog
     * <p>
     * 
     * 
     */
    @JsonProperty("thought")
    public ChoiceLog getThought() {
        return thought;
    }

    /**
     * MaasChatChoiceLog
     * <p>
     * 
     * 
     */
    @JsonProperty("thought")
    public void setThought(ChoiceLog thought) {
        this.thought = thought;
    }

    public Choice withThought(ChoiceLog thought) {
        this.thought = thought;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Choice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("finishReason");
        sb.append('=');
        sb.append(((this.finishReason == null)?"<null>":this.finishReason));
        sb.append(',');
        sb.append("logprobs");
        sb.append('=');
        sb.append(((this.logprobs == null)?"<null>":this.logprobs));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("observation");
        sb.append('=');
        sb.append(((this.observation == null)?"<null>":this.observation));
        sb.append(',');
        sb.append("thought");
        sb.append('=');
        sb.append(((this.thought == null)?"<null>":this.thought));
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
        result = ((result* 31)+((this.thought == null)? 0 :this.thought.hashCode()));
        result = ((result* 31)+((this.observation == null)? 0 :this.observation.hashCode()));
        result = ((result* 31)+((this.finishReason == null)? 0 :this.finishReason.hashCode()));
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.logprobs == null)? 0 :this.logprobs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Choice) == false) {
            return false;
        }
        Choice rhs = ((Choice) other);
        return ((((((((this.thought == rhs.thought)||((this.thought!= null)&&this.thought.equals(rhs.thought)))&&((this.observation == rhs.observation)||((this.observation!= null)&&this.observation.equals(rhs.observation))))&&((this.finishReason == rhs.finishReason)||((this.finishReason!= null)&&this.finishReason.equals(rhs.finishReason))))&&((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index))))&&((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.logprobs == rhs.logprobs)||((this.logprobs!= null)&&this.logprobs.equals(rhs.logprobs))));
    }

}
