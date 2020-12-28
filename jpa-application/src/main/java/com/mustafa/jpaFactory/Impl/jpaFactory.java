package com.mustafa.jpaFactory.Impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface jpaFactory {

        EntityManager getEntityManager();
        EntityTransaction getEntityTransaction();
    }

