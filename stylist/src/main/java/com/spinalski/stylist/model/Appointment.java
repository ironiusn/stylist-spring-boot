package com.spinalski.stylist.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Appointment
 */
@Validated

public class Appointment   {
  @JsonProperty("stylistId")
  private Long stylistId = null;

  @JsonProperty("customerId")
  private Long customerId = null;

  @JsonProperty("timeSlotId")
  private Long timeSlotId = null;

  public Appointment stylistId(Long stylistId) {
    this.stylistId = stylistId;
    return this;
  }

  /**
   * Get stylistId
   * @return stylistId
  **/
  @ApiModelProperty(value = "")


  public Long getStylistId() {
    return stylistId;
  }

  public void setStylistId(Long stylistId) {
    this.stylistId = stylistId;
  }

  public Appointment customerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public Appointment timeSlotId(Long timeSlotId) {
    this.timeSlotId = timeSlotId;
    return this;
  }

  /**
   * Get timeSlotId
   * @return timeSlotId
  **/
  @ApiModelProperty(value = "")


  public Long getTimeSlotId() {
    return timeSlotId;
  }

  public void setTimeSlotId(Long timeSlotId) {
    this.timeSlotId = timeSlotId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Appointment appointment = (Appointment) o;
    return Objects.equals(this.stylistId, appointment.stylistId) &&
        Objects.equals(this.customerId, appointment.customerId) &&
        Objects.equals(this.timeSlotId, appointment.timeSlotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stylistId, customerId, timeSlotId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Appointment {\n");
    
    sb.append("    stylistId: ").append(toIndentedString(stylistId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    timeSlotId: ").append(toIndentedString(timeSlotId)).append("\n");
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

