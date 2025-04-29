package me.emmy.plugin.runnable;

import me.emmy.plugin.ChatLogger;
import me.emmy.plugin.repository.MessageRepository;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * @author Emmy
 * @project ChatLogger
 * @since 29/04/2025
 */
public class WebhookCallRunnable extends BukkitRunnable {
    protected final MessageRepository messageRepository;

    /**
     * Constructor for the WebhookCallRunnable class.
     *
     * @param messageRepository The MessageRepository instance.
     */
    public WebhookCallRunnable(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    @Override
    public void run() {
        if (this.messageRepository.getMessages().isEmpty()) {
            return;
        }

        this.messageRepository.getMessages().forEach(
            message -> {
                ChatLogger.getInstance().getDiscordBridge().getWebhookService().sendMessage(
                    message
                );
            }
        );

        this.messageRepository.getMessages().clear();
    }
}
