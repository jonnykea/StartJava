package tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlModifierWithoutRegex {
    public static void main(String[] args) {
        String sql = "insert into AM_OBJECT \n" +
                "(DTYPE, ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, KEY_, SCREEN_DEFAULT_MODE, HIERARCHY_FIELD_CONFIG, KEY_LENGTH, KEY_PREFIX, ENTITY_NAME, ENTITY_LABEL, SUGGESTION_SEARCH_CONFIG) \n" +
                "values ('am_ExtObject', 'ba0db8c3-6b32-8b6f-9315-e8ca9843a344', 2, '2021-03-25 09:54:10', 'admin', '2022-10-25 15:33:21', 'admin', null, null, 'OBJ0029', 'lookup', null, 8, 'REQ', 'Request', 'ЗнО', 'key,subject');";
        String modifiedSql = removeColumn(sql, "DTYPE");
        System.out.println(sql);
        System.out.println(modifiedSql);
        String sql1 = "INSERT INTO table_name (column1, column2, column3) VALUES (value1, value2, value3)";
    }

    public static String removeColumn(String sql, String columnName) {
        // Find the parentheses that enclose column names and values
        int startColumns = sql.indexOf("(") + 1;
        int endColumns = sql.indexOf(")");
        int startValues = sql.indexOf("(", endColumns) + 1;
        int endValues = sql.lastIndexOf(")");

        // Extract the column and values parts
        String columnsPart = sql.substring(startColumns, endColumns);
        String valuesPart = sql.substring(startValues, endValues);

        // Find the index of the column
        String[] columns = columnsPart.split(",");
        String[] values = valuesPart.split(", (?=([^\']*\'[^\']*\')*[^\']*\'{0,1}$)");
        int columnIndex = -1;
        for (int i = 0; i < columns.length; i++) {
            if (columnName.equalsIgnoreCase(columns[i].trim())) {
                columnIndex = i;
                break;
            }
        }

        // If the column was found, remove it and its value
        if (columnIndex != -1) {
            StringBuilder modifiedColumns = new StringBuilder();
            StringBuilder modifiedValues = new StringBuilder();

            for (int i = 0; i < columns.length; i++) {
                if (i != columnIndex) {
                    modifiedColumns.append(columns[i].trim()).append(i < columns.length - 1 ? ", " : "");
                    modifiedValues.append(values[i].trim()).append(i < values.length - 1 ? ", " : "");
                }
            }

            // Rebuild the SQL statement
            return sql.substring(0, startColumns) + modifiedColumns + sql.substring(endColumns, startValues) + modifiedValues + sql.substring(endValues);
        }

        return sql; // Return the original SQL if the column is not found
    }
}
