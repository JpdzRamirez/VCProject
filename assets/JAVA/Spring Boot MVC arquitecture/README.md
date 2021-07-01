# Spring boot arquitecture

### _"In this section of the study we going to learn more about how build a Spring boot project with mvc arquitecture"_

<div align="center">
<img   width="600" src="https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/images/mvc.png">
</div>

### Conocimientos Aplicados
✅  Compartir informacion con Spring MVC y thymeleaf <br>
✅  Crear Clases y Listas desde .domain <br>
✅  Implementacion de MYSQL Server y WorkBench <br>
✅  Crear Base de datos MYSQL <br>
  
  ## MYSQL Integración
<div align="left">
<img   width="1000" src="https://user-images.githubusercontent.com/66846214/123996661-2a6be280-d995-11eb-9541-e49f99c823b5.png">
</div>

#### Configuracion
```
> Holst: localhost, Port: 3306 <br>
> JDBC URL: jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false&useTimezone=true&serverTimezone=UTC
```
<br>

<div align="left">
<img   width="600" src="https://user-images.githubusercontent.com/66846214/123998384-0f01d700-d997-11eb-8d62-ddbc09dae69d.png">
</div>

### Conectar a base de datos MYSQL 
#### Conocimientos Aplicados
✅  Spring Data JPA <br>
✅  PARAMETROS : <br>

```
# Mysql conexion 

spring.datasource.url=jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrival=true
spring.datasource.username=root
spring.datasource.password=admin
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

#Mostrar sql

spring.jpa.properties.hibernate.format_sql=true
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE
```
### Arquitectura
<div align="center">
<img   width="600" src="https://user-images.githubusercontent.com/66846214/124003436-8d14ac80-d99c-11eb-8d03-5096166d3901.png">
</div>

### Inyectar dependencias y sincronizar MYSQL
#### Conocimientos Aplicados
✅  @Autowired <br>
✅  Crear interface con el dominio DAO <br>
✅  Genera base de datos para el mapeo de la lista de personas desde MYSQL, para mapear ->👉 @{/identificador} <br>

### TEST

<div align="center">
<img   width="600" src="https://user-images.githubusercontent.com/66846214/124010044-efbd7680-d9a3-11eb-8fb7-7aa968be2872.gif">
</div>


### Creación de Capa de Servicios

<div align="center">
<img src="https://user-images.githubusercontent.com/66846214/124041792-31164c00-d9cd-11eb-9492-cd277c194335.png">
</div>

### Realizar CRUD (Create, Read, Update, Delete)

✅  GetMapping <br>
✅  PostMapping <br>


