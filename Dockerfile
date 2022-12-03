FROM openjdk:17

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /opt/sdd

COPY /target/starter*.jar sdd.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 8080
EXPOSE 5005

CMD java ${ADDITIONAL_OPTS} -jar sdd.ajr --spring.profiles.native=${PROFILE}