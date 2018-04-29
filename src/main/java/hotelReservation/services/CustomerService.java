package hotelReservation.services;

import hotelReservation.domain.Customer;

import java.util.List;

/**
 * Assignment 6
 * Domain Driven Design
 * Dylan Baadjies
 * 203064690.
 */
public interface CustomerService {
    public List<Customer> getAllCustomers();
    public boolean createCustomer(String idNumber, String firstNames, String lastName);
    public boolean updateCustomer(String idNumber, String firstNames, String lastName);
}
