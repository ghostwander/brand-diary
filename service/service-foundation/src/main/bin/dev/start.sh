#!/usr/bin/env bash
set -e
PROJECT_PATH=$(cd `dirname $0`/..; pwd)
ARTIFACTID=${project.artifactid}
VERSION=${project.version}

java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n \
     -classpath ${PROJECT_PATH}/conf;${PROJECT_PATH}/lib
     -jar ${PROJECT_PATH}/lib/${ARTIFACTID}-${VERSION}.jar --debug
