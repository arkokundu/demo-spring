# Basic CRUD operations using Spring Boot and Flybase Database Migration

## Instructions for quick setup - 
1. Spin up Postgres database instance using Docker
```
docker container run -d --name=postgres-spring-boot -p 5433:5432 -e POSTGRES_PASSWORD=password -e PGDATA=/pgdata -v /pgdata:/pgdata postgres:11.4
```
2. Exposing container port to the outside world on localhost:5432
```
docker port 
```
3. Enter into the container by passing the container id
```
docker exec -it a0e07f6fa592 bin/bash
psql -U postgres
\l 
```
4. Create a database and connect to it
```
CREATE DATABASE arkodb;
\c arkodb
```
5. Open the terminal in Intellij IDEA and run DemoApplication





