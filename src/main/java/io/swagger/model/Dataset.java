package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dataset
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-28T18:00:10.004Z[GMT]")


public class Dataset   {
  @JsonProperty("lastUpdated")
  private Object lastUpdated = null;

  @JsonProperty("name")
  private Object name = null;

  @JsonProperty("recordCount")
  private Object recordCount = null;

  @JsonProperty("description")
  private Object description = null;

  @JsonProperty("indexableField")
  private Object indexableField = null;

  public Dataset lastUpdated(Object lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
   **/
  @Schema(example = "1672249350", description = "")
  
    public Object getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Object lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Dataset name(Object name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Example Dataset Name", description = "")
  
    public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public Dataset recordCount(Object recordCount) {
    this.recordCount = recordCount;
    return this;
  }

  /**
   * Get recordCount
   * @return recordCount
   **/
  @Schema(example = "24586", description = "")
  
    public Object getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Object recordCount) {
    this.recordCount = recordCount;
  }

  public Dataset description(Object description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(example = "This is some example text for a description of a dataset", description = "")
  
    public Object getDescription() {
    return description;
  }

  public void setDescription(Object description) {
    this.description = description;
  }

  public Dataset indexableField(Object indexableField) {
    this.indexableField = indexableField;
    return this;
  }

  /**
   * Get indexableField
   * @return indexableField
   **/
  @Schema(description = "")
  
    public Object getIndexableField() {
    return indexableField;
  }

  public void setIndexableField(Object indexableField) {
    this.indexableField = indexableField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dataset dataset = (Dataset) o;
    return Objects.equals(this.lastUpdated, dataset.lastUpdated) &&
        Objects.equals(this.name, dataset.name) &&
        Objects.equals(this.recordCount, dataset.recordCount) &&
        Objects.equals(this.description, dataset.description) &&
        Objects.equals(this.indexableField, dataset.indexableField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, name, recordCount, description, indexableField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dataset {\n");
    
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    indexableField: ").append(toIndentedString(indexableField)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
