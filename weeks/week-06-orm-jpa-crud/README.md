# Week 6: Databases 2: ORM, Database Frameworks, CRUD Operations in Code

> **Certification:** AWS CLF-C02: Cloud Services module.

## Daily structure
| Time | Block | This week |
|---|---|---|
| 8:00–8:15 | Check-in & stand-up | One win, one blocker; Copilot challenge on Discord |
| 8:15–11:00 | Morning lecture | [`lecture/`](lecture/) |
| 11:00–12:00 | Hands-on lab | [`lab/`](lab/): Connect the Library Database to Code |
| 1:00–2:00 | Mentor sessions | 1:1 and small groups |
| 2:00–3:00 | Pair programming | [`pair-programming/`](pair-programming/) |
| 3:00–5:00 | Independent practice | [`practice/`](practice/): Contact Book → Database Version |

## Learning objectives
- What an ORM is and why it's used
- Repository pattern
- CRUD through the ORM
- Database migrations in version control
- Connection strings, environment variables, secrets
- NoSQL intro (MongoDB) and when to choose it
- Validation at the application layer
- Unit of Work: transactions and consistency

## ☕ Java track notes
Spring Data JPA with Hibernate: `@Entity`, `@Repository`, `JpaRepository<T, ID>`. Configure the datasource in `application.properties` and read credentials from environment variables.

## Deliverables
- **Weekly project:** [Full CRUD Application](project/)
- **Weekly quiz:** 10 questions: ORM concepts (3), repository pattern (3), migration ordering (2), connection security (2). Pass: 7/10.
- **Career development:** Professional Communication: email etiquette, writing a good README, asking for code review, Slack/Teams norms.

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
