package com.wusn.spring.gsm.controller;

import com.wusn.spring.gsm.bean.entity.Response;
import com.wusn.spring.gsm.bean.entity.SmsInfo;
import com.wusn.spring.gsm.service.GSMService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Objects;

@Slf4j
@RestController
public class GSMController {

    GSMService gsmService;

    public GSMController(GSMService gsmService) {
        this.gsmService = gsmService;
    }

    @Value("${spring.gsm.token.key}")
    private String tokenKey;

    @Value("${spring.gsm.token.value}")
    private String tokenValue;

    /**
     * 发送短信。
     *
     * @param smsInfo 短信
     * @return 发送响应
     */
    @PostMapping("/sent-message")
    public Response sentMessage(
            HttpServletRequest request,
            @RequestBody SmsInfo smsInfo
    ) {
        if (Objects.equals(tokenValue, request.getHeader(tokenKey))) {
            return gsmService.sentMessage(smsInfo);
        } else {
            return new Response(
                    smsInfo.getPhoneNum(),
                    smsInfo.getMessage(),
                    new Date(),
                    false,
                    "接口认证失败！"
            );
        }
    }

}
