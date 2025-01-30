package com.MovieTicketBooking.MovieTicketBooking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long theaterId;
    private String name;
    private String location;
	public Long getTheaterId() {
		return theaterId;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public void setTheaterId(Long theaterId) {
		this.theaterId = theaterId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}

    // Getters and setters
}

//	theater_id (Primary Key)
//	name
//	location (address or city)
//	total_seats (number of available seats in the theater)
//	contact_number
//	theater_type (IMAX, regular, 3D, etc.)
//	amenities (e.g., parking, food, restrooms)
//	screen_count (number of screens within the theater)
//
//}
