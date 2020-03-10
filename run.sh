#!/bin/bash

mvn clean package -Pdev

docker-compose up --build