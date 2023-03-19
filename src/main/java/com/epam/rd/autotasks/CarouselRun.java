package com.epam.rd.autotasks;

public class CarouselRun {
    int positionNow = 0;
    final int [] array = DecrementingCarousel.carousel.clone();


    public int next() {
        if (isFinished()) {
            return -1;
        } else {
            while (array[positionNow %= array.length] <= 0) {       //Честно позаимствованная проверка
                positionNow++;
            }
        }
        int returnValue = array [positionNow];
        array[positionNow]--;
        positionNow++;
        return returnValue;
    }

    public boolean isFinished() {
        for (int elementsArr:array)
            if (elementsArr > 0) return false;
        return true;
    }

}
