package com.example.moon.navigationdrawar;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class pageTwo extends Fragment {
    View view;
    Button btn;
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.pagetwo,container,false);
        btn = (Button)view.findViewById(R.id.button);
        textView = (TextView)view.findViewById(R.id.textView5);

        Bundle bundle = this.getArguments();
        if(bundle!=null){
           String text =  bundle.getString("Key");
           textView.setText(text);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame_content,new pageThree()).commit();
            }
        });
        return view;
    }
}
