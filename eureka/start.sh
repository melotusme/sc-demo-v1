#!/usr/bin/env bash
#nohup java -jar ./target/eureka-1.0-SNAPSHOT.jar --spring.profiles.active=es1 > es1.log 2>&1
java -jar ./target/eureka-1.0-SNAPSHOT.jar --spring.profiles.active=es1
#nohup java -jar ./target/eureka-1.0-SNAPSHOT.jar -Dspring.profiles.active=es2 > es2.log 2>&1