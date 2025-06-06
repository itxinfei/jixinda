<!-- 项目标题与徽章 -->
<div align="center">

  # 💬 集信达短信平台  
  **企业级短信统一管理解决方案**  
  *实现短信服务高效对接、智能通道管理、多业务场景适配*

  <!-- 技术栈滚动徽章 -->
  <div style="white-space: nowrap; overflow-x: auto; padding: 10px 0;">
    <img alt="后端框架" src="https://img.shields.io/badge/后端-Spring%20Cloud%20+%20MyBatis--Plus-orange">
    <img alt="数据库" src="https://img.shields.io/badge/数据库-MySQL%20+%20Redis-blueviolet">
    <img alt="中间件" src="https://img.shields.io/badge/中间件-RabbitMQ%20+%20Nacos-yellowgreen">
    <img alt="部署环境" src="https://img.shields.io/badge/部署-Docker%20+%20Sentinel-lightgrey">
  </div>
</div>

---

## 🌐 在线体验  
[演示地址](https://jxd.itheima.net/#/login)  
👉 推荐使用Chrome浏览器访问，测试账号：`admin/123456`

![输入图片说明](assets/%E5%8A%9F%E8%83%BD%E7%BB%93%E6%9E%84%E5%9B%BE-1605840544382.png)

---

## 📌 项目概述  

### 1.1 背景挑战  
随着企业短信业务规模扩大，传统方案面临以下痛点：
- **对接复杂**：多个服务需重复接入短信通道
- **稳定性差**：通道异常时无法自动切换
- **统计困难**：缺乏集中式发送数据统计分析

### 1.2 解决方案  
集信达短信平台通过三大核心能力解决企业痛点：

✅ **统一接入**：提供标准化SDK/API  
✅ **智能路由**：支持动态通道选举机制  
✅ **全链路监控**：从发送到接收的全流程追踪

![整体架构图](assets/1605854246868.png)

### 1.3 架构设计  
#### 技术架构全景  
![技术架构全景图](assets/2020-08-05_5f2a6b10f361d.png)

#### 核心服务拆分  
| 服务模块       | 端口  | 核心功能                     |
|----------------|-------|------------------------------|
| pd-sms-manage  | 8770  | 后台管理服务（签名/模板管理）|
| pa-sms-api     | 8771  | 短信接收服务（API网关）      |
| pd-sms-server  | 8772  | 短信发送服务（通道调度）     |

---
### 🔗 项目链接 & 社区支持  
![微信公众号二维码](docs/心飞为你飞.jpg)  
🚀 项目地址：[https://gitee.com/itxinfei/jixinda](https://gitee.com/itxinfei/jixinda)  
👥 QQ交流群：[661543188](https://qm.qq.com/cgi-bin/qm/qr?k=gNgch-wCkfUu-QbI7DZSudrax2BN7vY0&jump_from=webapi&authKey=QHSRnxQvu+h5S3AXGn/DSHrVPiFQAYEk6bSlCE1lS276SFjQAUagV4FG7bHf0OSM)  
📧 邮箱支持：[747011882@qq.com](http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&email=f0hLSE9OTkdHTT8ODlEcEBI)  

