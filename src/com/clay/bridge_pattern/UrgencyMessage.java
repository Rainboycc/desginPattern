package com.clay.bridge_pattern;

public class UrgencyMessage extends AbstractMessage{
    public UrgencyMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    @Override
    public void sendMessage(String msg, String toUser) {
        msg += "加急：";
        super.sendMessage(msg, toUser);
    }

    public Object watch (String messageId) {
        return null;
    }
}
