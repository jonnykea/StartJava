package tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlModifier {
    public static void main(String[] args) {
        String sql = "insert into AM_OBJECT \n" +
                "(DTYPE, ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, KEY_, SCREEN_DEFAULT_MODE, HIERARCHY_FIELD_CONFIG, KEY_LENGTH, KEY_PREFIX, ENTITY_NAME, ENTITY_LABEL, SUGGESTION_SEARCH_CONFIG) \n" +
                "values ('am_ExtObject', 'ba0db8c3-6b32-8b6f-9315-e8ca9843a344', 2, '2021-03-25 09:54:10', 'admin', '2022-10-25 15:33:21', 'admin', null, null, 'OBJ0029', 'lookup', null, 8, 'REQ', 'Request', 'ЗнО', 'key,subject');";
        String sql1 = "INSERT INTO table_name (column1, column2, column3) VALUES (value1, value2, value3)";
        String modifiedSql = removeColumn(sql, "DTYPE");
        System.out.println(sql);
        System.out.println(modifiedSql);
    }

    public static String removeColumn(String sql, String columnName) {
        // Regex to find the column list and value list
        String regex = "\\(([^)]+)\\)\\s+values\\s+\\(([^)]+)\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sql);

        if (matcher.find()) {
            // Extracting columns and values
            String[] columns = matcher.group(1).split("\\s*,\\s*");
            String[] values = matcher.group(2).split("\\s*,\\s*");

            // Building the new column and value strings
            StringBuilder newColumns = new StringBuilder();
            StringBuilder newValues = new StringBuilder();
            for (int i = 0; i < columns.length; i++) {
                if (!columns[i].equals(columnName)) {
                    newColumns.append(newColumns.length() == 0 ? "" : ", ").append(columns[i]);
                    newValues.append(newValues.length() == 0 ? "" : ", ").append(values[i]);
                }
            }

            // Reconstructing the SQL
            return sql.substring(0, matcher.start())
                    + "(" + newColumns + ") " +
                    "VALUES (" + newValues + ")" +
                    sql.substring(matcher.end());
        }

        return sql; // Return the original SQL if no match is found
    }
}
