# BRQ
BRQ Consultancy - FIAP Challenge Project
---
Create a PostgreSQL database to run the project:

- application.properties example:
```
spring.jpa.database=POSTGRESQL
spring.datasource.platform=postgres
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create-drop
spring.database.driverClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/brq
spring.datasource.username=postgres
spring.datasource.password=root
server.port=8080
```
---
## Register a User
Follow the sequence below to register a User:
1. POST /genre
2. POST /skill-type
3. POST /skill
4. POST /user

User body example:
```
{
	"id": 152,
	"name": "Ariel Ribeiro",
	"email": "ariiel.ribeiro@gmail.com",
	"document": "12345678912",
	"phone": "1239114456",
	"birthday": "1992-02-06",
	"skills": [
		{
		  "id": 102,
			"skill": "Angular",
			"skillType": {
				"id": 1,
				"skillType": "Hard"
			}
		}
	],
	"genre": {
		"id": 52,
		"genre": "Male"
	}
}
```
