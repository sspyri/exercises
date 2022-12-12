package com.begginersGuide;

import java.util.Locale;
import java.util.stream.IntStream;

public class Main {
// expected output Lipps_Asvph!

    public static void main(String[] args) {

        String ciphered_msg = "Hello_World!\n";
        int k = 4;
        StringBuilder msg = new StringBuilder(0);
        for (int i = 0 ; i < ciphered_msg.length(); i++){
            char previous_letter = ciphered_msg.charAt(i);
            int ascii_temp = (int) previous_letter  + k;
            if (Character.isLetter(previous_letter)){
                if (Character.isUpperCase(previous_letter)){
                    while(ascii_temp > 90){
                        ascii_temp = (ascii_temp % 90) + 64;
                    }
                        char new_letter = (char)ascii_temp;
                        msg.append(new_letter);
                }
                else{
                    while (ascii_temp > 122){
                        ascii_temp = (ascii_temp % 122) + 96;
                    }

                        char new_letter = (char) ascii_temp;
                        msg.append(new_letter);
                }
            }
            else{
                ascii_temp = (int) previous_letter;
                char new_letter =(char)ascii_temp;
                msg.append(new_letter);
            }
        }
        System.out.println(ciphered_msg);
        System.out.println(msg);
    }
}
