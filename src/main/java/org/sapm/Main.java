package org.sapm;

import org.sapm.services.StringHandlingService;

public class Main {

    private static StringHandlingService service;
    public static void main(String[] args) {

        service = new StringHandlingService();

        String word = "AABBCCD112233";
        String result = service.removeDuplicates(word);
        System.out.println("Original word: " + word);
        System.out.println("After removing duplicates: " + result);


    }


}