package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("comp")
@Data
@ConfigurationProperties(prefix = "org.nt")
//@PropertySource(value ="classpath:foo.yml",factory=YamlPropertySourcefactory.class)
                                              //this is user define yml file configuration
             
@Profile({"uat","prod"})          
public class Employee {
	//simple property
	private Integer eno;
	private String ename;
	//Array Types
	private String[] favcolors;
	//collections types
	private List<String> nicknames;
	private Set<Long> phoneNumbers;
	private Map<String, Object> idDetails;
	//has-A relation
	private Company company;
}
