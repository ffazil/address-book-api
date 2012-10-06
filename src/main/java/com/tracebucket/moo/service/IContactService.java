package com.tracebucket.moo.service;

import com.tracebucket.moo.domain.Contact;

import java.util.List;

/**
 * @author FFL
 */
public interface IContactService {
    public List<Contact> findAll();
    public Contact findOne(Long id);
    public Contact create(Contact contact);
    public Contact update(Contact contact);
    public Boolean delete(Long id);
    public Contact addContact(Contact contact);
    public List<Contact> findByLastName(String lastName);

}
