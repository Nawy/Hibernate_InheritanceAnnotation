package com.myhb.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="T_GEARS")
@Inheritance(strategy=InheritanceType.JOINED)
public class Gear {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="f_id")
	private Long id;
	
	@Column(name="f_name")
	private String name;
	
	public Gear() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
