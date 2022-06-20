package com.company.observer;

/**
 * Deve ser um objeto imutável para que nenhuma outra classe possa modificar o conteúdo
 **/
public class Message {

    final String messageContent;

    public Message(String m) {
        this.messageContent = m;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
