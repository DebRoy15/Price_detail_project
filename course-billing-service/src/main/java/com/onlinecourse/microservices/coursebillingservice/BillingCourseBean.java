package com.onlinecourse.microservices.coursebillingservice;

public class BillingCourseBean {
	//Getting from other service
	private Long courseId;
	private String courseName;
	private int coursePrice;
	
	//data from this service
	
	private int tax;
	private int discount;
	
	private int finalPrice;

	public BillingCourseBean() {
		
	}

	public BillingCourseBean(Long courseId, String courseName, int coursePrice, int tax, int discount, int finalPrice) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.tax = tax;
		this.discount = discount;
		this.finalPrice = finalPrice;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	
}
	