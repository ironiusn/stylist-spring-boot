/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.spinalski.stylist.api;

import com.spinalski.stylist.model.Appointment;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Api(value = "appointments", description = "the appointments API")
public interface AppointmentsApi {

    Logger log = LoggerFactory.getLogger(AppointmentsApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "get all appointments", nickname = "getAppointments", notes = "", response = Appointment.class, responseContainer = "List", tags={ "calendar", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "all appointments", response = Appointment.class, responseContainer = "List") })
    @RequestMapping(value = "/appointments/{startDate}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Appointment>> getAppointments(@ApiParam(value = "search for appointments starts since that timestamp",required=true) @PathVariable("startDate") OffsetDateTime startDate) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"stylistId\" : 0,  \"timeSlotId\" : 1,  \"customerId\" : 6}, {  \"stylistId\" : 0,  \"timeSlotId\" : 1,  \"customerId\" : 6} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AppointmentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}