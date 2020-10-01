package main.java.com.vz89.javacore.designPatterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat,"Admin");
        User user1 = new SimpleUser(chat,"User1");
        User user2 = new SimpleUser(chat,"User2");
        User user3 = new SimpleUser(chat,"User3");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        chat.addUserToChat(user3);

        user1.sendMessage("Hello, I'm User one");
        admin.sendMessage("Roger that");
    }
}
