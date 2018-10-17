package com.exercise.resource;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

public class ResourceTest {

    @Test
    public void test() throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("a.txt");
        System.out.println(classPathResource.getFilename());

        InputStream inputStream = classPathResource.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
    }
}
