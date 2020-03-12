package com.st;

public class lesson1 {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.depf = 3;
        box1.height = 4;
        box1.width = 5;

        Box box2 = new Box(3, 4, 5,Boxcolor.RED);
        int boxVolume = box1.volume();
        System.out.println(box2.color);
        box2.printvolume();


    }


}


