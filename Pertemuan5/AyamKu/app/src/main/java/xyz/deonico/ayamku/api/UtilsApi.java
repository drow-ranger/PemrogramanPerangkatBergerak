package xyz.deonico.ayamku.api;

public class UtilsApi {
    private static final String BASE_URL_API = "http://toko.deonico.xyz/api/";

    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
