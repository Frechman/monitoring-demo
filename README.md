# Monitoring with Prometheus


# Reverse Proxy - OpenIG

```bash
gradle clean build

docker-compose -f docker-openig/docker-compose.yml down --volumes

docker-compose -f docker-openig/docker-compose.yml up -d --build

curl -v -X GET http://localhost:8080/test

curl -v -X GET http://localhost:8080/test/menkent
```
