
package com.nt.Runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class AlterServiceRunners implements CommandLineRunner {
	public AlterServiceRunners() {
		System.out.println("AlterServiceRunners:0_paran");
	}
	@Override
	public void run(String... args) throws Exception {
    System.out.println("AlterServiceRunners.run()");
    System.out.println("CMD line  Args are");
    for(String arg:args) {
    	System.out.println(arg);
    }
	}

}
