package com.smu.mscda;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class CaptilizeAndGenerateMD5Hex {

    public static String Capitalize(String input){
        return StringUtils.capitalize(input);
    }

    public static String GenerateMD5Hex(String input)
    {
        return DigestUtils.md5Hex(input);
    }

    public static void main(String[] args) {
        System.out.println("This program will capitalie the input string and generate MD5 Hex \n\n" +
                "Enter the input string :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("\nCapitalized string is: "+Capitalize(input));
        System.out.println("\nMD5 hex is: "+GenerateMD5Hex(input));
    }
}
