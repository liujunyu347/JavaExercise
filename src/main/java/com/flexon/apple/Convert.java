package com.flexon.apple;

public class Convert {
    public static void main(String[] args) {
        String input = "aA123";
        Convert con = new Convert();
        System.out.println(con.convert(input));
    }

    public String convert(String input){
        char[] array = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : array){
            if (Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else if (Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
