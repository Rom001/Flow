package flow.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import flow.table.DataTable;

public class CsvLoader {
    
    public static DataTable load(String path) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(path));

        String headerLine = reader.readLine();
        if(headerLine == null){
            throw new IOException("Fichier vide");
        }

        List<String> columns = Arrays.asList(headerLine.split(";"));

        List<List<String>> rows = new ArrayList<>();

        String line;

        while ((line = reader.readLine()) != null){
            String[] values = line.split(";");
            rows.add(Arrays.asList(values));
        }

        reader.close();
        return new DataTable(columns, rows);
    }
}
