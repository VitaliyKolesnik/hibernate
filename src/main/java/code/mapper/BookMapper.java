package code.mapper;


import code.entity.Author;
import code.entity.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookMapper {
    public static Collection<Book> fromResultSet(ResultSet resultSet){
        try {
            List<Book> list = new ArrayList<Book>();

            while (resultSet.next()) {
                    list.add(new Book(resultSet.getInt("id"),
                            resultSet.getString("title"), resultSet.getInt("authorID")));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
