package com.mustafa.jpaFactory.Impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class jpaFactoryImpl implements jpaFactory{

    private EntityManager entityManager=null;

    public EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
        this.entityManager= factory.createEntityManager();

        return entityManager;
    }

    public EntityTransaction getEntityTransaction() {
        EntityTransaction transaction =this.entityManager.getTransaction();

        return transaction;
    }
}
