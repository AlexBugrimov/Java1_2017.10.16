
package ru.spec.java1.lec7;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requirement",
    "responsibility"
})
public class Snippet {

    @JsonProperty("requirement")
    private String requirement;
    @JsonProperty("responsibility")
    private String responsibility;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("requirement")
    public String getRequirement() {
        return requirement;
    }

    @JsonProperty("requirement")
    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    @JsonProperty("responsibility")
    public String getResponsibility() {
        return responsibility;
    }

    @JsonProperty("responsibility")
    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
