# 教务管理系统服务器端
***
## 开发配置：
>### 开发语言：Java
>### 开发环境：IDEA
>### 框架：Spring Boot 、 MyBatis
>### 数据库：MySQL
>*注：数据库结构及模拟数据目录 database/edu.sql
***
## API：
>### 学生登录:
>    POST:(id,password)
>
>    http://localhost:8080/login

>### 查询所有课程
>    GET:
>
>    http://localhost:8080/courseAll

>### 查询指定id课程
>    GET:(id)
>
>    http://localhost:8080/course
