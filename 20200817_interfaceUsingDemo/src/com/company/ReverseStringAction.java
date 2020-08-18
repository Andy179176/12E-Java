package com.company;

public class ReverseStringAction implements Action {

    @Override
    public String doAction(String string) {
        char[] chars = string.toCharArray();
        String reversedString = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversedString += chars[i];
        }
        return reversedString;
    }
}
