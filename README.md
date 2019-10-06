# springboot-dubbo
使用SpringBoot + Dubbo建造一个简单分布式服务
#zookeeper环境安装建造
zookeeper云盘下载地址：https://pan.baidu.com/s/1S4hTFzITISPtaObfOmn7VQ
也可自己官网选择下载：https://archive.apache.org/dist/zookeeper/
  具体安装运行步骤网上很多，这里就不具体介绍了，注意：如果部署到云服务器注意相关端口映射及防火墙设置
  项目结构：
    -- dubbo-interface ----接口项目，将项目打成 jar 包供其他项目使用(maven项目)
    -- dubbo-provider  ----实现服务提供者 （Spring boot项目）创建一个 SpringBoot 项目时，注意勾选上 web 模块
    -- dubbo-consumer  ----实现服务消费者 （Spring boot项目）创建一个 SpringBoot 项目时，注意勾选上 web 模块
#项目导入以Maven项目导入
  1.更改application.properties文件相关配置信息
  2.将dubbo-interface项目安装到本地仓库maven ---》install
  3.运行dubbo-provider项目DubApplication.java类
  4.运行dubbo-consumer项目的Application.java类
  5.浏览器访问 http://localhost:8089/hello 返回 Hello DUBBO；控制台亦有输出信息，
  恭喜SpringBoot + Dubbo建造一个简单分布式服务体验成功！
