package com.example.demo.Controller;

import com.example.demo.Entity.Employee;
import com.example.demo.Sevice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmpService empService;

    @GetMapping("/getall")
    public List<Employee> getAll(@Param("page")  int page, @Param("size") int size)
    {
        return empService.getAll(page,size);
    }

    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody  Employee e)
    {
        return empService.addEmployee(e);
    }

    @RequestMapping ( value = "/updateemployeename/{id}",method = RequestMethod.PUT)
    public Employee updateEmployeeName(@PathVariable long id, @RequestParam String name)
    {
        return empService.updateEmployeeName(id,name);
    }


}
