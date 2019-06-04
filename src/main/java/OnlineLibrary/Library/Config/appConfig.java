package OnlineLibrary.Library.Config;

import OnlineLibrary.Library.DAO.Book.BookDaoImpl;
import OnlineLibrary.Library.OnlineLibraryApplication;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@ComponentScan(basePackages = "OnlineLibrary.Library")
@Configuration
public class appConfig {

/*    @Bean
    public BasicDataSource dataSource(){

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost/library");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postMac24");
        dataSource.setInitialSize(5);
        dataSource.setMaxActive(10);

        return dataSource;
    }

    @Bean
    public HibernateJpaVendorAdapter jpaVendorAdapter(){

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

        vendorAdapter.setDatabase(Database.POSTGRESQL);
        vendorAdapter.setShowSql(true);
        vendorAdapter.setGenerateDdl(false);
        vendorAdapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQL9Dialect");

        return vendorAdapter;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
        return new PersistenceExceptionTranslationPostProcessor();
    }

    @Bean
    public PersistenceAnnotationBeanPostProcessor persistenceAnnotationBeanPostProcessor(){
        return new PersistenceAnnotationBeanPostProcessor();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){

        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();

        emf.setPersistenceUnitName("libraryDB");
        emf.setDataSource(dataSource());
        emf.setJpaVendorAdapter(jpaVendorAdapter());

        return emf;
    }*/
}