package com.itheima.sms.dto;

import com.itheima.sms.entity.BlackListEntity;
import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * 黑名单
 */
@Data
@ApiModel(description = "黑名单")
public class BlackListDTO extends BlackListEntity {

}
