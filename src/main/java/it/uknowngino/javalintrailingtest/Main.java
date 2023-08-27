package it.uknowngino.javalintrailingtest;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {

    public static void main(String[] args) {

        Javalin javalin = Javalin.create();
        javalin.updateConfig(config -> {

            config.staticFiles.add(staticFile -> {
                staticFile.directory = "/frontend/test";
                staticFile.location = Location.CLASSPATH;
                staticFile.hostedPath = "/test";
            });

        });

        javalin.start(30);

    }

}