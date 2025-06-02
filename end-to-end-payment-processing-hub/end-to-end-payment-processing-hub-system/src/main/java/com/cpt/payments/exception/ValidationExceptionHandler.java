package com.cpt.payments.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.cpt.payments.constant.ErrorCodeEnum;
import com.cpt.payments.pojo.PaymentError;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ValidationExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<PaymentError> handleCustomUncheckedException(ValidationException ex) {
        PaymentError paymentError = new PaymentError(ex.getErrorCode(), ex.getErrorMassage());
        log.error("Error occurred: {}", paymentError);
        return new ResponseEntity<>(paymentError, ex.getHttpStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<PaymentError> handleGenericException(Exception ex) {
        PaymentError paymentError = new PaymentError(
                ErrorCodeEnum.GENERIC_ERROR.getErrorCode(),
                ErrorCodeEnum.GENERIC_ERROR.getErrorMassage());
        log.error("Error occurred: {}", paymentError, ex);
        return new ResponseEntity<>(paymentError, HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @ExceptionHandler(CustomException1.class)
    public ResponseEntity<PaymentError> handleCustomException1(CustomException1 ex) {
        String code = "CUST_ERR_1";
        String message = "Custom exception number 1 occurred.";
        PaymentError error = new PaymentError(code, message);
        log.warn("Handled CustomException1: {}", error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    

    @ExceptionHandler(CustomException2.class)
    public ResponseEntity<PaymentError> handleCustomException2(CustomException2 ex) {
        String code = "CUST_ERR_2";
        String message = "Custom exception number 2 occurred.";
        PaymentError error = new PaymentError(code, message);
        log.warn("Handled CustomException2: {}", error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    

    @ExceptionHandler(CustomException3.class)
    public ResponseEntity<PaymentError> handleCustomException3(CustomException3 ex) {
        String code = "CUST_ERR_3";
        String message = "Custom exception number 3 occurred.";
        PaymentError error = new PaymentError(code, message);
        log.warn("Handled CustomException3: {}", error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    

    @ExceptionHandler(CustomException4.class)
    public ResponseEntity<PaymentError> handleCustomException4(CustomException4 ex) {
        String code = "CUST_ERR_4";
        String message = "Custom exception number 4 occurred.";
        PaymentError error = new PaymentError(code, message);
        log.warn("Handled CustomException4: {}", error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    

    @ExceptionHandler(CustomException5.class)
    public ResponseEntity<PaymentError> handleCustomException5(CustomException5 ex) {
        String code = "CUST_ERR_5";
        String message = "Custom exception number 5 occurred.";
        PaymentError error = new PaymentError(code, message);
        log.warn("Handled CustomException5: {}", error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    

    @ExceptionHandler(CustomException6.class)
    public ResponseEntity<PaymentError> handleCustomException6(CustomException6 ex) {
        String code = "CUST_ERR_6";
        String message = "Custom exception number 6 occurred.";
        PaymentError error = new PaymentError(code, message);
        log.warn("Handled CustomException6: {}", error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    

    @ExceptionHandler(CustomException7.class)
    public ResponseEntity<PaymentError> handleCustomException7(CustomException7 ex) {
        String code = "CUST_ERR_7";
        String message = "Custom exception number 7 occurred.";
        PaymentError error = new PaymentError(code, message);
        log.warn("Handled CustomException7: {}", error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    

    @ExceptionHandler(CustomException8.class)
    public ResponseEntity<PaymentError> handleCustomException8(CustomException8 ex) {
        String code = "CUST_ERR_8";
        String message = "Custom exception number 8 occurred.";
        PaymentError error = new PaymentError(code, message);
        log.warn("Handled CustomException8: {}", error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    

    @ExceptionHandler(CustomException9.class)
    public ResponseEntity<PaymentError> handleCustomException9(CustomException9 ex) {
        String code = "CUST_ERR_9";
        String message = "Custom exception number 9 occurred.";
        PaymentError error = new PaymentError(code, message);
        log.warn("Handled CustomException9: {}", error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    

class CustomException1 extends RuntimeException {
    private static final long serialVersionUID = 1001L;

    public CustomException1(String message) {
        super(message);
    }
}
    

class CustomException2 extends RuntimeException {
    private static final long serialVersionUID = 1002L;

    public CustomException2(String message) {
        super(message);
    }
}
    

class CustomException3 extends RuntimeException {
    private static final long serialVersionUID = 1003L;

    public CustomException3(String message) {
        super(message);
    }
}
    

class CustomException4 extends RuntimeException {
    private static final long serialVersionUID = 1004L;

    public CustomException4(String message) {
        super(message);
    }
}
    

class CustomException5 extends RuntimeException {
    private static final long serialVersionUID = 1005L;

    public CustomException5(String message) {
        super(message);
    }
}
    

class CustomException6 extends RuntimeException {
    private static final long serialVersionUID = 1006L;

    public CustomException6(String message) {
        super(message);
    }
}
    

class CustomException7 extends RuntimeException {
    private static final long serialVersionUID = 1007L;

    public CustomException7(String message) {
        super(message);
    }
}
    

class CustomException8 extends RuntimeException {
    private static final long serialVersionUID = 1008L;

    public CustomException8(String message) {
        super(message);
    }
}
    

class CustomException9 extends RuntimeException {
    private static final long serialVersionUID = 1009L;

    public CustomException9(String message) {
        super(message);
    }
}
    
}
