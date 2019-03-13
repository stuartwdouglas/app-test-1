FROM centos:7
ENV RELEASE_PATH target/apicurio-example-swarm.jar
RUN yum install -y \
    java-1.8.0-openjdk-headless \
  && yum clean all

WORKDIR /opt/apicurio-example

ADD ${RELEASE_PATH} /opt/apicurio-example

RUN groupadd -r duser -g 1001 \
    && useradd -u 1001 -r -g duser -d /opt/apicurio-example/ -s /sbin/nologin -c "Docker image user" duser \
    && chown -R duser:duser /opt/apicurio-example/ \
    && chgrp -R 0 /opt/apicurio-example && chmod -R g=u /opt/apicurio-example

USER 1001


EXPOSE 8080

ENV PORT_OFFSET=0
ENV LOGGING_LEVEL=INFO

CMD java -jar /opt/apicurio-example/apicurio-example-swarm.jar \
    -Dswarm.port.offset=${PORT_OFFSET} \
    -Dswarm.logging=${LOGGING_LEVEL}
