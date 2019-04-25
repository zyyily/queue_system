package com.queue.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.queue.pojo.Materials;
import com.queue.service.MaterialsService;
import com.queue.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materialsManage")
public class MaterialsController {
    @Autowired
    private MaterialsService materialsService;

    @RequestMapping(value = "/getMaterialsList", method = RequestMethod.POST)
    public ResultBean getMaterialsList(@RequestBody String params) throws Exception {
        Materials materials = JSON.parseObject(params, new TypeReference<Materials>() {
        });
        return materialsService.getMaterialsList(materials);
    }

    @RequestMapping(value = "/addMaterial", method = RequestMethod.POST)
    public ResultBean addMaterial(@RequestBody String params) throws Exception {
        Materials materials = JSON.parseObject(params, new TypeReference<Materials>() {
        });

        return materialsService.addMaterial(materials);
    }

    @RequestMapping(value = "/updateMaterial", method = RequestMethod.POST)
    public ResultBean upadteMaterial(@RequestBody String params) throws Exception {
        Materials materials = JSON.parseObject(params, new TypeReference<Materials>() {
        });

        return materialsService.updateMaterial(materials);
    }

    @RequestMapping(value = "/removeMaterial", method = RequestMethod.POST)
    public ResultBean removeMaterial(@RequestBody String params) throws Exception {
        Materials materials = JSON.parseObject(params, new TypeReference<Materials>() {
        });

        return materialsService.removeMaterial(materials);
    }
}
