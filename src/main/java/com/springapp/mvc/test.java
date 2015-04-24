package com.springapp.mvc;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by xirconias on 24/04/15.
 */
public class test {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:mvc-dispatcher-servlet.xml");

    }
}
