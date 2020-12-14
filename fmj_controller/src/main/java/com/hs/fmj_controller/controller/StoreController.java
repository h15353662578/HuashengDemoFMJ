package com.hs.fmj_controller.controller;

import com.hs.fmj.module.Store;
import com.hs.fmj_service.service.StoreService;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 华生
 * 2020/12/12
 */
@RestController
@RequestMapping("/store")
public class StoreController {

    @Reference
    private StoreService storeService;

    @ApiOperation("/查询全部")
    @GetMapping("/findAll")
    public List<Store> findAll(){
        return storeService.findAll();
    }

    @ApiOperation("/新增商品")
    @PutMapping("/addStore")
    public int addStore(@RequestBody Store store){
        return storeService.addStore(store);
    }

    @ApiOperation("/模糊查询商品首字母")
    @GetMapping("/likeStoreName")
    public List<Store> likeStoreName(@RequestBody String comName){
        return storeService.likeStoreName(comName);
    }

    @ApiOperation("/根据id删除")
    @DeleteMapping("/deleteStoreById")
    public int deleteStoreById(Long id){
        return storeService.deleteStoreById(id);
    }

    @ApiOperation("/修改商品")
    @PostMapping("/saveStore")
    public int saveStore(@RequestBody Store store){
        return storeService.saveStore(store);
    }
}
