package com.tracebucket.moo.test.repository;

import com.tracebucket.moo.domain.Contact;
import com.tracebucket.moo.domain.User;
import com.tracebucket.moo.repository.ContactRepository;
import com.tracebucket.moo.test.config.ApplicationTestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * @author FFL
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class })
@ContextConfiguration(classes  = {ApplicationTestConfig.class})
public class ContactRepositoryTest {

    @Autowired
    private ContactRepository contactRepository;

    @Test
    public void testFindAll(){
        List<Contact> contacts = contactRepository.findAll();
        Assert.assertNotNull(contacts);
    }

    @Test
    public void testCreate(){
        Contact contact = new Contact("Firoz", "F", "Fazil");
        //contact.setUser(new User("test", "test"));
        contact.setBirthDay(new Date());
        contact = contactRepository.save(contact);
        System.out.println(contact.getId());
    }

    @Test
    public void testFindOne(){
        Contact contact = contactRepository.findOne(new BigInteger("24895735388168133615130329449"));
        System.out.println("Contact = " + contact.getFirstName());
    }


}
