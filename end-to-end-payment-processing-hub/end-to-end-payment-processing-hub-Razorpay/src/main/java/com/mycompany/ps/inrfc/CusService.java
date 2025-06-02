package com.mycompany.ps.inrfc;

import com.mycompany.ps.entity.CustomerOrder;
import java.util.List;
import java.util.Map;

public interface CusService {

    // Order Management
    public CustomerOrder createOrder(CustomerOrder cusOrder) throws Exception;

    public List<CustomerOrder> getOrdersByCustomerId(String customerId);

    public CustomerOrder updateOrder(String orderId, CustomerOrder update);

    public void deleteOrder(String orderId);

    public Map<String, Object> getOrderSummary();

    public int reprocessFailedOrders();

    public Map<String, Object> getOrderStatus(String orderId);

    // Payment Handling
    public boolean validatePaymentDetails(CustomerOrder order);

    public boolean initiatePayment(CustomerOrder order);

    public boolean confirmPayment(String paymentId);

    public boolean cancelPayment(String paymentId);

    // Fraud and Risk
    public boolean performFraudCheck(CustomerOrder order);

    public String getFraudScore(String customerId);

    // Notification and Reporting
    public void notifyCustomer(String customerId, String message);

    public void sendOrderReport(String email);

    // Sanction Checks
    public boolean isSanctionedCustomer(String customerId);

    public boolean validateSanctionList(String name, String country);

    // EOD Processing
    public void performEndOfDayReconciliation();

    public Map<String, Double> getDailyTransactionVolume();

    // System Maintenance
    public void archiveOldOrders();

    public boolean backupTransactionLogs();

    // Miscellaneous
    public List<CustomerOrder> searchOrders(String keyword);

    public List<String> getTopPayingCustomers();

    public double getAverageTransactionValue();

    public boolean applyDiscountToOrder(String orderId, double discountPercent);

    public boolean isEligibleForLoyaltyProgram(String customerId);
}
