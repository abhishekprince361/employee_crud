package edu.ak.spring_boot_emp.control;

import edu.ak.spring_boot_emp.Entity.Employee;
import edu.ak.spring_boot_emp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository empRepo;

    @PostMapping("/emp")
    public String addEmp(@RequestBody Employee emp){
        empRepo.save(emp);
        return "Record Inserted";
    }
    @PostMapping("/emps")
    public String addMultipleEmp(@RequestBody List<Employee> empList){
        empRepo.saveAll(empList);
        return "All Records Inserted";
    }

    @GetMapping("/emp/{empId}")
    public Employee getEmpById(@PathVariable int empId){
        Optional<Employee> tempEmp = empRepo.findById(empId);
        return tempEmp.orElse(null);
    }
    @GetMapping("/emp/name/{name}")
    public List<Employee> getByName(@PathVariable String name){
        return empRepo.findByEmpName(name);
    }

    @GetMapping("/emp/salary")
    public int maxSalary(){
        return empRepo.findMaxSalary();
    }

    @GetMapping("/emps")
    public List<Employee> getAllEmp(){
        return empRepo.findAll();
    }

    @DeleteMapping("/emp/{empId}")
    public String deleteEmp(@PathVariable int empId){
        empRepo.deleteById(empId);
        return "Deleted";
    }

    @DeleteMapping("/emps")
    public String deleteAllEmp() {
        empRepo.deleteAll();
        return "All Records Deleted";
    }
    @PutMapping("/emp")
    public String updateEmp(@RequestBody Employee emp){
        empRepo.save(emp);
        return "Updated";
    }
}
