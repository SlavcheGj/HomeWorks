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
        List<E> tmp = new ArrayList<>(list);
        Collections.reverse(tmp);
        if(list.equals(tmp)) {
            System.out.println("palindrome \n");
        }else {
            System.out.println("Not palindrome \n");
        }

    }

}
