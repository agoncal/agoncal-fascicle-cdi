package org.agoncal.fascicle.cdi.interceptors.ex02;

import org.agoncal.fascicle.cdi.interceptors.Customer;

import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@Transactional
public class CustomerService {

  @Inject
  private EntityManager em;

  @Interceptors(LoggingInterceptor.class)
  public void createCustomer(Customer customer) {
    em.persist(customer);
  }

  public Customer findCustomerById(Long id) {
    return em.find(Customer.class, id);
  }
}
// end::adocSnippet[]
