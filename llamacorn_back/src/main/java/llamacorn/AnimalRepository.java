package llamacorn;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "animal", path = "animals")
public interface AnimalRepository extends PagingAndSortingRepository<Animal, Long> {

	List<Customer> findByname(@Param("name") String name);

}
