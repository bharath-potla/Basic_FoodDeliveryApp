package com.App.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.App.food.dao.ContactDaoImpl;
import com.App.food.model.Contact;

@RestController
@CrossOrigin
public class ContactController {

    @Autowired
    ContactDaoImpl contactDao;

    @PostMapping("/contact")
    public boolean contactUs(@RequestBody Contact contact, Model model){
        return contactDao.saveMessage(contact);
    }
}
