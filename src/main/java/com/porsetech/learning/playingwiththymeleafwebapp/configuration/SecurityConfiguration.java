package com.porsetech.learning.playingwiththymeleafwebapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/** Configuration. */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests().antMatchers("/").permitAll();
    }

    /**Not used testing.*/
    public void justChecking() {

        String name;
        String unusedVariable;
        Sting misspelledType;
        if (name.equals("wererwe")) {
            String.format("This will throw an NPE, let's see if it catches ist");
        }

    }

}
