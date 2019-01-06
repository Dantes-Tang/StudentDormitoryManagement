package com.dantes.StudentDormitoryManagement.biz.serviceImpl;

import com.dantes.StudentDormitoryManagement.biz.service.IAppFromService;
import com.dantes.StudentDormitoryManagement.dao.AppFromDao;
import com.dantes.StudentDormitoryManagement.model.AppFrom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppServiceImpl implements IAppFromService {
    @Autowired
    private AppFromDao appFromDao;

    @Override
    public List<AppFrom> getAppFromList() {
        return appFromDao.getAppFromList();
    }
}
