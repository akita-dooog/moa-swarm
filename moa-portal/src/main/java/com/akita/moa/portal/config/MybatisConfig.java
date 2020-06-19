package com.akita.moa.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.akita.moa.mapper", "com.akita.moa.portal.dao"})
public class MybatisConfig {
}
