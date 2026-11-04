# Week 12: Cloud Deployment & DevOps: GitHub Actions, Docker, AWS Deployment

> **Certification:** AWS CLF-C02: final exam window for remaining students.

## Daily structure
| Time | Block | This week |
|---|---|---|
| 8:00–8:15 | Check-in & stand-up | One win, one blocker; Copilot challenge on Discord |
| 8:15–11:00 | Morning lecture | [`lecture/`](lecture/) |
| 11:00–12:00 | Hands-on lab | [`lab/`](lab/): Deploy the Full-Stack App to AWS |
| 1:00–2:00 | Mentor sessions | 1:1 and small groups |
| 2:00–3:00 | Pair programming | [`pair-programming/`](pair-programming/) |
| 3:00–5:00 | Independent practice | [`practice/`](practice/): CI/CD Pipeline |

## Learning objectives
- Cloud fundamentals and free-tier services
- Docker: containers, Dockerfile, build and run
- docker-compose for app + database
- CI/CD with GitHub Actions
- Workflow YAML: triggers, jobs, steps
- AWS EC2, RDS, S3
- Dev, staging and prod environments
- SSH and basic server administration
- HTTPS, domains, Let's Encrypt

## ☕ Java track notes
Dockerfile using a Java 21 base image. Spring profiles (`application-prod.properties`). Deploy the JAR to EC2.

## Deliverables
- **Weekly project:** [Live Deployed Application](project/)
- **Weekly quiz:** 10 questions: Docker (4), Actions YAML (3), EC2/RDS/S3 (3). Pass: 7/10.
- **Career development:** Capstone Architecture Review: submit a 1-page architecture doc (see `capstone/templates/architecture-doc.md`) for approval before Week 13.

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
