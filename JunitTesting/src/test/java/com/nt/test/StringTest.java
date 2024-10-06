package com.nt.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import com.nt.calculate.StringUtiles;

public class StringTest {
   @Test
   public void stringtotesr() {
	   StringUtiles stringutiles=new  StringUtiles();
	   
	   assertThrows(IllegalArgumentException.class, ()->stringutiles.stringToInt(null));
   }
   @Test
   public void stringtotesr1() {
	   StringUtiles stringutiles=new  StringUtiles();
	   
	   assertThrows(IllegalArgumentException.class, ()->stringutiles.stringToInt(""));
   }
   @Test
   public void stringtotesr2() {
	   StringUtiles stringutiles=new  StringUtiles();
	       Integer int1 = stringutiles.stringToInt("10");
	       assertEquals(( Integer)10, int1);
   }
}
