package dev.revere.api.util;

import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

/**
 * @author Emmy
 * @project DiscordBridge
 * @since 12/04/2025
 */
@UtilityClass
public class Logger {
    /**
     * Log a message to the console.
     *
     * @param message the message to log
     */
    @SuppressWarnings("all")
    public void logException(String message, Exception e) {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lEXCEPTION | " + message + ": " + e.getMessage()));
        e.printStackTrace();
    }
}