package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ExerciseMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> voteList = new HashMap<>();

        String path = "/home/dayane/Documents/exercicio.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();

            while (line != null){
                String[] splitList = line.split(",");
                String name = splitList[0];
                int numberVotes = Integer.parseInt(splitList[1]);

             if (voteList.containsKey(name)){
                 int totalVotes = voteList.get(name);
                 voteList.put(name,numberVotes+= totalVotes);

             }else voteList.put(name, numberVotes);

             line = bufferedReader.readLine();

            }

            for (String key : voteList.keySet()){
                System.out.println(key + ":" + voteList.get(key));
            }

        }catch (IOException ioException){
            System.out.println("Error: " + ioException.getMessage());
        }
    }
}


