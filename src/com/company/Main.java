package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String sentence="i love him and i am doing this for the graham";
        System.out.println(sentence);
        String hashTag="#";
        String [] strings=sentence.split(" ");

        List<String> strings1=new ArrayList<>();

        for (String words :strings) {
            String modifiedText=hashTag+words;
            strings1.add(modifiedText);

        }
        for(int i=0;i<strings1.size();i++){
            System.out.print(strings1.get(i)+" ");
        }
    }
}
