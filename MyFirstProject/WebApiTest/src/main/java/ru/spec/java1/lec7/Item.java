
package ru.spec.java1.lec7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "salary",
    "snippet",
    "archived",
    "premium",
    "name",
    "area",
    "url",
    "created_at",
    "alternate_url",
    "apply_alternate_url",
    "relations",
    "employer",
    "response_letter_required",
    "published_at",
    "address",
    "department",
    "sort_point_distance",
    "type",
    "id"
})
public class Item {

    @JsonProperty("salary")
    private Object salary;
    @JsonProperty("snippet")
    private Snippet snippet;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("premium")
    private Boolean premium;
    @JsonProperty("name")
    private String name;
    @JsonProperty("area")
    private Area area;
    @JsonProperty("url")
    private String url;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("alternate_url")
    private String alternateUrl;
    @JsonProperty("apply_alternate_url")
    private String applyAlternateUrl;
    @JsonProperty("relations")
    private List<Object> relations = null;
    @JsonProperty("employer")
    private Employer employer;
    @JsonProperty("response_letter_required")
    private Boolean responseLetterRequired;
    @JsonProperty("published_at")
    private String publishedAt;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("department")
    private Object department;
    @JsonProperty("sort_point_distance")
    private Object sortPointDistance;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("salary")
    public Object getSalary() {
        return salary;
    }

    @JsonProperty("salary")
    public void setSalary(Object salary) {
        this.salary = salary;
    }

    @JsonProperty("snippet")
    public Snippet getSnippet() {
        return snippet;
    }

    @JsonProperty("snippet")
    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonProperty("premium")
    public Boolean getPremium() {
        return premium;
    }

    @JsonProperty("premium")
    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("area")
    public Area getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Area area) {
        this.area = area;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("alternate_url")
    public String getAlternateUrl() {
        return alternateUrl;
    }

    @JsonProperty("alternate_url")
    public void setAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
    }

    @JsonProperty("apply_alternate_url")
    public String getApplyAlternateUrl() {
        return applyAlternateUrl;
    }

    @JsonProperty("apply_alternate_url")
    public void setApplyAlternateUrl(String applyAlternateUrl) {
        this.applyAlternateUrl = applyAlternateUrl;
    }

    @JsonProperty("relations")
    public List<Object> getRelations() {
        return relations;
    }

    @JsonProperty("relations")
    public void setRelations(List<Object> relations) {
        this.relations = relations;
    }

    @JsonProperty("employer")
    public Employer getEmployer() {
        return employer;
    }

    @JsonProperty("employer")
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    @JsonProperty("response_letter_required")
    public Boolean getResponseLetterRequired() {
        return responseLetterRequired;
    }

    @JsonProperty("response_letter_required")
    public void setResponseLetterRequired(Boolean responseLetterRequired) {
        this.responseLetterRequired = responseLetterRequired;
    }

    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("published_at")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("department")
    public Object getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(Object department) {
        this.department = department;
    }

    @JsonProperty("sort_point_distance")
    public Object getSortPointDistance() {
        return sortPointDistance;
    }

    @JsonProperty("sort_point_distance")
    public void setSortPointDistance(Object sortPointDistance) {
        this.sortPointDistance = sortPointDistance;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
