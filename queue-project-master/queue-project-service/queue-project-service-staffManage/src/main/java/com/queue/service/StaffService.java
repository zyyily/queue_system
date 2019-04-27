package com.queue.service;

import com.queue.pojo.Staff;
import com.queue.util.ResultBean;

public interface StaffService {
    ResultBean getStaffList(Staff staff)throws Exception;
    ResultBean updateStaff(Staff staff)throws Exception;
    ResultBean insertStaff(Staff staff)throws Exception;
    ResultBean deleteStaff(Staff staff) throws Exception;
}
