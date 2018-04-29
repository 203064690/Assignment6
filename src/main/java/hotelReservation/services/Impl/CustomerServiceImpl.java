package hotelReservation.services.Impl;

import hotelReservation.domain.Customer;
import hotelReservation.repositories.CustomerRepo;
import hotelReservation.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Assignment 6
 * Domain Driven Design
 * Dylan Baadjies
 * 203064690.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo repositoryCustomer;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> allCustomer = new ArrayList<Customer>();

        Iterable<Customer> customers = repositoryCustomer.findAll();
        for (Customer customer : customers) {
            allCustomer.add(customer);
        }
        return allCustomer;
    }

    @Override
    public boolean createCustomer(String idNumber, String firstNames, String lastName) {
        int count = 0;
        boolean blnCreateCustomer;


        Iterable<Customer> customers = repositoryCustomer.findAll();

        if (count == 0)
        {

            Customer newCustomer = new Customer.Builder(idNumber)
                    .customer_firstnames(firstNames)
                    .customer_lastname(lastName)
                    .build();
            repositoryCustomer.save(newCustomer);

            blnCreateCustomer = true;
        }
        else
        {
            blnCreateCustomer =false;
        }
        return blnCreateCustomer;
    }

    @Override
    public boolean updateCustomer(String idNumber, String firstNames, String lastName) {

        boolean blnUpdateCustomer= false;
        Long customerID = 0L;

        Iterable<Customer> customers = repositoryCustomer.findAll();
        for (Customer customer : customers) {
            if (customer.getIDNumber().equalsIgnoreCase(idNumber))
            {
                customerID = customer.getID();

                blnUpdateCustomer = true;
            }
        }

        if (blnUpdateCustomer == true)
        {
           Customer customer = repositoryCustomer.findOne(customerID);

            Customer newCustomer = new Customer.Builder(customer.getIDNumber())
                    .ID(customerID)
                    .customer_firstnames("Jon")
                    .customer_lastname("David")
                    .build();
            repositoryCustomer.save(newCustomer);
        }

        return blnUpdateCustomer;
    }
}
