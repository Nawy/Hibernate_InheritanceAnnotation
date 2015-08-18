package com.myhb.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="T_ENGINES")
@PrimaryKeyJoinColumn(name="f_fid")
public class Engine extends Gear {

	@Column(name="f_fuel")
	private Float fuel;

	public Engine() {}
	
	public Float getFuel() {
		return fuel;
	}

	public void setFuel(Float fuel) {
		this.fuel = fuel;
	}
}
