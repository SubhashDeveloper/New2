package com.example.subhash.new2;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Api {
    String BASE_URL = "http://dev1.xicom.us/";

    @Multipart
    @POST("xttest/get_categories.php")
    Call<ResponseBody> upImageMany(@Header("Authorization") String authorization, @Part("Id") RequestBody id, @Part List<MultipartBody.Part> file);
//    change
}
