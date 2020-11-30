package com.clay.bridge_pattern;

public class MessageSMS implements  MessageImplementor {
    @Override
    public void sendMessage(String msg, String toUser) {
        System.out.println("发送系统站内消息：" + msg + "|给" + toUser );
    }
}
