package com.myhb.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("wolf")
public class Wolf extends Animal {

	@Column(name="f_speedRun")
	private Float speedRun;

	public Wolf() {}
	
	public Float getSpeedRun() {
		return speedRun;
	}

	public void setSpeedRun(Float speedRun) {
		this.speedRun = speedRun;
	}
}
