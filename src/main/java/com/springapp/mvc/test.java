package com.springapp.mvc;

import com.springapp.domain.service.ContactService;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by xirconias on 24/04/15.
 */
public class test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:mvc-dispatcher-servlet.xml");

        ContactService service = context.getBean("ContactService", ContactService.class);

        System.out.println(service.findById(1l));
    }
}
