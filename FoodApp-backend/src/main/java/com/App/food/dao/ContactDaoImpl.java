package com.App.food.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.food.model.Contact;

@Service
public class ContactDaoImpl{

    @Autowired
    ContactDao contactDao;

    public boolean saveMessage(Contact contact){
        contactDao.save(contact);
        return true;
    }
}
