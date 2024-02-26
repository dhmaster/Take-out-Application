package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
// 来自 lombok 库的注解，自动为这个类生成所有字段的 getter 方法、所有非 final 字段的 setter 方法、
// equals() 和 hashCode() 方法、toString()方法。
@ApiModel(description = "员工登录时传递的数据模型")
public class EmployeeLoginDTO implements Serializable {

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

}
