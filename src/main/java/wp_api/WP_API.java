package wp_api;

import wp_api.models.Post;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WP_API {

    private Services services;

    public WP_API(String endpoint) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(endpoint)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        services = retrofit.create(Services.class);
    }

    public Call<Post> getPost(Integer id) {
        return services.getPost(id);
    }
}