package com.example.datawarehouse.service.serviceImpl;

import com.example.datawarehouse.model.ItemEntity;
import com.example.datawarehouse.repository.ItemRepository;
import com.example.datawarehouse.service.ItemService;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.rmi.ServerException;
import java.util.Optional;


@Component
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepo;

    @Override
    public ItemEntity saveItem(ItemEntity entity) throws ServerException
    {
        Optional<ItemEntity> itemEntity=itemRepo.findById(entity.getItemID());
        if(itemEntity.isPresent())
        {
            throw new ServerException("Item Already Exists");
        }
        return itemRepo.save(entity);

    }
}
