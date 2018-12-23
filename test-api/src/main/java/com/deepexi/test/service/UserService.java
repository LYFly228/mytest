package com.deepexi.test.service;

import com.deepexi.util.pageHelper.PageBean;
import com.deepexi.test.domain.eo.User;
import java.util.*;

public interface UserService{

    PageBean<User> findPage(User eo,Integer page, Integer size);

    List<User> findAll(User eo);

    User detail(Integer  pk);

    Object update(Integer  pk,User eo);

    Object create(User eo);

    Object delete(Integer ... pk);
}