package com.App.food.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.food.model.Food;

import java.util.List;

@Service
public class FoodDaoImpl {

    @Autowired
    private FoodDao foodDao;


    public List<Food> getFoodList(){
        List<Food> food;
        food = foodDao.findAll();
        return food;
    }

    public Food validateFoodInfo(String productId){
        Food food = null;
        food = foodDao.findById(productId).get();
        return food;
    }
}

