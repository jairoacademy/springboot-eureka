<p align="center">
  <h2>Java Spring Boot Eureka/Gateway Microservices Application</h2>
</p>

### Description
- Simple, clean and modern Spring Cloud Gateway with Netflix Eureka Discovery Service with MySQL and MongoDB

### Prerequisite to build e install 
- [Java 11](https://adoptopenjdk.net/index.html)
- [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
- [Docker](https://docs.docker.com/engine/install/)
- [Docker Compose](https://docs.docker.com/compose/install/)

### Technologies
Project is created with:
* Linux: Pop!_OS 20.04 LTS
* Java: 11
* Maven: 3.6.3
* Spring Framework: 2.4.3
* Docker: 2.4
* MySQL: latest
* MongoDB: latest 
* Portainer: latest
* Prometheus: latest (coming soon)
* Grafana: latest (coming soon)

### Clone 
1. Open terminal
2. Change the current working directory to the location where you want the cloned directory
3. Type git clone as below:
```
git clone https://github.com/jairoacademy/springboot-eureka.git
```

### Setup 
To run this project, install it locally using docker compose:
```
docker-compose up -d
```

### Application is running...
Amazing things that can be accessed
- [Service Registration and Discovery](http://localhost:8081)
- [API REST with Swagger - Customer Module](http://localhost:8080/swagger-ui.html)
- [Prometheus (coming soon)](http://localhost:9090)
- [Grafana (coming soon)](http://localhost:3000)

# 🚀 Tips 
### Improve your README!
I recommend [Markdown Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

### References
- [DevDojo Academy](https://devdojo.academy/)
- [Route Predicates](https://cloud.spring.io/spring-cloud-static/spring-cloud-gateway/2.1.5.RELEASE/multi/multi_gateway-request-predicates-factories.html)
- [Spring Cloud Gateway](https://cloud.spring.io/spring-cloud-gateway/reference/html/)
- [Spring Cloud Tutorial](https://www.javainuse.com/spring/cloud-gateway-eureka/)
