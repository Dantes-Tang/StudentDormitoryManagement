package com.dantes.StudentDormitoryManagement.dao;

import com.dantes.StudentDormitoryManagement.model.AppFrom;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AppFromDao {
    List<AppFrom> getAppFromList();
}
