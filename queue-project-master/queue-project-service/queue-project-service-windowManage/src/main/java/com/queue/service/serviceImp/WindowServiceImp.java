package com.queue.service.serviceImp;

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
        result.setMessage("addWindow success");
        return result;
    }

    @Override
    public ResultBean modifyWindow(Window window) throws Exception {
        ResultBean result = new ResultBean();
        result.setData(windowMapper.updateWindow(window));
        result.setSuccess(true);
        result.setMessage("modifyWindow success");
        return result;
    }

    @Override
    public ResultBean deleteWindow(Window window) throws Exception {
        ResultBean result = new ResultBean();
        result.setData(windowMapper.deleteWindow(window));
        result.setSuccess(true);
        result.setMessage("deleteWindow success");
        return result;
    }
}