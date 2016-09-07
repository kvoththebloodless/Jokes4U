package com.udacity.gradle.jokes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
public class Joker {
    public String jokeWanted()
    {
        Scanner sc=null;
        int i=0;
        String joke="joke's on you";
        int jokeno=new Random().nextInt(72);
        System.out.println(jokeno);
        try {
            sc= new Scanner(new File("jokes"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(sc!=null&&sc.hasNextLine() && i!=jokeno)
        {
          i++;
            sc.nextLine();
        }
        try {
            joke = sc.nextLine();
        }
        catch(Exception e)
        {}
       return joke;
    }

}
