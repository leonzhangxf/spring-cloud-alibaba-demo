# spring cloud alibaba demo

## 内容

主要介绍cloud-alibaba中的Nacos,sentinel,dubbo,cloud-stream-rocket-binder,

基于阿里云服务的ANS（命名服务/注册中心），ACM（配置管理），OSS（对象存储），SMS（短信服务），
SchedulerX（计划任务）将不做介绍

## 依赖版本

- spring-cloud
    - Greenwich.SR4
- spring-boot
    - 2.1.11.RELEASE
- spring-cloud-alibaba 
    - 2.1.0.RELEASE
    - https://spring-cloud-alibaba-group.github.io/github-pages/greenwich/spring-cloud-alibaba.html


## 使用

### Nacos

https://nacos.io/en-us/docs/quick-start-docker.html

https://github.com/nacos-group/nacos-docker.git

使用`standalone-mysql.yaml`文件启动Nacos

注意：

> 官方`standalone-mysql.yaml`文件配置存在错误，Nacos连接的mysql master和slave应该为同一端口，官方配置错误