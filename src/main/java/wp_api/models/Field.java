package wp_api.models;

import com.google.gson.annotations.SerializedName;

public class Field {

    private String rendered;

    @SerializedName("protected")
    private Boolean isProtected;

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    public Boolean getProtected() {
        return isProtected;
    }

    public void setProtected(Boolean aProtected) {
        isProtected = aProtected;
    }

}
