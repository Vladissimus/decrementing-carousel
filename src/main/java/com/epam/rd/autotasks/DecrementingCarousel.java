package com.epam.rd.autotasks;

public class DecrementingCarousel {
    static int [] carousel;
    private final int capacity;
    int index = 0;
    boolean isRun = false;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
    }

    public boolean addElement(int element){
        if (element > 0 && index < capacity && !isRun){
            carousel [index] = element;
            index++;
            return true;
        } return false;
    }

    public CarouselRun run(){
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        } return null;
    }
}
