package com.udacity.gradle.jokes;

import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.net.*;
import java.io.*;

public class Joker {


    public static String jokeWanted() {
        String joke;
        URL oracle;
        try {
            oracle = new URL("http://tambal.azurewebsites.net/joke/random");
            BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            JSONObject json = new JSONObject(sb.toString());
            joke = json.getString("joke");
            System.out.print(joke);
            in.close();

        } catch (Exception e) {
            joke = "What's down and isn't working? the joke api from where jokes are being fetched. sorry";
        }
        return joke;
    }
}



