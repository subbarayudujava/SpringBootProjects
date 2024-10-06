package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component()
@Setter
@ToString
@ConfigurationProperties(prefix="org.nt")
public class Company {
 private String name;
 private String addrs;
 private Long Pincode;
 private Long contract;
}
