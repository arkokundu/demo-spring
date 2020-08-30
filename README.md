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
docker container ls
docker exec -it <container-id> bin/bash
psql -U postgres
\l 
```
4. Create a database and connect to it
```
CREATE DATABASE arkodb;
\c arkodb
```
5. Open the terminal in Intellij IDEA and run DemoApplication

6. Generate UUIDS 
```
CREATE EXTENSION "uuid-ossp";
SELECT uuid_generate_v4();
```
7. Custom queries :
```
INSERT INTO person(id,name,balance) VALUES (uuid_generate_v4(),'Charles Xavier',20000);
INSERT INTO person(id,name,balance) VALUES (uuid_generate_v4(),'Logan',30000);
INSERT INTO person(id,name,balance) VALUES (uuid_generate_v4(),'Magneto',45000);
INSERT INTO person(id,name,balance) VALUES (uuid_generate_v4(),'Cyclops',0000);
```




