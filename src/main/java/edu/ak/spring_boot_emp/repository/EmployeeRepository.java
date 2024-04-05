package edu.ak.spring_boot_emp.repository;

import edu.ak.spring_boot_emp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByEmpName(String name);

    @Query("select max(e.empSalary) from Employee e")
    int findMaxSalary();
}
