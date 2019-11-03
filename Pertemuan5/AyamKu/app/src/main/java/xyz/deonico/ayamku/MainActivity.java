package xyz.deonico.ayamku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import xyz.deonico.ayamku.adapter.AyamAdapter;
import xyz.deonico.ayamku.api.BaseApiService;
import xyz.deonico.ayamku.api.UtilsApi;
import xyz.deonico.ayamku.model.ResponseAyam;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.pbLoading)
    ProgressBar pbLoading;
    @BindView(R.id.rvRepos)
    RecyclerView rvRepos;
    @BindView(R.id.totalPrice)
    TextView totaPrice;

    BaseApiService mApiService;
    AyamAdapter mRepoAdapter;

    List<ResponseAyam> repoList = new ArrayList<>();

    public int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mApiService = UtilsApi.getAPIService();

        mRepoAdapter = new AyamAdapter(this, repoList, null);
        rvRepos.setLayoutManager(new LinearLayoutManager(this));
        rvRepos.setItemAnimator(new DefaultItemAnimator());
        rvRepos.setHasFixedSize(true);
        rvRepos.setAdapter(mRepoAdapter);

        requestRepos();
    }

    private void requestRepos() {
        pbLoading.setVisibility(View.VISIBLE);

        mApiService.requestRepos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<ResponseAyam>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<ResponseAyam> responseRepos) {
                        for (int i = 0; i < responseRepos.size(); i++) {
                            String id = responseRepos.get(i).getId();
                            String name = responseRepos.get(i).getName();
                            String description = responseRepos.get(i).getDescription();
                            String createdAt = responseRepos.get(i).getCreatedAt();
                            String price = responseRepos.get(i).getPrice();
                            String url_photo = responseRepos.get(i).getUrlPhoto();

                            repoList.add(new ResponseAyam(id, name, description, createdAt, price, url_photo));
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {
                        pbLoading.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Berhasil mengambil data", Toast.LENGTH_SHORT).show();

                        mRepoAdapter = new AyamAdapter(MainActivity.this, repoList, null);
                        rvRepos.setAdapter(mRepoAdapter);

                        mRepoAdapter.setOnClickListener(new AyamAdapter.OnItemClickListener() {
                            @Override
                            public void onItemClick(int position) {
                                total = total + Integer.parseInt(repoList.get(position).getPrice());
                                totaPrice.setText(String.valueOf("Rp."  + total));
                            }
                        });
                        mRepoAdapter.notifyDataSetChanged();
                    }
                });
    }
}
