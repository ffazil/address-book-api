package com.tracebucket.moo.service;

import com.tracebucket.moo.domain.Contact;

import java.math.BigInteger;
import java.util.List;

/**
 * @author FFL
 */
public interface IContactService {
    public List<Contact> findAll();
    public Contact findOne(BigInteger id);
    public Contact create(Contact contact);
    public Contact update(Contact contact);
    public Boolean delete(BigInteger id);
    public Contact addContact(Contact contact);
    public List<Contact> findByLastName(String lastName);

}
