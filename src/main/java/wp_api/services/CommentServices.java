package wp_api.services;

import java.util.ArrayList;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import wp_api.models.Comment;

public interface CommentServices {

    @GET("wp/v2/comments")
    Call<ArrayList<Comment>> getComments(@QueryMap Map<String, String> arguments);

    @GET("wp/v2/comments/{id}")
    Call<Comment> getComment(@Path("id") Integer id, @QueryMap Map<String, String> arguments);
}
