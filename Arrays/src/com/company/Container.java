package com.company;

import java.util.Arrays;

public class Container {
    private static Container instance;

    private static int Array[];

    public Container() {
        Array = new int[10];
    }

    public Container(int size){
        Array = new int [size];
    }

    static {
        instance = new Container();
    }

    public static Container getInstance() {
        return instance;
    }



    public int[] getArray() {
        return Array;
    }

    public void setArray(int[] array) {
        Array = array;
    }

    public void add(int number){
        for (int i = 0; i < Array.length; i++){
            if (this.Array[i] == 0){
                this.Array[i] = number;
                break;
            }
        }
    }
    public void remove(int index){
        for (int i = 0; i < Array.length; i++) {
            if (i == index) {
                this.Array[index] = 0;
            }
        }
    }
    public int count(){
        int counter = 0;
        for (int i = 0; i < Array.length; i++){
            if (Array[i] != 0){
                counter++;
            }
        }
        return counter;
    }
    public static Container Union(Container container1, Container container2){
        Container container3 = new Container(container1.count() + container2.count());
            for(int i = 0; i < container1.count(); i++){
                for (int j = 0; j < container2.count(); j++){
                   container3.Array[i] = container1.Array[i];
                   container3.Array[j+container1.count()] = container2.Array[j];

                }
            }
        return container3;
    }
}




