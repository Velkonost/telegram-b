# telegram-b

Telegram Standup Bot with Jira integration.

## Stack

- **Runtime:** Kotlin/JVM (coroutines)
- **Bot Framework:** Telegram Bot API (kotlin-telegram-bot)
- **Integrations:** Jira REST API
- **Database:** PostgreSQL
- **Cache/Queue:** Redis
- **Monitoring:** Prometheus + Grafana
- **Deploy:** Docker on Hetzner VPS

## Project Structure

```
src/main/kotlin/com/velkonost/telegramb/
├── Application.kt          # Entry point
├── bot/                     # Telegram bot handlers, commands, callbacks
├── config/                  # App configuration (env, secrets)
├── jira/                    # Jira API client and models
├── model/                   # Domain models
├── repository/              # Database repositories (PostgreSQL)
├── scheduler/               # Cron jobs (standup triggers, reminders)
├── service/                 # Business logic layer
├── queue/                   # Message queue (Redis-backed throttling)
└── metrics/                 # Prometheus metrics
```

## Getting Started

### Prerequisites

- JDK 17+
- Docker & Docker Compose
- Telegram Bot Token (via @BotFather)
- Jira API Token

### Run locally

```bash
cp .env.example .env
# Fill in your tokens
docker-compose up -d postgres redis
./gradlew run
```

### Run with Docker

```bash
docker-compose up --build
```

## Environment Variables

See `.env.example` for the full list.

## License

Private — Velkonost