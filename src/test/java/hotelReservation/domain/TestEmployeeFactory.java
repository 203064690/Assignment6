package hotelReservation.domain;

import hotelReservation.factories.EmployeeFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Assignment 6
 * Domain Driven Design
 * Dylan Baadjies
 * 203064690.
 */
public class TestEmployeeFactory {
    private Employee emp;
    private Employee newEmp;
    private Date d;
    @Before
    public void setUp()
    {
        emp = EmployeeFactory.createEmployee("921", "John", "Doe", d);
    }
    @Test
    public void testCreate() throws Exception
    {
        Assert.assertEquals("921", emp.getIDNumber());
    }
    @Test
    public void testUpdate() throws Exception
    {
        newEmp = new Employee
                .Builder(emp.getIDNumber())
                .copy(emp)
                .employee_firstnames("John D")
                .build();
        Assert.assertEquals("921", newEmp.getIDNumber());
        Assert.assertEquals("John D", newEmp.getFirstnames());
    }
    @After
    public void tearDown()
    {

    }
}
