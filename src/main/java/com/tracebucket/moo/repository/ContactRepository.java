package com.tracebucket.moo.repository;

import com.tracebucket.moo.domain.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author FFL
 */

public interface ContactRepository extends MongoRepository<Contact, Long>{
    public List<Contact> findByLastName(String lastName);
}
