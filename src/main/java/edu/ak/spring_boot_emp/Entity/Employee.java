package edu.ak.spring_boot_emp.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


import java.sql.Date;


@Entity
@Table(name = "employee")
public class Employee {

//  @Column
//  @GeneratedValue
    @Id
    private int empId;
    private String empName;
    private int empAge;
    private double empSalary;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dob;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public Date getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName +
                ", empAge=" + empAge +
                ", empSalary=" + empSalary +
                ", dob=" + dob +
                '}';
    }
}
