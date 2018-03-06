package com.example;

public class MyClass {
    public static void main(String[] args){

        AndroidATCTrainings aat = new AndroidATCTrainings();

        int courseNum = 3;
        int certiNum = 2;

        System.out.println("Company Info\n");
        System.out.println(aat.getCompanyInfo());
        System.out.println("Contact Info\n");
        System.out.println(aat.getInfo());

        if(courseNum>=0 && courseNum<=aat.courses.length-1) {
            System.out.println("Course Info\n");
            System.out.println(aat.getCourse(courseNum));
        }
        else
        {
            System.out.println("Error, invalid number of course");
        }

        if(certiNum>=0 && certiNum<=aat.certifications.length-1) {

            System.out.println("Certification Info\n");
            System.out.println(aat.getCertifications(certiNum));
        }
        else
        {
            System.out.println("Error, invalid number of Certification");
        }


    }
}
