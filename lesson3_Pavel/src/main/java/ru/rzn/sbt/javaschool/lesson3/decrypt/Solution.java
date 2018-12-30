package ru.rzn.sbt.javaschool.lesson3.decrypt;

public class Solution {
    /**
     * Дешфрование строки
     *
     * Реализуйте метод decrypt, осуществляющий расшифровку сроки encrypted с использованием {@link StringBuilder}.
     *
     * Входящая строка зашифрована следующим образом:
     * а) Зашифрованы только символы латинского алфавита, прочие следует оставлять в исходном виде
     * б) Каждый символ зашифрован ASCII кодом со смещением 9, например 'a' -> 'j'
     * в) После символа 'z' шифрование осуществляется циклически, независимо от регистра символа, например,
     * 'x' -> 'g', 'V' -> 'E'
     *
     * Не забудте проверку на null.
     */
    public static String decrypt(String encrypted){
        if (null == encrypted) return null;
        StringBuilder decryptedString = new StringBuilder();
        char[] encryptedArray = encrypted.toCharArray();
        for(char item : encryptedArray) {
            if (item >= 'a' && item <= 'z') {
                int ord = (int)item - 9;
                if (ord < 'a') ord = 'z' + ord - 'a' + 1;
                decryptedString.append((char)ord);
            } else if (item >= 'A' && item <= 'Z'){
                int ord = (int)item - 9;
                if (ord < 'A') ord = 'Z' + ord - 'A' + 1;
                decryptedString.append((char)ord);
            } else {
                decryptedString.append(item);
            }
        }
        return decryptedString.toString();
    }
}
