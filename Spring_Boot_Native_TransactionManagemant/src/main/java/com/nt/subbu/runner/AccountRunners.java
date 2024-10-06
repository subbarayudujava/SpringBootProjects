package com.nt.subbu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.subbu.Service.IBankService;

public class AccountRunners implements CommandLineRunner {
      @Autowired
      private IBankService bankService;
	@Override
	public void run(String... args) throws Exception {
		try {
			String msg= bankService.transvererMoney(101, 102, 80000.0);
    System.out.print(msg);
		} catch (Exception e) {
		    System.out.print("Amount not transevr");

			e.printStackTrace();
		}
	}

}
