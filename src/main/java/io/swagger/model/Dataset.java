package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Dataset
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-29T00:56:50.235Z[GMT]")


public class Dataset   {
  @JsonProperty("lastUpdated")
  private Long lastUpdated = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recordCount")
  private Long recordCount = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("indexableField")
  @Valid
  private List<DatasetFieldDefinition> indexableField = null;

  public Dataset lastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
   **/
  @Schema(example = "1672249350", description = "")
  
    public Long getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Dataset name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Example Dataset Name", description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Dataset recordCount(Long recordCount) {
    this.recordCount = recordCount;
    return this;
  }

  /**
   * Get recordCount
   * @return recordCount
   **/
  @Schema(example = "24586", description = "")
  
    public Long getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Long recordCount) {
    this.recordCount = recordCount;
  }

  public Dataset description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(example = "This is some example text for a description of a dataset", description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Dataset indexableField(List<DatasetFieldDefinition> indexableField) {
    this.indexableField = indexableField;
    return this;
  }

  public Dataset addIndexableFieldItem(DatasetFieldDefinition indexableFieldItem) {
    if (this.indexableField == null) {
      this.indexableField = new ArrayList<DatasetFieldDefinition>();
    }
    this.indexableField.add(indexableFieldItem);
    return this;
  }

  /**
   * Get indexableField
   * @return indexableField
   **/
  @Schema(description = "")
      @Valid
    public List<DatasetFieldDefinition> getIndexableField() {
    return indexableField;
  }

  public void setIndexableField(List<DatasetFieldDefinition> indexableField) {
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
