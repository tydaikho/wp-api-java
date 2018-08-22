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
    public Posts author(String IDs) {
        this.arguments.put("author", IDs);
        return this;
    }

    /**
     * Ensure result set excludes posts assigned to specific authors.
     */
    public Posts authorExclude(String IDs) {
        this.arguments.put("author_exclude", IDs);
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
     * Ensure result set excludes specific IDs.
     */
    public Posts exclude(String IDs) {
        this.arguments.put("exclude", IDs);
        return this;
    }

    /**
     * Limit result set to specific IDs.
     */
    public Posts include(String IDs) {
        this.arguments.put("include", IDs);
        return this;
    }

    /**
     * Offset the result set by a specific number of items.
     */
    public Posts offset(Integer offset) {
        this.arguments.put("offset", offset);
        return this;
    }

    /**
     * Order sort attribute ascending or descending.
     *
     * Default: desc
     *
     * One of: asc, desc
     */
    public Posts order(String order) {
        this.arguments.put("order", order);
        return this;
    }

    /**
     * Sort collection by object attribute.
     *
     * Default: date
     *
     * One of: author, date, id, include, modified, parent, relevance, slug, title
     */
    public Posts orderby(String orderby) {
        this.arguments.put("orderby", orderby);
        return this;
    }

    /**
     * Limit result set to posts with one or more specific slugs.
     */
    public Posts slug(String slug) {
        this.arguments.put("slug", slug);
        return this;
    }

    /**
     * Limit result set to posts assigned one or more statuses.
     *
     * Default: publish
     */
    public Posts status(String status) {
        this.arguments.put("status", status);
        return this;
    }

    /**
     * Limit result set to all items that have the specified term assigned in the categories taxonomy.
     */
    public Posts categories(String categories) {
        this.arguments.put("categories", categories);
        return this;
    }

    /**
     * Limit result set to all items except those that have the specified term assigned in the categories taxonomy.
     */
    public Posts categoriesExclude(String categoriesExclude) {
        this.arguments.put("categories_exclude", categoriesExclude);
        return this;
    }

    /**
     * Limit result set to all items that have the specified term assigned in the tags taxonomy.
     */
    public Posts tags(String tags) {
        this.arguments.put("tags", tags);
        return this;
    }

    /**
     * Limit result set to all items except those that have the specified term assigned in the tags taxonomy.
     */
    public Posts tagsExclude(String tagsExclude) {
        this.arguments.put("tags_exclude", tagsExclude);
        return this;
    }

    /**
     * Limit result set to items that are sticky.
     */
    public Posts sticky(Boolean sticky) {
        this.arguments.put("sticky", sticky);
        return this;
    }

    /**
     * Add custom arguments
     */
    public Posts argument(String context, String value) {
        this.arguments.put(context, value);
        return this;
    }

    /**
     * Get List Posts
     */
    public Call<ArrayList<Post>> get() {
        return this.service.getPosts(this.arguments);
    }

}