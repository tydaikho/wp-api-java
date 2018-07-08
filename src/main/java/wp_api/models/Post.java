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
     * The ID for the author of the object.
     *
     * Context: view, edit, embed
     */
    private Integer author;

    /**
     * The ID of the featured media for the object.
     *
     * Context: view, edit, embed
     */
    @SerializedName("featured_media")
    private Integer featuredMedia;

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

    @Override
    public String toString() {
        return "Post{" +
                "date='" + date + '\'' +
                ", dateGMT='" + dateGMT + '\'' +
                ", id=" + id +
                ", link='" + link + '\'' +
                ", modified='" + modified + '\'' +
                ", modifiedGMT='" + modifiedGMT + '\'' +
                ", slug='" + slug + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", author=" + author +
                ", featuredMedia=" + featuredMedia +
                ", pingStatus='" + pingStatus + '\'' +
                ", format='" + format + '\'' +
                ", sticky='" + sticky + '\'' +
                '}';
    }
}