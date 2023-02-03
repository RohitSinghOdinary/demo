package Thym_Spring_Project.Service;

import Thym_Spring_Project.Model.Employee;
import Thym_Spring_Project.Repository.Employee_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Employee_Service_impl  implements Employee_Service{


    @Autowired
    private Employee_Repository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();

    }
}
