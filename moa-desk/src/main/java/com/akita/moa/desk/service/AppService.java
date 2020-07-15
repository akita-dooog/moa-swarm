package com.akita.moa.desk.service;

import com.akita.moa.desk.model.App;
import com.akita.moa.security.MoaBaseService;

import java.util.List;

public interface AppService extends MoaBaseService {
    List<App> listByUsername();
}
