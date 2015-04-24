package com.springapp.domain.service;

import com.springapp.domain.model.Contact;

import java.util.List;

/**
 * Created by xirconias on 24/04/15.
 */
public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    Contact save(Contact contact);
}
