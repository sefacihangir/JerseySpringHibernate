package com.rajesh.galla.config;

import com.rajesh.galla.bo.UserDetailsBO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by rajeshgalla on 7/7/15.
 */
@ImportResource("classpath:applicationContext.xml")
public class BOConfig {

    @Bean
    UserDetailsBO userDetailsBO() {

        return new UserDetailsBO();
    }
}
