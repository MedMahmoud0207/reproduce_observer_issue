#FROM payara/micro:5.2022.3
FROM payara/micro:4.181
COPY app.war $DEPLOY_DIR