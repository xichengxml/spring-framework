package com.xicheng.demo.common;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String name = "default name";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
