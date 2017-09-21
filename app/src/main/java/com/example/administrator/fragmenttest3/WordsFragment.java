package com.example.administrator.fragmenttest3;

import android.app.ListFragment;
import android.support.v4.app.Fragment;


/**
 * word list 를 나타낼 fragment 입니다.
 */
public class WordsFragment extends ListFragment {
    OnWordSelectedListener mCallback;

    /**
     * 액티비티와 프래그먼트가 데이터를 주고 받는 인터페이스
     */
    public interface OnWordSelectedListener {
        public void onWordSelected(int position);
    }


}
