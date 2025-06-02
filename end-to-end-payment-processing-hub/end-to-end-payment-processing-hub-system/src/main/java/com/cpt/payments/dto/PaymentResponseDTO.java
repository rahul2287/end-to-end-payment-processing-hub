package com.cpt.payments.dto;

import lombok.Data;

@Data
public class PaymentResponseDTO {

    private String txnId;
    private String redirectUrl;

    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;
    private String field7;
    private String field8;
    private String field9;
    private String field10;
    private String field11;
    private String field12;
    private String field13;
    private String field14;
    private String field15;
    private String field16;
    private String field17;
    private String field18;
    private String field19;
    private String field20;
    private String field21;
    private String field22;
    private String field23;
    private String field24;
    public PaymentResponseDTO(String txnId, String redirectUrl) {
        this.txnId = txnId;
        this.redirectUrl = redirectUrl;
    }

    // Additional constructors

    public PaymentResponseDTO(String txnId, String redirectUrl, String field1) {
        this.txnId = txnId;
        this.redirectUrl = redirectUrl;
        this.field1 = field1;
    }

    public String getField1UpperCase() {
        return field1 != null ? field1.toUpperCase() : null;
    }
    
    public PaymentResponseDTO(String txnId, String redirectUrl, String field2) {
        this.txnId = txnId;
        this.redirectUrl = redirectUrl;
        this.field2 = field2;
    }

    public String getField2UpperCase() {
        return field2 != null ? field2.toUpperCase() : null;
    }
    
    public PaymentResponseDTO(String txnId, String redirectUrl, String field3) {
        this.txnId = txnId;
        this.redirectUrl = redirectUrl;
        this.field3 = field3;
    }

    public String getField3UpperCase() {
        return field3 != null ? field3.toUpperCase() : null;
    }
    
    public PaymentResponseDTO(String txnId, String redirectUrl, String field4) {
        this.txnId = txnId;
        this.redirectUrl = redirectUrl;
        this.field4 = field4;
    }

    public String getField4UpperCase() {
        return field4 != null ? field4.toUpperCase() : null;
    }
    
    public PaymentResponseDTO(String txnId, String redirectUrl, String field5) {
        this.txnId = txnId;
        this.redirectUrl = redirectUrl;
        this.field5 = field5;
    }

    public String getField5UpperCase() {
        return field5 != null ? field5.toUpperCase() : null;
    }
    
}
