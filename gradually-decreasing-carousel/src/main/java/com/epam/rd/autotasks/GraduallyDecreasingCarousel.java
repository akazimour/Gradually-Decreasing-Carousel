package com.epam.rd.autotasks;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            CarouselRun carouselRun = new CarouselRun();
            carouselRun.setGradual(true);
            return carouselRun;
        }
        return null;
    }

}
