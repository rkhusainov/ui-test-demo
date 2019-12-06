package com.khusainov.rinat.uitestsdemo;

import androidx.test.espresso.ViewInteraction;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

class MainPage {

    private ViewInteraction mTextView = onView(withId(R.id.tv_text));
    private ViewInteraction mButton = onView(withId(R.id.button));

    private ViewInteraction mRecyclerView = onView(withId(R.id.recycler));

    public ViewInteraction getTextView() {
        return mTextView;
    }

    public ViewInteraction getButton() {
        return mButton;
    }

    public ViewInteraction getRecyclerView() {
        return mRecyclerView;
    }
}
