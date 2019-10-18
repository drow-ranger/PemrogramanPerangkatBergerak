package xyz.deonico.latihanmenu.ui.nilai;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NilaiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NilaiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is nilai fragment");
    }

    public LiveData<String> getText() { return mText; }

}
