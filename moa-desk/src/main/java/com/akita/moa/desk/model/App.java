package com.akita.moa.desk.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class App {

    @ApiModelProperty("应用名")
    private String appName;

    @ApiModelProperty("应用类型")
    private String typeName;

    @ApiModelProperty("徽章描述")
    private String badge;

    @ApiModelProperty("图标名称")
    private String icon;

    @ApiModelProperty("应用资源")
    private String uri;

    @ApiModelProperty("版本")
    private String version;
}
