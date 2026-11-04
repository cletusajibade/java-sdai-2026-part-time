# Claim Academy: Software Development + AI (Java Track)
**Full-time · 14 weeks · Mon–Fri 8 AM–5 PM CST · 2026 Edition**

The course repo for the Java track: lectures, labs, starter code, project briefs, and solutions, released week by week.

## Schedule
| Week | Topic | Weekly project | Certification milestone |
|---|---|---|---|
| [01](weeks/week-01-fundamentals-ide-git-variables/) | IDE Setup, Git, Variables, Scope, Naming | Personal Introduction Program | GitHub Foundations: exam open this week for confident students; everyone sits by end of Week 2 |
| [02](weeks/week-02-data-types-flow-control/) | Data Types, Statements, Expressions, Flow Control | Temperature Converter | GitHub Foundations: all students sit the exam this week (Thursday 4:00 PM) |
| [03](weeks/week-03-oop-classes-inheritance-polymorphism/) | Classes, OOP, Encapsulation, Polymorphism, Inheritance | Library System (OOP) | GitHub Copilot cert prep begins: review the Copilot documentation |
| [04](weeks/week-04-collections-exceptions-debugging/) | Collections, Exception Handling, Debugging | Contact Book Application | GitHub Copilot Certification EXAM this week (Thursday 4:00 PM, included in tuition) |
| [05](weeks/week-05-databases-sql-erd/) | Relational Concepts, SQL, Entity Relationship Diagrams | Inventory Database | AWS CLF-C02 prep begins; free-tier accounts created during mentor sessions |
| [06](weeks/week-06-orm-jpa-crud/) | ORM, Database Frameworks, CRUD Operations in Code | Full CRUD Application | AWS CLF-C02: Cloud Services module |
| [07](weeks/week-07-web-html-css-react/) | HTML, CSS, Frontend Basics, React Introduction | Portfolio Website V1 | AWS CLF-C02: Security module |
| [08](weeks/week-08-spring-boot-rest-api-auth/) | Backend Frameworks, REST APIs, Authentication | Full-Stack Application V1 | AWS CLF-C02: Billing and Pricing |
| [09](weeks/week-09-react-state-fullstack-auth/) | React Deep Dive, State Management, Full-Stack Integration | Full-Stack Application V2: Authentication | AWS CLF-C02 EXAM: recommended this week; Claim Academy facilitates group scheduling |
| [10](weeks/week-10-ai-integration-claude-api/) | Claude API, Advanced GitHub Copilot, Building AI-Powered Features | AI-Enhanced Full-Stack Application | Claude AI API Developer Certificate: students take the exam this week |
| [11](weeks/week-11-testing-junit-tdd/) | Unit Testing, Integration Testing, Test-Driven Development | Tested Full-Stack Application | AWS DVA-C02 preview introduced; Claude AI cert results confirmed |
| [12](weeks/week-12-docker-ci-cd-aws/) | GitHub Actions, Docker, AWS Deployment | Live Deployed Application | AWS CLF-C02: final exam window for remaining students |
| [13](weeks/week-13-solid-patterns-capstone-sprint-1/) | Advanced Programming + Capstone Build Sprint 1 | Capstone Milestone 1 | Capstone milestone review |
| [14](weeks/week-14-capstone-demo-day/) | Capstone Finalization, Demo Day Preparation & Career Launch | Capstone Final Deliverable | AWS DVA-C02 preview |

## Repo layout
```
course/
├── weeks/week-NN-topic/   # README, lecture, demos, lab, practice, pair-programming, project, quiz, solutions
├── capstone/              # Requirements, rubric, milestones, document templates
├── certifications/        # Cert timeline for the Java track
├── templates/             # Maven starter to copy for new exercises
├── resources/             # Cheat sheets
└── .github/               # CI workflow, issue and PR templates
```

## How students use this repo
1. Clone it once: `git clone <org>/course`
2. Every morning: `git pull` to get the day's materials.
3. **Do your work in your own cohort repo** (`claim-academy-[name]-cohort`, created from `student-template`), never here.
4. Ask questions through GitHub Issues or Discussions.

## Instructor workflow
- Release a week by pushing its folder, and tag it when the week ends: `git tag week-01 && git push --tags`
- Prepare solutions on a `solutions` branch and merge each week's solutions after the due date.
- Friday commit review: students with fewer than 5 commits that week get a mentor follow-up.
- Keep quiz answer keys and `MENTOR_NOTES.md` in a **private** instructor repo if this repo is shared with students.

See [SETUP.md](SETUP.md) to get started and [CONTRIBUTING.md](CONTRIBUTING.md) for the class Git rules.
