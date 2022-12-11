package org.agoncal.fascicle.cdi.interceptors.ex03;

import org.agoncal.fascicle.cdi.interceptors.Customer;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.interceptor.Interceptors;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
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
// end::adocSnippet[]
