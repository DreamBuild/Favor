package favor.metadata.service;

import favor.metadata.model.Table;
import favor.metadata.model.TableMetadata;

import java.util.List;

/**
 * Created by Joyor on 2014-09-13.
 */
public interface TableService
{
   boolean create(Table table);

   boolean remove(TableMetadata table);

   List<TableMetadata> list();

   Table query(TableMetadata tableMetadata);
}