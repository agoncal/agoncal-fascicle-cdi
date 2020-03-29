package org.agoncal.fascicle.cdi.interceptors.ex04;

import org.agoncal.fascicle.cdi.interceptors.Customer;

import javax.inject.Inject;
import javax.interceptor.ExcludeClassInterceptors;
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
@Interceptors({I1.class, I2.class})
public class CustomerService {

  @Inject
  private EntityManager em;

  public void createCustomer(Customer customer) {
    em.persist(customer);
  }

  @Interceptors({I3.class, I4.class})
  public Customer findCustomerById(Long id) {
    return em.find(Customer.class, id);
  }

  public void removeCustomer(Customer customer) {
    em.remove(em.merge(customer));
  }

  @ExcludeClassInterceptors
  public Customer updateCustomer(Customer customer) {
    return em.merge(customer);
  }
}
// end::adocSnippet[]
