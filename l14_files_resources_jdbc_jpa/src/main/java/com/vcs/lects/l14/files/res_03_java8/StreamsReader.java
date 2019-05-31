package com.vcs.lects.l14.files.res_03_java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class StreamsReader {

    public static void main(String args[]) {

        String fileName = "duomenys.dat";


        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(System.out::println);

//            List<String> lines =  stream.collect(Collectors.toCollection(new::ArrayList));
//            List<String> lines =  stream.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
