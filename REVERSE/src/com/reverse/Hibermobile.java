package com.reverse;

// Generated Mar 11, 2015 12:11:24 PM by Hibernate Tools 3.4.0.CR1

/**
 * Hibermobile generated by hbm2java
 */
public class Hibermobile implements java.io.Serializable {

	private long mobileId;
	private String MModel;
	private long price;

	public Hibermobile() {
	}

	public Hibermobile(long mobileId, long price) {
		this.mobileId = mobileId;
		this.price = price;
	}

	public Hibermobile(long mobileId, String MModel, long price) {
		this.mobileId = mobileId;
		this.MModel = MModel;
		this.price = price;
	}

	public long getMobileId() {
		return this.mobileId;
	}

	public void setMobileId(long mobileId) {
		this.mobileId = mobileId;
	}

	public String getMModel() {
		return this.MModel;
	}

	public void setMModel(String MModel) {
		this.MModel = MModel;
	}

	public long getPrice() {
		return this.price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
