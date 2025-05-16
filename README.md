# java-spi-currency-converter
A multi-module Java console application demonstrating the Service Provider Interface (SPI) pattern with dynamic currency converter implementations. Includes a custom annotation for user-friendly labels and Docker support for portable execution.






##  Features

- Java **SPI-based plugin architecture**
- Two converter implementations: USD → SEK and EUR → SEK
- Custom `@ConverterName` annotation for user-friendly names
- Console-based user interaction
- Fully containerized with Docker
- Built as a **multi-module Maven project**

##  How to Run (Locally)

```bash
mvn clean package
java -jar service-runner/target/service-runner-1.0-SNAPSHOT.jar
```

## How to run with Docker

```bash
docker pull linushlmlnd1/spi-runner:1.0
docker run -it linushlmlnd1/spi-runner:1.0
```
