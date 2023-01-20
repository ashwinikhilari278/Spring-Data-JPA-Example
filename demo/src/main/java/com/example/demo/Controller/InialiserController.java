package com.example.demo.Controller;

import com.example.demo.Entity.AccessCard;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Payslip;
import com.example.demo.Sevice.AccessCardService;
import com.example.demo.Sevice.EmpService;
import com.example.demo.Repository.payslipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class InialiserController {

    @Autowired
    EmpService empService;

    @Autowired
    AccessCardService accessCardService;


    @Autowired
    payslipRepo paysliprepo;
    @GetMapping("/initialisedata")
    public void initialiseData()
    {
        Employee e2=new Employee();
        Employee e1=new Employee();
        e1.setName("John");


        e2.setName("Jolly");

        AccessCard card1=new AccessCard();
        AccessCard card2=new AccessCard();
        card1.setIssuedData(new Date());
        card1.setEmployee(e1);
        card2.setIssuedData(new Date());
        card2.setEmployee(e2);
        e1.setCard(card1);
        e2.setCard(card2);



        Payslip p=new Payslip();
        p.setPayperioddate(new Date());
        p.setSalary(30000);
        Payslip p1=new Payslip();
        p1.setPayperioddate(new Date());
        p1.setSalary(40000);

        p.setEmployee(e2);
        p1.setEmployee(e2);
        e2.setPayslips(List.of(p,p1));
        empService.addEmployee(e1);
        empService.addEmployee(e2);
        accessCardService.saveAccessCard(card1);
        accessCardService.saveAccessCard(card2);
        //empService.addEmployee(e2);
        paysliprepo.save(p);
        paysliprepo.save(p1);


    }

}
