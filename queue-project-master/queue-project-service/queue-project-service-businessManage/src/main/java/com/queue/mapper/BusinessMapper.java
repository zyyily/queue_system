package com.queue.mapper;

import com.queue.pojo.Business;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BusinessMapper {

    List<Business> selectBusiness(Business business) throws Exception;

    Integer updateBusiness(Business business) throws Exception;

    Integer insertBusiness(Business business) throws Exception;

    Integer deleteBusiness(Business business) throws Exception;

}
