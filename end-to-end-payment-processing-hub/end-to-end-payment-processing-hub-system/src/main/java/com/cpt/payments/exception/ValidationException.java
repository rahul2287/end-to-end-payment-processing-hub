package com.cpt.payments.exception;

import org.springframework.http.HttpStatus;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = 4289409051253111135L;

    private String errorCode;
    private String errorMessage;
    private HttpStatus httpStatus;

    public ValidationException(String errorCode, String errorMessage, HttpStatus httpStatus) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }

    public ValidationException(String errorMessage) {
        super(errorMessage);
        this.errorCode = "UNKNOWN";
        this.errorMessage = errorMessage;
        this.httpStatus = HttpStatus.BAD_REQUEST;
    }

    public ValidationException(HttpStatus httpStatus) {
        super("Validation failed");
        this.errorCode = "VALIDATION_ERROR";
        this.errorMessage = "Validation failed";
        this.httpStatus = httpStatus;
    }

    public String formatMessage() {
        return String.format("Error[%s]: %s (Status: %s)", errorCode, errorMessage, httpStatus);
    }


    public boolean isErrorCode1() {
        return "ERR1".equals(this.errorCode);
    }

    public String errorCodeDetail1() {
        return "Error code ERR1 means issue #1";
    }
    

    public boolean isErrorCode2() {
        return "ERR2".equals(this.errorCode);
    }

    public String errorCodeDetail2() {
        return "Error code ERR2 means issue #2";
    }
}
