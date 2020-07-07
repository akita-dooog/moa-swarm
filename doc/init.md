# 本地开发环境
## 1. Nacos Server
> 注册中心及配置中心
1. 使用docker搭建
```shell script
docker pull nacos/nacos-server
```

2. 本地单节点
```shell script
docker run --env MODE=standalone --name nacos -d -p 8848:8848 nacos/nacos-server
```

3. 登陆地址：http://localhost:8848/nacos/index.html。默认账号密码是nacos/nacos

## 2. Mysql
> 数据持久化
1. 使用docker搭建
```shell script

```

2. 单节点启动
```shell script
docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=123456 -d mysql

docker run -p 3306:3306 --name mysql -v /opt/docker_v/mysql/conf:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=123456 -d mysql
```

## 3.MinIO
> 对象存储
1. docker搭建环境
```shell script
docker pull minio/minio
docker run -p 9000:9000 --name minio -d -e "MINIO_ACCESS_KEY=minio" -e "MINIO_SECRET_KEY=12345678" minio/minio server /data
# 启动客户端
docker run -it --entrypoint=/bin/sh minio/mc

mc config host add minio http://127.0.0.1:9000 minio 12345678 S3v4
```
2. 登陆地址：http://localhost:9000。默认账号密码是minioadmin/minioadmin

## 4. Redis
1. docker搭建环境
```shell script
docker pull redis
docker run -p 6379:6379 --name redis -d redis
```

# 启动
## 1. swagger2
http://localhost:8080/swagger-ui.html

## 2. druid
http://localhost:8080/druid/index.html

## 开发
### moa-mbg
1. 修改mybatis generator生成的Java类型
参照 org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl

2. mbg 配置文件增加
```xml
<javaTypeResolver type="org.mybatis.generator.internal.types.MyJavaTypeResolverDefaultImpl"/>
```
