package com.example.datawarehouse.service;

import com.example.datawarehouse.model.ItemEntity;
import org.springframework.stereotype.Service;

import java.rmi.ServerException;


@Service
public interface ItemService {

    ItemEntity saveItem(ItemEntity entity) throws ServerException;

}
