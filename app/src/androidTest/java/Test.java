import android.content.Context;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingResource;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.R;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static org.junit.Assert.assertNotNull;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class Test {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    private IdlingResource mIdlingResource;


    @Before
    public void registerIdlingResource() {
        mIdlingResource = mActivityTestRule.getActivity().getIdlingResource();
//         To prove that the test fails, omit this call:
        Espresso.registerIdlingResources(mIdlingResource);
    }

    @Ignore
    @org.junit.Test
    public void checkJoke_MainActivity() {
        onView(ViewMatchers.withId(R.id.button)).perform(click());
        onView(withText("Your browser must be caching the old content")).check(matches(isDisplayed()));
    }

    @org.junit.Test
    @SuppressWarnings("unchecked")
    public void checkJoke_EndpointsAsyncTask() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask task = new EndpointsAsyncTask();

        task.execute(new Pair<Context, String>(getTargetContext(), ""));

        assertNotNull(task.get());
    }
}
