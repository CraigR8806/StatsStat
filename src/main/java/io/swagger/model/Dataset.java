package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dataset
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-23T15:24:59.862Z[GMT]")


public class Dataset   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recordCount")
  private Long recordCount = null;

  @JsonProperty("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  public Dataset name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
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
  @Schema(description = "")
  
    public Long getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Long recordCount) {
    this.recordCount = recordCount;
  }

  public Dataset lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
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
    return Objects.equals(this.name, dataset.name) &&
        Objects.equals(this.recordCount, dataset.recordCount) &&
        Objects.equals(this.lastUpdated, dataset.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, recordCount, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dataset {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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
