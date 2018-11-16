package com.cg.ams.bean;

import java.util.Date;

public class AssetAllocationBean {
	private int allocationId;
	private int assetId;
	private int empNo;
	private Date allocationDate;
	private Date releaseDate;

	public AssetAllocationBean() {

	}

	public AssetAllocationBean(int allocationId, int assetId, int empNo,
			Date allocationDate, Date releaseDate) {
		super();
		this.allocationId = allocationId;
		this.assetId = assetId;
		this.empNo = empNo;
		this.allocationDate = allocationDate;
		this.releaseDate = releaseDate;
	}

	public int getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(int allocationId) {
		this.allocationId = allocationId;
	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public Date getAllocationDate() {
		return allocationDate;
	}

	public void setAllocationDate(Date allocationDate) {
		this.allocationDate = allocationDate;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "AssetAllocationBean [allocationId=" + allocationId
				+ ", assetId=" + assetId + ", empNo=" + empNo
				+ ", allocationDate=" + allocationDate + ", releaseDate="
				+ releaseDate + "]";
	}

}
