package org.example;

public class StringUtils {
    public static String updateLight(String current) {
        if(current.equals("green")){
            return "yellow";
        } else if(current.equals("yellow")){
            return "red";
        } else {
            return "green";
        }
    }
    public static String remove(String str) {
        String result = "";
        for(int i = 1; i < str.length()-1; i++){
            result += str.charAt(i);
        }
        return result;
    }

}


