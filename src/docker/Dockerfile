FROM openjdk:8-jre-alpine

# Require for health tests
RUN apk add --no-cache curl

ENV ENVIRONMENT dev
ENV DESTINATION /opt/app/service.jar

ADD target/poc-graphql-thorntail.jar $DESTINATION

CMD ["-jar", "--Djava.net.preferIPv4Stack=true", "/opt/app/service.jar", "-Sdev"]

ENTRYPOINT ["/usr/bin/java"]