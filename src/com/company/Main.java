package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            testPalindrome();
    }


    public static void testPalindrome(){
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        Palindrome palindrome = new Palindrome();

        palindrome.setList(list);
        palindrome.checkPalindrome();

        List<String> stringList = new ArrayList<>();

        stringList.add("b");
        stringList.add("a");
        stringList.add("n");
        stringList.add("a");
        stringList.add("n");
        stringList.add("a");

        Palindrome stringPalindrome = new Palindrome();

        stringPalindrome.setList(stringList);
        stringPalindrome.checkPalindrome();

        List<Character> characterList = new ArrayList<>();

        characterList.add('k');
        characterList.add('a');
        characterList.add('l');
        characterList.add('a');
        characterList.add('b');
        characterList.add('a');
        characterList.add('l');
        characterList.add('a');
        characterList.add('k');

        Palindrome characterPalindrome = new Palindrome();

        characterPalindrome.setList(characterList);
        characterPalindrome.checkPalindrome();

        List<Dummy> dummyList = new ArrayList<>();
        Dummy dummy1 = new Dummy("dummy1",1);
        Dummy dummy2 = new Dummy("dummy2",2);
        Dummy dummy3 = new Dummy("dummy1",3);

        dummyList.add(dummy1);
        dummyList.add(dummy2);
        dummyList.add(dummy3);

        Palindrome dummyPalindrome = new Palindrome();

        dummyPalindrome.setList(dummyList);
        dummyPalindrome.checkPalindrome();
    }
}
