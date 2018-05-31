package com.Sachin;

import java.util.List;

public interface ISaved {

    //So we have to store an Object,Let's use an List
    //that we can use any list we want

    List<String> object();
    void read(List<String> savedObjects);

}
