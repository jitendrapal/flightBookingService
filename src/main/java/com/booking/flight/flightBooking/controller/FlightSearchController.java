package com.booking.flight.flightBooking.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.booking.flight.flightBooking.dto.FlightDTO;

@RestController
@RequestMapping("/booking")
public class FlightSearchController {

	@RequestMapping(value = "/flights/{destId}/to/{orginId}", method = RequestMethod.GET)
	public FlightDTO getFlightDeatils(@PathVariable String destId, @PathVariable String orginId) {

		FlightDTO flightDTO=new FlightDTO();
		flightDTO.setArrivalAirport("Delhi");
		flightDTO.setDepartureAirport("Amsterdam");
		flightDTO.setArrivalDateTime(new Date());
		flightDTO.setDepartureDateTime(new Date());
		
		return flightDTO;
	}

}
