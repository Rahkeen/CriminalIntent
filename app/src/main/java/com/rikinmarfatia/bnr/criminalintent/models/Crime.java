package com.rikinmarfatia.bnr.criminalintent.models;

import java.util.Date;
import java.util.UUID;

/**
 * Model for crimes, holds pertinent information that a crime might have.
 *
 * @author Rikin (rikinm10@gmail.com)
 * @version 1.0
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
