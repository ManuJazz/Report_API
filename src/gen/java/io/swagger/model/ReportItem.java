/*
 * Service_03_Report_API
 * Remembranza Project is a response to the need of dealing with mental diseases in advanced ages
 *
 * OpenAPI spec version: 1.0.0
 * Contact: mjesusaz@alumnos.unex.es
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;


import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.UUID;



import javax.validation.constraints.*;




/**
 * ReportItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-21T18:46:33.206Z[GMT]")
public class ReportItem   {
  
    
      
  
  @JsonProperty("id_report")
  
  
  
  
  private Long idReport = null;
  

  
    
      
  
  @JsonProperty("date")
  
  
  
  
  private Date date = null;
  

  
    
      
  
  @JsonProperty("description")
  
  
  
  
  private String description = null;
  

  
  
  
  public ReportItem idReport(Long idReport) {
    this.idReport = idReport;
    return this;
  }
  
  

  
  /**
  
  
   * Get idReport
  
  
  
   * @return idReport
   **/
 
  
  @JsonProperty("id_report")
  
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")

  @NotNull

  public Long getIdReport() {
    return idReport;
  }
  

  public void setIdReport(Long idReport) {
    this.idReport = idReport;
  }
  

  
  
  public ReportItem date(Date date) {
    this.date = date;
    return this;
  }
  
  

  
  /**
  
  
   * Get date
  
  
  
   * @return date
   **/
 
  
  @JsonProperty("date")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public Date getDate() {
    return date;
  }
  

  public void setDate(Date date) {
    this.date = date;
  }
  

  
  
  public ReportItem description(String description) {
    this.description = description;
    return this;
  }
  
  

  
  /**
  
  
   * Get description
  
  
  
   * @return description
   **/
 
  
  @JsonProperty("description")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public String getDescription() {
    return description;
  }
  

  public void setDescription(String description) {
    this.description = description;
  }
  

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportItem reportItem = (ReportItem) o;
    return Objects.equals(this.idReport, reportItem.idReport) &&
        Objects.equals(this.date, reportItem.date) &&
        Objects.equals(this.description, reportItem.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idReport, date, description);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportItem {\n");
    
    sb.append("    idReport: ").append(toIndentedString(idReport)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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



