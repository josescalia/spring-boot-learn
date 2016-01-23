package org.josescalia.blog.simple.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;

/**
 * Created by josescalia on 25/10/15.
 */
@Configuration
@ComponentScan(basePackages = {"org.josescalia.blog.simple"})
@EntityScan(basePackages = "org.josescalia.blog.simple.model")
@EnableJpaRepositories(basePackages = {"org.josescalia.blog.simple.repository"})
//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@EnableTransactionManagement
//@PropertySource("classpath:application-test.properties")
public class ApplicationTest {

    @Autowired
    private ConfigurableApplicationContext context;

    public static void main(String[] args) throws IOException {
        ApplicationTest test = new ApplicationTest();
        test.getContext();
    }

    public void getContext(){
        this.context = SpringApplication.run(ApplicationTest.class);
    }
}
