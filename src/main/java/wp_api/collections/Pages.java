package wp_api.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import wp_api.models.Page;
import wp_api.services.PageServices;

/**
 * Pages Collection
 *
 * @link https://developer.wordpress.org/rest-api/reference/pages/
 */
public class Pages {

    /**
     * Pages Arguments
     */
    private Map arguments;

    /**
     * Pages Service
     */
    private PageServices service;

    /**
     * Pages Construct
     */
    public Pages(Retrofit retrofit) {
        this.service = retrofit.create(PageServices.class);
        this.arguments = new HashMap<>();
    }

    /**
     * Get Page by ID
     */
    public Call<Page> id(Integer id) {
        return service.getPage(id, null);
    }

    /**
     * Scope under which the request is made; determines fields present in response.
     *
     * Default: view
     *
     * One of: view, embed, edit
     */
    public Pages context(String context) {
        this.arguments.put("context", context);
        return this;
    }

    /**
     * Current page of the collection.
     *
     * Default: 1
     */
    public Pages page(Integer page) {
        this.arguments.put("page", page);
        return this;
    }

    /**
     * Maximum number of items to be returned in result set.
     *
     * Default: 10
     */
    public Pages perPage(Integer perPage) {
        this.arguments.put("per_page", perPage);
        return this;
    }

    /**
     * Limit results to those matching a string.
     */
    public Pages search(String q) {
        this.arguments.put("search", q);
        return this;
    }

    /**
     * Limit response to posts published after a given ISO8601 compliant date.
     */
    public Pages after(String date) {
        this.arguments.put("after", date);
        return this;
    }

    /**
     * Limit result set to posts assigned to specific authors.
     */
    public Pages author(String IDs) {
        this.arguments.put("author", IDs);
        return this;
    }

    /**
     * Ensure result set excludes posts assigned to specific authors.
     */
    public Pages authorExclude(String IDs) {
        this.arguments.put("author_exclude", IDs);
        return this;
    }

    /**
     * Limit response to posts published before a given ISO8601 compliant date.
     */
    public Pages before(String date) {
        this.arguments.put("before", date);
        return this;
    }

    /**
     * Ensure result set excludes specific IDs.
     */
    public Pages exclude(String IDs) {
        this.arguments.put("exclude", IDs);
        return this;
    }

    /**
     * Limit result set to specific IDs.
     */
    public Pages include(String IDs) {
        this.arguments.put("include", IDs);
        return this;
    }

    /**
     * Limit result set to posts with a specific menu_order value.
     */
    public Pages menuOrder(String menuOrder) {
        this.arguments.put("menu_order", menuOrder);
        return this;
    }

    /**
     * Offset the result set by a specific number of items.
     */
    public Pages offset(Integer offset) {
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
    public Pages order(String order) {
        this.arguments.put("order", order);
        return this;
    }

    /**
     * Sort collection by object attribute.
     *
     * Default: date
     *
     * One of: author, date, id, include, modified, parent, relevance, slug, title, menu_order
     */
    public Pages orderby(String orderby) {
        this.arguments.put("orderby", orderby);
        return this;
    }

    /**
     * Limit result set to items with particular parent IDs.
     */
    public Pages parent(String parent) {
        this.arguments.put("parent", parent);
        return this;
    }

    /**
     * Limit result set to all items except those of a particular parent ID.
     */
    public Pages parentExclude(String parentExclude) {
        this.arguments.put("parent_exclude", parentExclude);
        return this;
    }

    /**
     * Limit result set to posts with one or more specific slugs.
     */
    public Pages slug(String slug) {
        this.arguments.put("slug", slug);
        return this;
    }

    /**
     * Limit result set to posts assigned one or more statuses.
     *
     * Default: publish
     */
    public Pages status(String status) {
        this.arguments.put("status", status);
        return this;
    }

    /**
     * Add custom arguments
     */
    public Pages argument(String context, String value) {
        this.arguments.put(context, value);
        return this;
    }

    /**
     * Get List Pages
     */
    public Call<ArrayList<Page>> get() {
        return this.service.getPages(this.arguments);
    }

}
