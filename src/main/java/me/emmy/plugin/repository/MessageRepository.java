package me.emmy.plugin.repository;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Emmy
 * @project ChatLogger
 * @since 29/04/2025
 */
@Getter
public class MessageRepository {
    private final List<String> messages;

    public MessageRepository() {
        this.messages = new LinkedList<>();
    }
}