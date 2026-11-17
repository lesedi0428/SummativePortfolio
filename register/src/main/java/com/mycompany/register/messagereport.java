/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.register;

/**
 *
 * @author lesed
 */
public class messagereport {
    
   
   
    public static void displaySenderRecipient() {
        
        for(message msg : message.storedMessages) {
                System.out.println("Sender: User");
                System.out.println( "Recipient: " + msg.getRecipient());
                System.out.println();
        }
    }

    public static void displayLongestMessage() {

        message longest = null;

        for(message msg :message.storedMessages) {
            
            if(longest == null || msg.getMessage().length() > longest.getMessage().length()) {
                longest = msg;
            }
        }

        if(longest != null) {
            System.out.println( "Longest Message:");
            System.out.println(longest.getMessage());
        }
    }

    public static void searchMessageID( String id) {

        for(message msg : message.storedMessages) {
            if(msg.getMessageID().equals(id)) {
                System.out.println("Recipient: " + msg.getRecipient());
                System.out.println("Message: " + msg.getMessage());
                return;
            }
        }
        System.out.println("Message not found.");
    }

    public static void searchRecipient(String recipient) {

        boolean found = false;

        for(message msg : message.storedMessages) {

            if(msg.getRecipient().equals(recipient)) {

                System.out.println( msg.getMessage());

                found = true;
            }
        }

        if(!found) {
            System.out.println("No messages found.");
        }
    }

    public static void deleteMessage(String hash) {

        for(int i = 0; i < message.storedMessages.size(); i++) {

            if(message.storedMessages.get(i).getMessageHash().equals(hash)) {

                message.storedMessages.remove(i);
                System.out.println("Message deleted.");
                return;
            }
        }

        System.out.println("Hash not found.");
    }

    public static void displayReport() {

        System.out.println("\n===== MESSAGE REPORT =====");

        for(message msg : message.storedMessages) {
            System.out.println( "\nMessage ID: " + msg.getMessageID());
            System.out.println( "Hash: " + msg.getMessageHash());
            System.out.println( "Recipient: " + msg.getRecipient());
            System.out.println("Message: " + msg.getMessage());
        }
    }
}

