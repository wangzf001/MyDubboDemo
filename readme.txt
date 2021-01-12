技术栈：
	dubbo  ( group=mydubbo-dev)
	zookeeper
	kafka
	
dubbo-admin 8080
	
mydubbo - user  8081
myuser-service  20880

mydubbo - order  8082
myorder-service  20881

nacos.config.server-addr =172.16.2.106:8848
dubbo.scan.base-packages=com.study.wzf.mydubbouser.controller
dubbo.application.name=mydubbo-user
dubbo.application.owner=wzf
dubbo.registry.address=zookeeper://172.16.2.106:2181?172.16.2.182:2181,172.16.2.98:2181
dubbo.registry.check=false
dubbo.registry.group=mydubbo-dev
dubbo.registry.simplified=true
dubbo.metadata-report.address=zookeeper://172.16.2.106:2181?172.16.2.182:2181,172.16.2.98:2181
dubbo.metadata-report.retry-times=30
dubbo.metadata-report.cycle-report=false
dubbo.metadata-report.group=mydubbo-dev

server.port=8081




