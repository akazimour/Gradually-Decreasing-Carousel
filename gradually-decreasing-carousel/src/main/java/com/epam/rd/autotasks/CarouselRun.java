package com.epam.rd.autotasks;

public class CarouselRun {
    protected final int[] array = DecrementingCarousel.container.clone();
    private boolean gradual = false;
    int i =0;
    int c = 0;

    public int next() {
        if (isFinished())
            return -1;

        if (gradual==true){
            while (array[i %= array.length] <= 0) {
                if (i==0){c++;}
                i++;
            }
            if (i==0){c++;}
            int temp=array[i];
            array[i] = array[i]-c;
            i++;
            return temp;
        }else
            while (array[i %= array.length] <= 0) {
                i++;
            }
        return array[i++]--;
    }

    public boolean isFinished() {
        for (int count : array)
            if (count > 0){
                return false;
            }
        return true;
    }

    public boolean isGradual() {
        return gradual;
    }

    public void setGradual(boolean gradual) {
        this.gradual = gradual;
    }
}
