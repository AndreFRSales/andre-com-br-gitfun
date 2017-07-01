package data.models.pullrequest

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by andre on 01/07/17.
 */
class PullRequest {

    @SerializedName("items")
    @Expose
    var items: List<Item>? = null
}