package flow;

import flow.io.CsvLoader;
import flow.table.DataTable;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("FLOW");

        try {
            DataTable table = CsvLoader.load("csv/NPA.csv");
            System.out.println("Colonnes " + table.getColumns());
            System.out.println("Nombre de ligne : " + table.getRows().size());

        }catch(Exception e){
            
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
