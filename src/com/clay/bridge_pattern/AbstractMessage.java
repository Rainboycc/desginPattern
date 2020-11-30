package com.clay.bridge_pattern;

public abstract class AbstractMessage {
    private MessageImplementor messageImplementor;
    public AbstractMessage (MessageImplementor messageImplementor) {
        this.messageImplementor = messageImplementor;
    }
    public void sendMessage (String msg, String toUser) {
        this.messageImplementor.sendMessage(msg, toUser);
    }
}
