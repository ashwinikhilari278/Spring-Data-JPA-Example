package com.example.demo.Controller;

import com.example.demo.Entity.AccessCard;
import com.example.demo.Sevice.AccessCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessCardController {
    @Autowired
    AccessCardService accessCardService;

    @PostMapping("/saveaccesscard")
    public AccessCard saveAccessCard(@RequestBody AccessCard ac)
    {
        return accessCardService.saveAccessCard(ac);
    }
}
