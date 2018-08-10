package wp_api.services;

import java.util.ArrayList;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import wp_api.models.Post;

public interface PostServices {

    @GET("wp/v2/posts")
    Call<ArrayList<Post>> getPosts(@QueryMap Map<String, String> arguments);

    @GET("wp/v2/posts/{id}")
    Call<Post> getPost(@Path("id") Integer id, @QueryMap Map<String, String> arguments);

}
