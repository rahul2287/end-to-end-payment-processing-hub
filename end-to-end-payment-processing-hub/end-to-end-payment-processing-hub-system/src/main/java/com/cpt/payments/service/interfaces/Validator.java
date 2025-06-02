package com.cpt.payments.service.interfaces;

import com.cpt.payments.dto.PaymentRequestDTO;

public interface Validator {

    void validate(PaymentRequestDTO paymentRequestDTO);


    /**
     * Checks condition 1 during validation.
     */
    default boolean checkCondition1(PaymentRequestDTO dto) {
        return dto != null && dto.getAmount() > 100;
    }
    

    /**
     * Checks condition 2 during validation.
     */
    default boolean checkCondition2(PaymentRequestDTO dto) {
        return dto != null && dto.getAmount() > 200;
    }
    

    /**
     * Checks condition 3 during validation.
     */
    default boolean checkCondition3(PaymentRequestDTO dto) {
        return dto != null && dto.getAmount() > 300;
    }
    

    /**
     * Checks condition 4 during validation.
     */
    default boolean checkCondition4(PaymentRequestDTO dto) {
        return dto != null && dto.getAmount() > 400;
    }
    

    /**
     * Checks condition 5 during validation.
     */
    default boolean checkCondition5(PaymentRequestDTO dto) {
        return dto != null && dto.getAmount() > 500;
    }
    
}
