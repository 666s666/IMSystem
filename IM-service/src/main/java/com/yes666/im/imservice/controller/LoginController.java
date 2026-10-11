package com.yes666.im.imservice.controller;

import com.yes666.im.DTO.LoginDTO;
import com.yes666.im.VO.LoginVO;
import com.yes666.im.imservice.service.LoginService;
import com.yes666.im.result.Result;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api")
@Slf4j
@Tag(name="用户登录接口" )
public class LoginController {
    @Autowired
    LoginService loginService;
    @PutMapping("/auth/register")
    public Result register(@RequestBody LoginDTO loginDTO){
       LoginVO login =  loginService.login(loginDTO);
        return Result.success(login);
    }
}
