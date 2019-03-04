/**
 * 
 */
package com.booking.flight.flightBooking.dto;

import java.util.Date;

import lombok.Data;

/**
 * @author XYZ
 *
 */

@Data
public class FlightDTO {

	private String departureAirport;
	private String arrivalAirport;
	private Date departureDateTime;
	private Date arrivalDateTime;

}
