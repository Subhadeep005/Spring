package com.jlcindia.spring.domain;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Jlcconfig {
	@Bean
	public List<String> emails() {
		// System.out.println("List");
		List<String> emails = new ArrayList<String>();
		emails.add("aa@jlc.com");
		emails.add("bb@jlc.com");
		emails.add("cc@jlc.com");
		return emails;
	}

	@Bean
	public Set<Long> phones() {
		// System.out.println("Set");
		Set<Long> phones = new LinkedHashSet<Long>();
		phones.add(11111L);
		phones.add(22222L);
		phones.add(33333L);
		return phones;
	}

	@Bean(name = "refs")
	public Map<String, Long> references() {
		// System.out.println("refs");
		Map<String, Long> refs = new LinkedHashMap<String, Long>();
		refs.put("AA", 11L);
		refs.put("BB", 22L);
		refs.put("CC", 33L);
		return refs;
	}

	@Bean(name = "myprops")
	public Properties myProperties() {
		// System.out.println("props");
		Properties props = new Properties();
		props.put("AA", 11);
		props.put("BB", 22);
		props.put("CC", 33);
		return props;
	}

	@Bean
	public Address address() {
		// System.out.println("call Address");
		return new Address("Bangalore", "Mathikere", "KA");
	}

	@Bean
	public Account account1() {
		// System.out.println("Call acc-1");
		Account acc1 = new Account();
		acc1.setAccno(11);
		acc1.setAtype("SA");
		acc1.setBal(100000.0);
		return acc1;
	}

	@Bean(name = "accounts")
	public List<Account> accounts() {
		// System.out.println("List acc");
		List<Account> accounts = new ArrayList<Account>();
		Account acc2 = new Account();
		// System.out.println("Call acc-2");
		acc2.setAccno(12);
		acc2.setAtype("FD");
		acc2.setBal(20000.0);

		accounts.add(account1());
		accounts.add(acc2);
		return accounts;
	}

	@Bean(name = "cust")
	public Customer customer(Address add) {
		// System.out.println("customer--" + add);
		Customer cust = new Customer(101, "Sri", "sri@jlc.com", 9999L);
		cust.setAddress(add);
		return cust;
	}
}
