package flow.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import flow.table.DataTable;

public class CsvExporter {
    
    public static void export(DataTable table, String path) throws IOException {

        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {

            List<String> columns = table.getColumns();
            out.println(String.join(";", columns));

            for (List<String> row : table.getRows()) {
                out.println(String.join(";", row));
            }
        }
    }

}
