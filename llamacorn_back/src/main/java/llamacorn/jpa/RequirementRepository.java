package llamacorn.jpa;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import llamacorn.model.Requirement;

@RepositoryRestResource(collectionResourceRel = "requirement", path = "requirement")
public interface RequirementRepository extends PagingAndSortingRepository<Requirement, Long> {

	List<Requirement> findById(@Param("Id") long Id);
	
}

