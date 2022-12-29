package io.swagger.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DatasetFieldDefinition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-29T00:56:50.235Z[GMT]")


public class DatasetFieldDefinition   {
  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("datatype")
  private String datatype = null;

  public DatasetFieldDefinition fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
   **/
  @Schema(example = "Example Field Name", description = "")
  
    public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public DatasetFieldDefinition datatype(String datatype) {
    this.datatype = datatype;
    return this;
  }

  /**
   * Get datatype
   * @return datatype
   **/
  @Schema(example = "String", description = "")
  
    public String getDatatype() {
    return datatype;
  }

  public void setDatatype(String datatype) {
    this.datatype = datatype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetFieldDefinition datasetFieldDefinition = (DatasetFieldDefinition) o;
    return Objects.equals(this.fieldName, datasetFieldDefinition.fieldName) &&
        Objects.equals(this.datatype, datasetFieldDefinition.datatype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, datatype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetFieldDefinition {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
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
