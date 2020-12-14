package com.hs.fmj_service.service;

import com.hs.fmj.module.Store;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 华生
 * 2020/12/11
 */
@Service
public interface StoreService {

    public int addStore(Store store);

    public List<Store> findAll();

    public List<Store> likeStoreName(String comName);

    public int deleteStoreById(Long id);

    public int saveStore(Store store);
}
