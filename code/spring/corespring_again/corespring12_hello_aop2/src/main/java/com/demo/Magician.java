package com.demo;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Hero is the main entity we'll be using to . . .
 *
 * Please see the {@link com.demo.Magician} class for true identity
 * @author Captain America
 *
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@interface Foo{

}
@Foo
@Component(value = "m")
public class Magician {

    /**
     * <p>This is a simple description of the method. . .
     * <a href="http://www.supermanisthegreatest.com">Superman!</a>
     * </p>
     * @return the amount of health hero has after attack
     * @see <a href="http://www.link_to_jira/HERO-402">HERO-402</a>
     * @since 1.0
     */
    public String doMagic(){
        System.out.println("abra ka dabra...");
        return "rabbit from the hat";
    }
}
