package com.hs.fmj_service.service.impl;

import com.hs.fmj.module.Store;
import com.hs.fmj_service.mapper.StoreMapper;
import com.hs.fmj_service.service.StoreService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 华生
 * 2020/12/11
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public int addStore(Store store) {
        return storeMapper.addStore(store);
    }

    @Override
    public List<Store> findAll() {
        return storeMapper.findAll();
    }

    @Override
    public List<Store> likeStoreName(String comName) {
        return storeMapper.likeStoreName(comName);
    }

    @Override
    public int deleteStoreById(Long id){
        return storeMapper.deleteStoreById(id);
    }

    @Override
    public int saveStore(Store store){
        return storeMapper.saveStore(store);
    }
}
