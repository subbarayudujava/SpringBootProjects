package com.nt.test;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nt.comtroller.RestSubbu;
import com.nt.comtroller.WelcomeService;

@WebMvcTest(value = RestSubbu.class)
public class RestControllerTest {

	@MockBean
	private WelcomeService service;

	@Autowired
	private MockMvc mockMvc;

	@Test
   void welcometest() throws Exception{
		 when(service.getWelcomemsg()).thenReturn("Welcome to naresh IT");
		 
		 MockHttpServletRequestBuilder requestBuilder=MockMvcRequestBuilders.get("/welcome");
		 
		 MvcResult mvcResult=mockMvc.perform(requestBuilder).andReturn();
		 
		 MockHttpServletResponse reponse=mvcResult.getResponse();
		 
		 int status=reponse.getStatus();
		
		 assertEquals(200,status);
	}
}
