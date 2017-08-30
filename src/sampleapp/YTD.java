/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp;


import java.io.File;
import java.net.URL;
import com.github.axet.vget.VGet;

/**
 *
 * @author Manindar
 */
public class YTD {

    public static void main(String[] args) {
        try {
            String url = "https://www.youtube.com/watch?v=htHPpNd6H0U";
            String path = "D:\\Work@N\\Varma\\";
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}