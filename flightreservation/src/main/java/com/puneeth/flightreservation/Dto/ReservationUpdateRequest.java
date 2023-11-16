package com.puneeth.flightreservation.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationUpdateRequest {

    private long id;
	private Boolean checkedIn;
	private int numberOfBags;
	

}
