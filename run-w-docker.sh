#!/bin/bash
PWD=$(pwd)
API_URL=http://localhost:8080
cd primer-api
mvn clean package
docker build -t primer-api .
docker run -d -p 8080:8080 primer-api
cd ../primer-webui
docker build --build-arg primer_api_base_url=$API_URL -t primer-webui .
docker run -d -p 80:80 primer-webui
cd $PWD
exit 0
