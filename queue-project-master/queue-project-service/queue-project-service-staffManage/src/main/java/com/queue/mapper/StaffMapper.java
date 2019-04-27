package com.queue.mapper;

import com.queue.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StaffMapper {

    List<Staff> getStaffList(Staff staff);

    void insertStaff(Staff staff);

    void deleteStaff(Staff staff);

    void updateStaff(Staff staff);
}
