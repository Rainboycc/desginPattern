package com.clay.bridge_pattern;

public class CommonMessage extends AbstractMessage {
    public CommonMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    @Override
    public void sendMessage(String msg, String toUser) {
        super.sendMessage(msg, toUser);
    }
}
