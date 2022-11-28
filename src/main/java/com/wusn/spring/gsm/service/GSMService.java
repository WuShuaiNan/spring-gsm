package com.wusn.spring.gsm.service;

import com.wusn.spring.gsm.bean.entity.Response;
import com.wusn.spring.gsm.bean.entity.SmsInfo;

/**
 * GSM短信发送服务。
 *
 * @author wusn
 * @since 1.0.0
 */
public interface GSMService {

    /**
     * 发送短信。
     *
     * @param smsInfo 短信
     * @return 发送响应
     */
    Response sentMessage(SmsInfo smsInfo);

}
