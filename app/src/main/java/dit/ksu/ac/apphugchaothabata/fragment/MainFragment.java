package dit.ksu.ac.apphugchaothabata.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import dit.ksu.ac.apphugchaothabata.R;


public class MainFragment extends Fragment{
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment_layout, container, false);
        return view;
    }
    @Override
    public  void onActivityCreated(@Nullable Bundle  savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        gotoSecord();
    }
    private void gotoSecord(){
        Button button = getView().findViewById(R.id.bottom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecordFragment secordFragment = new SecordFragment();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fraContent,secordFragment)
                        .commit();
            }
        });
    }

    //Main Class
}