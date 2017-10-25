
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
    "building",
    "city",
    "description",
    "metro",
    "metro_stations",
    "raw",
    "street",
    "lat",
    "lng",
    "id"
})
public class Address {

    @JsonProperty("building")
    private String building;
    @JsonProperty("city")
    private String city;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("metro")
    private Object metro;
    @JsonProperty("metro_stations")
    private List<Object> metroStations = null;
    @JsonProperty("raw")
    private Object raw;
    @JsonProperty("street")
    private String street;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lng")
    private Double lng;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("metro")
    public Object getMetro() {
        return metro;
    }

    @JsonProperty("metro")
    public void setMetro(Object metro) {
        this.metro = metro;
    }

    @JsonProperty("metro_stations")
    public List<Object> getMetroStations() {
        return metroStations;
    }

    @JsonProperty("metro_stations")
    public void setMetroStations(List<Object> metroStations) {
        this.metroStations = metroStations;
    }

    @JsonProperty("raw")
    public Object getRaw() {
        return raw;
    }

    @JsonProperty("raw")
    public void setRaw(Object raw) {
        this.raw = raw;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
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
