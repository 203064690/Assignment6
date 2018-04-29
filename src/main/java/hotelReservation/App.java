package hotelReservation;

import hotelReservation.domain.Customer;
import hotelReservation.services.CustomerService;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        CustomerService ob = new CustomerService() {
            @Override
            public List<Customer> getAllCustomers() {
                return null;
            }

            @Override
            public boolean createCustomer(String idNumber, String firstNames, String lastName) {
                return false;
            }

            @Override
            public boolean updateCustomer(String idNumber, String firstNames, String lastName) {
                return false;
            }

        };

        ob.createCustomer("1","Dylan","Baadjies");

        ob.createCustomer("2","Angeliek","Baadjies");
        System.out.println(ob.getAllCustomers());
    }
}