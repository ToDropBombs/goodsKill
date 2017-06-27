# 前言
   本demo为仿购物秒杀网站,该系统分为用户注册登录、秒杀商品管理模块。 前端页面基于bootstrap框架搭建，并使用bootstrap-validator插件进行表单验证。 此项目整体采用springMVC+RESTFUL风格，持久层使用的是mybatis。使用maven模块化设计，并可根据环境加载不同的数据源配置文件，数据库密码采用AES加密保护。采用dubbo+zookeeper实现服务分布式部署及调用。集成了支付宝支付功能（详见service模块），用户完成秒杀操作成功之后即可通过二维码扫码完成支付（本demo基于支付宝沙箱环境）。
 
## 技术选型

### 后端技术:
技术 | 名称 | 官网
----|------|----
Spring Framework | 容器  | [http://projects.spring.io/spring-framework/](http://projects.spring.io/spring-framework/)
SpringMVC | MVC框架  | [http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#mvc](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#mvc)
MyBatis | ORM框架  | [http://www.mybatis.org/mybatis-3/zh/index.html](http://www.mybatis.org/mybatis-3/zh/index.html)
MyBatis Generator | 代码生成  | [http://www.mybatis.org/generator/index.html](http://www.mybatis.org/generator/index.html)
PageHelper | MyBatis物理分页插件  | [http://git.oschina.net/free/Mybatis_PageHelper](http://git.oschina.net/free/Mybatis_PageHelper)
Druid | 数据库连接池  | [https://github.com/alibaba/druid](https://github.com/alibaba/druid)
ZooKeeper | 分布式协调服务  | [http://zookeeper.apache.org/](http://zookeeper.apache.org/)
Dubbo | 分布式服务框架  | [http://dubbo.io/](http://dubbo.io/)
Redis | 分布式缓存数据库  | [https://redis.io/](https://redis.io/)
ActiveMQ | 消息队列  | [http://activemq.apache.org/](http://activemq.apache.org/)
Log4J | 日志组件  | [http://logging.apache.org/log4j/1.2/](http://logging.apache.org/log4j/1.2/)
Protobuf & json | 数据序列化  | [https://github.com/google/protobuf](https://github.com/google/protobuf)
Jenkins | 持续集成工具  | [https://jenkins.io/index.html](https://jenkins.io/index.html)
Maven | 项目构建管理  | [http://maven.apache.org/](http://maven.apache.org/)
Gradle | 项目构建工具 | [https://gradle.org/](https://gradle.org/)
SonarQube | 项目代码质量监控 | [https://www.sonarqube.org/](https://www.sonarqube.org/)
Swagger2 | 项目API文档生成及测试工具 | [http://swagger.io/](http://swagger.io/)
### 前端技术:
技术 | 名称 | 官网
----|------|----
jQuery | 函式库  | [http://jquery.com/](http://jquery.com/)
Bootstrap | 前端框架  | [http://getbootstrap.com/](http://getbootstrap.com/)
### API接口
![image](https://github.com/techa03/learngit/blob/techa03-patch-1/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20170623222039.png)

### 页面展示
![image](https://github.com/techa03/learngit/blob/techa03-patch-1/QQ%E6%88%AA%E5%9B%BE20170315174408.png)

### sonarQube代码质量管理平台
![image](https://github.com/techa03/learngit/blob/techa03-patch-1/QQ%E6%88%AA%E5%9B%BE20170627205739.png)

#### 项目启动方法：

1.参照redis官网安装redis，默认端口启动activemq，zookeeper；

2.在service模块中找到GoodsKillRpcServiceApplication类main方法启动远程服务；

3.编译好整个项目后使用tomcat发布server模块，上下文环境可自定义；

#### 编译部署注意事项：
1.本项目集成了支付宝二维码支付API接口，使用时需要配置支付宝沙箱环境，具体教程见[支付包二维码支付接入方法](http://blog.csdn.net/techa/article/details/71003519)；

2.项目中service部分引用了支付宝的第三方jar包，如需使用首先需要到支付宝开放平台下载，并引入到项目中，支付宝jar包安装到本地环境并添加本地依赖的方法：

```
mvn install:install-file -Dfile=jar包路径 -DgroupId=com.alibaba.alipay -DartifactId=alipay -Dversion=20161213 -Dpackaging=jar
mvn install:install-file -Dfile=jar包路径 -DgroupId=com.alibaba.alipay -DartifactId=alipay-trade -Dversion=20161215 -Dpackaging=jar
```

