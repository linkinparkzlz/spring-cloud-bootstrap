package com.example.springcloudbootstrap.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventListenerDemo {


    public static void main(String[] args) {


        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();

        //监听器

        configApplicationContext.addApplicationListener(new MyApplicationListener());


        //上下文启动
        configApplicationContext.refresh();

        //f发布时间
        configApplicationContext.publishEvent(new MyApplicationEvent("Hello World"));
        ;


    }

    private static class
    MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

        @Override
        public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {

            System.out.println(myApplicationEvent.getSource());
        }
    }


    private static class MyApplicationEvent extends ApplicationEvent {

        public MyApplicationEvent(Object source) {
            super(source);
        }
    }
}





























