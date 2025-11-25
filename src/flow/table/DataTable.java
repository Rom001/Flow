package flow.table;

import java.util.ArrayList;
import java.util.List;

public class DataTable {
    private List<String> columns;
    private List<List<String>> rows;

    public DataTable(List<String> columns, List<List<String>> rows) {
        this.columns = new ArrayList<>(columns);
        this.rows = new ArrayList<>(rows);
    }

    public List<String> getColumns() {
        return columns;
    }

    public List<List<String>> getRows() {
        return rows;
    }
}
