package wp_api.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import wp_api.models.Comment;
import wp_api.services.CommentServices;

/**
 * Comments Collection
 *
 * @link https://developer.wordpress.org/rest-api/reference/comments/
 */
public class Comments {

    /**
     * Comments Arguments
     */
    private Map arguments;

    /**
     * Comments Service
     */
    private CommentServices service;

    /**
     * Comments Construct
     */
    public Comments(Retrofit retrofit) {
        this.service = retrofit.create(CommentServices.class);
        this.arguments = new HashMap<>();
    }

    /**
     * Get Comment by ID
     */
    public Call<Comment> id(Integer id) {
        return service.getComment(id, null);
    }

    /**
     * Scope under which the request is made; determines fields present in response.
     *
     * Default: view
     *
     * One of: view, embed, edit
     */
    public Comments context(String context) {
        this.arguments.put("context", context);
        return this;
    }

    /**
     * Current page of the collection.
     *
     * Default: 1
     */
    public Comments page(Integer page) {
        this.arguments.put("page", page);
        return this;
    }

    /**
     * Maximum number of items to be returned in result set.
     *
     * Default: 10
     */
    public Comments perPage(Integer perPage) {
        this.arguments.put("per_page", perPage);
        return this;
    }

    /**
     * Limit results to those matching a string.
     */
    public Comments search(String q) {
        this.arguments.put("search", q);
        return this;
    }

    /**
     * Limit response to comments published after a given ISO8601 compliant date.
     */
    public Comments after(String date) {
        this.arguments.put("after", date);
        return this;
    }

    /**
     * Limit result set to comments assigned to specific user IDs. Requires authorization.
     */
    public Comments author(String IDs) {
        this.arguments.put("author", IDs);
        return this;
    }

    /**
     * Ensure result set excludes comments assigned to specific user IDs. Requires authorization.
     */
    public Comments authorExclude(String IDs) {
        this.arguments.put("author_exclude", IDs);
        return this;
    }

    /**
     * Limit result set to that from a specific author email. Requires authorization.
     */
    public Comments authorEmail(String email) {
        this.arguments.put("author_email", email);
        return this;
    }

    /**
     * Limit response to comments published before a given ISO8601 compliant date.
     */
    public Comments before(String date) {
        this.arguments.put("before", date);
        return this;
    }

    /**
     * Ensure result set excludes specific IDs.
     */
    public Comments exclude(String IDs) {
        this.arguments.put("exclude", IDs);
        return this;
    }

    /**
     * Limit result set to specific IDs.
     */
    public Comments include(String IDs) {
        this.arguments.put("include", IDs);
        return this;
    }

    /**
     * Offset the result set by a specific number of items.
     */
    public Comments offset(Integer offset) {
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
    public Comments order(String order) {
        this.arguments.put("order", order);
        return this;
    }

    /**
     * Sort collection by object attribute.
     *
     * Default: date_gmt
     *
     * One of: date, date_gmt, id, include, post, parent, type
     */
    public Comments orderby(String orderby) {
        this.arguments.put("orderby", orderby);
        return this;
    }

    /**
     * Limit result set to comments of specific parent IDs.
     */
    public Comments parent(String parent) {
        this.arguments.put("parent", parent);
        return this;
    }

    /**
     * Ensure result set excludes specific parent IDs.
     */
    public Comments parentExclude(String parentExclude) {
        this.arguments.put("parent_exclude", parentExclude);
        return this;
    }

    /**
     * Limit result set to comments assigned to specific post IDs.
     */
    public Comments post(String IDs) {
        this.arguments.put("post", IDs);
        return this;
    }

    /**
     * Limit result set to comments assigned a specific status. Requires authorization.
     *
     * Default: approve
     */
    public Comments status(String status) {
        this.arguments.put("status", status);
        return this;
    }

    /**
     * Limit result set to comments assigned a specific type. Requires authorization.
     *
     * Default: comment
     */
    public Comments type(String type) {
        this.arguments.put("type", type);
        return this;
    }

    /**
     * The password for the post if it is password protected.
     */
    public Comments password(String password) {
        this.arguments.put("password", password);
        return this;
    }

    /**
     * Add custom arguments
     */
    public Comments argument(String context, String value) {
        this.arguments.put(context, value);
        return this;
    }

    /**
     * Get List Comments
     */
    public Call<ArrayList<Comment>> get() {
        return this.service.getComments(this.arguments);
    }

}
