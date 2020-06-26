package com.onlinecourse.microservices.currencyconverterservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private Long id;
	//from billing service
	private Long courseId;
	private String courseName;
	private BigDecimal coursePrice;
	private BigDecimal tax;
	private BigDecimal discount;
	private BigDecimal finalPrice;
	//from exchange service
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal conversionFee;

	private BigDecimal convertedPrice;
	private int port;

	public CurrencyConversionBean() {

	}
	
	public CurrencyConversionBean(Long courseId, String courseName, BigDecimal coursePrice, BigDecimal tax,
			BigDecimal discount, BigDecimal finalPrice, String from, String to, BigDecimal conversionMultiple,
			BigDecimal conversionFee, BigDecimal convertedPrice, int port) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.tax = tax;
		this.discount = discount;
		this.finalPrice = finalPrice;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.conversionFee = conversionFee;
		this.convertedPrice = convertedPrice;
		this.port = port;
	}
	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

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

	public BigDecimal getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(BigDecimal coursePrice) {
		this.coursePrice = coursePrice;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	public BigDecimal getConversionFee() {
		return conversionFee;
	}

	public void setConversionFee(BigDecimal conversionFee) {
		this.conversionFee = conversionFee;
	}

	public BigDecimal getConvertedPrice() {
		return convertedPrice;
	}

	public void setConvertedPrice(BigDecimal convertedPrice) {
		this.convertedPrice = convertedPrice;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
    
	
}