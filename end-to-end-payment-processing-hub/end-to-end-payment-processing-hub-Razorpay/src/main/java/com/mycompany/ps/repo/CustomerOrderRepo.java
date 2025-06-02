package com.mycompany.ps.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mycompany.ps.entity.CustomerOrder;

import java.util.List;

@Repository
public interface CustomerOrderRepo extends JpaRepository<CustomerOrder, Integer> {

    // Find orders by customer ID
    List<CustomerOrder> findByCustomerId(String customerId);

    // Find orders by status
    List<CustomerOrder> findByStatus(String status);

    // Find recent orders
    @Query("SELECT o FROM CustomerOrder o WHERE o.orderDate >= CURRENT_DATE - 7")
    List<CustomerOrder> findRecentOrders();

    // Find high value orders
    @Query("SELECT o FROM CustomerOrder o WHERE o.amount > ?1")
    List<CustomerOrder> findHighValueOrders(double amount);

    // Count total orders by customer
    @Query("SELECT COUNT(o) FROM CustomerOrder o WHERE o.customerId = ?1")
    long countByCustomerId(String customerId);

    // Get average order value
    @Query("SELECT AVG(o.amount) FROM CustomerOrder o")
    double getAverageOrderAmount();

    // Get top 5 latest orders
    List<CustomerOrder> findTop5ByOrderByOrderDateDesc();

    // Find orders by merchant
    List<CustomerOrder> findByMerchantId(String merchantId);

    // Find failed transactions
    List<CustomerOrder> findByStatusAndRetryCountGreaterThan(String status, int retryCount);

    // Delete all cancelled orders
    long deleteByStatus(String status);
}
