# spring-gsm

- 基于 springboot 的gsm短信发送模块。

## 一、实现原理
- 本模块分为硬件、软件两部分。
- 硬件可使用“信泰微电子SIM900A模块”或“正点原子SIM900C模块”，其他模块暂未进行适配，如有需要可提issue。
- 软件采用 springboot 作为后台，通过 232、485、ttl 等串口，操作SIM900A或SIM800C模块发送GSM短信。
- java操作串口我采用的是 JSerialComm 而非过时的 RXTXComm，感谢 hedgecrw 所做的贡献！

## 二、使用方法
### 1.项目打包运行
- 克隆项目后请运行命令 `mvn clean package` 进行打包，把打出来的war包放到Tomcat等web容器中即可正常运行。

### 2.发送短信
#### (1) 通过 Dubbo 调用微服务发送短信
- 利用 Dubbo 调用 GSMService 的 sendMessage 方法即可发送短信。
#### (2) 通过 WebService 接口发送短信
- URL地址：http://localhost:8080/spring-gsm/sent-message
- 请求类型：Post
- 请求头认证信息(认证信息需和 application.properties 配置的一致)：
```json
{
    "Authentication": ""
}
```
- 请求体：
```json
{
    "phone_num": "",
    "message": ""
}
```

## 三、TODO
- 实现利用AT控制SIM900A、SIM800C发送短信。
- 增加消息队列、多线程、多终端自动连接等功能。
  - 目前项目处于硬件通信技术测试阶段，后续会对大流量情景进行功能支持和测试。
