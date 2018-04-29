package hotelReservation.services.Impl;

import hotelReservation.domain.*;
import hotelReservation.repositories.*;
import hotelReservation.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Assignment 6
 * Domain Driven Design
 * Dylan Baadjies
 * 203064690.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo repositoryEmployee;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = new ArrayList<Employee>();

        Iterable<Employee> employees = repositoryEmployee.findAll();
        for (Employee employee : employees) {
            allEmployees.add(employee);
        }
        return allEmployees;
    }

    @Override
    public boolean createEmployee(String idNumber, String firstName, String lastName, Date hireDate, String gender, String race, String homeLanguage, String physicalAddress, String postalAddress, String postalCode, String cellNumber, String homeNumber, String emailAddress, String NOKN, String jobCode, String jobType, String jobTitle, String jobDescription, double salary, String managerID, String managerTitle) {
        int count = 0;
        boolean blnCreateEmployee;

        Iterable<Employee> employees = repositoryEmployee.findAll();

        System.out.println(" " + count);
        System.out.println(" " + idNumber + " " + firstName + " " + lastName);

        if (count == 0)
        {
            Date dateTemp = new Date();

            Employee employee = new Employee.Builder(idNumber)
                    .employee_firstnames(firstName)
                    .employee_lastname(lastName)
                    .hire_date(dateTemp)
                    .build();
            repositoryEmployee.save(employee);
            blnCreateEmployee = true;
        }
        else
        {
            blnCreateEmployee = false;
        }

        return blnCreateEmployee;
    }

    @Override
    public boolean updateEmployee(String idNumber, String firstName, String lastName, Date hireDate, String gender, String race, String homeLanguage, String physicalAddress, String postalAddress, String postalCode, String cellNumber, String homeNumber, String emailAddress, String NOKN, String jobCode, String jobType, String jobTitle, String jobDescription, double salary, String managerID, String managerTitle) {
        boolean blnUpdateEmployee= false;
        Long employeeID = 0L;

        Iterable<Employee> employees = repositoryEmployee.findAll();
        for (Employee employee : employees) {
            if (employee.getIDNumber().equalsIgnoreCase(idNumber))
            {
                employeeID = employee.getID();
                blnUpdateEmployee = true;
            }
        }

        if (blnUpdateEmployee == true)
        {
            Employee employee = repositoryEmployee.findOne(employeeID);

            Employee newEmployee = new Employee.Builder(employee.getIDNumber())
                    .ID(employeeID)
                    .employee_firstnames("John")
                    .employee_lastname("Dave")
                    .build();
            repositoryEmployee.save(newEmployee);
        }
        return blnUpdateEmployee;
    }
}