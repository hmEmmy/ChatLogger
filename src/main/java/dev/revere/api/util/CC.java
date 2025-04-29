package dev.revere.api.util;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

/**
 * @author Emmy
 * @project DiscordBridge
 * @since 12/04/2025
 */
@UtilityClass
public class CC {
    /**
     * Translates color codes in a string using '&' as the color code character.
     *
     * @param string The string to translate.
     * @return The translated string with color codes applied.
     */
    public String translate(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
}