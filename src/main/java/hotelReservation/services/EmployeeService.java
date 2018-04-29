package hotelReservation.services;

import hotelReservation.domain.Employee;

import java.util.Date;
import java.util.List;

/**
 * Assignment 6
 * Domain Driven Design
 * Dylan Baadjies
 * 203064690.
 */
public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public boolean createEmployee(String idNumber, String firstName, String lastName, Date hireDate,
                                  String gender, String race, String homeLanguage, String physicalAddress,
                                  String postalAddress, String postalCode, String cellNumber, String homeNumber,
                                  String emailAddress, String NOKN, String jobCode, String jobType, String jobTitle,
                                  String jobDescription, double salary, String managerID, String managerTitle);
    public boolean updateEmployee(String idNumber, String firstName, String lastName, Date hireDate,
                                  String gender, String race, String homeLanguage, String physicalAddress,
                                  String postalAddress, String postalCode, String cellNumber, String homeNumber,
                                  String emailAddress, String NOKN, String jobCode, String jobType, String jobTitle,
                                  String jobDescription, double salary, String managerID, String managerTitle);
}
