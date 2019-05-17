# java-spring-cloud-gateway-sentinel-nacos
java-spring-cloud-gateway-sentinel-nacos


https://github.com/alibaba/Sentinel
https://github.com/alibaba/Sentinel/wiki/主流框架的适配#api-gateway-适配
# 首先搭建基础环境
需要以下两个
nacos

sentinel

这里，直接使用docker [https://github.com/foxiswho/docker-nacos-sentinel-rocketmq-rabbitmq][https://github.com/foxiswho/docker-nacos-sentinel-rocketmq-rabbitmq]

`docker-compose.yml` 里 docker 比较多，可以把不需要的给删除或注释掉


# gateway 
全局异常

https://www.cnblogs.com/yinjihuan/p/10474774.html


# gateway-sentinel-demo
Spring Cloud Gateway Sentinel

整合Gateway和Sentinel，返回值是JSON，支持Sentinel控制台


部分介绍
https://www.cnblogs.com/yinjihuan/p/10772558.html

浏览器访问
http://localhost:8080/github?vipType=1



浏览器访问
http://localhost:8080/article

http://localhost:8080/blog/xxxx

# gateway-sentinel-demo-002
整合Gateway Sentinel nacos Feign，返回值是JSON，支持Sentinel控制台

Feign 说明 
https://github.com/spring-cloud-incubator/spring-cloud-alibaba/wiki/Sentinel


浏览器访问
http://localhost:18080/article

# sentinel-demo
官方案例 限流控制
