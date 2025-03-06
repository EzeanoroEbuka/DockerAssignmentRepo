package com.gasdetectionregisterydata.dokerpractice.services;

import com.gasdetectionregisterydata.dokerpractice.models.User;
import com.gasdetectionregisterydata.dokerpractice.models.Wallet;

public interface MyService {
    
    User createUser(User user);
    Wallet createWallet(Wallet wallet);
    
}
