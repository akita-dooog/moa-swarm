package com.akita.moa.desk.dao;

import com.akita.moa.desk.model.App;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AppDao {
    List<App> listByUsername(String username);
}
