package data.pullrequestrepository

import data.models.pullrequest.PullRequest
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by andre on 01/07/17.
 */
interface PullRequestApi {

    @GET("search/repositories")
    fun searchRespoistory(@Query("q") technologyName : String, @Query("sort") relevant : String ) : Observable<PullRequest>

}