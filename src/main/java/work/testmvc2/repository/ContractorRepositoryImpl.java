package work.testmvc2.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import work.testmvc2.model.Contractor;

@Repository
public class ContractorRepositoryImpl implements ContractorRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void saveContractor(Contractor contractor) {
		entityManager.persist(contractor);

	}

}
