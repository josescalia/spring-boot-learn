package org.josescalia.blog.simple.test.repository;

import org.josescalia.blog.simple.model.Author;
import org.josescalia.blog.simple.repository.AuthorRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by josescalia on 25/10/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = org.josescalia.blog.simple.test.ApplicationTest.class)
@Component
public class AuthorRepositoryTest {


    @Autowired
    private AuthorRepository authorRepository;


    @Before
    public void initAuthor(){
        Author author = new Author();
        author.setAuthorName("Josescalia");
        author.setAuthorAddress("Jakarta");
        authorRepository.save(author);
    }


    @Test
    public void testAuthorRepository(){
        System.out.println("Testing author repository");

        Assert.assertEquals(1, authorRepository.count());
        Assert.assertEquals("Josescalia",authorRepository.findOne((long) 1).getAuthorName());
    }
}
