package com.clay.bridge_pattern;

public class MessageEmail implements MessageImplementor{
    @Override
    public void sendMessage(String msg, String toUser) {
        System.out.println("发送邮件消息：" + msg + "|给" + toUser );
    }
}
