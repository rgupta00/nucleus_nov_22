package com.demo3;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
final public class Foo {
	
	private String message;

	private Bar bar;

	//Application context and ObjectFactory<Bar>
	
	@Autowired
	public void setBar(Bar bar) {
		this.bar = bar;
	}
	@Value("foo message")
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("message : " + message);
		System.out.println(getBar().getValue());
	}
	@Lookup
	 public Bar getBar() {
		return null;
	}

	
	
}

