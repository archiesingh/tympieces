package abc.myProject.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import abc.myProject.model.AllUsers;
import abc.myProject.model.billaddress;
import abc.myProject.model.shipaddress;
import abc.myProject.model.cart;
import abc.myProject.model.category;
import abc.myProject.model.orderdetails;
import abc.myProject.model.product;
import abc.myProject.model.supplier;

@Configuration
@ComponentScan("abc.myProject")
@EnableTransactionManagement
public class DBConfig{
	
	@Bean(name="dataSource")
	public DataSource getDataSource(){
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:~/projectDatabase");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
	}
	@Autowired
	@Bean(name="sessionfact")
	public SessionFactory getSessionFactory(){
		Properties prop=new Properties();
		prop.put("hibernate.hbm2ddl.auto", "update");
		prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		prop.put("hibernate.show_sql", "true");
		LocalSessionFactoryBuilder sessionFactBuilder = new LocalSessionFactoryBuilder(getDataSource());
		sessionFactBuilder.addProperties(prop);
		sessionFactBuilder.addAnnotatedClass(AllUsers.class);
		sessionFactBuilder.addAnnotatedClass(supplier.class);
		sessionFactBuilder.addAnnotatedClass(category.class);
		sessionFactBuilder.addAnnotatedClass(product.class);
		sessionFactBuilder.addAnnotatedClass(cart.class);
		sessionFactBuilder.addAnnotatedClass(shipaddress.class);
		sessionFactBuilder.addAnnotatedClass(billaddress.class);
		sessionFactBuilder.addAnnotatedClass(orderdetails.class);
		
		return sessionFactBuilder.buildSessionFactory();
		
	}
	@Autowired
	@Bean(name="txManager")
	public HibernateTransactionManager getTransectionManager(){
		HibernateTransactionManager txm = new HibernateTransactionManager(getSessionFactory());
		return txm;
	}
	
}

