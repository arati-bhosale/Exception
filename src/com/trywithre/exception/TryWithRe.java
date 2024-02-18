package com.trywithre.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithRe {
	
	public static void main(String[] args) {

        String line;

        try (BufferedReader br = new BufferedReader(
                new FileReader("c:\\testing.txt"))) {

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
