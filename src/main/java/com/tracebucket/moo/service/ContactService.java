package com.tracebucket.moo.service;

import com.tracebucket.moo.domain.Contact;
import com.tracebucket.moo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

/**
 * @author FFL
 */
@Service("contactService")
public class ContactService implements IContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    @Override
    public Contact findOne(BigInteger id) {
        return contactRepository.findOne(id);
    }

    @Override
    public Contact create(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact update(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Boolean delete(BigInteger id) {
        Boolean status = false;
        contactRepository.delete(id);
        if(contactRepository.findOne(id) == null)
            status = true;
        return status;
    }

    @Override
    public Contact addContact(Contact contact) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Contact> findByLastName(String lastName) {
        return contactRepository.findByLastName(lastName);
    }
}
