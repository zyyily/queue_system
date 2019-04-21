package com.queue.service.ServiceImp;

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
    public ResultBean getWindowList(Window window) throws Exception{
        ResultBean resultBean = new ResultBean();
        resultBean.setDataList(windowMapper.selectAllWindow(window));
        resultBean.setSuccess(true);
        resultBean.setMessage("selected success");
        return resultBean;
    }

    @Override
    public ResultBean modifyWindow(Window window) {
        return null;
    }
}
