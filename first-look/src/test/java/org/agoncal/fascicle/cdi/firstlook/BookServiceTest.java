package org.agoncal.fascicle.cdi.firstlook;

import jakarta.inject.Inject;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldJunit5Extension;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
@ExtendWith(WeldJunit5Extension.class)
public class BookServiceTest {

  @WeldSetup
  public WeldInitiator weld = WeldInitiator.from(BookService.class).inject(this).build();
  @Inject
  BookService bookService;

  @Test
  public void shouldCheckNumberIsThirteenDigits() {
    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
    assertTrue(book.getIsbn().startsWith("13"));
  }
}
