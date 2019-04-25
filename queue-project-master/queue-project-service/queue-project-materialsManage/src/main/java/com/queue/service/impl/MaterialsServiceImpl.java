package com.queue.service.impl;

import com.queue.mapper.MaterialsMapper;
import com.queue.pojo.Materials;
import com.queue.service.MaterialsService;
import com.queue.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.crypto.RsaMd5CksumType;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class MaterialsServiceImpl implements MaterialsService {
    @Autowired
    private MaterialsMapper materialsMapper;

    @Override
    public ResultBean getMaterialsList(Materials materials) throws Exception {
        ResultBean resultBean = new ResultBean();
        List<Materials> materialsList = materialsMapper.getMaterialsList(materials);
        resultBean.setDataList(materialsList);
        resultBean.setSuccess(true);
        resultBean.setMessage("查询成功");
        return resultBean;
    }

    @Override
    public ResultBean addMaterial(Materials materials) throws Exception {
        ResultBean resultBean = new ResultBean();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        materials.setCreateTime(sdf.format(date));
        materialsMapper.addMaterial(materials);
        resultBean.setSuccess(true);
        resultBean.setMessage("添加成功");
        return resultBean;
    }

    @Override
    public ResultBean updateMaterial(Materials materials) throws Exception {
        ResultBean resultBean = new ResultBean();
        materialsMapper.updateMaterial(materials);
        resultBean.setSuccess(true);
        resultBean.setMessage("修改成功");
        return resultBean;
    }

    @Override
    public ResultBean removeMaterial(Materials materials) throws Exception {
        ResultBean resultBean = new ResultBean();
        materialsMapper.removeMaterial(materials);
        resultBean.setSuccess(true);
        resultBean.setMessage("删除成功");
        return resultBean;
    }
}
