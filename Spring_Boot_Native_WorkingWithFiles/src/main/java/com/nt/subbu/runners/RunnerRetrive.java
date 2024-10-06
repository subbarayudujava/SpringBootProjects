package com.nt.subbu.runners;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.subbu.entity.PorsonDetails;
import com.nt.subbu.service.IPorsonInfoManage;

public class RunnerRetrive implements CommandLineRunner {
      @Autowired
      private IPorsonInfoManage infoManage;
	@SuppressWarnings("unused")
	@Override
	public void run(String... args) throws Exception {
       System.out.println("====================================");
       try {
		PorsonDetails info= infoManage.fetchPorsonDetails(3);
		   if(info!=null) {
			   System.out.print(info.getPid()+""+info.getPName()+info.getLdt());
			   byte[] photoContent=info.getPhoto();
			   OutputStream os=new FileOutputStream("retrve_photo.gif");
			   os.write(photoContent);
			   os.flush();
		       os.close();
		      System.out.print("photo retrive from the data base table");
		      char[] resumeContect=info.getResume();
		      Writer write=new FileWriter("retrive_resume.txt");
		      write.write(resumeContect);
		      write.flush();
		      write.close();
		   }//if
		   else {
			   System.out.print("record not Available");
		   }//else
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
      
	}//runners

}
