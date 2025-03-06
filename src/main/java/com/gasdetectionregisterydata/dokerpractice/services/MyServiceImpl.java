package com.gasdetectionregisterydata.dokerpractice.services;

import com.gasdetectionregisterydata.dokerpractice.models.User;
import com.gasdetectionregisterydata.dokerpractice.models.Wallet;
import com.gasdetectionregisterydata.dokerpractice.repositories.UserRepository;
import com.gasdetectionregisterydata.dokerpractice.repositories.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private WalletRepository walletRepository;

    @Override
    public User createUser(User user) {
        User newUser = new User();  
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        userRepository.save(newUser);
        return newUser;
    }

    @Override
    public Wallet createWallet(Wallet wallet) {
        Wallet newWallet = new Wallet();
        newWallet.setAccountNumber(wallet.getAccountNumber());
        newWallet.setPassword(wallet.getPassword());
        walletRepository.save(newWallet);
        return newWallet;
    }
}
