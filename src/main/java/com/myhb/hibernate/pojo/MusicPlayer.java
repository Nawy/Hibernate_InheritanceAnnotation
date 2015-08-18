package com.myhb.hibernate.pojo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_MUSICPLAYERS")
@AttributeOverrides({
	@AttributeOverride(name="f_id", column=@Column(name="f_id")),
	@AttributeOverride(name="f_name", column=@Column(name="f_name"))
})
public class MusicPlayer extends Device {
	
	@Column(name="f_volume")
	private Float volume;

	public MusicPlayer() {}
	
	public Float getVolume() {
		return volume;
	}

	public void setVolume(Float volume) {
		this.volume = volume;
	}
}
