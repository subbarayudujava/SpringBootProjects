package com.nt.Runners;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class SMS implements ApplicationRunner {
      public SMS() {
    	  System.out.println("SMS Runners");
      }
	@Override
	public void run(ApplicationArguments args) throws Exception {
       System.out.println("SMS Runners.runners()");
       System.out.println("non_optional args:"+args.getNonOptionArgs());
       System.out.println("optional args:"+args.getOptionNames());
       System.out.println("optional args value:"+args.getOptionValues("key1"));
       System.out.println("Alloptional args:"+Arrays.toString(args.getSourceArgs()));
	}

}
