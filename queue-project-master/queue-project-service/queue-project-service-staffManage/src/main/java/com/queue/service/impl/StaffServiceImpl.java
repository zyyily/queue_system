package com.queue.service.impl;

import com.queue.mapper.StaffMapper;
import com.queue.pojo.Staff;
import com.queue.service.StaffService;
import com.queue.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;


    @Override
    public ResultBean getStaffList(Staff staff) throws Exception {
        ResultBean resultBean=new ResultBean();
        List<Staff> staffs=staffMapper.getStaffList(staff);
        resultBean.setDataList(staffs);
        resultBean.setMessage("查找成功");
        resultBean.setSuccess(true);
        return resultBean;
    }

    @Override
    public ResultBean updateStaff(Staff staff) throws Exception {
        ResultBean resultBean=new ResultBean();
        staffMapper.updateStaff(staff);
        resultBean.setMessage("修改成功" );
        resultBean.setSuccess(true);
        return resultBean;
    }

    @Override
    public ResultBean insertStaff(Staff staff) throws Exception {
        ResultBean resultBean =new ResultBean();
        staffMapper.insertStaff(staff);
        resultBean.setSuccess(true);
        resultBean.setMessage("添加成功");
        return resultBean;
    }

    @Override
    public ResultBean deleteStaff(Staff staff) throws Exception {
        ResultBean resultBean=new ResultBean();
        staffMapper.deleteStaff(staff);
        resultBean.setMessage("删除成功" );
        resultBean.setSuccess(true);
        return resultBean;
    }
}
