package org.sapm.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringHandlingService {

    public String removeDuplicates(String word) {

        if (word == null) {
            return null; // or throw an exception, depending on your requirements
        }

        return word.chars()
                .distinct()  // Removes duplicate characters
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
