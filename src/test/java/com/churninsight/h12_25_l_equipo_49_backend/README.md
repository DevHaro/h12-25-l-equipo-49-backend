# h12-25-l-equipo-49-backend

Backend API REST para predicción de churn.

## Descripción
Este proyecto corresponde al backend del sistema **ChurnInsight**, cuyo objetivo es exponer
una API REST que permita recibir información de clientes y, en etapas posteriores,
retornar una predicción de **churn (cancelación de servicio)**.

Actualmente, el endpoint principal valida la correcta conexión entre cliente y servidor.

## Arquitectura del proyecto

Estructura base del proyecto:

src
├── main
│ └── java
│ └── com
│ └── churninsight
│ └── h12_25_l_equipo_49_backend
│ ├── controller
│ │ └── ChurnController.java
│ └── H1225LEquipo49BackendApplication.java
└── test
└── java
└── com
└── churninsight
└── h12_25_l_equipo_49_backend
└── H1225LEquipo49BackendApplicationTests.java

## Tecnologías
- Java 17
- Spring Boot
- Gradle
- Spring Web
- Lombok
- Validation

## Requisitos previos
- Java JDK 17 instalado
- Git
- Gradle (incluido mediante wrapper)
- IDE recomendado: IntelliJ IDEA

## Ejecución del proyecto
Desde la raíz del proyecto ejecutar:

```bash
./gradlew bootRun;


Una vez ejecutado el proyecto, la API estará disponible en:

http://localhost:8080/api/v1/predict

(Disponible solo mientras la aplicación esté en ejecución)