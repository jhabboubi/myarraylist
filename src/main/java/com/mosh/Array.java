package com.mosh;


import java.util.Arrays;
import java.util.StringJoiner;

public class Array <T extends Number>{

    // fields

    private Object[] content;
    private int index;


    // constructor takes length of array
    public Array(int length){
        this.content = new Object[length];

    }
    // default constructor length 10
    public Array(){
        this(10);
    }
    // print array elements
    public String print(){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < content.length; i++) {
            sj.add(String.valueOf(content[i]));
        }
        return sj.toString();
    }


    // insert array
    public void insert(T value){
      if(this.index == content.length){
            content = Arrays.copyOf(content,content.length*2);
      }
        content[index] = value;
        index++;

    }

    public void removeAt(int index){
        if(index > content.length)
            throw new ArrayIndexOutOfBoundsException(String.format("Length: %d Index: %d",content.length,this.index));
        content[index] = null;
    }

    public int indexOf(T value){
        for (int i = 0; i < content.length; i++) {
            if(content[i]==value)
                return i;
        }
        return -1;
    }




    public Object getContent(int index) {
        return content[index];
    }

    public int getLength(){
        return content.length;
    }


}
