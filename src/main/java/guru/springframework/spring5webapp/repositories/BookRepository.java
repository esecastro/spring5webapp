/*
 * Created by Eduardo Studzinski Estima de Castro - 2018.
 *
 */

package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
