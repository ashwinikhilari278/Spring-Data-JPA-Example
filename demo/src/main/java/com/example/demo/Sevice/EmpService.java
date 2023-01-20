package com.example.demo.Sevice;

import com.example.demo.Repository.EmpRepo;
import com.example.demo.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService
{
    @Autowired
    EmpRepo empRepo;

    public List<Employee> getAll(int page, int size)
    {
        Pageable pagewithtworecords= PageRequest.of(page,size, Sort.by("name"));
       empRepo.findAll().stream().map(x->x.getPayslips()).forEach(System.out::println);
        return empRepo.findAll(pagewithtworecords).getContent();
    }
    public Employee addEmployee(Employee e)
    {

        return empRepo.save(e);
    }

    public Employee updateEmployeeName(long id,String name) {
        Employee e=empRepo.getById(id);
        e.setName(name);
        return empRepo.save(e);
    }

    public Employee getEmployee(long id)
    {
      return   empRepo.findById(id).get();
    }
}
