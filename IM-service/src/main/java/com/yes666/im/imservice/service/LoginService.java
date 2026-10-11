package com.yes666.im.imservice.service;

import com.yes666.im.DTO.LoginDTO;
import com.yes666.im.VO.LoginVO;

public interface LoginService {
    LoginVO login(LoginDTO loginDTO);
}
