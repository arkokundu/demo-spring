# Simple banking app with credit and debit transactions using Spring Boot, PostgreSQL relational DB, and Flyway DB migration

## Instructions for quick setup - 
1. Spin up Postgres database instance using Docker
```
docker run --name postgres-spring -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine
```
2. Exposing container port to the outside world on localhost:5432
```
docker port postgres-spring
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
5. Generate UUIDS 
```
CREATE EXTENSION "uuid-ossp";
SELECT uuid_generate_v4();
```
6. Open the terminal in Intellij IDEA and run DemoArkoApplication

7. Custom queries :
```
INSERT INTO person(id,name,balance) VALUES (uuid_generate_v4(),'Charles Xavier',20000);
INSERT INTO person(id,name,balance) VALUES (uuid_generate_v4(),'Logan',30000);
INSERT INTO person(id,name,balance) VALUES (uuid_generate_v4(),'Magneto',45000);
INSERT INTO person(id,name,balance) VALUES (uuid_generate_v4(),'Cyclops',10000);
```




