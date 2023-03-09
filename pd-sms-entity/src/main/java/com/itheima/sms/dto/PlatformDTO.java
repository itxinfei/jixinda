package com.itheima.sms.dto;

import com.itheima.sms.entity.PlatformEntity;
import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * 配置表
 */
@Data
@ApiModel(description = "接入平台")
public class PlatformDTO extends PlatformEntity {

}
