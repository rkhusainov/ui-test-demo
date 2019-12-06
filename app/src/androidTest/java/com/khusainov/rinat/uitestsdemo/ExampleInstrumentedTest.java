package com.khusainov.rinat.uitestsdemo;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    MainPage page = new MainPage();

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

//    @Test
//    public void checkHelloWorld() throws Exception {
//        onView(withId(R.id.tv_text)).check(matches(withText("")));
//        onView(withId(R.id.tv_text)).check(matches(withContentDescription("нажмите чтобы увидеть")));
//        onView(withId(R.id.button)).perform(click());
//        onView(withId(R.id.tv_text)).check(matches(withText("Hello world!")));
//    }

    @Test
    public void checkHelloWorld() throws Exception {
        page.getTextView().check(matches(withText("")));
        page.getTextView().check(matches(withContentDescription("нажмите чтобы увидеть")));
        page.getButton().perform(click());
        page.getTextView().check(matches(withText("Hello world!")));
    }

    public void checkElementInRecycler() throws Exception {
        page.getRecyclerView().perform(RecyclerViewActions.scrollTo(withText("10")));
        page.getRecyclerView().perform(RecyclerViewActions.scrollTo(hasDescendant(withText("10"))));
        page.getRecyclerView().check(matches(isDisplayed()));
        page.getRecyclerView().perform(RecyclerViewActions.actionOnItemAtPosition(30, click()));
        page.getRecyclerView().perform(RecyclerViewActions.actionOnItem(withText("10"), click()));
        page.getRecyclerView().perform(RecyclerViewActions.scrollToPosition(10));
        page.getRecyclerView().perform(RecyclerViewActions.scrollToPosition(20));
        page.getRecyclerView().perform(RecyclerViewActions.scrollToPosition(30));
    }
}
