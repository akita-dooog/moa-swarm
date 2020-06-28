package com.akita.moa.desk.service;

import com.akita.moa.desk.model.App;

import java.util.List;

public interface AppService {
    List<App> listByUsername(String username);
}
