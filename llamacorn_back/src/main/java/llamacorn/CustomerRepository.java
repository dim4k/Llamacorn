package llamacorn;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "client", path = "client")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

	List<Customer> findBynom(@Param("nom") String nom);

}

