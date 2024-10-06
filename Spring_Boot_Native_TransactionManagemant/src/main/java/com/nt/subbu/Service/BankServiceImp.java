package com.nt.subbu.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.subbu.repository.IAccountRepository;

import jakarta.transaction.Transactional;
@Service("bank")
public class BankServiceImp implements IBankService {
      @Autowired 
      private  IAccountRepository accountRepository;
	@Override
	@Transactional
	public String transvererMoney(long srcAcoNo, long destAcoNo, double amount) {
		    Integer int1=  accountRepository.withdrawMoney(srcAcoNo, amount);
		    Integer int2=accountRepository.depositeAmount(destAcoNo, amount);
		    if(int1==0 || int2==0) {
		    	throw new RuntimeException("amount not there");
		    	}
		return "transver the Money"+srcAcoNo+"to"+destAcoNo+"amount"+amount;
	}

}
