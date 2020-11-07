package com.jc.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {

	private static StandardServiceRegistry registry = null;
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			try {
				// create registry
				registry = new StandardServiceRegistryBuilder().configure().build();

				//Create a metadata sources using the specified service registry.
				MetadataSources sources = new MetadataSources(registry);

				// create metadata : Represents the ORM model as determined from all provided mapping sources

				Metadata metadata = sources.getMetadataBuilder().build();

				// create SessionFactory

				sessionFactory = metadata.getSessionFactoryBuilder().build();
			} catch (Exception e) {

				e.printStackTrace();
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		}

		return sessionFactory;

	}

	public static Session getSession() {

		return (HibernateUtils.getSessionFactory() != null) ? HibernateUtils.getSessionFactory().openSession()
				: sessionFactory.openSession();

	}

	public static void shutdown() {
		if (registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("Session:"+getSession()); shutdown();
	 * 
	 * }
	 */

}
