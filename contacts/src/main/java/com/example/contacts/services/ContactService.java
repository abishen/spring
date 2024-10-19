package com.example.contacts.services;

import com.example.contacts.Contact;
import com.example.contacts.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public List<Contact> GetAllContact() {
        return repository.findAll();
    }

    public Contact GetContactBy(Long id) {
        return repository.findById(id).get();
    }
    public Contact GetContactBy(Contact contact) {
        Example<Contact> example = Example.of(contact);
        Contact contactData = repository.findOne(example).get();
        return contactData;
    }
}
