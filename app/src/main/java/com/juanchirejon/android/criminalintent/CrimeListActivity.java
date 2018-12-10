package com.juanchirejon.android.criminalintent;

public class CrimeListActivity extends SingleFragmentActivity{
    @override
    protected Fragment createFragment(){
        return new CrimeListFragment();

    }
}
