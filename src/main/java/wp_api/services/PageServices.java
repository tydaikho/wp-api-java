package wp_api.services;

import java.util.ArrayList;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import wp_api.models.Page;

public interface PageServices {

    @GET("wp/v2/pages")
    Call<ArrayList<Page>> getPages(@QueryMap Map<String, String> arguments);

    @GET("wp/v2/pages/{id}")
    Call<Page> getPage(@Path("id") Integer id, @QueryMap Map<String, String> arguments);
}
