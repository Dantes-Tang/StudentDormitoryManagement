package com.dantes.StudentDormitoryManagement.dao;

import com.dantes.StudentDormitoryManagement.model.AppFrom;
import org.apache.ibatis.annotations.Mapper;

//@Repository
@Mapper
public interface AppFromDao {
    AppFrom getAppFromList();
}
