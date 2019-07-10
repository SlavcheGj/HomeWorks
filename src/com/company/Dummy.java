package com.company;

import java.util.Objects;

public class Dummy {
    String name;
    int id;

    public Dummy(String name,int id){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dummy)) return false;
        Dummy dummy = (Dummy) o;
        return Objects.equals(name, dummy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
