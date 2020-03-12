package com.st;

public class Box {
    int width;
    int height;
    int depf;
    Boxcolor color;

    public Box() {
    }
    public Box(int width, int height, int depf,Boxcolor color){
        this.width=width;
        this.height=height;
        this.depf=depf;
        this.color=color;
    }
    public int volume(){return  width* height *depf;}
    public  double flexiblevolume(double divider){
        return  width*divider*depf*divider *height*divider;
    }
    public  void  printvolume(){
        int volume=volume();
        System.out.println( volume);
    }
}
