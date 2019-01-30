package com.spinalski.stylist.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TimeSlot
 */
@Validated

public class TimeSlot   {
  @JsonProperty("timeSlotId")
  private Long timeSlotId = null;

  @JsonProperty("stylistId")
  private Long stylistId = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  public TimeSlot timeSlotId(Long timeSlotId) {
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

  public TimeSlot stylistId(Long stylistId) {
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

  public TimeSlot startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public TimeSlot endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlot timeSlot = (TimeSlot) o;
    return Objects.equals(this.timeSlotId, timeSlot.timeSlotId) &&
        Objects.equals(this.stylistId, timeSlot.stylistId) &&
        Objects.equals(this.startTime, timeSlot.startTime) &&
        Objects.equals(this.endTime, timeSlot.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSlotId, stylistId, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlot {\n");
    
    sb.append("    timeSlotId: ").append(toIndentedString(timeSlotId)).append("\n");
    sb.append("    stylistId: ").append(toIndentedString(stylistId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

