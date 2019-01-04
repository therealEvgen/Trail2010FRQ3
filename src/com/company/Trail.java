package com.company;

public class Trail {
    private int[] markers;

    public boolean isLevelTrailSegment (int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = start + 1; j <= end; j++) {
                if (Math.abs(this.markers[i] - this.markers[j]) > 10)
                    return false;
            }
        }
        return true;
    }

    public boolean isDifficult() {
        int numChanges = 0;
        for (int i = 0; i < this.markers.length - 1; i++) {
            if (Math.abs(this.markers[i] - this.markers[i+1]) >= 30)
                numChanges++;
        }
        return (numChanges >= 3);
    }
}