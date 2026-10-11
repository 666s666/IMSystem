package com.yes666.im.imservice.service.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.yes666.im.DTO.LoginDTO;
import com.yes666.im.VO.LoginVO;
import com.yes666.im.imservice.mapper.LoginMapper;
import com.yes666.im.imservice.service.LoginService;
import org.apache.catalina.Loader;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;
    @Override
    public LoginVO login(LoginDTO loginDTO) {
        LoginVO login = new LoginVO();
        BeanUtils.copyProperties(login,loginDTO);
        loginMapper.save(loginDTO);
        String uuId = UUID.randomUUID().toString();
        login.setUid(uuId);
        return login;
    }
}
