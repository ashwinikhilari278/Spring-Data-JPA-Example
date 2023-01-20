package com.example.demo.Sevice;

import com.example.demo.Repository.AccesscardRepo;
import com.example.demo.Entity.AccessCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessCardService {
    @Autowired
    AccesscardRepo accesscardRepo;


    public AccessCard saveAccessCard(AccessCard ac)
    {

        return accesscardRepo.save(ac);
    }
}
