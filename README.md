#说明

- 原作者：Judas.n：<http://code.YouMeek.com> 原项目地址：https://github.com/judasn/Basic-Single-Module-SSM.git

- 自己用来搭建学习maven + ssm 最快速简单示例

自己遇到的问题：
- 1.数据库连接不上。
    - 解决方法：
        - ①数据库版本和jar包不兼容，升级jar包，我本地是8.0.15
        - ②时间错误，在url连接拼接上&serverTimezone=GMT%2B8  
- 2.后台访问404
   - 解决方法：访问路径前边加上项目前缀${pageContext.request.contextPath}
   
## 部署步骤
- 1.执行数据库脚本init.sql
- 2.部署到tomcat中。
- 3.访问http://localhost:8080/项目名称
    
