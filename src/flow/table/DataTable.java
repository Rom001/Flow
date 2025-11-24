package flow.table;

import java.util.List;

public class DataTable {
    private List<String> columns;
    private List<List<String>> rows;

    public DataTable(List<String> columns, List<List<String>> rows) {
        this.columns = columns;
        this.columns = columns;
    }

    public List<String> getColumns() {
        return columns;
    }

    public List<List<String>> getRows() {
        return rows;
    }
}
