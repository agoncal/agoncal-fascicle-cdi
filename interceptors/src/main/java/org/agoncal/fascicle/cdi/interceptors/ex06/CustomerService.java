package org.agoncal.fascicle.cdi.interceptors.ex06;

import org.agoncal.fascicle.cdi.interceptors.Customer;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
@Transactional
@Loggable
public class CustomerService {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Inject
  private EntityManager em;

  // ======================================
  // =           Public Methods           =
  // ======================================

  @Auditable
  public void createCustomer(Customer customer) {
    em.persist(customer);
  }

  public Customer findCustomerById(Long id) {
    return em.find(Customer.class, id);
  }
}
