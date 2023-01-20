package com.example.demo.Entity;

import com.example.demo.Entity.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Payslip  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date payperioddate;
    private Date payperiodenddate;
    private float salary;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Payslip{" +
                "id=" + id +
                ", payperioddate=" + payperioddate +
                ", payperiodenddate=" + payperiodenddate +
                ", salary=" + salary +

                '}';
    }

    public Date getPayperioddate() {
        return payperioddate;
    }

    public void setPayperioddate(Date payperioddate) {
        this.payperioddate = payperioddate;
    }

    public Date getPayperiodenddate() {
        return payperiodenddate;
    }

    public void setPayperiodenddate(Date payperiodenddate) {
        this.payperiodenddate = payperiodenddate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Payslip(long id, Date payperioddate, Date payperiodenddate, float salary) {
        this.id = id;
        this.payperioddate = payperioddate;
        this.payperiodenddate = payperiodenddate;
        this.salary = salary;
    }

    public Payslip() {
    }
}
