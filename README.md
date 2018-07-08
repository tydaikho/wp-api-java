# A WordPress REST API client for Java y Android

> This library is an isomorphic client for the [WordPress REST API](http://developer.wordpress.org/rest-api), designed to work with WordPress 4.7 or later. If you are using the older [WP REST API plugin](https://github.com/WP-API/WP-API), some commands will not work.

### Gradle

```groovy
implementation 'com.google.code.gson:gson:2.8.5'
implementation 'com.squareup.retrofit2:retrofit:2.4.0'
implementation 'com.squareup.retrofit2:converter-gson:2.4.0'
implementation project(path: ':wp-api-java')
```

### Get the post in Android with ID 15

```java
package com.thogoll.wpblog;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import wp_api.WP_API;
import wp_api.models.Post;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create WP_API instance
        WP_API wp_api = new WP_API("http://demo.wp-api.org/wp-json/");

        // Get the post with ID 15
        Call<Post> postCall = wp_api.getPost(15);

        postCall.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(@NonNull Call<Post> call, @NonNull Response<Post> response) {

                Post post = response.body();

                // Your code on response

            }

            @Override
            public void onFailure(@NonNull Call<Post> call, @NonNull Throwable t) {

                // Your code on failure

            }
        });

    }
}
```