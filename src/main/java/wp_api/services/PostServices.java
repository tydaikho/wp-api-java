package wp_api.services;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import wp_api.models.Post;

public interface PostServices {

    @GET("wp/v2/posts")
    Call<ArrayList<Post>> getPosts();

    @GET("wp/v2/posts/{id}")
    Call<Post> getPostByID(@Path("id") Integer id);

}
