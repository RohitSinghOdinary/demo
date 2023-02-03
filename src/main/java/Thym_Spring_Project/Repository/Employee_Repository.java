package Thym_Spring_Project.Repository;

import Thym_Spring_Project.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee_Repository extends JpaRepository<Employee,Long> {


}
