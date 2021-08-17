package Kata;

import java.util.Arrays;

public class ReorderStrings {
    public static String reOrder(String input) {
        String[] tokens = input.split("\\s+");
        String[] newArray = new String[tokens.length];
        for (String token : tokens) {
            for (int counter = 0; counter < token.length(); counter++) {
                if (Character.isDigit(token.charAt((counter)))) {
                    int digit = Integer.parseInt(String.valueOf(token.charAt(counter)));
                    newArray[digit - 1] = token;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word : newArray) {
            sb.append(word).append(" ");
        }

        return sb.toString().trim();
    }
    public static String reOrder1(String input){
        String[] arr=input.split(" ");
        System.out.println(Arrays.toString(arr));
        StringBuilder result=new StringBuilder("");
        for(int counter=0;counter<10;counter++){
           for(int count=counter;count<counter;count++)
//                if(arr.contains(String.valueOf(count)));
                result.append(arr[counter]+" ");

            }

    return result.toString().trim();
    }
}