package com.queue.service;

import com.queue.pojo.Materials;
import com.queue.util.ResultBean;

public interface MaterialsService {
    ResultBean getMaterialsList(Materials materials)throws Exception;
    ResultBean addMaterial(Materials materials)throws Exception;
    ResultBean updateMaterial(Materials materials)throws Exception;
    ResultBean removeMaterial(Materials materials)throws Exception;
}
