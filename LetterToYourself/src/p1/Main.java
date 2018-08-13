package p1;

import java.io.Console;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        /**
         *  +--------------------------------------------+
|                |         *  |                    BIllllll                |
         *
         */
        String[] input = {"Bill Gates", "1 Microsoft Way", "Redmond, WA 98104"};


        int numdash = 48;
       
        StringBuilder np =new StringBuilder("");

        StringBuilder empty_line = new StringBuilder("");

        empty_line.append("|");
        for(int i = 0; i < 48; i++)
            empty_line.append(" ");
        empty_line.append("|");


        np = np.append('+');
        for(int i = 0; i<numdash; i++)
            np.insert(0,"-");
        np = np.insert(0,'+');


        System.out.println(np);
        for(int i = 0; i<5; i++)
            System.out.println(empty_line);
        for(String info : input){
            String line = "|";
            for(int i = 0; i<24; i++)
                line += " ";
            line += info;
            int num_miss = 24 - info.length();
            for(int i = 0; i<num_miss; i++)
                line += " ";
            line += "|";

            System.out.println(line);


        }


        System.out.println(np);











    }



}
