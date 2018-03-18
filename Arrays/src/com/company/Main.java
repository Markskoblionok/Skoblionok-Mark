package com.company;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int a[];
	    a = new int[5];
	    a[0] = -3;
	    a[1] = 2;
	    a[2] = 1;
	    a[3] = 5;
	    a[4] = 6;
	    int per;
	    for (int i = 0; i < a.length/2; i++) {
            per = a[a.length - i - 1];
            a[a.length - i - 1] = a[i];
            a[i] = per;

        }
        System.out.println(Arrays.toString(a));


	    Container container = new Container(10);
		container.add(2);
		System.out.println(Arrays.toString(container.getArray()));
		Container container1 = new Container (10);
		container1.add(1);
		container1.remove(0);
		System.out.println(Arrays.toString(container1.getArray()));
		System.out.println(Arrays.toString(Container.getInstance().getArray()));



		Simlple simlple = new Simlple();
		System.out.println(simlple.field);
		char c;
		int i = 0;

    }
}
