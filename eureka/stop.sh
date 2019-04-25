#!/usr/bin/env bash
jps | grep 'eureka-1.0-SNAPSHOT.jar' | awk '{print $1}' | xargs kill
