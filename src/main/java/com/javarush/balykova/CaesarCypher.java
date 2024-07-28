package com.javarush.balykova;
import com.javarush.balykova.AlphabetConst;


public class CaesarCypher {

    public String caesarEncrypt(String text, int cypherStep){

        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if(character != ' '){
                int currentAlphabetPosition = character - 'а';
                int newAlphabetPosition = (currentAlphabetPosition  + cypherStep) % 33;
                char newCharacter = (char) ('а' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }


        return result.toString();
    }

    public String caesarDecrypt(String encryptedText, int cypherStep){
        return caesarEncrypt(encryptedText, 33 - (cypherStep % 33));
    }

}
