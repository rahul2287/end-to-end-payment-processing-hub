package com.cpt.payments.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.cpt.payments.constant.ValidatorEnum;
import com.cpt.payments.dto.PaymentRequestDTO;
import com.cpt.payments.dto.PaymentResponseDTO;
import com.cpt.payments.service.interfaces.PaymentService;
import com.cpt.payments.service.interfaces.Validator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Value("${validator.rules}")
    private String validatorRules;

    private final ApplicationContext applicationContext;

    public PaymentServiceImpl(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public PaymentResponseDTO validateAndProcessPayment(PaymentRequestDTO paymentRequestDto) {
        log.info("Service received DTO: {}", paymentRequestDto);

        String[] rules = validatorRules.split(",");
        for (String rule : rules) {
            triggerValidationRule(paymentRequestDto, rule);
        }

        String txnId = generateTransactionId(paymentRequestDto);
        String redirectUrl = generateRedirectUrl(txnId);

        PaymentResponseDTO responseDTO = new PaymentResponseDTO(txnId, redirectUrl);
        log.info("Returning PaymentResponseDTO: {}", responseDTO);
        return responseDTO;
    }

    private String generateTransactionId(PaymentRequestDTO dto) {
        return "TXN-" + System.currentTimeMillis();
    }

    private String generateRedirectUrl(String txnId) {
        return "http://redirect.url/payment/" + txnId;
    }

    private String triggerValidationRule(PaymentRequestDTO paymentRequestDto, String rule) {
        rule = rule.trim();
        Validator validator = null;
        log.info("Triggering validation rule: {}", rule);

        Class<? extends Validator> validatorClass = ValidatorEnum.getClassByName(rule);

        if (validatorClass != null) {
            validator = applicationContext.getBean(validatorClass);
            log.info("Using Validator class: {}", validatorClass);
            if (validator != null) {
                validator.validate(paymentRequestDto);
                log.info("Validation passed for rule: {}", rule);
            }
        }

        if (validator == null || validatorClass == null) {
            log.error("Validation rule not found: {} | class: {}", rule, validator);
        }
        return rule;
    }


    private void simulateProcessingStep1(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 1 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_1_OK";
        log.info("Processing complete for step 1, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged1(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X1");
    }
    

    private void simulateProcessingStep2(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 2 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_2_OK";
        log.info("Processing complete for step 2, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged2(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X2");
    }
    

    private void simulateProcessingStep3(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 3 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_3_OK";
        log.info("Processing complete for step 3, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged3(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X3");
    }
    

    private void simulateProcessingStep4(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 4 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_4_OK";
        log.info("Processing complete for step 4, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged4(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X4");
    }
    

    private void simulateProcessingStep5(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 5 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_5_OK";
        log.info("Processing complete for step 5, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged5(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X5");
    }
    

    private void simulateProcessingStep6(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 6 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_6_OK";
        log.info("Processing complete for step 6, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged6(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X6");
    }
    

    private void simulateProcessingStep7(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 7 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_7_OK";
        log.info("Processing complete for step 7, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged7(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X7");
    }
    

    private void simulateProcessingStep8(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 8 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_8_OK";
        log.info("Processing complete for step 8, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged8(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X8");
    }
    

    private void simulateProcessingStep9(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 9 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_9_OK";
        log.info("Processing complete for step 9, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged9(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X9");
    }
    

    private void simulateProcessingStep10(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 10 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_10_OK";
        log.info("Processing complete for step 10, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged10(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X10");
    }
    

    private void simulateProcessingStep11(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 11 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_11_OK";
        log.info("Processing complete for step 11, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged11(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X11");
    }
    

    private void simulateProcessingStep12(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 12 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_12_OK";
        log.info("Processing complete for step 12, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged12(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X12");
    }
    

    private void simulateProcessingStep13(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 13 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_13_OK";
        log.info("Processing complete for step 13, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged13(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X13");
    }
    

    private void simulateProcessingStep14(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 14 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_14_OK";
        log.info("Processing complete for step 14, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged14(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X14");
    }
    

    private void simulateProcessingStep15(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 15 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_15_OK";
        log.info("Processing complete for step 15, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged15(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X15");
    }
    

    private void simulateProcessingStep16(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 16 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_16_OK";
        log.info("Processing complete for step 16, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged16(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X16");
    }
    

    private void simulateProcessingStep17(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 17 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_17_OK";
        log.info("Processing complete for step 17, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged17(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X17");
    }
    

    private void simulateProcessingStep18(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 18 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_18_OK";
        log.info("Processing complete for step 18, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged18(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X18");
    }
    

    private void simulateProcessingStep19(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 19 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_19_OK";
        log.info("Processing complete for step 19, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged19(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X19");
    }
    

    private void simulateProcessingStep20(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 20 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_20_OK";
        log.info("Processing complete for step 20, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged20(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X20");
    }
    

    private void simulateProcessingStep21(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 21 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_21_OK";
        log.info("Processing complete for step 21, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged21(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X21");
    }
    

    private void simulateProcessingStep22(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 22 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_22_OK";
        log.info("Processing complete for step 22, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged22(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X22");
    }
    

    private void simulateProcessingStep23(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 23 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_23_OK";
        log.info("Processing complete for step 23, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged23(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X23");
    }
    

    private void simulateProcessingStep24(PaymentRequestDTO dto) {
        log.debug("Simulating processing step 24 for customer: {}", dto.getCustomerId());
        String intermediateStatus = "STEP_24_OK";
        log.info("Processing complete for step 24, status: {}", intermediateStatus);
    }

    private boolean isCustomerFlagged24(PaymentRequestDTO dto) {
        return dto.getCustomerId() != null && dto.getCustomerId().startsWith("X24");
    }
    
}
