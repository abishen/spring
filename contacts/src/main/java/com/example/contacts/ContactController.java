package com.example.contacts;

import com.example.contacts.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService service;


    @GetMapping("/contacts")
    List<Contact> all() {
        return service.GetAllContact();
    }

    @RequestMapping(value="/contacts/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Contact getContact(@PathVariable("id") Long id) {

        return service.GetContactBy(id);
    }

    @RequestMapping(value="/contacts/filter/{firstName}", method = RequestMethod.GET)
    public @ResponseBody
    Contact getContact(@PathVariable("firstName") String firstName) {
        Contact findContact = new Contact();
        findContact.setFirstName(firstName);
        return service.GetContactBy(findContact);
    }

}
