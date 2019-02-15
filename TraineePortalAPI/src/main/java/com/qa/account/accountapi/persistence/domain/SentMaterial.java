package com.qa.account.accountapi.persistence.domain;

public class SentMaterial {

	private Long materialId;
	
	private String materialName;
	
	private int materialSize;
	
	public SentMaterial() {
	}
	
	public SentMaterial(Material material) {
		this.materialId = material.getMaterialId();
		this.materialName = material.getMaterialName();
		this.materialSize = material.getMaterialSize();
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
