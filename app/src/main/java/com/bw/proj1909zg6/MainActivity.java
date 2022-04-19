package com.bw.proj1909zg6;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bw.proj1909zg6.databinding.ActivityMainBinding;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    private Button btnTest;

    public ObservableField<String> testTxt=new ObservableField<>();
//    ObservableInt observableInt=new ObservableInt();



    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setOwn(this);

        getLifecycle().addObserver(new BasePersenter());

//        btnTest = (Button) findViewById(R.id.btn_test);
//        btnTest.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

//        ArrayList<String> list=new ArrayList<>();
//        list.add("1");
//        list.add("10");
////        list.add(100.0f);
////        list.add(1000L);
//
//        Class<? extends ArrayList> clazz = list.getClass();
//        Method[] methods = clazz.getDeclaredMethods();
//        for (Method method:methods){
//            if (method.getName().equals("add")){
//                try {
//                    if (method.getGenericParameterTypes().length==1){
//                        method.invoke(list,10);
//                        method.invoke(list,100.0F);
//                        method.invoke(list,1000L);
//                    }
//
//
//                } catch (Exception exception) {
//                    exception.printStackTrace();
//                }
//            }
//        }
//
//        for (Object obj:list){
//            Log.d("123", "onCreate: "+obj);
//        }

//        observableInt.set(10);
//
//        observableInt.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
//            @Override
//            public void onPropertyChanged(Observable sender, int propertyId) {
//
//            }
//        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        testTxt.set("我是小明同学");
    }

    public void onClick(View view){
//        Toast.makeText(this, "111", Toast.LENGTH_SHORT).show();
        String s = testTxt.get();
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

}