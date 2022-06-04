package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

/*
Esta clase tiene la funcionalidad o el fin de poder calcular todos los datos
necesarios para nuestro sistema

 */
public class FootballTeam {

    // PROPIEDADES
    // esta propiedad es donde vamos a guardar la lista con todos los datos de los equipos de football
    private List<ArrayList<String>> data = new ArrayList<>();

    // CONSTRUCTOR
    // constructor donde inicializamos nuestras listas 2D para los nodos y las distancias
    public FootballTeam(List<ArrayList<String>> data) {
        this.data = data;
    }

    // METODOS
    /*
    Este metodo tiene la finalidad de:
    Calcular/predecir que aquipos de cada grupo son los que tienen mas posibilidades
    de llegar a octavos, esto dependiendo de los datos con los que lo hemos alimentado.
    
    va a ordenar en una lista: el grupo, el equipo y su puntaje.
    
    para posteriormente regresarla en el return
     */
    public List<ArrayList<String>> getDataGroupStages() {
        // definimos la lsita que vamos a regresar
        List<ArrayList<String>> finalData = new ArrayList<>();

        // usamos un try por cualquier posible error que se produsca 
        try {
            /*
            Calculamos las posibilidades de cada equipo y las guardamos en la lista finalData
            
            Para hacer esto tenemos que realizar varios pasos:
            1.- calcular la suma todal de todos los puntos de todos los equipos
            2.- con la suma total procedemos a calcular los puntaje/probabilidades de todos los equipos 
            3.- ordenamos los equipos para un mejor uso en otros metodos o funcionalidades de nuestro sistema
            4.- regresamos la lista con los datos ya ordenada
             */
            // variables a usar
            int sumatoria = 0;
            // realizamos la suma total de los puntos
            for (int i = 1; i < this.data.size(); i++) {
                sumatoria += Integer.parseInt(this.data.get(i).get(9));
            }

            // procedemos a realizar el calculo de los puntaje/probabilidades de todos los equipos
            // donde puntage/probabilidad = SumaTotalPuntos/GLB*BUFF
            // y la informacion la guardaremos en la lista que vamos a regresar
            for (int i = 1; i < this.data.size(); i++) {
                // lsita a guardar en la lista a regresar
                ArrayList<String> teamData = new ArrayList<>();
                // guardamos rankin
                teamData.add(this.data.get(i).get(0));
                // guardamos Grupo
                teamData.add(this.data.get(i).get(1));
                // guardamos Nombre
                teamData.add(this.data.get(i).get(2));
                // guardamos puntaje/probabilidad
                teamData.add("" + (Float.parseFloat(this.data.get(i).get(9)) / sumatoria));
                // guardamos esta lista en la lista a regresar
                finalData.add(teamData);
            }

            // ordenamos la lista por grupo y por puntaje/probabilidad
            finalData = this.sortByGroupAndProbability(finalData);

        } catch (Exception e) {
            // si obtenemos cualquier error lo mostramos al usuario
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage(), "Se produjo un error", JOptionPane.ERROR_MESSAGE);
        }
        // regresamos la lista con toda la informacion 
        return finalData;
    }

    /*
    Este metodo tiene la finalidad de:
    Obtener el numero de victorias y derrotas de cada equipo por grupo.
    
    para esto compararemos los datos de cada equipo por grupo que se obtienen 
    con el metodo getDataGroupStages, en el caso de un empate al final, se 
    tomara en cuenta el rankin para que pase uno u otro
     */
    public List<ArrayList<String>> getNumberOfWinsAndLosses(List<ArrayList<String>> info) {
        // creamos la lista que vamos a regresar con la informacion
        List<ArrayList<String>> dataWinsAndLosses = new ArrayList<>();
        // usamos un try por cualquier posible error
        try {
            // vamos a usar un for para calcular las victorias y derrotas de cada equipo
            for (int i = 0; i < info.size(); i++) {
                // variables para las victorias y derrotas
                int wins = 0;
                int losses = 0;
                // usamos un for para compararlos con cada equipo
                for (int j = 0; j < info.size(); j++) {
                    // comprobamos que el equipo del que vamos a calcular sus victorias y derroas sea del mismo grupo y que sea diretente equipo que los equipos a comparar
                    if (info.get(i).get(1).equals(info.get(j).get(1)) && !info.get(i).get(2).equals(info.get(j).get(2))) {

                        // si el equipo a calcular victorias y derrotas tiene mas posibilidades de ganar que el otro equipo sumamos una victoria
                        if (Float.parseFloat(info.get(i).get(3)) > Float.parseFloat(info.get(j).get(3))) {
                            wins++;
                        } // si el equipo a calcular victorias y derrotas tiene menos posibilidades de ganar que el otro equipo sumamos una derrota
                        else if (Float.parseFloat(info.get(i).get(3)) < Float.parseFloat(info.get(j).get(3))) {
                            losses++;
                        } else {
                            // en caso de que esten totalmente igualados se le dara una victoria si tiene un mayor ranking
                            if (Float.parseFloat(info.get(i).get(0)) < Float.parseFloat(info.get(j).get(0))) {
                                wins++;
                            } else {
                                losses++;
                            }
                        }

                    }
                }

                // procedemos a guardar la informacion del equipo en una lista y esta lista la guardamos en la lista a regresar
                ArrayList<String> teamData = new ArrayList<>();
                // ranking
                teamData.add(info.get(i).get(0));
                // grupo
                teamData.add(info.get(i).get(1));
                // nombre
                teamData.add(info.get(i).get(2));
                // victorias
                teamData.add("" + wins);
                // derrotas
                teamData.add("" + losses);
                // puntaje/probabilidad
                teamData.add(info.get(i).get(3));
                // guardamos lista en la lista a regresar
                dataWinsAndLosses.add(teamData);
            }
            /*
            para este punto ya tenemos todas las victorias y derrotas por equipo, en este punto
            es posible que tengamos algun empate, para seleccionar el equipo ganador en este caso
            seleccionaremos al equipo que tenga mejor ranking.
            
            para esto utilizaremos el metodo sortByWinsAndRanking, que nos ordena la lista y nos
            soluciona este posible error
             */
            dataWinsAndLosses = this.sortByWinsAndRanking(dataWinsAndLosses);
        } catch (Exception e) {
            // si obtenemos cualquier error lo mostramos al usuario
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage(), "Se produjo un error", JOptionPane.ERROR_MESSAGE);
        }

        // regresamos la lista con la informacion de victorias y derrotas por equipo
        return dataWinsAndLosses;
    }

    /*
    Este metodo tiene la finalidad de:
    obtener unicamente los ganadores de cada grupo de la fase de grupos y de esta
    forma obtener los equipos que continuaran a la octavos de final
    
    tambien va a guardar en una lista que posteriormente nos va a regresar
    los grupos para los octavos de final
     */
    public List<ArrayList<String>> getGroupStageWinners(List<ArrayList<String>> data) {
        // creamos la lista que vamos a regresar
        List<ArrayList<String>> finalData = new ArrayList<>();
        int num = 0;
        // mediante un for agregamos los primeros del grupo a la lista que vamos a regresar
        for (int i = 0; i < data.size(); i++) {
            if (num < 2) {
                finalData.add(data.get(i));
                num++;
            } else if (num == 2) {
                num++;
            } else {
                num = 0;
            }
        }
        // regresamos la lista
        return finalData;
    }

    /*
    
    los siguientes metodos tendran una funcionalidad muy similar y es calcular/obtener
    los partidos del lado a y del lado b. En otras palabras, que equipos van a jugar
    del lado A y que equipos jugaran del lado B.
    
    estos metodos nos van a servir principalmente para otro metodo que nos servira para 
    calcular los ganadores en octavos de final.
    
    Estos dos metodos son alimentados con la lista que se obtiene del metodo getGroupStageWinners
    
     */
    public List<ArrayList<String>> getSideA(List<ArrayList<String>> data) {
        List<ArrayList<String>> finalData = new ArrayList<>();
        finalData.add(data.get(0));
        finalData.add(data.get(3));
        finalData.add(data.get(4));
        finalData.add(data.get(7));
        finalData.add(data.get(8));
        finalData.add(data.get(11));
        finalData.add(data.get(12));
        finalData.add(data.get(15));
        return finalData;
    }

    public List<ArrayList<String>> getSideB(List<ArrayList<String>> data) {
        List<ArrayList<String>> finalData = new ArrayList<>();
        finalData.add(data.get(1));
        finalData.add(data.get(2));
        finalData.add(data.get(5));
        finalData.add(data.get(6));
        finalData.add(data.get(9));
        finalData.add(data.get(10));
        finalData.add(data.get(13));
        finalData.add(data.get(14));
        return finalData;
    }

    /*
    Este metodo tiene la finalidad de:
    obtener los ganadores de cada ronda de las diferentes rondas de octavos de final,
    este metodo lo estaremos usando constantemente hasta obtener el ganador de cada lado
     */
    public List<ArrayList<String>> getWinners(List<ArrayList<String>> data) {
        // creamos la lista que vamos a regresar
        List<ArrayList<String>> finalData = new ArrayList<>();
        // mediante un for vamos a estar iterando y veremos cuales tienen mas posibilidades de ganar
        for (int i = 0; i < data.size(); i += 2) {
            // si A es mayor que B, pasa A
            if (Float.parseFloat(data.get(i).get(5)) > Float.parseFloat(data.get(i + 1).get(5))) {
                finalData.add(data.get(i));
            } else if (Float.parseFloat(data.get(i).get(5)) < Float.parseFloat(data.get(i + 1).get(5))) {
                // si B es mayor que A, pasa B
                finalData.add(data.get(i + 1));
            } else {
                // si estan en un empate, se comparan los rankin de los equipos, y pasa el que tenga el mejor rankin
                if (Float.parseFloat(data.get(i).get(0)) > Float.parseFloat(data.get(i + 1).get(0))) {
                    finalData.add(data.get(i));
                } else if (Float.parseFloat(data.get(i).get(0)) < Float.parseFloat(data.get(i + 1).get(0))) {
                    finalData.add(data.get(i + 1));
                }
            }
        }
        // regresamos la lista con los ganadores
        return finalData;
    }

    /*
    este metodo nos sirve para comprobar si un equipo le gana a otro equipo
    con este metodo sabremos cual es el equipo ganador
     */
    public boolean isWinner(List<ArrayList<String>> a, List<ArrayList<String>> b) {
        // si a es mayor que b, regresa true, en caso contrario regresa false
        // en caso de empate el que tenga mejor rankin gana, si a tiene mejor ranking regresa true
        if (Float.parseFloat(a.get(0).get(5)) > Float.parseFloat(b.get(0).get(5))) {
            return true;
        } else if (Float.parseFloat(a.get(0).get(5)) < Float.parseFloat(b.get(0).get(5))) {
            return false;
        } else {
            if (Float.parseFloat(a.get(0).get(0)) > Float.parseFloat(b.get(0).get(0))) {
                return true;
            } else if (Float.parseFloat(a.get(0).get(0)) < Float.parseFloat(b.get(0).get(0))) {
                return false;
            }
        }
        return true;
    }

    /*
    Este metodo tiena la finalidad de ordenar la lista que hacemos en el metodo getDataGroupStages,
    primero va a ordenar por el puntaje/probabilidad y por ultimo por grupo, de esta forma tendremos
    una lista ordenada tanto por grupo como por puntaje/probabilidad
     */
    private List<ArrayList<String>> sortByGroupAndProbability(List<ArrayList<String>> data) {
        // creamos la lista que vamos a regresar 
        List<ArrayList<String>> sortedData = new ArrayList<>();
        // le damos un valor
        sortedData = data;
        // ordenamos por puntaje/probabilidad
        Collections.sort(data, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o2.get(3).compareTo(o1.get(3));
            }
        });
        // ordenamos por grupo
        Collections.sort(data, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });

        // regresamos la lista ordenada
        return sortedData;
    }

    /*
    Este metodo tiena la finalidad de ordenar la lista que hacemos en el metodo getNumberOfWinsAndLosses,
    primero va a ordenar por el numero de wins, despues por el ranking y por ultimo por grupo, 
    de esta forma tendremos una lista ordenada para solucionar los casos que tengan el mismo numero
    de victorias y derrotas
     */
    private List<ArrayList<String>> sortByWinsAndRanking(List<ArrayList<String>> data) {
        // creamos la lista que vamos a regresar 
        List<ArrayList<String>> sortedData = new ArrayList<>();
        // le damos un valor
        sortedData = data;
        // ordenamos ranking
        Collections.sort(data, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        // ordenamos numero de wins
        Collections.sort(data, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o2.get(3).compareTo(o1.get(3));
            }
        });
        // ordenamos por grupo
        Collections.sort(data, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });

        // regresamos la lista ordenada
        return sortedData;
    }

}
