package com.example.demo.Repository;

import com.example.demo.Entity.AccessCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccesscardRepo extends JpaRepository<AccessCard,Long>{

}
