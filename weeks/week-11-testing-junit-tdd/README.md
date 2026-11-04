# Week 11: Testing: Unit Testing, Integration Testing, Test-Driven Development

> **Certification:** AWS DVA-C02 preview introduced; Claude AI cert results confirmed.

## Daily structure
| Time | Block | This week |
|---|---|---|
| 8:00–8:15 | Check-in & stand-up | One win, one blocker; Copilot challenge on Discord |
| 8:15–11:00 | Morning lecture | [`lecture/`](lecture/) |
| 11:00–12:00 | Hands-on lab | [`lab/`](lab/): Test the Task Manager |
| 1:00–2:00 | Mentor sessions | 1:1 and small groups |
| 2:00–3:00 | Pair programming | [`pair-programming/`](pair-programming/) |
| 3:00–5:00 | Independent practice | [`practice/`](practice/): TDD Sprint |

## Learning objectives
- The cost of bugs in production
- Testing pyramid: unit, integration, end-to-end
- JUnit 5 and Arrange/Act/Assert
- What to test and what not to test
- Mocks, stubs and spies
- TDD: Red → Green → Refactor
- Integration tests against an in-memory database
- Code coverage
- Secure coding (OWASP basics): validation, parameterized queries, no secrets in code

## ☕ Java track notes
JUnit 5, Mockito, `@SpringBootTest`, H2 in-memory database for tests, `mvn test`. Add the JaCoCo plugin for coverage.

## Deliverables
- **Weekly project:** [Tested Full-Stack Application](project/)
- **Weekly quiz:** 10 questions: test types (4), AAA structure (3), TDD cycle (3). Pass: 7/10.
- **Career development:** Salary Negotiation Workshop: St. Louis and national salary research, responding to offers, counter-offer scripts, evaluating benefits.

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
