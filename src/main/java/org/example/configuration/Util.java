package org.example.configuration;
import org.example.model.Person;
import org.example.model.Phone;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class Util {
    private static final SessionFactory connection;

    static  {
        connection = new Configuration()
                .setProperty( Environment.DRIVER,"org.postgresql.Driver" )
                //url
                .setProperty( Environment.URL,"jdbc:postgresql://localhost:5432/postgres" )
                //password
                .setProperty( Environment.PASS,",sql.111217S" )
                //username
                .setProperty( Environment.USER,"postgres" )
                //format sql
                .setProperty( Environment.HBM2DDL_AUTO,"update" )
                //show sql message
                .setProperty( Environment.SHOW_SQL,"true" )
                //dialect
                .setProperty( Environment.DIALECT,"org.hibernate.dialect.PostgreSQL10Dialect" )
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Phone.class)
                .buildSessionFactory();
    }

    public static SessionFactory getConnection() {
        return connection;
    }
}
