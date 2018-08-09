package by.kuchinsky.alexandr.test1;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.widget.Toast;

public class MyStart implements LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void connect(){


    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void disconnect(){

    }




public void test(){


}}