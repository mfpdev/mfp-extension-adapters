package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.EntityResponse;
import com.ibm.mfp.adapters.sample.model.ValueCollection;
import com.ibm.mfp.adapters.sample.model.ValueExportResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class EntityExportResponse   {
  
  private String entity = null;
  private String description = null;
  private String created = null;
  private String updated = null;
  private Object metadata = null;
  private List<ValueExportResponse> values = new ArrayList<ValueExportResponse>();

  /**
   * The name of the entity.
   **/
  public EntityExportResponse entity(String entity) {
    this.entity = entity;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the entity.")
  @JsonProperty("entity")
  public String getEntity() {
    return entity;
  }
  public void setEntity(String entity) {
    this.entity = entity;
  }

  /**
   * The description of the entity.
   **/
  public EntityExportResponse description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The description of the entity.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The timestamp for creation of the entity.
   **/
  public EntityExportResponse created(String created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for creation of the entity.")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp for the last update to the entity.
   **/
  public EntityExportResponse updated(String updated) {
    this.updated = updated;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for the last update to the entity.")
  @JsonProperty("updated")
  public String getUpdated() {
    return updated;
  }
  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * Any metadata related to the entity.
   **/
  public EntityExportResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Any metadata related to the entity.")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * An array of entity values.
   **/
  public EntityExportResponse values(List<ValueExportResponse> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(value = "An array of entity values.")
  @JsonProperty("values")
  public List<ValueExportResponse> getValues() {
    return values;
  }
  public void setValues(List<ValueExportResponse> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityExportResponse entityExportResponse = (EntityExportResponse) o;
    return Objects.equals(entity, entityExportResponse.entity) &&
        Objects.equals(description, entityExportResponse.description) &&
        Objects.equals(created, entityExportResponse.created) &&
        Objects.equals(updated, entityExportResponse.updated) &&
        Objects.equals(metadata, entityExportResponse.metadata) &&
        Objects.equals(values, entityExportResponse.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, description, created, updated, metadata, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityExportResponse {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
