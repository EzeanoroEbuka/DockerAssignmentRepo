package com.gasdetectionregisterydata.dokerpractice.controller;

import com.gasdetectionregisterydata.dokerpractice.models.User;
import com.gasdetectionregisterydata.dokerpractice.models.Wallet;
import com.gasdetectionregisterydata.dokerpractice.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private MyService myService;

    @PostMapping("/create/user")
    public ResponseEntity<?> createUser(User user ) {
        return new ResponseEntity<>(myService.createUser(user), HttpStatus.CREATED);

    }

    @PostMapping("/create/wallet")
    public ResponseEntity<?> createWallet(Wallet wallet ) {
        return new ResponseEntity<>(myService.createWallet(wallet), HttpStatus.CREATED);

    }
}
