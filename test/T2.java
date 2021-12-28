/*
 * Copyright
 */
package test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * @author Bao.f
 * @version V1.0
 */
public class T2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        new Thread(() -> {
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        String s1 = s.nextLine();
        System.out.println(s1);

    }
}
