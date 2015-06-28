package com.rikinmarfatia.bnr.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by rikin on 6/22/15.
 */
public class CrimeListActivity extends SingleFragmentActivity{


    @Override
    public Fragment createFragment() {
        return new CrimeListFragment();
    }
}
