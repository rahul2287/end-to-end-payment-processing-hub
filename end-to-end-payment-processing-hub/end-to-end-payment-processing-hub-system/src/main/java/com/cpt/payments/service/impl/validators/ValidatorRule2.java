package com.cpt.payments.service.impl.validators;

import org.springframework.stereotype.Service;

import com.cpt.payments.dto.PaymentRequestDTO;
import com.cpt.payments.service.interfaces.Validator;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ValidatorRule2 implements Validator {

	public void validate(PaymentRequestDTO paymentRequestDTO ) {
		
		log.info("Validator2 : Payment service request :{}",paymentRequestDTO);
	 }
 	if (paymentRequestDTO.getEmail() == null || !paymentRequestDTO.getEmail().contains("@")) {
            log.error("Validation failed: Invalid email format");
            throw new ValidationException("402", "Invalid email format", HttpStatus.BAD_REQUEST);
        }

        if (paymentRequestDTO.getAmount() == 0) {
            log.warn("Validation warning: amount is zero");
        }


        if (paymentRequestDTO.getField1() != null && paymentRequestDTO.getField1().equalsIgnoreCase("BLOCKED")) {
            log.warn("Field1 flagged as BLOCKED for customer: {}", paymentRequestDTO.getCustomerId());
        }
    

        if (paymentRequestDTO.getField2() != null && paymentRequestDTO.getField2().equalsIgnoreCase("BLOCKED")) {
            log.warn("Field2 flagged as BLOCKED for customer: {}", paymentRequestDTO.getCustomerId());
        }
    

        if (paymentRequestDTO.getField3() != null && paymentRequestDTO.getField3().equalsIgnoreCase("BLOCKED")) {
            log.warn("Field3 flagged as BLOCKED for customer: {}", paymentRequestDTO.getCustomerId());
        }
    

	
}
