package edu.orangecoastcollege.cs273.gbyers.tapcounter;
/**
 * @author Grant Byers (gbyers)
 * 9/8/2016
 *
 * Model for TapCounter app. Provides increment by one for MainActivity
 */

public class Counter {
    private int mCount;


    public Counter(){
        mCount=0;
    }

    /**
     * @return mCount
     */
    public int getCount() {
        return mCount;
    }

    /**
     * Increments the member variable mCount by one.
     */
    public void addCount()
    {
        mCount+=1;
    }

}
