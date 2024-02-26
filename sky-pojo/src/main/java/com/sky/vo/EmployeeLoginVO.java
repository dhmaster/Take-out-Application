package com.sky.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
// 来自 lombok 库，这个注解会为类生成一个内部的Builder类。
// Builder模式是一种常用的设计模式，用于构造一个复杂对象。
@Builder
@Data
// 来自 Lombok，它会为类生成一个无参构造函数。
@NoArgsConstructor
// 来自 Lombok，为类生成一个包含所有字段作为参数的构造函数。
@AllArgsConstructor
// 来自 Swagger 库，这个注解用于给API的模型（实体类）添加额外的信息。
@ApiModel(description = "员工登录返回的数据格式")
public class EmployeeLoginVO implements Serializable {
    // 来自 Swagger 库，这个注解用于字段级别，为模型的属性添加元数据信息（如描述）
    @ApiModelProperty("主键值")
    private Long id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("jwt令牌")
    private String token;

}
