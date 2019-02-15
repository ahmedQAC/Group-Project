package com.qa.account.accountapi.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Material {

	@Id
	@GeneratedValue
	private Long materialId;
	
	private String materialName;
	
	private int materialSize;
	
	public Material() {
		
	}
	
	public Material(Long materialId, String materialName, int materialSize) {
		this.materialId = materialId;
		this.materialName = materialName;
		this.materialSize = materialSize;
	}

	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public int getMaterialSize() {
		return materialSize;
	}

	public void setMaterialSize(int materialSize) {
		this.materialSize = materialSize;
	}
			
}
