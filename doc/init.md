# 本地开发环境
## 1. Nacos Server
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
1. 使用docker搭建
```shell script

```

2. 单节点启动
```shell script
docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=123456 -d mysql

docker run -p 3306:3306 --name mysql -v /opt/docker_v/mysql/conf:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=123456 -d mysql
```

# 启动
## 1. swagger2
http://localhost:8080/swagger-ui.html

## 2. druid
http://localhost:8080/druid/index.html
