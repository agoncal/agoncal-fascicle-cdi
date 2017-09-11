package org.agoncal.fascicle.cdi.interceptors.ex03;

import org.agoncal.fascicle.cdi.interceptors.Customer;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocsnippet[]
@Transactional
@Interceptors(ProfileInterceptor.class)
public class CustomerService {

  @Inject
  private EntityManager em;

  @PostConstruct
  public void init() {
    // ...
  }

  public void createCustomer(Customer customer) {
    em.persist(customer);
  }

  public Customer findCustomerById(Long id) {
    return em.find(Customer.class, id);
  }
}
// end::adocsnippet[]
