package com.wusn.spring.gsm.bean.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 短信信息。
 *
 * @author wusn
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmsInfo {

    @JsonProperty(value = "phone_num")
    String phoneNum;

    @JsonProperty(value = "message")
    String message;

}
