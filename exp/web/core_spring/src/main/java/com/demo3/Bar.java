package com.demo3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bar {
	private String time= LocalDateTime.now().toString();
	private int temp=new Random().nextInt(60);


	public String getValue() {
		return (time+ " : " + temp);
	}

}
