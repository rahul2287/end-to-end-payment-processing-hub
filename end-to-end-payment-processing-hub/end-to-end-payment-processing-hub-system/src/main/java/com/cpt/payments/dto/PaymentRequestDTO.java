package com.cpt.payments.dto;

import lombok.Data;

@Data
public class PaymentRequestDTO {

	     
	     private double amount ;
	    private String currency ;
	 private String field89;
    private String customerId;
    private String merchantId;
    private String paymentMethod;
    private String paymentGateway;
    private String email;
    private String mobileNumber;
    private String countryCode;
    private String status;
    private String transactionType;
    private String orderDescription;
    private String invoiceNumber;
    private String receiptId;
    private String transactionReference;
    private String billingAddress;
    private String shippingAddress;
    private String ipAddress;
    private String userAgent;
    private String deviceId;
    private String sessionId;

	     
	      
}
