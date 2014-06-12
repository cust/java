package main;

public class Run3 {

	public static void main(String[] args) {
	
		//http://docs.jboss.org/hibernate/entitymanager/3.6/reference/en/html/configuration.html
		
	      Ejb3Configuration cfg = new Ejb3Configuration();
	EntityManagerFactory emf = 
	  cfg.addProperties( properties ) //add some properties
	     .setInterceptor( myInterceptorImpl ) // set an interceptor
	     .addAnnotatedClass( MyAnnotatedClass.class ) //add a class to be mapped
	     .addClass( NonAnnotatedClass.class ) //add an hbm.xml file using the Hibernate convention
	     .addRerousce( "mypath/MyOtherCLass.hbm.xml ) //add an hbm.xml file
	     .addRerousce( "mypath/orm.xml ) //add an EJB3 deployment descriptor
	     .configure("/mypath/hibernate.cfg.xml") //add a regular hibernate.cfg.xml
	     .buildEntityManagerFactory(); //Create the entity manager factory
	}
}
