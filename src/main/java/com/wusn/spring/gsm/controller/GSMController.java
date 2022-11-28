package com.wusn.spring.gsm.controller;

import com.wusn.spring.gsm.bean.entity.Response;
import com.wusn.spring.gsm.bean.entity.SmsInfo;
import com.wusn.spring.gsm.service.GSMService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GSMController {

    GSMService gsmService;

    public GSMController(GSMService gsmService) {
        this.gsmService = gsmService;
    }

    /**
     * 发送短信。
     *
     * @param smsInfo 短信
     * @return 发送响应
     */
    @PostMapping("/sent-message")
    public Response sentMessage(
            @RequestBody SmsInfo smsInfo
    ) {
        return gsmService.sentMessage(smsInfo);
    }

}
