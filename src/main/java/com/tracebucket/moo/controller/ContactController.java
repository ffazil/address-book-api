package com.tracebucket.moo.controller;

import com.tracebucket.moo.domain.Contact;
import com.tracebucket.moo.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

/**
 * @author FFL
 */
@Controller
public class ContactController {

    @Autowired
    private IContactService contactService;

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    @ResponseBody
    public List<Contact> findAll(){
        return contactService.findAll();
    }

    @RequestMapping(value = "/contact/{contact_id}", method = RequestMethod.GET)
    @ResponseBody
    public Contact fineOne(@PathVariable("contact_id") BigInteger id){
        return contactService.findOne(id);
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    @ResponseBody
    public Contact create(@RequestBody Contact contact){
        return contactService.create(contact);
    }

    @RequestMapping(value = "/contact", method = RequestMethod.PUT)
    @ResponseBody
    public Contact update(@RequestBody Contact contact){
        return contactService.update(contact);
    }

    @RequestMapping(value = "/contact/{contact_id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Boolean delete(@PathVariable("contact_id") BigInteger id){
        return contactService.delete(id);
    }

    @RequestMapping(value = "/contact/search", method = RequestMethod.GET)
    @ResponseBody
    public List<Contact> findByLastName(@RequestParam("last_name") String lastName){
        return contactService.findByLastName(lastName);
    }


}
