package com.deepexi.test.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.deepexi.test.service.UserService;
import com.deepexi.test.domain.eo.User;
import com.deepexi.test.extension.ApplicationException;
import com.deepexi.test.extension.AppRuntimeEnv;
import com.deepexi.test.mapper.UserMapper;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import javax.ws.rs.core.Response;

@Component
@Service(version = "${demo.service.version}")
public class UserServiceImpl implements UserService{

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AppRuntimeEnv appRuntimeEnv;

    public PageBean findPage(User eo,Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userMapper.findList(eo);
        return new PageBean<>(list);
    }

    public List<User> findAll(User eo) {
        List<User> list = userMapper.findList(eo);
        return list;
    }

    public User detail(Integer  pk){
        return userMapper.selectById(pk);
    }

    public Object create(User eo) {
        return userMapper.insert(eo);
    }

    public Object update(Integer  pk,User eo) {
        eo.setId(pk);
        return userMapper.updateById(eo);
    }

    public Object delete(Integer ... pk) {
userMapper.deleteByIds(pk);
        return true;
    }

}