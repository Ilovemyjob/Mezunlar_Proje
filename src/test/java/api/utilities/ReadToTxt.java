package api.utilities;


import ui.utilities.ConfigReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadToTxt {

//    boardsid =new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\IdeaProjects\\Mezunlar_Proje\\src\\test\\resources\\id.exe"))){
//        boardsid.add(reader.readLine());
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//
//        System.out.println(boardsid);
//        filePath = C:\Users\Administrator\IdeaProjects\Mezunlar_Proje\src\test\resources\id.exe;
    public static List<Integer> ida(String filePath)  {

        List<Integer> allStatesIds =new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line =reader.readLine();
              //  System.out.println(line);
            int i =0;
            while (line !=null){
                String temp = "";
                temp= line.split(",")[i].trim();

                sb.append(System.lineSeparator())    ;
                line=reader.readLine();
              //  System.out.println(i++);
                allStatesIds.add(Integer.valueOf(temp));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allStatesIds;
    }
//    allStatesIdspublic static String id(String filePath) {
//
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(ConfigReader.getProperty("id")))) {
//            id = reader.readLine();
//            System.out.println(id);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }return id;
    }

//    public static List<States>  returnAllCountries(String filePath)  {
//
//        List<States> allStates =new ArrayList<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            StringBuilder sb = new StringBuilder();
//            String line =reader.readLine();
//            //    System.out.println(line);
//
//            int i =0;
//            while (line !=null){
//                States states = new States();
//                //   String temp = "";
//                //    temp= line.split(",")[0].trim();
//                sb.append(line);
//                sb.append(System.lineSeparator())    ;
//                line=reader.readLine();
//                String [] each = line.split(",");
////                states.getId(each[0]);
////                states.getName(each[1]);
//                allStates.add(states);
//
//
//            //    System.out.println(i++);
//
//                //  allSSNCountry.add(temp);
//            }
//
//            String everthing = sb.toString();
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return allStates;
//
//    }





