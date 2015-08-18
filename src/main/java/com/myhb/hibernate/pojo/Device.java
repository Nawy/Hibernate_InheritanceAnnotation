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
@Table(name="T_DEVICES")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Device {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="f_id")
	private Long id;
	
	@Column(name="f_vendor")
	private String vendor;

///////////////////////////////////////////////////////////////////////////
	//	GETTER & SETTERS
///////////////////////////////////////////////////////////////////////////
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
}
