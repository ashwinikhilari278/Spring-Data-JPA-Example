package com.example.demo.Repository;

import com.example.demo.Entity.Payslip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface payslipRepo extends JpaRepository<Payslip,Long> {
}
