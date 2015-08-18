package com.myhb.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="T_ELECTRICALS")
@PrimaryKeyJoinColumn(name="f_fid")
public class Electrical extends Gear {
	
	@Column(name="f_energy")
	private Float energy;
	
	public Electrical() {}

	public Float getEnergy() {
		return energy;
	}

	public void setEnergy(Float energy) {
		this.energy = energy;
	}
}
