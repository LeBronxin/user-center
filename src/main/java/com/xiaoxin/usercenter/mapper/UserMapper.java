package com.xiaoxin.usercenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoxin.usercenter.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version 1.0
 * @authpr 陈鑫
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
