#!/usr/bin/env bash
set -e
PROJECT_PATH=$(cd `dirname $0`/..; pwd)
ARTIFACTID=${project.artifactid}
VERSION=${project.version}

java -classpath ${PROJECT_PATH}/conf:${PROJECT_PATH}/lib \
     -jar ${PROJECT_PATH}/lib/${ARTIFACTID}-${VERSION}.jar
