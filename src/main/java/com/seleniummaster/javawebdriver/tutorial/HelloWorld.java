package com.seleniummaster.javawebdriver.tutorial;

import com.seleniummaster.javawebdriver.tutorial.takescreenshot.WebsiteCrawler;


import java.io.IOException;


public class HelloWorld {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("Hello World");

        // URL list

        //String url = "http://www.linkedin.com";
        //String url = "http://www.google.com";
        //String url = "http://www.youtube.com";
        //String url = "http://www.tf.uni-kiel.de";
        //String url = "http://www.pe.tf.uni-kiel.de";
        //String url = "http://www.udemy.com";
        //String url = "http://www.bmi.ir";
        //String url = "http://www.dict.cc";
        String url ="try.arbitrary";


        WebsiteCrawler websiteCrawl = new WebsiteCrawler();

        websiteCrawl.initialDelay();
        int aa = websiteCrawl.setUp(url);
        WebsiteCrawler.showLogs(aa);
        //websiteCrawl.analyzeLog();
        //websiteCrawl.tearDown();




    }
}
