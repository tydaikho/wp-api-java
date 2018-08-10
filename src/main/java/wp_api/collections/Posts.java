package wp_api.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import wp_api.models.Post;
import wp_api.services.PostServices;

/**
 * Posts Collection
 *
 * @link https://developer.wordpress.org/rest-api/reference/posts/
 */
public class Posts {

    /**
     * Posts Arguments
     */
    private Map arguments;

    /**
     * Posts Service
     */
    private PostServices service;

    /**
     * Posts Construct
     */
    public Posts(Retrofit retrofit) {
        this.service = retrofit.create(PostServices.class);
        this.arguments = new HashMap<>();
    }

    /**
     * Get Post by ID
     */
    public Call<Post> id(Integer id) {
        return service.getPost(id, null);
    }

    /**
     * Scope under which the request is made; determines fields present in response.
     *
     * Default: view
     *
     * One of: view, embed, edit
     */
    public Posts context(String context) {
        this.arguments.put("context", context);
        return this;
    }

    /**
     * Current page of the collection.
     *
     * Default: 1
     *
     * @return Posts
     */
    public Posts page(Integer page) {
        this.arguments.put("page", page);
        return this;
    }

    /**
     * Maximum number of items to be returned in result set.
     *
     * Default: 10
     *
     * @return Posts
     */
    public Posts perPage(Integer perPage) {
        this.arguments.put("per_page", perPage);
        return this;
    }

    /**
     * Limit results to those matching a string.
     */
    public Posts search(String q) {
        this.arguments.put("search", q);
        return this;
    }

    /**
     * Limit response to posts published after a given ISO8601 compliant date.
     */
    public Posts after(String date) {
        this.arguments.put("after", date);
        return this;
    }

    /**
     * Limit result set to posts assigned to specific authors.
     */
    public Posts author(Integer id) {
        this.arguments.put("author", id);
        return this;
    }

    /**
     * Ensure result set excludes posts assigned to specific authors.
     */
    public Posts authorExclude(Integer id) {
        this.arguments.put("author_exclude", id);
        return this;
    }

    /**
     * Limit response to posts published before a given ISO8601 compliant date.
     */
    public Posts before(String date) {
        this.arguments.put("before", date);
        return this;
    }

    /**
     * Get List Posts
     */
    public Call<ArrayList<Post>> get() {
        return this.service.getPosts(this.arguments);
    }

}