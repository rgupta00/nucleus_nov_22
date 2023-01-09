package com.config;

import com.demo.PhoneFormatter;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages={"com.demo"})
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 // Don't forget the ending "/" for location or you will hit 404.
	    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

    //default bean name must be "messageSource"
  /*  @Bean
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        return  messageSource;
    }
    @Bean(name = "validator")
    public LocalValidatorFactoryBean validate(){
        LocalValidatorFactoryBean localValidatorFactoryBean=new LocalValidatorFactoryBean();
        localValidatorFactoryBean.setValidationMessageSource(messageSource());
        return localValidatorFactoryBean;
    }

    @Override
    public Validator getValidator() {
        return  validate();
    }*/

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new PhoneFormatter());
    }
}