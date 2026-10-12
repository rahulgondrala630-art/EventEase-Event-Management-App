# EventEase

EventEase is a focused event lifecycle service for creating, discovering, and joining events without turning the product into a generic operations dashboard.

## Product shape

Event organizers publish events with clear capacity and schedule information. Attendees discover relevant events, inspect details, and join with predictable validation around capacity and timing.

## Starter architecture

- **Domain:** event identity, schedule, venue, capacity, and participation rules
- **Application:** use cases for publishing, discovery, registration, and cancellation
- **Adapters:** REST controllers and MySQL persistence
- **Quality:** validation, service tests, integration tests, and repeatable local setup

## Technology

Java 17 · Spring Boot · Spring Web · Spring Data JPA · MySQL · Bean Validation · Maven · Docker

## Repository map

`src/main/java/com/eventease` contains the application, domain, application, and adapter layers. Database migrations live in `src/main/resources/db/migration`; architecture notes live in `docs/`.

## Run locally

```bash
./mvnw spring-boot:run
```

Use `docker compose up -d mysql` for the local database. The service is intentionally seeded with non-sensitive example events only.

## Roadmap

- Add organizer and attendee authentication
- Add event search and category filters
- Add registration confirmation and cancellation policies
- Publish an OpenAPI contract and browser demo

## Portfolio note

This project emphasizes humane event flows, clear validation, and domain modeling rather than visual similarity to the Nexora operations workspace.
