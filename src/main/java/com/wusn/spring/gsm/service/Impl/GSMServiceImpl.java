package com.wusn.spring.gsm.service.Impl;

import com.wusn.spring.gsm.bean.entity.Response;
import com.wusn.spring.gsm.bean.entity.SmsInfo;
import com.wusn.spring.gsm.handler.GSMHandler;
import com.wusn.spring.gsm.service.GSMService;
import org.springframework.stereotype.Service;

@Service
public class GSMServiceImpl implements GSMService {

    private final GSMHandler gsmHandler;

    public GSMServiceImpl(GSMHandler gsmHandler) {
        this.gsmHandler = gsmHandler;
    }

    @Override
    public Response sentMessage(SmsInfo smsInfo) {
        return gsmHandler.sentMessage(smsInfo);
    }

}
