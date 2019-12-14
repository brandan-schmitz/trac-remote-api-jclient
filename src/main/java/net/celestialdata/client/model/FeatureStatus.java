/*
 * TRAC Controller API
 * This is a simple API for the connecting to the Two Rivers Activity Centers waterpark control system. It should only be accessable from within the internal network.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandan.schmitz@uj.edu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.celestialdata.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Returns if the requested feature is running or not.
 */
@Schema(description = "Returns if the requested feature is running or not.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-11-24T00:10:40.781Z[GMT]")
public class FeatureStatus {
  @SerializedName("name")
  private String name = null;

  @SerializedName("running")
  private Boolean running = null;

  public FeatureStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Lazy River", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeatureStatus running(Boolean running) {
    this.running = running;
    return this;
  }

   /**
   * Get running
   * @return running
  **/
  @Schema(example = "true", description = "")
  public Boolean isRunning() {
    return running;
  }

  public void setRunning(Boolean running) {
    this.running = running;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureStatus featureStatus = (FeatureStatus) o;
    return Objects.equals(this.name, featureStatus.name) &&
        Objects.equals(this.running, featureStatus.running);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, running);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureStatus {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
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
