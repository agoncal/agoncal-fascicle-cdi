package org.agoncal.fascicle.cdi.writingbean.ex12;

import jakarta.enterprise.context.Conversation;
import jakarta.enterprise.context.ConversationScoped;
import jakarta.inject.Inject;
import java.io.Serializable;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@ConversationScoped
public class CustomerCreatorWizard implements Serializable {

  private Login login;
  private Account account;

  @Inject
  private CustomerService customerService;

  @Inject
  private Conversation conversation;

  public void saveLogin() {
    conversation.begin();

    login = new Login();
    // Set login properties
  }

  public void saveAccount() {
    account = new Account();
    // Set account properties
  }

  public void createCustomer() {
    Customer customer = new Customer();
    customer.setLogin(login);
    customer.setAccount(account);
    customerService.createCustomer(customer);

    conversation.end();
  }
}
// end::adocSnippet[]
