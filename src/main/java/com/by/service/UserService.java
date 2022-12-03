package com.by.service;

import com.by.mapper.CloudUserMapper;
import com.by.model.CloudUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author macbookpro
 */
@Service
public class UserService {

    @Resource
    private CloudUserMapper cloudUserMapper;

    public CloudUser getUser(int userId){
        return cloudUserMapper.selectByPrimaryKey(userId);
    }
}
