#!/bin/bash
#mvn clean install
rm -rf demodatadogmetricswithdatadog.tar
docker build -t demodatadogmetricswithdatadog .
docker save demodatadogmetricswithdatadog > demodatadogmetricswithdatadog.tar
microk8s ctr image import demodatadogmetricswithdatadog.tar
helm upgrade --install demo2 helmcharts/demodatadogmetricswithdatadog/ --values helmcharts/demodatadogmetricswithdatadog/values.yaml