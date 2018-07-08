package wp_api;

import wp_api.models.Post;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Services {

    @GET("wp/v2/posts/{id}")
    Call<Post> getPost(@Path("id") Integer id);
}
