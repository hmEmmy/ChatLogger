package dev.revere.api;

import dev.revere.api.impl.DiscordWebhookServiceImpl;
import dev.revere.api.interfaces.IDiscordWebhookService;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Emmy
 * @project DiscordBridge
 * @since 12/04/2025
 */
@Getter
public final class DiscordBridge {

    @Getter
    private static DiscordBridge instance;
    private final JavaPlugin plugin;
    private final String webhookUrl;
    private final IDiscordWebhookService webhookService;

    /**
     * Constructor for the DiscordBridge class.
     *
     * @param plugin The plugin instance.
     * @param webhookUrl The webhook URL for Discord.
     */
    public DiscordBridge(JavaPlugin plugin, String webhookUrl) {
        instance = this;

        this.plugin = plugin;
        this.webhookUrl = webhookUrl;

        this.webhookService = new DiscordWebhookServiceImpl();
    }
}