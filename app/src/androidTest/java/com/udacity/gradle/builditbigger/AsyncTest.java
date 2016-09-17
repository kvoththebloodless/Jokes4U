package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;

import org.mockito.Mock;

import java.util.concurrent.TimeUnit;

public class AsyncTest extends AndroidTestCase {

    EndpointsAsyncTask task;
    String result;
    @Mock
    Context mockContext;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        result = null;
        task = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String joke) {
                //we don't want our Intent calling mechanism to work
                //as we are just testing the result
            }
        };
    }

    public void testAsyncReturnType() {

        try {

            //20 seconds is usually the limit in which the result should be
            //returned before being considered for a failure
            task.execute(mockContext);
            result = task.get(20, TimeUnit.SECONDS);
            assertNotNull(result);

        } catch (Exception e) {
            fail("Server didn't send results, it timed out");
        }
    }
}