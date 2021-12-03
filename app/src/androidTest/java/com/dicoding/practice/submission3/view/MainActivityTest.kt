package com.dicoding.practice.submission3.view

import androidx.test.core.app.ActivityScenario
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Before
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.dicoding.practice.submission3.R
import org.junit.Test


@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @Before
    fun setup() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun assertMenuButton() {
        onView(withId(R.id.search)).check(matches(isDisplayed()))
        onView(withId(R.id.change_theme)).check(matches(isDisplayed()))


    }
}