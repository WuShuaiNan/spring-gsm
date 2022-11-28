package com.wusn.spring.gsm.handler;

import com.wusn.spring.gsm.bean.entity.Response;
import com.wusn.spring.gsm.bean.entity.SmsInfo;

public interface GSMHandler {

    /**
     * 发送短信。
     *
     * @param smsInfo 短信
     * @return 发送响应
     */
    Response sentMessage(SmsInfo smsInfo);

}
