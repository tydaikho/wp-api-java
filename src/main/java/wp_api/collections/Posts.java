package wp_api.collections;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;
import wp_api.models.Post;
import wp_api.services.PostServices;

public class Posts {

    private PostServices service;

    public Posts(Retrofit retrofit) {
        service = retrofit.create(PostServices.class);
    }

    public Call<Post> id(Integer id) {
        return service.getPostByID(id);
    }

    public Call<ArrayList<Post>> get() {
        return service.getPosts();
    }
}