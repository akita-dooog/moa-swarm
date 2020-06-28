package com.akita.moa;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

public class MyJavaTypeResolverImpl extends JavaTypeResolverDefaultImpl {

    public MyJavaTypeResolverImpl() {
        super();
        // tinyint 映射为 Integer类型
        super.typeMap.put(Types.BIT, new JdbcTypeInformation("BIT", new FullyQualifiedJavaType(Integer.class.getName())));
    }
}
