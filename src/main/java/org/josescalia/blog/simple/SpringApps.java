package org.josescalia.blog.simple;

import org.josescalia.blog.simple.model.Author;
import org.josescalia.blog.simple.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by josescalia on 19/04/16.
 */
@Configuration
@ComponentScan(basePackages = {"org.josescalia.blog.simple"})
@EntityScan(basePackages = "org.josescalia.blog.simple.model")
@EnableJpaRepositories(basePackages = {"org.josescalia.blog.simple.repository"})
@EnableAutoConfiguration
public class SpringApps implements CommandLineRunner{


    @Autowired
    private AuthorRepository authorRepository;

    ApplicationContext context;

    public static void main(String[] args) throws IOException {
        SpringApplication application = new SpringApplication(SpringApps.class);
        application.setShowBanner(false);
        application.run(args);
    }

    private void getAuthor(){
        System.out.println(authorRepository == null);
        System.out.println(authorRepository.count());
    }


    public void run(String... strings) throws Exception {
        getAuthor();
    }
}
