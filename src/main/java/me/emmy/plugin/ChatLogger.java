package me.emmy.plugin;

import dev.revere.api.DiscordBridge;
import lombok.Getter;
import me.emmy.plugin.listener.ChatListener;
import me.emmy.plugin.repository.MessageRepository;
import me.emmy.plugin.runnable.WebhookCallRunnable;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class ChatLogger extends JavaPlugin {

    @Getter
    private static ChatLogger instance;

    private DiscordBridge discordBridge;
    private MessageRepository messageRepository;

    @Override
    public void onEnable() {
        instance = this;

        this.saveDefaultConfig();
        this.discordBridge = new DiscordBridge(this, getConfig().getString("webhook-url"));
        this.messageRepository = new MessageRepository();

        this.getServer().getPluginManager().registerEvents(new ChatListener(), this);

        new WebhookCallRunnable(this.messageRepository).runTaskTimer(this, 0L, 100L);
    }

    @Override
    public void onDisable() {

    }
}