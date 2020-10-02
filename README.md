# AREP_LAB7
En este artículo se expondrá la teoría y la forma en la que se implementó una arquitectura segura la cual consiste en realizar una aplicación LoginService que es la fachada y que tiene su propio certificado lo cual la hace unicamente accesible con HTTPS esta se comunica con la aplicación OtherService por medio de este protocolo y a su vez tiene su propio certificado.

## Pre-requisitos
* [MAVEN](https://maven.apache.org/) - Administrador de dependencias.
* [GIT](https://git-scm.com/) - Control de versiones.
Para estar seguro de las versiónes que posee de maven, git y de java ejecute los siguientes comandos:
```
mvn -version  
git --version  
java -version  
```
## Instalación 
Para descargar el proyecto desde GitHub ejecute la siguiente linea:
```
git clone https://github.com/Camu10/AREP_LAB7.git
```

## Ejecutar
Dentro del directorio AREP_LAB7/LoginService, desde la consola de comandos para compilar ejecutamos la siguiente linea:
```
mvn package
```
Para ejecutar el proyecto de manera local desde la consola de comandos ejecutamos la siguiente linea y desde un navegador buscamos `localhost:5000/` :
```
java -cp target/classes;target/dependency/* edu.escuelaing.arep.app.App
```

Dentro del directorio AREP_LAB7/OtherService, desde la consola de comandos para compilar ejecutamos la siguiente linea:
```
mvn package
```
Para ejecutar el proyecto de manera local desde la consola de comandos ejecutamos la siguiente linea y desde un navegador buscamos `localhost:5001/information` :
```
java -cp target/classes;target/dependency/* edu.escuelaing.arep.app.App
```

## Ejecutando las pruebas
Para correr las pruebas ejecutamos la siguiente linea:
```
mvn test
```
## Despliegue en AWS
Para ver el despliegue de esta aplicación puede ver el video donde se explica el funcionamiento y se da una vista al funcionamiento de la arquitectura 

## Construido con
* [MAVEN](https://maven.apache.org/) - Administrador de dependencias.
* [GIT](https://git-scm.com/) - Control de versiones.
* [JUNIT](https://junit.org/junit5/) - Framework para realizar y automatizar pruebas.
* [SPARK](http://sparkjava.com/) - Framework para el desarrollo de aplicaciones web.
* [AWS](https://aws.amazon.com/es/console/) - Computación en la nube.
* [DOCKER](https://www.docker.com/) - Tecnología para el uso de contenedores.
* JAVA - Lenguaje de programación.

## Autor
* **Carlos Murillo** - [Camu10](https://github.com/Camu10)

## Licencia
Este proyecto está bajo la Licencia GNU(General Public License) - mira el archivo [LICENSE](LICENSE) para detalles.
