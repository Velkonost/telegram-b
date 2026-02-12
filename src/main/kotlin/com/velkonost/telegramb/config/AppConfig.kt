package com.velkonost.telegramb.config

import io.github.cdimascio.dotenv.dotenv

data class AppConfig(
    val telegramBotToken: String,
    val jiraBaseUrl: String,
    val jiraApiToken: String,
    val jiraUserEmail: String,
    val postgresHost: String,
    val postgresPort: Int,
    val postgresDb: String,
    val postgresUser: String,
    val postgresPassword: String,
    val redisHost: String,
    val redisPort: Int,
    val standupCron: String,
    val reminderDelayMinutes: Long,
) {
    companion object {
        fun fromEnv(): AppConfig {
            val env = dotenv()
            return AppConfig(
                telegramBotToken = env["TELEGRAM_BOT_TOKEN"],
                jiraBaseUrl = env["JIRA_BASE_URL"],
                jiraApiToken = env["JIRA_API_TOKEN"],
                jiraUserEmail = env["JIRA_USER_EMAIL"],
                postgresHost = env["POSTGRES_HOST", "localhost"],
                postgresPort = env["POSTGRES_PORT", "5432"].toInt(),
                postgresDb = env["POSTGRES_DB", "telegramb"],
                postgresUser = env["POSTGRES_USER", "telegramb"],
                postgresPassword = env["POSTGRES_PASSWORD"],
                redisHost = env["REDIS_HOST", "localhost"],
                redisPort = env["REDIS_PORT", "6379"].toInt(),
                standupCron = env["APP_STANDUP_CRON", "0 0 10 * * ?"],
                reminderDelayMinutes = env["APP_REMINDER_DELAY_MINUTES", "30"].toLong(),
            )
        }
    }
}
