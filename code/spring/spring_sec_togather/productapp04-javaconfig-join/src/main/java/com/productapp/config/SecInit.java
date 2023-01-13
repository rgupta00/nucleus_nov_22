package com.productapp.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
//Dont apply any annoation
//spring give u grente if if u craete  a class by extending
//AbstractSecurityWebApplicationInitializer spring sec config delegatingFilterProxy under the hood
public class SecInit extends AbstractSecurityWebApplicationInitializer {
}
