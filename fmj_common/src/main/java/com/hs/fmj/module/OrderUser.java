package com.hs.fmj.module;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 华生
 * 2020/12/11
 */
@Data
@ApiModel(value = "订单用户实体")
@TableName("order_user")
public class OrderUser {

    @ApiModelProperty(value = "id")
    @TableId(type = IdType.AUTO)
    private Long orderId;

    @ApiModelProperty(value = "用户姓名")
    @TableField
    private String orderUserName;

    @ApiModelProperty(value = "用户账号")
    @TableField
    private String orderUserUsername;

    @ApiModelProperty(value = "用户手机号")
    @TableField
    private String orderUserPhone;

}
