package com.deepexi.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.test.domain.eo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> findList(@Param("eo")  User eo);

    int deleteByIds(Integer ... pks);
}
