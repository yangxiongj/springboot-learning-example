# springboot-learning-example
spring boot 实践学习案例，是 spring boot 初学者及核心技术巩固的最佳实践。

# 推荐 springcloud-learning-example
[spring cloud 实践学习案例](https://github.com/JeffLi1993/springcloud-learning-example)<br>
https://github.com/JeffLi1993/springcloud-learning-example

## Spring For All 社区
[Spring For All 社区](http://www.spring4all.com/ "spring4all")是新组建的关于 Spring 的纯技术交流社区（涵盖 Spring Boot、Spring Cloud 等内容），集诸多开源爱好者和技术大牛贡献内容和交流问题。我们不夸大、不装逼、做最纯粹的技术分享！！！

看看我们超强的群众基础，欢迎有兴趣的朋友加入QQ群分享与交流：

Spring For All 社区 ① 365234583（满）<br>
Spring For All 社区 ② 123013854（满）<br>
Spring For All 社区 ③ 290714704（满）<br>
Spring For All 社区 ④ 112133511（满）<br>
Spring For All 社区 ⑤ 157525002（满）<br>
Spring For All 社区 ⑥ 564840207<br>
Spring For All 社区 ⑦ 470962790（满）<br>
Spring For All 社区 ⑧ 613456104（满）<br>
Spring For All 社区 ⑨ 534583667<br>
Spring For All 社区 ⑩ 210742970 （满）<br>
Spring For All 社区 ⑪ 517395240 <br>
Spring For All 社区 ⑫ 498098401 <br>

博主微信：139-5868-6678

## 一、项目结构
「Spring Boot 那些事」：[传送门](http://www.bysocket.com/?page_id=1639 "Spring Boot 那些事")<br>

#### a. 『 基础 - 入门篇 』
- springboot-helloworld<br>
 [《Spring Boot 之 HelloWorld 详解》](http://www.bysocket.com/?p=1124 "Spring Boot 之 HelloWorld详解")<br>
- springboot-properties <br>
 [《Spring Boot 之配置文件详解》](http://www.bysocket.com/?p=1786 "Spring Boot 之配置文件详解")<br>

#### b. 『 基础 - Web 业务开发篇 』
- springboot-restful <br>
 [《Springboot 实现 Restful 服务，基于 HTTP / JSON 传输》](http://www.bysocket.com/?p=1627 "Springboot 实现 Restful 服务，基于 HTTP / JSON 传输")<br>
 [《Spring Boot 之 RESRful API 权限控制》](http://www.bysocket.com/?p=1080 "Spring Boot 之 RESRful API 权限控制")<br>
- springboot-freemarker <br>
[《Spring Boot 集成 FreeMarker 详解案例》](http://www.bysocket.com/?p=1666 "Spring Boot 集成 FreeMarker 详解案例")<br>
- springboot-validation-over-json
[《Spring Boot HTTP over JSON 的错误码异常处理》](http://www.bysocket.com/?p=1692 "Spring Boot HTTP over JSON 的错误码异常处理")<br>


#### c. 『 基础 – 数据存储篇 』
- springboot-mybatis <br>
 [《Springboot 整合 Mybatis 的完整 Web 案例》](http://www.bysocket.com/?p=1610 "Springboot 整合 Mybatis 的完整 Web 案例")<br>
- springboot-mybatis-annotation <br>
 [《Spring Boot 整合 Mybatis Annotation 注解的完整 Web 案例》](http://www.bysocket.com/?p=1811 "Spring Boot 整合 Mybatis Annotation 注解的完整 Web 案例")<br>
- springboot-mybatis-mutil-datasource <br>
 [《Spring Boot 整合 Mybatis 实现 Druid 多数据源详解》](http://www.bysocket.com/?p=1712 "Spring Boot 整合 Mybatis 实现 Druid 多数据源详解")<br>


#### d. 『 基础 – 数据缓存篇 』
- springboot-mybatis-redis <br>
 [《Spring Boot 整合 Redis 实现缓存操作》](http://www.bysocket.com/?p=1756 "Spring Boot 整合 Mybatis 实现 Druid 多数据源详解")<br>
- springboot-mybatis-redis-annotation <br>
 [《Spring Boot 注解实现整合 Redis 作为缓存》](http://www.bysocket.com/?p=1756 "Spring Boot 整合 Mybatis 实现 Druid 多数据源详解")<br>

#### e. 『 其他篇 』
- springboot-elasticsearch <br>
 [《Spring Boot 整合 Elasticsearch，实现 function score query 权重分查询》](http://www.bysocket.com/?p=1829 "Spring Boot 整合 Elasticsearch，实现 function score query 权重分查询")<br>
- springboot-dubbo-server <br>
- springboot-dubbo-client <br>
Dubbo 服务提供者工程和 Dubbo 服务消费者工程 <br>
 [《Springboot 整合 Dubbo/ZooKeeper 详解 SOA 案例》](http://www.bysocket.com/?p=1681 "Springboot 整合 Dubbo/ZooKeeper 详解 SOA 案例")<br>
 [《Spring Boot 中如何使用 Dubbo Activate 扩展点》](http://www.bysocket.com/?p=1782 "Spring Boot 中如何使用 Dubbo Activate 扩展点")<br>


#### 『 Spring Data ES 篇 』
- spring-data-elasticsearch-crud <br>
 [《Spring Data Elasticsearch - 基本案例》](http://spring4all.com/article/70 "Spring Data Elasticsearch - 基本案例")<br>
- spring-data-elasticsearch-query <br>
spring-data-elasticsearch - 实战案例详解

## 二、项目 Quick Start 快速开发指南
#### a. 基本环境配置
在 MySQL 中，创建数据库 springbootdb：
````
CREATE DATABASE springbootdb;
````
创建表 city 城市 (因为我喜欢徒步)
````
DROP TABLE IF EXISTS  `city`;
CREATE TABLE `city` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号',
  `province_id` int(10) unsigned  NOT NULL COMMENT '省份编号',
  `city_name` varchar(25) DEFAULT NULL COMMENT '城市名称',
  `description` varchar(25) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
````
插入基础数据
````
INSERT city VALUES (1 ,1,'温岭市','BYSocket 的家在温岭。');
````
 <br>
 
### 《 springboot-mybatis 工程 Quick Start 》
首先 check 基本环境配置完成，创建好数据库和表。

#### 1. 修改数据库配置
配置文件地址：springboot-mybatis/src/main/resources/application.properties
修改相应的数据源配置，比如账号、密码等

#### 2. 编译工程
在项目根目录 `springboot-learning-example`，运行 maven 指令：
````
mvn clean install
````
#### 3. 运行工程
右键运行工程包中 `org.spring.springboot.Application` Spring Boot 应用启动类的 main 函数，然后在浏览器访问：
`````
http://localhost:8080/api/city?cityName=温岭市
`````
可以看到返回的 JSON 结果：
````
{
    "id": 1,
    "provinceId": 1,
    "cityName": "温岭市",
    "description": "我的家在温岭。"
}
````
最后，<br/>

推荐
 [《Spring Boot教程与Spring Cloud教程》](https://git.oschina.net/didispace/SpringBoot-Learning "Spring Boot教程与Spring Cloud教程")<br>


## springboot-SpringSecurity0  

包含两部分代码：

* 第一是  博客 springboot+mybatis＋SpringSecurity 实现用户角色数据库管理   地址：http://blog.csdn.net/u012373815/article/details/54632176

* 第二是  博客 springBoot+springSecurity验证密码MD5加密  地址：http://blog.csdn.net/u012373815/article/details/54927070

## springboot-SpringSecurity1  

*  博客 springBoot+springSecurity 数据库动态管理用户、角色、权限（二）   地址：http://blog.csdn.net/u012373815/article/details/54633046

## springboot-SpringSecurity2

*  博客  springboot+security restful权限控制官方推荐（五）   地址：http://blog.csdn.net/u012373815/article/details/59749385

## springboot-SpringSecurity3

*  博客  springBoot+springSecurity 动态管理Restful风格权限（三） 地址：http://blog.csdn.net/u012373815/article/details/55225079  

## springboot-SpringSecurity4
* 实战，项目中正在用

## springboot-WebSocket  

包含三部分代码,三部分代码有交合:

* 第一是  博客 spring boot ＋WebSocket 广播式（一）地址：http://blog.csdn.net/u012373815/article/details/54375195  中所示代码

* 第二是  博客 spring boot ＋WebSocket 广播式（二）地址：http://blog.csdn.net/u012373815/article/details/54377937   中所示代码
 
* 第三是  博客 spring boot ＋WebSocket（三） 点对点式 地址： http://blog.csdn.net/u012373815/article/details/54380476  中所示代码



## springboot-Cache

包含两部分代码：

* 第一部分是 博客 springboot的缓存技术 地址： http://blog.csdn.net/u012373815/article/details/54564076  

* 第二部分是 博客 springboot缓存篇（二）－redis 做缓存 地址：http://blog.csdn.net/u012373815/article/details/54572687

## springboot-Cache2

* 是  博客  springboot缓存 之 GuavaCacheManager   地址：http://blog.csdn.net/u012373815/article/details/60468033

## springboot-shiro

* 是博客  springboot集成shiro 实现权限控制   地址：http://blog.csdn.net/u012373815/article/details/57532292

## springboot-swagger-ui
* 博客 spring boot ＋Swagger-ui 自动生成API文档 地址： https://blog.csdn.net/u012373815/article/details/82685962


##未完待续。。。

# Spring Boot 学习教程，示例代码

**spring-boot-limit**
[	Spring Boot 中使用 分布式应用限流实践](http://www.ymq.io/2018/08/16/redis-lua/)
 
**spring-boot-mongodb**
[Spring Boot 中使用 MongoDB 增删改查](http://www.ymq.io/2018/02/05/spring-boot-mongodb-example/)

**spring-boot-rocketmq**
[Spring Boot 中使用 RocketMQ](http://www.ymq.io/2018/02/02/spring-boot-rocketmq-example/)

**spring-boot-redis**
[Spring Boot 中使用 Redis](http://www.ymq.io/2017/10/16/redis-jedis-spring-boot-example/)

**spring-boot-rabbitmq**
[Spring Boot 中使用 RabbitMQ](http://www.ymq.io/2017/10/26/rabbitmq-spring-boot-example/)

**spring-boot-kafka**
[Spring Boot 中使用 kafka](http://www.ymq.io/2017/10/17/kafka-spring-boot-example/)

**spring-boot-solr-cloud**
[Spring Boot 中使用 SolrCloud](http://www.ymq.io/2017/10/18/solr-cloud-spring-boot-example/)

**spring-boot-mybatis**
[Spring Boot 中使用 MyBatis 整合 Druid 多数据源](http://www.ymq.io/2017/10/20/mybatis-spring-boot-example/)

**spring-boot-dubbo**
[Spring Boot 中使用 Dubbo 详解](http://www.ymq.io/2017/10/27/dubbo-spring-boot-example/)

**spring-boot-swagger**
[Spring Boot 中使用 swagger  笔记未更新 ]()

**spring-boot-logback**
[Spring Boot 中使用 logback  配置 ](http://www.ymq.io/2017/10/30/spring-boot-logback-example/)

**spring-boot-elasticsearch**
[Spring Boot 中使用 elasticsearch  笔记未更新 ]()

**spring-boot-elasticsearch-demo**
[Spring Boot 中使用 Java API 调用 Elasticsearch](http://www.ymq.io/2017/11/06/ElasticSearch-example/)

**spring-boot-lucene-demo**
[Spring Boot 中使用 Java API 调用 lucene](http://www.ymq.io/2017/11/06/lucene-example/)

# Contact

 - 作者：鹏磊  
 - 出处：[http://www.ymq.io](http://www.ymq.io)  
 - Email：[admin@souyunku.com](admin@souyunku.com)  
 - GitHub：[https://github.com/souyunku](https://github.com/souyunku)  
 - Segment Fault：[https://segmentfault.com/u/souyunku](https://segmentfault.com/u/souyunku)  
 - 版权归作者所有，转载请注明出处
 - Wechat：关注公众号，搜云库技术团队，专注于开发技术的研究与知识分享
 
![关注公众号-搜云库](http://www.ymq.io/images/souyunku.png "搜云库技术团队")
