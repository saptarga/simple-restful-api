# SPRING BOOT - RESTFUL API - H2 DATABASE

## Description

Simple project restful api using database H2

## Prerequisites

- Java JDK 11
- Maven

## Installation

Step for installation:

```sh
# Clone this project from gitlab
git clone git@github.com:saptarga/simple-restful-api.git

# Clears the target directory and builds the project
mvn clean install
```

## Run Project

You can start this project using

```sh
mvn clean spring-boot:run
```

## Example Request Rest API

### Create New Data Tutorial

Request

```http
POST /api/tutorials HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 124

{
    "title": "Belajar Java",
    "description": "Tutorial Tentang Belajar Java Dalam 7 Hari",
    "published": false
}
```

Response

```http
HTTP/1.1 201 
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 28 Sep 2021 13:58:27 GMT
Connection: close

{
  "id": 1,
  "title": "Belajar Java",
  "description": "Tutorial Tentang Belajar Java Dalam 7 Hari",
  "published": false
}
```

### Find All Data Tutorial

Request

```http
GET /api/tutorials HTTP/1.1
Host: localhost:8080
```

Response

```http
HTTP/1.1 200 
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 28 Sep 2021 13:59:25 GMT
Connection: close

[
  {
    "id": 1,
    "title": "Belajar Java",
    "description": "Tutorial Tentang Belajar Java Dalam 7 Hari",
    "published": false
  }
]

```

### Find Data Tutorial By Id

Request

```http
GET /api/tutorials/1 HTTP/1.1
Host: localhost:8080
```

Response

```http
HTTP/1.1 200 
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 28 Sep 2021 14:00:36 GMT
Connection: close

{
  "id": 1,
  "title": "Belajar Java",
  "description": "Tutorial Tentang Belajar Java Dalam 7 Hari",
  "published": false
}
```

### Update Data Tutorial By ID

Request

```http
PUT /api/tutorials/1 HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 132

{
    "title": "Belajar Java Versi 2",
    "description": "Tutorial Tentang Belajar Java Dalam 7 Hari",
    "published": false
}
```

Response

```http
HTTP/1.1 200 
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 28 Sep 2021 14:01:35 GMT
Connection: close

{
  "id": 1,
  "title": "Belajar Java Versi 2",
  "description": "Tutorial Tentang Belajar Java Dalam 7 Hari",
  "published": false
}
```

## Author

Created and maintained by saptarga ([@saptarga](https://www.linkedin.com/in/saptarga)).