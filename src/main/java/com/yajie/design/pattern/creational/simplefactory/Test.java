package com.yajie.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {


        //1
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();


        //2
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();
    }
}
