package com.bankapp.factory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSessionFactory {
    private static  SessionFactory sessionFactory=null;
    private HibernateSessionFactory(){}

    public static SessionFactory getSessionFactory(){
        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        sessionFactory=new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

        return sessionFactory;
    }

}
