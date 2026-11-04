# Week 8: Web Programming 2: Backend Frameworks, REST APIs, Authentication

> **Certification:** AWS CLF-C02: Billing and Pricing. Students scoring 80%+ on practice exams schedule the real exam.

## Daily structure
| Time | Block | This week |
|---|---|---|
| 8:00–8:15 | Check-in & stand-up | One win, one blocker; Copilot challenge on Discord |
| 8:15–11:00 | Morning lecture | [`lecture/`](lecture/) |
| 11:00–12:00 | Hands-on lab | [`lab/`](lab/): Task Manager REST API |
| 1:00–2:00 | Mentor sessions | 1:1 and small groups |
| 2:00–3:00 | Pair programming | [`pair-programming/`](pair-programming/) |
| 3:00–5:00 | Independent practice | [`practice/`](practice/): REST API Expansion |

## Learning objectives
- Spring Boot project structure
- REST design: resources, endpoints, verbs, status codes
- GET, POST, PUT and DELETE endpoints
- JSON serialization and deserialization
- Swagger/OpenAPI documentation
- Session vs. token authentication
- JWT: header.payload.signature, validation, refresh tokens
- Connecting the Week 7 frontend to the API
- Configuration via environment variables

## ☕ Java track notes
Spring Boot: `@RestController`, `@GetMapping`, `@PostMapping`, `@RequestBody`, `@PathVariable`. Spring Security for JWT. Generate projects at start.spring.io with Java 21 + Maven and add Spring Web, Spring Data JPA, PostgreSQL Driver, Validation, and springdoc-openapi.

## Deliverables
- **Weekly project:** [Full-Stack Application V1](project/)
- **Weekly quiz:** 12 questions: status codes (4), endpoint design (4), JWT structure (4). Pass: 8/12.
- **Career development:** Alumni Speaker Event: job searches, first-year experiences, salary progression. Post a LinkedIn thank-you afterward.

## Folder guide
| Folder | Contents |
|---|---|
| `lecture/` | Slides or links, lecture notes |
| `demos/` | Code live-coded in class (committed after the lecture) |
| `lab/` | Guided lab instructions + `starter/` code |
| `practice/` | Independent practice brief + starter |
| `pair-programming/` | Pair exercise brief |
| `project/` | Weekly project brief and grading checklist |
| `quiz/` | Quiz format (questions and answers live in the private instructor repo) |
| `solutions/` | Released after the due date |

> Remember: nothing counts if it isn't committed. Aim for at least 5 commits this week.
