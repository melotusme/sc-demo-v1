#!/usr/bin/env bash
# https://docs.docker.com/engine/reference/commandline/ps/
docker ps -a --filter status=exited --format '{{.ID}}'
#docker run -d -p 9411:9411 openzipkin/zipkin
#docker start zipkin
#docker stop zipkin