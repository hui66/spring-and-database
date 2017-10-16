package cn.com.gree.controller;


import java.io.*;
import java.net.URL;

public class FileDemo {
    public static int i=0;
   public static String path =  "f:";

    public static void main(String[] args) {
        getNum();
    }

    public static void getNum(){

        try {
            String  address = path +File.separator+"temp"+File.separator+"saveNum.txt";
            File saveFile  = new File(address);
            if(!saveFile.exists()) {
                saveFile.createNewFile();
            }
            FileInputStream in = new FileInputStream(saveFile);
            byte[] bytes = new byte[3];
            in.read(bytes);
            String data = new String(bytes);
            int x = Integer.parseInt(data);
//            System.out.println(data);


            i = x;
            i++;
            FileOutputStream out = new FileOutputStream(saveFile);
            out.write((i +"").getBytes());



            out.close();
            in.close();

        }catch (IOException ex){
            ex.printStackTrace();
        }

        System.out.println(i);
    }
}
