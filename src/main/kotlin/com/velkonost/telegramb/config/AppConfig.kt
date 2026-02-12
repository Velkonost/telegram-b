package com.velkonost.telegramb.config

/**
 * Application configuration loaded from environment variables.
 */
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
)