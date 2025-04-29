package me.emmy.plugin.listener;

import me.emmy.plugin.ChatLogger;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * @author Emmy
 * @project ChatLogger
 * @since 29/04/2025
 */
public class ChatListener implements Listener {

    @EventHandler
    private void onChat(AsyncPlayerChatEvent event) {
        String formattedMessage = event.getPlayer().getName() + ": " + event.getMessage();
        ChatLogger.getInstance().getMessageRepository().getMessages().add(formattedMessage);
    }
}