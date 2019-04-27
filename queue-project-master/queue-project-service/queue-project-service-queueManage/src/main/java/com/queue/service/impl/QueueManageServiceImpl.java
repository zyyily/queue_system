package com.queue.service.impl;

import com.queue.mapper.QueueMapper;
import com.queue.pojo.Queues;
import com.queue.service.QueueManageService;
import com.queue.util.DateUtil;
import com.queue.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class QueueManageServiceImpl implements QueueManageService {
    @Autowired
    private QueueMapper queueMapper;
    @Override
    public ResultBean getQueueList(Queues queues) throws Exception {
        ResultBean resultBean=new ResultBean();
        List<Queues> queuesList=queueMapper.getQueueList(queues);
        resultBean.setSuccess(true);
        resultBean.setMessage("查找成功");
        resultBean.setDataList(queuesList);
        return resultBean;
    }

    @Override
    public ResultBean addQueue(Queues queues) throws Exception {
        ResultBean resultBean=new ResultBean();
        queues.setQueueNum(queueMapper.getQueueList(queues).size());
        Date date=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMDD");
        String dates=sdf.format(date);
        queues.setCreateTime(dates);
        List<Queues> queuesList=queueMapper.getQueueList(queues);
        if (queuesList==null||queuesList.size()==0)
            queues.setQueueNo(dates+"0001");
        else{
            queues.setQueueNo(DateUtil.getnumber(queuesList.get(queuesList.size()-1).getQueueNo()));
        }
        queues.setTransact(0);
        queueMapper.addQueue(queues);
        resultBean.setSuccess(true);
        resultBean.setMessage("预约成功");
        return resultBean;
    }

    @Override
    public ResultBean missTurnHandle(Queues queues) throws Exception {
        ResultBean resultBean=new ResultBean();
        queues.setTransact(0);
        queues.setQueueNum(1);

        return null;
    }
}
