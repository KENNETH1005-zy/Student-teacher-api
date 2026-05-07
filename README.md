# Homework 2 — Student / Teacher

Spring Boot + H2 in-memory DB. Student to Teacher is many-to-many, but I use
an explicit `student_teacher` entity instead of `@ManyToMany`. Hibernate does
not create the tables — `schema.sql` does (DDL is also in `db/ddl.sql`).

## Run

```bash
mvn spring-boot:run
```

## Endpoints

- `GET    /students`
- `GET    /students/{id}`
- `POST   /students`         body: `{ "name": "...", "email": "..." }`
- `PUT    /students/{id}`    body: `{ "name": "...", "email": "..." }`
- `DELETE /students/{id}`
- `GET    /students/{id}/teachers`

H2 console: `http://localhost:8080/h2-console` (URL `jdbc:h2:mem:schooldb`,
user `sa`).
