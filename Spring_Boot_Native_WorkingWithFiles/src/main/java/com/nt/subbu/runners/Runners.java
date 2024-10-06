package com.nt.subbu.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.subbu.entity.PorsonDetails;
import com.nt.subbu.service.IPorsonInfoManage;
@Component
public class Runners implements CommandLineRunner {
	@Autowired
	private IPorsonInfoManage infoManage;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the porson name:");
		String name = sc.nextLine();
		System.out.print("enter the DOB(yyyy-mm-ddThh:mm:ss:)");
		String dob = sc.nextLine();
		System.out.print("is the Porson is married:");
		boolean ms = sc.nextBoolean();
		System.out.print("Enter the Photo file poth:");
		String photoPoth = sc.next().trim();
		System.out.print("enter the resume file poth:");
		String resumepoth = sc.next().trim();
		
		//converting string data values into localdatetime  class obj 
		
		LocalDateTime ldt=LocalDateTime.parse(dob);
		
		//prepaireing  byte[] from the Photo content 
		File file1=new File(photoPoth);
		@SuppressWarnings("resource")
		FileInputStream fi1= new FileInputStream(file1);
		byte[] photoContent=new byte[(int) file1.length()];
		fi1.read(photoContent);
		
		//preparing char[] of resume of content
		File file2=new File(resumepoth);
		FileReader fr=new FileReader(file2);
		char[] resumecontent=new char[(int) file2.length()];
		fr.read(resumecontent);
		//carete entity  class object 
		PorsonDetails parson=new PorsonDetails();
		parson.setPName(name);
		parson.setLdt(ldt);
		parson.setMarried(ms);
		parson.setPhoto(photoContent);
		parson.setResume(resumecontent);
		
		try {
			System.out.print(infoManage.registerPorsonDetails(parson));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//runners

}//class
