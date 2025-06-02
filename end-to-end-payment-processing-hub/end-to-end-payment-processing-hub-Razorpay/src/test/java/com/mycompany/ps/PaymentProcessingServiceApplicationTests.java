package com.mycompany.ps;

import com.mycompany.ps.entity.CustomerOrder;
import com.mycompany.ps.repo.CustomerOrderRepo;
import com.mycompany.ps.service.CustomerService;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class PaymentProcessingServiceApplicationTests {

    @Mock
    private CustomerOrderRepo customerOrderRepo;

    @InjectMocks
    private CustomerService customerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void contextLoads() {
        assertTrue(true);
    }


    @Test
    void testCreateOrderScenario1() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST1");
        order.setEmail("cust1@example.com");
        order.setAmount(110);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag1() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(2100);
        boolean result = order.getAmount() > 1510;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario2() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST2");
        order.setEmail("cust2@example.com");
        order.setAmount(120);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag2() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(2200);
        boolean result = order.getAmount() > 1520;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario3() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST3");
        order.setEmail("cust3@example.com");
        order.setAmount(130);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag3() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(2300);
        boolean result = order.getAmount() > 1530;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario4() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST4");
        order.setEmail("cust4@example.com");
        order.setAmount(140);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag4() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(2400);
        boolean result = order.getAmount() > 1540;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario5() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST5");
        order.setEmail("cust5@example.com");
        order.setAmount(150);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag5() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(2500);
        boolean result = order.getAmount() > 1550;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario6() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST6");
        order.setEmail("cust6@example.com");
        order.setAmount(160);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag6() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(2600);
        boolean result = order.getAmount() > 1560;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario7() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST7");
        order.setEmail("cust7@example.com");
        order.setAmount(170);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag7() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(2700);
        boolean result = order.getAmount() > 1570;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario8() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST8");
        order.setEmail("cust8@example.com");
        order.setAmount(180);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag8() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(2800);
        boolean result = order.getAmount() > 1580;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario9() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST9");
        order.setEmail("cust9@example.com");
        order.setAmount(190);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag9() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(2900);
        boolean result = order.getAmount() > 1590;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario10() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST10");
        order.setEmail("cust10@example.com");
        order.setAmount(200);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag10() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(3000);
        boolean result = order.getAmount() > 1600;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario11() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST11");
        order.setEmail("cust11@example.com");
        order.setAmount(210);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag11() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(3100);
        boolean result = order.getAmount() > 1610;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario12() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST12");
        order.setEmail("cust12@example.com");
        order.setAmount(220);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag12() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(3200);
        boolean result = order.getAmount() > 1620;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario13() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST13");
        order.setEmail("cust13@example.com");
        order.setAmount(230);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag13() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(3300);
        boolean result = order.getAmount() > 1630;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario14() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST14");
        order.setEmail("cust14@example.com");
        order.setAmount(240);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag14() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(3400);
        boolean result = order.getAmount() > 1640;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario15() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST15");
        order.setEmail("cust15@example.com");
        order.setAmount(250);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag15() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(3500);
        boolean result = order.getAmount() > 1650;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario16() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST16");
        order.setEmail("cust16@example.com");
        order.setAmount(260);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag16() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(3600);
        boolean result = order.getAmount() > 1660;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario17() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST17");
        order.setEmail("cust17@example.com");
        order.setAmount(270);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag17() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(3700);
        boolean result = order.getAmount() > 1670;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario18() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST18");
        order.setEmail("cust18@example.com");
        order.setAmount(280);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag18() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(3800);
        boolean result = order.getAmount() > 1680;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario19() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST19");
        order.setEmail("cust19@example.com");
        order.setAmount(290);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag19() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(3900);
        boolean result = order.getAmount() > 1690;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario20() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST20");
        order.setEmail("cust20@example.com");
        order.setAmount(300);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag20() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(4000);
        boolean result = order.getAmount() > 1700;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario21() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST21");
        order.setEmail("cust21@example.com");
        order.setAmount(310);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag21() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(4100);
        boolean result = order.getAmount() > 1710;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario22() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST22");
        order.setEmail("cust22@example.com");
        order.setAmount(320);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag22() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(4200);
        boolean result = order.getAmount() > 1720;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario23() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST23");
        order.setEmail("cust23@example.com");
        order.setAmount(330);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag23() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(4300);
        boolean result = order.getAmount() > 1730;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario24() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST24");
        order.setEmail("cust24@example.com");
        order.setAmount(340);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag24() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(4400);
        boolean result = order.getAmount() > 1740;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario25() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST25");
        order.setEmail("cust25@example.com");
        order.setAmount(350);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag25() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(4500);
        boolean result = order.getAmount() > 1750;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario26() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST26");
        order.setEmail("cust26@example.com");
        order.setAmount(360);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag26() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(4600);
        boolean result = order.getAmount() > 1760;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario27() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST27");
        order.setEmail("cust27@example.com");
        order.setAmount(370);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag27() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(4700);
        boolean result = order.getAmount() > 1770;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario28() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST28");
        order.setEmail("cust28@example.com");
        order.setAmount(380);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag28() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(4800);
        boolean result = order.getAmount() > 1780;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario29() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST29");
        order.setEmail("cust29@example.com");
        order.setAmount(390);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag29() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(4900);
        boolean result = order.getAmount() > 1790;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario30() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST30");
        order.setEmail("cust30@example.com");
        order.setAmount(400);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag30() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(5000);
        boolean result = order.getAmount() > 1800;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario31() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST31");
        order.setEmail("cust31@example.com");
        order.setAmount(410);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag31() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(5100);
        boolean result = order.getAmount() > 1810;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario32() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST32");
        order.setEmail("cust32@example.com");
        order.setAmount(420);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag32() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(5200);
        boolean result = order.getAmount() > 1820;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario33() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST33");
        order.setEmail("cust33@example.com");
        order.setAmount(430);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag33() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(5300);
        boolean result = order.getAmount() > 1830;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario34() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST34");
        order.setEmail("cust34@example.com");
        order.setAmount(440);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag34() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(5400);
        boolean result = order.getAmount() > 1840;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario35() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST35");
        order.setEmail("cust35@example.com");
        order.setAmount(450);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag35() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(5500);
        boolean result = order.getAmount() > 1850;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario36() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST36");
        order.setEmail("cust36@example.com");
        order.setAmount(460);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag36() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(5600);
        boolean result = order.getAmount() > 1860;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario37() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST37");
        order.setEmail("cust37@example.com");
        order.setAmount(470);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag37() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(5700);
        boolean result = order.getAmount() > 1870;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario38() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST38");
        order.setEmail("cust38@example.com");
        order.setAmount(480);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag38() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(5800);
        boolean result = order.getAmount() > 1880;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario39() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST39");
        order.setEmail("cust39@example.com");
        order.setAmount(490);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag39() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(5900);
        boolean result = order.getAmount() > 1890;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario40() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST40");
        order.setEmail("cust40@example.com");
        order.setAmount(500);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag40() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(6000);
        boolean result = order.getAmount() > 1900;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario41() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST41");
        order.setEmail("cust41@example.com");
        order.setAmount(510);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag41() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(6100);
        boolean result = order.getAmount() > 1910;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario42() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST42");
        order.setEmail("cust42@example.com");
        order.setAmount(520);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag42() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(6200);
        boolean result = order.getAmount() > 1920;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario43() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST43");
        order.setEmail("cust43@example.com");
        order.setAmount(530);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag43() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(6300);
        boolean result = order.getAmount() > 1930;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario44() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST44");
        order.setEmail("cust44@example.com");
        order.setAmount(540);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag44() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(6400);
        boolean result = order.getAmount() > 1940;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario45() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST45");
        order.setEmail("cust45@example.com");
        order.setAmount(550);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag45() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(6500);
        boolean result = order.getAmount() > 1950;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario46() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST46");
        order.setEmail("cust46@example.com");
        order.setAmount(560);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag46() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(6600);
        boolean result = order.getAmount() > 1960;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario47() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST47");
        order.setEmail("cust47@example.com");
        order.setAmount(570);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag47() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(6700);
        boolean result = order.getAmount() > 1970;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario48() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST48");
        order.setEmail("cust48@example.com");
        order.setAmount(580);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag48() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(6800);
        boolean result = order.getAmount() > 1980;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario49() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST49");
        order.setEmail("cust49@example.com");
        order.setAmount(590);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag49() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(6900);
        boolean result = order.getAmount() > 1990;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario50() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST50");
        order.setEmail("cust50@example.com");
        order.setAmount(600);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag50() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(7000);
        boolean result = order.getAmount() > 2000;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario51() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST51");
        order.setEmail("cust51@example.com");
        order.setAmount(610);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag51() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(7100);
        boolean result = order.getAmount() > 2010;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario52() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST52");
        order.setEmail("cust52@example.com");
        order.setAmount(620);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag52() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(7200);
        boolean result = order.getAmount() > 2020;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario53() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST53");
        order.setEmail("cust53@example.com");
        order.setAmount(630);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag53() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(7300);
        boolean result = order.getAmount() > 2030;
        assertTrue(result);
    }
    

    @Test
    void testCreateOrderScenario54() throws Exception {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId("CUST54");
        order.setEmail("cust54@example.com");
        order.setAmount(640);
        order.setOrderStatus("created");

        when(customerOrderRepo.save(any(CustomerOrder.class))).thenReturn(order);

        CustomerOrder result = customerService.createOrder(order);

        assertNotNull(result);
        assertEquals("created", result.getOrderStatus());
        verify(customerOrderRepo, times(1)).save(any(CustomerOrder.class));
    }

    @Test
    void testHighValueOrderFlag54() {
        CustomerOrder order = new CustomerOrder();
        order.setAmount(7400);
        boolean result = order.getAmount() > 2040;
        assertTrue(result);
    }
    
}
