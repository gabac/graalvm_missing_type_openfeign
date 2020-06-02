# Sample repo 
https://github.com/spring-projects-experimental/spring-graalvm-native/issues/135

## How to reproduce

Run
```shell
./compile.sh
```

this should produce the expected error

```shell
Fatal error:org.springframework.graal.type.MissingTypeException: Unable to find class file for org/springframework/cloud/openfeign/FeignAutoConfiguration
```

Remove the dependency and the image will compile
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>
```
