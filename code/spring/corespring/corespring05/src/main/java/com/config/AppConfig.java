package com.config;

import com.demo.Car;
import com.demo.Metro;
import com.demo.Passanger;
import com.demo.Vehical;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.demo"})
public class AppConfig {
    @Bean(name = "p")
    public Passanger getPassanger(Vehical vehical){
        Passanger passanger=new Passanger();
        passanger.setName("raj");
        passanger.setVehical(vehical);
        return passanger;
    }
    @Primary
    @Bean
    public Vehical getVehical1(){
        Vehical vehical=new Metro();
        return vehical;
    }

    @Bean
    public Vehical getVehical2(){
        Vehical vehical=new Car();
        return vehical;
    }
}
