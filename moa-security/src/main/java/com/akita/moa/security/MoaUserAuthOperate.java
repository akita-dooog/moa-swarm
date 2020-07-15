package com.akita.moa.security;

import java.util.List;

public interface MoaUserAuthOperate {
    List getSourcesByAuthKey(MoaAuthKey authKey);
}
