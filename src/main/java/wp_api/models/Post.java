package wp_api.models;

import com.google.gson.annotations.SerializedName;

public class Post {

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
     * The globally unique identifier for the object.
     *
     * Read only
     *
     * Context: view, edit
     */
    private Field guid;

    /**
     * Unique identifier for the object.
     *
     * Read only
     *
     * Context: view, edit, embed
     */
    private Integer id;

    /**
     * URL to the object.
     *
     * Read only
     *
     * Context: view, edit, embed
     */
    private String link;

    /**
     * The date the object was last modified, in the site's timezone.
     *
     * Read only
     *
     * Context: view, edit
     */
    private String modified;

    /**
     * The date the object was last modified, as GMT.
     *
     * Read only
     *
     * Context: view, edit
     */
    @SerializedName("modified_gmt")
    private String modifiedGMT;

    /**
     * An alphanumeric identifier for the object unique to its type.
     *
     * Context: view, edit, embed
     */
    private String slug;

    /**
     * A named status for the object.
     *
     * Context: view, edit
     *
     * One of: publish, future, draft, pending, private
     */
    private String status;

    /**
     * Type of Post for the object.
     *
     * Read only Context: view, edit, embed
     */
    private String type;

    /**
     * A password to protect access to the content and excerpt.
     *
     * Context: edit
     */
    private String password;

    /**
     * The title for the object.
     *
     * Context: view, edit, embed
     */
    private Field title;

    /**
     * The content for the object.
     *
     * Context: view, edit
     */
    private Field content;

    /**
     * The ID for the author of the object.
     *
     * Context: view, edit, embed
     */
    private Integer author;

    /**
     * The excerpt for the object.
     *
     * Context: view, edit, embed
     */
    private Field excerpt;

    /**
     * The ID of the featured media for the object.
     *
     * Context: view, edit, embed
     */
    @SerializedName("featured_media")
    private Integer featuredMedia;

    /**
     * Whether or not comments are open on the object.
     *
     * Context: view, edit
     *
     * One of: open, closed
     */
    private String comment_status;

    /**
     * Whether or not the object can be pinged.
     *
     * Context: view, edit
     *
     * One of: open, closed
     */
    @SerializedName("ping_status")
    private String pingStatus;

    /**
     * The format for the object.
     *
     * Context: view, edit
     *
     * One of: standard, aside, chat, gallery, link, image, quote, status, video, audio
     */
    private String format;

    /**
     * Whether or not the object should be treated as sticky.
     */
    private Boolean sticky;

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

    public Field getGuid() {
        return guid;
    }

    public void setGuid(Field guid) {
        this.guid = guid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModifiedGMT() {
        return modifiedGMT;
    }

    public void setModifiedGMT(String modifiedGMT) {
        this.modifiedGMT = modifiedGMT;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Field getTitle() {
        return title;
    }

    public void setTitle(Field title) {
        this.title = title;
    }

    public Field getContent() {
        return content;
    }

    public void setContent(Field content) {
        this.content = content;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Field getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Field excerpt) {
        this.excerpt = excerpt;
    }

    public Integer getFeaturedMedia() {
        return featuredMedia;
    }

    public void setFeaturedMedia(Integer featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    public String getComment_status() {
        return comment_status;
    }

    public void setComment_status(String comment_status) {
        this.comment_status = comment_status;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getSticky() {
        return sticky;
    }

    public void setSticky(Boolean sticky) {
        this.sticky = sticky;
    }

}