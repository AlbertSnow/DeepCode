package com.albert.snow.deepcode.aspectj;

import android.util.Log;
import android.view.View;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import static com.albert.snow.datasdk.DataSdkGlobalKt.TAG;

@Aspect
public class ViewOnClickListenerAspectj {

    @After("execution(* android.view.View.onClickListener.onClick(android.view.View))")
    public void onViewClickAOP(final JoinPoint joinPoint) {
        View view = (View) joinPoint.getArgs()[0];
        Log.i(TAG, "onViewClickAOP ++++++++++++++++++++ ");
    }

    @After("execution(* com.albert.snow.deepcode.MainActivity.initView())")
    public void onInitViewAOP(final JoinPoint joinPoint) {
//        View view = (View) joinPoint.getArgs()[0];
        Log.i(TAG, "onInitViewAOP ++++++++++++++++++++ ");
    }

    @Around("execution(* com.albert.snow.deepcode.MainActivity.initView())")
    public void onCreateAround(final ProceedingJoinPoint joinPoint) {
        long start = System.nanoTime();
        Log.i(TAG, "onCreate AOP ++++++++++++++++++++ ");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Log.i(TAG, "onCreate AOP ++++++++++++++++++++ ");
        Log.i(TAG, "cast nano time: " + (System.nanoTime() - start));
    }

}
