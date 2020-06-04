# Sample repo 
https://github.com/spring-projects-experimental/spring-graalvm-native/issues/135
https://github.com/oracle/graal/issues/2529

## How to reproduce

Run
```shell
./compile.sh
```

this should produce the expected error

```shell
Caused by: org.graalvm.compiler.java.BytecodeParser$BytecodeParserError: java.lang.NoClassDefFoundError: org/springframework/retry/backoff/BackOffPolicy
	at parsing org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration$RetryAutoConfiguration.loadBalancedRetryFactory(LoadBalancerAutoConfiguration.java:112)
	at org.graalvm.compiler.java.BytecodeParser.throwParserError(BytecodeParser.java:2578)
	at com.oracle.svm.hosted.phases.SharedGraphBuilderPhase$SharedBytecodeParser.throwParserError(SharedGraphBuilderPhase.java:100)
	at org.graalvm.compiler.java.BytecodeParser.iterateBytecodesForBlock(BytecodeParser.java:3416)
	at org.graalvm.compiler.java.BytecodeParser.processBlock(BytecodeParser.java:3218)
	at org.graalvm.compiler.java.BytecodeParser.build(BytecodeParser.java:1088)
```

Remove the dependency and the image will compile
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>
```
