package wp_api;

import wp_api.collections.Comments;
import wp_api.collections.Pages;
import wp_api.collections.Posts;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WP_API {

    private Retrofit retrofit;

    public WP_API(String endpoint) {
        retrofit = new Retrofit.Builder()
                .baseUrl(endpoint)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Posts posts() {
        return new Posts(retrofit);
    }

    public Pages pages() {
        return new Pages(retrofit);
    }

    public Comments comments() {
        return new Comments(retrofit);
    }

}