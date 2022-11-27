import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        DataSource dataSource= (DataSource) context.getBean("dataSource");
        JdbcTemplate template= new JdbcTemplate(dataSource);
        template.update("UPDATE product SET description=? WHERE id=?","quá chất nhé",12);// chu thuong nah. truy van truc tiep vs csdl

    }
}
