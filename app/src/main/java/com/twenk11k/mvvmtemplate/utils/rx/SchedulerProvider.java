package com.twenk11k.mvvmtemplate.utils.rx;


import io.reactivex.Scheduler;


public interface SchedulerProvider {

    Scheduler computation();

    Scheduler io();

    Scheduler ui();
}
