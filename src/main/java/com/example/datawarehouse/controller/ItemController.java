package com.example.datawarehouse.controller;


import com.example.datawarehouse.model.ItemEntity;
import com.example.datawarehouse.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerException;

@RestController
@RequestMapping("/item")

public class ItemController {

    private static final Logger LOGGER=(Logger) LoggerFactory.getLogger(ItemController.class);

    @Autowired
    ItemService itemService;

    @PostMapping(name= "/create", consumes = "application/json")
    public ResponseEntity<ItemEntity> addItem(@RequestBody ItemEntity itemEntity) throws ServerException
    {
    LOGGER.info("Inside ItemController Save");
    return new ResponseEntity<ItemEntity>(itemService.saveItem(itemEntity), HttpStatus.CREATED);
    }



}

