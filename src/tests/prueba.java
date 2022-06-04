package tests;

import java.util.*;

import search.FootballTeam;
import data.ReadFileCSV;

public class prueba {

    public static void main(String[] args) {

        ReadFileCSV distancias = new ReadFileCSV("data.csv");
        //ReadFileCSV nodos = new ReadFileCSV("nodos.csv");
        //System.out.println(distancias.getData());
        FootballTeam ft = new FootballTeam(distancias.getData());
        //ft.getDataGroupStages();
        List<ArrayList<String>> data = ft.getDataGroupStages();

        List<ArrayList<String>> data2 = ft.getNumberOfWinsAndLosses(data);

        List<ArrayList<String>> data3 = ft.getGroupStageWinners(data2);

        List<ArrayList<String>> sideA = ft.getSideA(data3);
        List<ArrayList<String>> sideB = ft.getSideB(data3);
        
        List<ArrayList<String>> quarters = ft.getWinners(sideA);
        
        List<ArrayList<String>> semis = ft.getWinners(quarters);
        
        List<ArrayList<String>> winer = ft.getWinners(semis);
        
        System.out.println(sideA);
        System.out.println("-----------------------");
        System.out.println(quarters);
        System.out.println("-----------------------");
        System.out.println(semis);
        System.out.println("-----------------------");
        System.out.println(winer);
        
        /*
        List<ArrayList<String>> data = new ArrayList<>();
        data = distancias.getData();
//        List<ArrayList<String>> namesAndNumbers = new ArrayList<ArrayList<String>>();

        Collections.sort(data, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o2.get(9).compareTo(o1.get(9));
            }
        });
        //
        Collections.sort(data, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });
        data.forEach(element->{
            System.out.println(element);
        });*/ /*
        int matrix[][] = { { 39, 27, 11, 42 },
                           { 10, 93, 91, 90 },
                           { 54, 78, 56, 89 },
                           { 24, 64, 20, 65 } };
        // Sort this matrix by 3rd Column
        int col = 3;
        sortbyColumn(matrix, col - 1);

        // Display the sorted Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
         */
    }

}
