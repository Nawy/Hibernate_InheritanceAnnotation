package com.myhb.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("eagle")
public class Eagle extends Animal {
	
	@Column(name="f_flightAlt")
	private Float flightAltitude;
	
	public Eagle() {}

	public Float getFlightAltitude() {
		return flightAltitude;
	}

	public void setFlightAltitude(Float flightAltitude) {
		this.flightAltitude = flightAltitude;
	}
}
