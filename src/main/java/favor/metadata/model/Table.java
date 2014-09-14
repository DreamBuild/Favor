package favor.metadata.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joyor on 2014-09-14.
 */
public class Table
{
    private TableMetadata tableMetadata;
    private List<ColumnMetadata> columnsMetadata = new ArrayList<ColumnMetadata>();

    public Table setTableMetadata(TableMetadata tableMetadata)
    {
        this.tableMetadata = tableMetadata;
        return this;
    }

    public TableMetadata getTableMetadata()
    {
        return this.tableMetadata;
    }

    public Table addColumnMetadata(ColumnMetadata column)
    {
        this.columnsMetadata.add(column);
        return this;
    }

    public List<ColumnMetadata> getColumnsMetadata()
    {
        return this.columnsMetadata;
    }
}
