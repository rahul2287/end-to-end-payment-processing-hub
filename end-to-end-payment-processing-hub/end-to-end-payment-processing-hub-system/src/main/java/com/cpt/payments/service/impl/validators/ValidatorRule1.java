package com.cpt.payments.service.impl.validators;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cpt.payments.constant.ErrorCodeEnum;
import com.cpt.payments.dto.PaymentRequestDTO;
import com.cpt.payments.exception.ValidationException;
import com.cpt.payments.service.interfaces.Validator;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ValidatorRule1 implements Validator{

	
	public void validate(PaymentRequestDTO paymentRequestDTO ) {
		
		
		
		log.info("Validator1 : Payment service request :{}",paymentRequestDTO);
		 
		if(paymentRequestDTO.getAmount() <0) {
			
			     
			 log.error("eror occured amount can not be nagative");
			throw new ValidationException(ErrorCodeEnum.INVALID_AMOUNT.getErrorCode(),ErrorCodeEnum.INVALID_AMOUNT.getErrorMassage(),HttpStatus.BAD_REQUEST) ;
		}
	 if (paymentRequestDTO.getCurrency() == null || paymentRequestDTO.getCurrency().isBlank()) {
            log.error("Validation failed: currency cannot be null or blank");
            throw new ValidationException("400", "Currency must be provided", HttpStatus.BAD_REQUEST);
        }


        if (paymentRequestDTO.getField1() != null && paymentRequestDTO.getField1().equalsIgnoreCase("INVALID")) {
            log.error("Validation failed: Field1 contains invalid value");
            throw new ValidationException("400", "Invalid value in field1", HttpStatus.BAD_REQUEST);
        }
    

        if (paymentRequestDTO.getField2() != null && paymentRequestDTO.getField2().equalsIgnoreCase("INVALID")) {
            log.error("Validation failed: Field2 contains invalid value");
            throw new ValidationException("400", "Invalid value in field2", HttpStatus.BAD_REQUEST);
        }
    

        if (paymentRequestDTO.getField3() != null && paymentRequestDTO.getField3().equalsIgnoreCase("INVALID")) {
            log.error("Validation failed: Field3 contains invalid value");
            throw new ValidationException("400", "Invalid value in field3", HttpStatus.BAD_REQUEST);
        }
    
		 
	 }
	   
	  
}
