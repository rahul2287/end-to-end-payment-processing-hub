package com.mycompany.ps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mycompany.ps.entity.CustomerOrder;
import com.mycompany.ps.inrfc.CusService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@Slf4j
@RequestMapping("/v1/customers")
public class CustomerController {

    @Autowired
    private CusService service;

    @PostMapping("/payments")
    public ResponseEntity<CustomerOrder> createOrder(@RequestBody CustomerOrder customerOrder) throws Exception {
        log.info("Customer request is received: {}", customerOrder);
        CustomerOrder createdOrder = service.createOrder(customerOrder);
        log.info("Customer order is created: {}", createdOrder);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

    @GetMapping("/{customerId}/orders")
    public ResponseEntity<List<CustomerOrder>> getCustomerOrders(@PathVariable String customerId) {
        log.info("Fetching orders for customer: {}", customerId);
        List<CustomerOrder> orders = service.getOrdersByCustomerId(customerId);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @PutMapping("/{orderId}/update")
    public ResponseEntity<CustomerOrder> updateOrder(@PathVariable String orderId, @RequestBody CustomerOrder update) {
        log.info("Updating order: {}", orderId);
        CustomerOrder updated = service.updateOrder(orderId, update);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<String> deleteOrder(@PathVariable String orderId) {
        log.info("Deleting order with ID: {}", orderId);
        service.deleteOrder(orderId);
        return new ResponseEntity<>("Order deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> healthCheck() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "Customer Payment Service");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/analytics/summary")
    public ResponseEntity<Map<String, Object>> getSummaryReport() {
        log.info("Generating summary report for admin dashboard.");
        Map<String, Object> summary = service.getOrderSummary();
        return new ResponseEntity<>(summary, HttpStatus.OK);
    }

    @PostMapping("/simulate")
    public ResponseEntity<String> simulateBulkOrders(@RequestBody List<CustomerOrder> orders) {
        log.info("Simulating bulk order creation.");
        for (CustomerOrder order : orders) {
            try {
                service.createOrder(order);
            } catch (Exception e) {
                log.error("Failed to create order: {}", order, e);
            }
        }
        return new ResponseEntity<>("Bulk orders processed.", HttpStatus.CREATED);
    }

    @PostMapping("/reprocess-failed")
    public ResponseEntity<String> reprocessFailedOrders() {
        log.info("Initiating reprocessing of failed transactions.");
        int count = service.reprocessFailedOrders();
        return new ResponseEntity<>(count + " failed orders reprocessed.", HttpStatus.OK);
    }

    @GetMapping("/status/{orderId}")
    public ResponseEntity<Map<String, Object>> getOrderStatus(@PathVariable String orderId) {
        log.info("Checking order status for ID: {}", orderId);
        Map<String, Object> status = service.getOrderStatus(orderId);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
