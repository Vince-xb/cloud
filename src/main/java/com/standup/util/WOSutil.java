package com.standup.util;

import java.io.*;

public class WOSutil {

    public static void main(String[] args) {
        splitTxt();
    }
    public static void splitTxt() {
        try {
            int count = 0;
            int fileCount = 0;
            File wosTxt = new File("/Users/macbookpro/Desktop/wos.txt");
            System.out.println(wosTxt.exists());
            FileWriter fileWriter = null;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(wosTxt)));
            String lineContent = null;
            while((lineContent = bufferedReader.readLine()) != null){
                if (count % 20000 == 0 || count == 0){
                    String fileName = "newwos" + fileCount + ".txt";
                    File newWosTxt = new File("/Users/macbookpro/Desktop/newwos5/" + fileName);
                    fileWriter = new FileWriter(newWosTxt);
                    fileCount++;
                };
                count++;
                fileWriter.write(lineContent + " ");
                fileWriter.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
