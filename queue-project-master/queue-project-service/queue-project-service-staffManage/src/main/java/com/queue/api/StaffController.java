package com.queue.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.queue.pojo.Staff;
import com.queue.service.StaffService;
import com.queue.util.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staffManage")
public class StaffController {

    @Autowired
    private StaffService staffService;

    private Logger logger= LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/getStaffList",method = RequestMethod.POST)
    public ResultBean getStaffList(@RequestBody String params) throws Exception {
        logger.info("查询员工参数："+params);
        Staff staff= JSON.parseObject(params,new TypeReference<Staff>(){});
        return staffService.getStaffList(staff);
    }

    @RequestMapping(value = "/insertStaff",method = RequestMethod.POST)
    public ResultBean insertStaff(@RequestBody String params) throws Exception {
        logger.info("添加员工参数："+params);
        Staff staff= JSON.parseObject(params,new TypeReference<Staff>(){});
        return staffService.insertStaff(staff);
    }

    @RequestMapping(value = "/updateStaff",method = RequestMethod.POST)
    public ResultBean updateStaff(@RequestBody String params) throws Exception {
        logger.info("修改员工参数："+params);
        Staff staff= JSON.parseObject(params,new TypeReference<Staff>(){});
        return staffService.updateStaff(staff);
    }

    @RequestMapping(value = "/deleteStaff",method = RequestMethod.POST)
    public ResultBean deleteStaff(@RequestBody String params) throws Exception {
        logger.info("删除员工参数："+params);
        Staff staff= JSON.parseObject(params,new TypeReference<Staff>(){});
        return staffService.deleteStaff(staff);
    }

}
