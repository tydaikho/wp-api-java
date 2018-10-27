package wp_api.models;

import com.google.gson.annotations.SerializedName;

public class Comment {

    /**
     * Unique identifier for the object.
     *
     * Read only
     *
     * Context: view, edit, embed
     */
    private Integer id;

    /**
     * The ID of the user object, if author was a user.
     *
     * Context: view, edit, embed
     */
    private Integer author;

    /**
     * Email address for the object author.
     *
     * Context: edit
     */
    @SerializedName("author_email")
    private String authorEmail;

    /**
     * IP address for the object author.
     *
     * Context: edit
     */
    @SerializedName("author_ip")
    private String authorIP;

    /**
     * Display name for the object author.
     *
     * Context: view, edit, embed
     */
    @SerializedName("author_name")
    private String authorName;

    /**
     * URL for the object author.
     *
     * Context: view, edit, embed
     */
    @SerializedName("author_url")
    private String authorURL;

    /**
     * User agent for the object author.
     *
     * Context: edit
     */
    @SerializedName("author_user_agent")
    private String authorUserAgent;

    /**
     * The content for the object.
     *
     * Context: view, edit, embed
     */
    private Field content;

    /**
     * The date the object was published, in the site's timezone.
     *
     * Context: view, edit, embed
     */
    private String date;

    /**
     * The date the object was published, as GMT.
     *
     * Context: view, edit
     */
    @SerializedName("date_gmt")
    private String dateGMT;

    /**
     * URL to the object.
     *
     * Read only
     *
     * Context: view, edit, embed
     */
    private String link;

    /**
     * The ID for the parent of the object.
     *
     * Context: view, edit, embed
     */
    private Integer parent;

    /**
     * The ID of the associated post object.
     *
     * Context: view, edit
     */
    private Integer post;

    /**
     * State of the object.
     *
     * Context: view, edit
     */
    private String status;

    /**
     * Type of Comment for the object.
     *
     * Read only
     *
     * Context: view, edit, embed
     */
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getAuthorIP() {
        return authorIP;
    }

    public void setAuthorIP(String authorIP) {
        this.authorIP = authorIP;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorURL() {
        return authorURL;
    }

    public void setAuthorURL(String authorURL) {
        this.authorURL = authorURL;
    }

    public String getAuthorUserAgent() {
        return authorUserAgent;
    }

    public void setAuthorUserAgent(String authorUserAgent) {
        this.authorUserAgent = authorUserAgent;
    }

    public Field getContent() {
        return content;
    }

    public void setContent(Field content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateGMT() {
        return dateGMT;
    }

    public void setDateGMT(String dateGMT) {
        this.dateGMT = dateGMT;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
