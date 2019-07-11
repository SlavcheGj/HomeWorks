package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Palindrome<E> {

    private List<E> list = new ArrayList<>();

    public void setList(List<E> list) {
        this.list = list;
    }

    public void checkPalindrome(){

        for(int i=0;i<(list.size()-1)/2;i++) {
            if (!(list.get(i).equals(list.get((list.size()-1)-i)))) {
                System.out.println("Not palindrome \n");
                return;
            }
        }
        System.out.println("Palindrome \n");
    }

}
