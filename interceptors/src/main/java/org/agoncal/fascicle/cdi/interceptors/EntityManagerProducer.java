package org.agoncal.fascicle.cdi.interceptors;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {

  // ======================================
  // =             Attributes             =
  // ======================================

  private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cdiPU");

  // ======================================
  // =           Public Methods           =
  // ======================================

  @Produces
  private EntityManager createEntityManager() {
    EntityManager em = entityManagerFactory.createEntityManager();
    return em;
  }

  private void closeEntityManager(@Disposes EntityManager entityManager) {
    if (entityManager.isOpen()) {
      entityManager.close();
    }
  }
}
