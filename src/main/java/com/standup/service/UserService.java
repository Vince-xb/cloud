package com.standup.service;

import com.standup.mapper.CloudUserMapper;
import com.standup.model.CloudUser;
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
