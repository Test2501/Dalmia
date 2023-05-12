package com.dalmia.demo.test;


import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[A-Z]+[a-z]", "pGGGa"));

        System.out.println();

        //if the regex accepts min 4 chars sequence, starting with P or R
        System.out.println(Pattern.matches("[PR][a-z]{4}", "Param"));
        System.out.println(Pattern.matches("[PR][a-z]{4,}", "Deepak"));
        System.out.println(Pattern.matches("[PR][a-z]{4,}", "Piyush"));
        System.out.println();

        //Quantifiers examples..
        //[x]?, X occurs once or not at all
//        System.out.println(Pattern.matches("[xyz]?", "x"));
//        System.out.println(Pattern.matches("[xyz]?", "xxyyzz"));
//        System.out.println(Pattern.matches("[xyz]?", ""));
//        System.out.println();
//
//
//        //[x]+, X occurs once or more times
//        System.out.println(Pattern.matches("[xyz]+", "x"));
//        System.out.println(Pattern.matches("[xyz]+", "xxxyyyzz"));
//        System.out.println(Pattern.matches("[xyz]+", ""));
//        System.out.println();
//
//        //[x]*, X occurs zero or more times
//        System.out.println(Pattern.matches("[xyz]*", "x"));
//        System.out.println(Pattern.matches("[xyz]*", "xxxyyyzz"));
//        System.out.println(Pattern.matches("[xyz]*", ""));
//        System.out.println();
//
//
//        //Meta-character example
//        // "\d if the character sequence consists of any digit
//        System.out.println(Pattern.matches("[\\d]", "1"));
//        System.out.println(Pattern.matches("[\\d]", "1a"));

    }
}
