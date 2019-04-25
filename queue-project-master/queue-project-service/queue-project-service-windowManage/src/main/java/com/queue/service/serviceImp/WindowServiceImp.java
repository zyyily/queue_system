package com.queue.service.serviceImp;

import com.queue.mapper.BusinessMapper;
import com.queue.pojo.Business;
import com.queue.pojo.Window;
import com.queue.mapper.WindowMapper;
import com.queue.service.WindowService;
import com.queue.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WindowServiceImp implements WindowService {

    @Autowired
    private WindowMapper windowMapper;
    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public ResultBean getWindowList(Window window) throws Exception {
        ResultBean resultBean = new ResultBean();
        resultBean.setDataList(windowMapper.selectWindow(window));
        resultBean.setSuccess(true);
        resultBean.setMessage("selected window success");
        return resultBean;
    }

    @Override
    public ResultBean addWindow(Window window) throws Exception {
        ResultBean result = new ResultBean();
        result.setData(windowMapper.insertWindow(window));
        result.setSuccess(true);
        result.setMessage("add success");
        return result;
    }

    @Override
    public ResultBean modifyWindow(Window window) throws Exception {
        ResultBean result = new ResultBean();
        result.setData(windowMapper.updateWindow(window));
        result.setSuccess(true);
        result.setMessage("update success");
        return result;
    }

    @Override
    public ResultBean deleteWindow(Window window) throws Exception {
        ResultBean result = new ResultBean();
        result.setData(windowMapper.deleteWindow(window));
        result.setSuccess(true);
        result.setMessage("delete success");
        return result;
    }

    @Override
    public ResultBean getBusinessList(Business business) throws Exception {
        ResultBean result = new ResultBean();
        result.setDataList(businessMapper.selectBusiness(business));
        result.setSuccess(true);
        result.setMessage("selected business success");
        return result;
    }
}
