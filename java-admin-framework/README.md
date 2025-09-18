# Java Admin Framework

一个类似RuoYi的Java管理框架，基于Spring Boot、MyBatis-Plus、Spring Security等技术栈开发。

## 项目结构

```
java-admin-framework
├── src/main/java/com/example/admin
│   ├── AdminApplication.java        # 应用主入口
│   ├── common                       # 公共模块
│   │   ├── BaseEntity.java          # 实体基类
│   │   └── Result.java              # 响应结果类
│   ├── config                       # 配置模块
│   │   ├── MyBatisPlusConfig.java   # MyBatis-Plus配置
│   │   └── SwaggerConfig.java       # Swagger配置
│   ├── controller                   # 控制器模块
│   │   └── SysUserController.java   # 用户控制器
│   ├── entity                       # 实体模块
│   │   └── SysUser.java             # 用户实体
│   ├── mapper                       # Mapper模块
│   │   └── SysUserMapper.java       # 用户Mapper接口
│   ├── service                      # 服务模块
│   │   ├── ISysUserService.java     # 用户服务接口
│   │   └── impl                     # 服务实现
│   │       └── SysUserServiceImpl.java # 用户服务实现
│   └── utils                        # 工具模块
│       └── SecurityUtils.java       # 安全工具类
├── src/main/resources
│   ├── application.yml              # 全局配置文件
│   └── mapper                       # Mapper XML文件
│       └── SysUserMapper.xml        # 用户Mapper XML
└── pom.xml                          # Maven依赖管理
```

## 技术栈

- Spring Boot 2.7.14
- MyBatis-Plus 3.5.3.1
- MySQL 8.0.33
- Spring Security
- Swagger 3.0.0
- Lombok
- Druid 数据库连接池

## 快速开始

### 前提条件

- JDK 1.8+ 已安装
- Maven 已安装并配置环境变量
- MySQL 8.0+ 已安装

### 数据库配置

1. 创建数据库 `admin`
2. 配置 `application.yml` 中的数据库连接信息

### 运行项目

```bash
# 构建项目
mvn clean install

# 运行项目
mvn spring-boot:run
# 或
java -jar target/java-admin-framework-0.0.1-SNAPSHOT.jar
```

### 访问项目

- 项目访问地址: http://localhost:8080/admin
- Swagger文档: http://localhost:8080/admin/swagger-ui/index.html
- Druid监控: http://localhost:8080/admin/druid/login.html (用户名: admin, 密码: admin)

## 功能模块

1. **用户管理**：用户信息的增删改查
2. **权限管理**：基于Spring Security的权限控制
3. **接口文档**：基于Swagger的API文档生成
4. **数据库监控**：基于Druid的数据库连接池监控

## 扩展建议

1. 完善权限管理模块（角色、菜单等）
2. 添加日志管理
3. 实现定时任务
4. 开发前端页面