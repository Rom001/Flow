package flow.steps;

import java.util.ArrayList;
import java.util.List;

import flow.table.DataTable;

public class Filter {

    public static DataTable apply(DataTable input, String columns, String op, String values) {
        int colIndex = input.getColumns().indexOf(columns);
        if (colIndex == -1) {
            throw new IllegalArgumentException("Colonne inconue : " + columns);
        }

        ///ColumnType columnType = detectColumnType(input, colIndex);

        List<List<String>> filteredRows = new ArrayList<>();

        double target = Double.parseDouble(values);

        for(List<String> row : input.getRows()) {
            double cell = Double.parseDouble(row.get(colIndex));
            boolean keep = false;

            // switch (op) {
              //  case ">" -> {
                //    if (columnType != ColumnType.NUMERIC) {
                  //      throw new IllegalArgumentException("Opérateur '>' réservé aux colonnes numériques");
                    //}
                //}
                //case "<" -> {
                  //  if (columnType != ColumnType.NUMERIC) {
                    //    throw new IllegalArgumentException("Opérateur '>' réservé aux colonnes numériques");
                    //}
                //}
                //case "=" -> {
                  //  if (columnType != ColumnType.NUMERIC) {
                    //    throw new IllegalArgumentException("Opérateur '>' réservé aux colonnes numériques");
                    //}
                //}
                //case "!=" -> {
                  //  if (columnType != ColumnType.NUMERIC) {
                    //    throw new IllegalArgumentException("Opérateur '>' réservé aux colonnes numériques");
                    //}
                //}
                //default -> throw new IllegalArgumentException("Opérateur invalide : " + op);
            //} 

            switch (op) {
                case ">" -> keep = cell > target;
                case "<" -> keep = cell < target;
                case "=" -> keep = cell == target;
                case "!=" -> keep = cell != target;

                default -> throw new IllegalArgumentException("Opérateur invalide : " + op);
                
            }

            if (keep) {
                filteredRows.add(row);
            }
        }
        return new DataTable(input.getColumns(), filteredRows);
    }

    
}
