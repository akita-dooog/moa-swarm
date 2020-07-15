package com.akita.moa.govern.service;

import com.akita.moa.model.GmsUser;
import com.akita.moa.security.MoaBaseService;

import java.util.List;

public interface UserService extends MoaBaseService {
    List<GmsUser> incList(String datetime);
}
