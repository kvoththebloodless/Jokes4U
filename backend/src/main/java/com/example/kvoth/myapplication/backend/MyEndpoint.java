/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.kvoth.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.appengine.repackaged.com.google.common.base.Flag;
import com.udacity.gradle.jokes.Joker;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.kvoth.example.com",
                ownerName = "backend.myapplication.kvoth.example.com",
                packagePath = ""
        )
)
public class MyEndpoint {
//sayHi({'name': name})

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "jokes4u")
    public MyBean jokes4u() {
        MyBean response = new MyBean();
        response.setData(Joker.jokeWanted());

        return response;
    }


}
