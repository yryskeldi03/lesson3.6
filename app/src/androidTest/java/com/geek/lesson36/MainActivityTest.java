package com.geek.lesson36;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

   /* @Test
    public void checkBtnVisibility(){
        onView(withId(R.id.btn_plus)).perform(click());
        onView(withId(R.id.btn_minus)).check(matches(isDisplayed()));
    }*/
    @Test
    public void addBtnTest(){
        onView(withId(R.id.et_int1)).perform(typeText("3"));
        onView(withId(R.id.et_int2)).perform(typeText("7"));
        onView(withId(R.id.btn_plus)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("10")));
    }
    @Test
    public void minusBtnTest() {
        onView(withId(R.id.et_int1)).perform(typeText("12"));
        onView(withId(R.id.et_int2)).perform(typeText("4"));
        onView(withId(R.id.btn_minus)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("8")));
    }
}
