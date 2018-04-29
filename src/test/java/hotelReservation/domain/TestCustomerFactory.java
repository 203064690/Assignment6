package hotelReservation.domain;


import hotelReservation.factories.CustomerFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Assignment 6
 * Domain Driven Design
 * Dylan Baadjies
 * 203064690.
 */
public class TestCustomerFactory {
    private Customer cust;
    private Customer newCust;
    @Before
    public void setUp()
    {
        cust = CustomerFactory.createCustomer("9211", "John", "Doe");
    }
    @Test
    public void testCreate() throws Exception
    {
        Assert.assertEquals("9211", cust.getIDNumber());
    }
    @Test
    public void testUpdate() throws Exception
    {
        newCust = new Customer
                .Builder(cust.getIDNumber())
                .copy(cust)
                .customer_firstnames("Matt")
                .build();
        Assert.assertEquals("9211", newCust.getIDNumber());
        Assert.assertEquals("Matt", newCust.getFirstnames());

    }
    @After
    public void tearDown()
    {

    }
}

