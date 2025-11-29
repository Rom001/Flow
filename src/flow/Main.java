package flow;

import flow.io.CsvExporter;
import flow.io.CsvLoader;
import flow.steps.Filter;
import flow.table.DataTable;;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("FLOW");

        try {
            DataTable table = CsvLoader.load("csv/NPA.csv");
            System.out.println("Colonnes " + table.getColumns());
            System.out.println("Nombre de ligne : " + table.getRows().size());

            DataTable filtered = Filter.apply(table, "Age", ">", "26");

            //test export
            CsvExporter.export(filtered, "csv/NPA_export.csv");
            System.out.println("Export terminé");

        }catch(Exception e){
            
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
