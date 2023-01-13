package com.productapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //hasAuthority("ROLE_ADMIN") vs hasRole("ADMIN")
       http.authorizeRequests()
               .antMatchers("/**").authenticated()
//               .antMatchers("/mgr/**").hasAnyRole("MGR")
//               .antMatchers("/emp/**").hasAnyRole("EMP")
               .and()
               .formLogin()
               .loginPage("/login").loginProcessingUrl("/checkme").usernameParameter("email").passwordParameter("password")
               .defaultSuccessUrl("/showall",true)
               .failureUrl("/login?error=true")
               .permitAll()
               .and()
               .exceptionHandling().accessDeniedPage("/403");
    }
}
