package data.models.pullrequest

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by andre on 01/07/17.
 */
class Item {

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("full_name")
    @Expose
    var full_name: String? = null

    @SerializedName("score")
    @Expose
    var score: Float? = null
}