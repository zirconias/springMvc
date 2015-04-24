package com.springapp.domain.dao;

import com.springapp.domain.model.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by xirconias on 24/04/15.
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
