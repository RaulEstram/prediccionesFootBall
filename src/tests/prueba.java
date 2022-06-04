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
        
        List<ArrayList<String>> quarters = ft.getWinners(sideB);
        
        List<ArrayList<String>> semis = ft.getWinners(quarters);
        
        List<ArrayList<String>> winer = ft.getWinners(semis);
        
        System.out.println(sideB);
        System.out.println(sideA);
        System.out.println("-----------------------");
        System.out.println(quarters);
        System.out.println("-----------------------");
        System.out.println(semis);
        System.out.println("-----------------------");
        System.out.println(winer);
        
    }

}
