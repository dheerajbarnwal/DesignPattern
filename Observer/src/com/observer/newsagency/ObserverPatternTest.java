package com.observer.newsagency;

import java.util.Scanner;

/**
 * Created by Dheeraj Kumar Barnwal on 04/07/18.
 */
public class ObserverPatternTest {
    public static void main(String args[]){

        //create subject
        News news = new News();

        //create observers
        FinancialNews finNews = new FinancialNews();
        TechnicalNews techNews = new TechnicalNews();

        //register observers to the subject
        news.register(finNews);
        news.register(techNews);

        //attach observer to subject
        finNews.setSubject(news);
        techNews.setSubject(news);

        Scanner sc = new Scanner(System.in);

        //now post news to subject
        while(true){
            System.out.println("Enter news or pess q to exit");
            System.out.println("type (tech/fin)");
            String type = sc.nextLine();
            if(type.equals("q")){
                System.exit(0);
            }
            System.out.println("Now enter news :");
            String s = sc.nextLine();
            if(s.equals("q")){
                System.exit(0);
            }
            news.postNews(type, s);

        }


    }
}
