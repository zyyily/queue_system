package com.queue.service.serviceImp;

import com.queue.mapper.BusinessMapper;
import com.queue.pojo.Business;
import com.queue.service.BusinessService;
import com.queue.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImp implements BusinessService {
    @Autowired
    private BusinessMapper businessMapper;
    @Override
    public ResultBean getBusinessList(Business business) throws Exception {
        ResultBean resultBean = new ResultBean();
        resultBean.setDataList(businessMapper.selectBusiness(business));
        resultBean.setSuccess(true);
        resultBean.setMessage("selected business success");
        return resultBean;
    }

    @Override
    public ResultBean modifyBusiness(Business business) throws Exception {
        ResultBean resultBean = new ResultBean();
        resultBean.setData(businessMapper.updateBusiness(business));
        resultBean.setSuccess(true);
        resultBean.setMessage("modifyBusiness success");
        return resultBean;
    }

    @Override
    public ResultBean addBusiness(Business business) throws Exception {
        ResultBean resultBean = new ResultBean();
        resultBean.setData(businessMapper.insertBusiness(business));
        resultBean.setSuccess(true);
        resultBean.setMessage("insertBusiness success");
        return resultBean;
    }

    @Override
    public ResultBean deleteBusiness(Business business) throws Exception {
        ResultBean resultBean = new ResultBean();
        resultBean.setData(businessMapper.deleteBusiness(business));
        resultBean.setSuccess(true);
        resultBean.setMessage("deleteBusiness success");
        return resultBean;
    }
}
