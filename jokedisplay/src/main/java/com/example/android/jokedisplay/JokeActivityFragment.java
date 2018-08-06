package com.example.android.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by joycelin12 on 7/30/18.
 */

public class JokeActivityFragment extends Fragment {

    public JokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_joke, container, false);
        String joke="";

        if (getActivity() != null) {

            Intent intent = getActivity().getIntent();
            joke = intent.getStringExtra(JokeActivity.JOKE_KEY);

        }

        TextView jokeTextView = (TextView) root.findViewById(R.id.joke_textview);
        if (!TextUtils.isEmpty(joke)) {
            jokeTextView.setText(joke);
        }

        return root;
    }
}
