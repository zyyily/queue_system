package com.queue.mapper;

import com.queue.pojo.Materials;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Component
@Mapper
public interface MaterialsMapper {
    List<Materials> getMaterialsList(Materials materials) throws Exception;

    void addMaterial(Materials materials) throws Exception;

    void updateMaterial(Materials materials) throws Exception;

    void removeMaterial(Materials materials) throws Exception;
}
