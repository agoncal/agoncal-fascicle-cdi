package org.agoncal.fascicle.cdi.interceptors.ex05;

import org.agoncal.fascicle.cdi.interceptors.Customer;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocsnippet[]
@Transactional
@Loggable
public class CustomerService {

  @Inject
  private EntityManager em;

  public void createCustomer(Customer customer) {
    em.persist(customer);
  }

  public Customer findCustomerById(Long id) {
    return em.find(Customer.class, id);
  }
}
// end::adocsnippet[]
