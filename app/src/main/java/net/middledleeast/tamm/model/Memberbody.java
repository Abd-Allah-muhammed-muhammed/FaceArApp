
package net.middledleeast.tamm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Memberbody {

    @SerializedName("memberbody")
    @Expose
    private String memberbody;

    public String getMemberbody() {
        return memberbody;
    }

    public void setMemberbody(String memberbody) {
        this.memberbody = memberbody;
    }

}
