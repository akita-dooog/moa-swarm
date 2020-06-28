package com.akita.moa.desk.service.impl;

import com.akita.moa.desk.dao.AppDao;
import com.akita.moa.desk.model.App;
import com.akita.moa.desk.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceImpl implements AppService {
    @Autowired
    private AppDao appDao;

    @Override
    public List<App> listByUsername(String username) {
        return appDao.listByUsername(username);
    }
}
