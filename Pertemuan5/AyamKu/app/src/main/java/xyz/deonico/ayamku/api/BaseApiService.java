package xyz.deonico.ayamku.api;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import xyz.deonico.ayamku.model.ResponseAyam;

public interface BaseApiService {
    @GET("ayam")
    Observable<List<ResponseAyam>> requestRepos();
}
