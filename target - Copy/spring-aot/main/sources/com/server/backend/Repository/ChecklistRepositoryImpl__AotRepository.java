package com.server.backend.Repository;

import com.server.backend.entity.Checklist;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link ChecklistRepository}.
 */
@Generated
public class ChecklistRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public ChecklistRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link ChecklistRepository#findByPhase(java.lang.String)}.
   */
  public List<Checklist> findByPhase(String phase) {
    String queryString = "SELECT c FROM Checklist c WHERE c.phase = :phase";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("phase", phase);

    return (List<Checklist>) query.getResultList();
  }
}
