package com.example;

/**
 * Created by Yuukino on 06-03-2018.
 */

public class AndroidATCTrainings extends AndroidATC{
    public String[] courses = { "Java Fundamentals for Android",
                                "Android Application Development",
                                "Android Security Essentials",
                                "Monetize Android Applications" };

  public String[] certifications ={
          "Android certified Application Developer",
          "Android certified Application Engineer",
          "Android certified Trainer"};

   public String getCourse(int couseNumber){
       return courses[couseNumber];
   }

   public String getCertifications(int certificationCoded){
       return certifications[certificationCoded];
   }

}
