package vandavv.repository;

import org.springframework.data.repository.CrudRepository;
import vandavv.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
