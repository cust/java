package main;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Run2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//http://stackoverflow.com/questions/11695291/setting-jpa-persistence-properties-dynamically

	public Session setProperties(final String provider, final Boolean excludeUnlisted, final Properties properties) {
		properties.setProperty("provider", provider);
		properties.setProperty("exclude-unlisted-classes", excludeUnlisted.toString());
		Configuration configuration = new Configuration();
		configuration.setProperties(properties);
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		return sessionFactory.openSession();
	}
}
