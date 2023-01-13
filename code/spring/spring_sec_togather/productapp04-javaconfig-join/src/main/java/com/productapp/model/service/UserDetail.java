package com.productapp.model.service;

import com.productapp.model.dao.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//What is userdetailsservice is a interface u need to imp this as spring sec dont care about ur servlerr layer
@Service(value = "userdetail")
public class UserDetail implements UserDetailsService {

    private UserService userService;

    @Autowired
    public UserDetail(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        UserEntity user=null;
       try{
           user=userService.getUserByEmail(email);
       }catch (DataAccessException ex){
           ex.printStackTrace();
           //we are going to throw usernotfoundEx
           throw new UsernameNotFoundException("invalid login");
       }
       //We need to convert our user to the user that is undersand by spring spring sec
        //now what we need to do write a class that imp UserDetails and wrap my user !
        return new SecUser(user);
    }
}
