package com.vcs.lects.l17.springboot;


import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

@RestController("/")
public class HelloWorldController {



    @Autowired
    private HttpServletRequest request;

    @GetMapping("")
    public String sayHello() {
        return "<html><body><h1>Labas pasauli, as REST servisas (" + request.getRemoteHost()
                + ")</h1><p align='center'><img src='http://192.168.115.133:8080/generated-image/"+request.getRemoteHost()+"' alt='Paveiksliukas su tavo IP adresu'></p></body></html>";

    }

    @GetMapping("name-{vardas}")
    public String sayHelloWithName(@PathVariable("vardas") String name) {

        return "Labas " + name;
    }


    @GetMapping("person")
    public Person giveMePerson() {
        return new Person("Vardauskas", 45);
    }

    @PostMapping("gimtadienis")
    public Person takePerson(@RequestBody Person person) {
        person.setAge(person.getAge() + 1);
        return person;
    }

    @GetMapping(value = "generated-image/{txt}", produces = {"image/jpeg"})
    public @ResponseBody byte[] getImageAsByteArray(@PathVariable("txt") String txt) throws IOException {

        int width = 250;
        int height = 250;

        // Constructs a BufferedImage of one of the predefined image types.
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Create a graphics which can be used to draw into the buffered image
        Graphics2D g2d = bufferedImage.createGraphics();

        // fill all the image with white
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, width, height);

        // create a circle with black
        g2d.setColor(Color.black);
        g2d.fillOval(0, 0, width, height);

        // create a string with yellow
        g2d.setColor(Color.yellow);
        g2d.drawString("TEXT: " + txt, 50, 120);

        // Disposes of this graphics context and releases any system resources that it is using.
        //g2d.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write( bufferedImage, "jpg", baos );
        baos.flush();
        byte[] imageInByte = baos.toByteArray();
        baos.close();

        return imageInByte;
    }



}
