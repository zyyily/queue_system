package com.queue.service;

import com.queue.pojo.Business;
import com.queue.util.ResultBean;

public interface BusinessService {
    ResultBean getBusinessList(Business business) throws Exception;

    ResultBean modifyBusiness(Business business) throws Exception;

    ResultBean addBusiness(Business business) throws Exception;

    ResultBean deleteBusiness(Business business) throws Exception;
}
