package com.server.backend.Repository;

import com.server.backend.entity.RankEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link RankRepository}.
 */
@Generated
public class RankRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public RankRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link RankRepository#findByRankAndPhaseAndYear(java.lang.Integer,java.lang.Integer,java.lang.Integer)}.
   */
  public Optional<RankEntity> findByRankAndPhaseAndYear(Integer rank, Integer phase, Integer year) {
    String queryString = "SELECT r FROM RankEntity r WHERE r.rank = :rank AND r.phase = :phase AND r.year = :year";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("rank", rank);
    query.setParameter("phase", phase);
    query.setParameter("year", year);

    return Optional.ofNullable((RankEntity) convertOne(query.getSingleResultOrNull(), false, RankEntity.class));
  }
}
