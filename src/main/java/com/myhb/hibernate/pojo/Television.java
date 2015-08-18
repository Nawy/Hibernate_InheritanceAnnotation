package com.myhb.hibernate.pojo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_TELEVISION")
@AttributeOverrides({
	@AttributeOverride(name="f_id", column=@Column(name="f_id")),
	@AttributeOverride(name="f_name", column=@Column(name="f_name"))
})
public class Television extends Device {

	@Column(name="f_screenResolution")
	private Float screenResolution;

	public Television() {}
	
	public Float getScreenResolution() {
		return screenResolution;
	}

	public void setScreenResolution(Float screenResolution) {
		this.screenResolution = screenResolution;
	}
}
