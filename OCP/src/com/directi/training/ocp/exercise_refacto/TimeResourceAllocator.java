package com.directi.training.ocp.exercise_refacto;

public class TimeResourceAllocator extends ResourceAllocator {
    @Override
    protected int findFreeSlot() {
        return 0;
    }

    @Override
    protected void markSlotBusy(int resourceId) {
        // Do stuff
    }

    @Override
    protected void markSlotFree(int resourceId) {
        // Do stuff
    }
}
