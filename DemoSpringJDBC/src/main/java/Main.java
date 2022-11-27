import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//        DataSource dataSource= (DataSource) context.getBean("dataSource");
//        JdbcTemplate template= new JdbcTemplate(dataSource);
//        //template.update("UPDATE product SET description=? WHERE id=?","quá chất nhé",12);// chu thuong nah. truy van truc tiep vs csdl
//
////        List<String> a = template.query("SELECT * FROM category", (rs, i) -> {
////            return rs.getString("name");
////        });
////
////        a.forEach( v -> System.out.println(v));
//
//        List<String> b = template.query("SELECT * FROM category where name LIKE CONCAT('%',?,'%')",
//                                                (rs, i) -> {return rs.getString("name");},
//                                                "máy"
//                                                );
//
//        b.forEach( v -> System.out.println(v));



        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        JdbcTemplate template= (JdbcTemplate) context.getBean("jdbcTemplate");

        List<String> b = template.query("SELECT * FROM category where name LIKE CONCAT('%',?,'%')",
                (rs, i) -> {return rs.getString("name");},
                "máy"
        );

        b.forEach( v -> System.out.println(v));

    }
}
