package com.server.backend.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;
import org.springframework.data.repository.query.Param;

/**
 * AOT generated JPA repository implementation for {@link ItiRepository}.
 */
@Generated
public class ItiRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public ItiRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link ItiRepository#findItiAndTradeNamesByDistrictCode(java.lang.String)}.
   */
  public List<Object[]> findItiAndTradeNamesByDistrictCode(@Param("distCode") String distCode) {
    String queryString = "SELECT i.iti_name, m.trade_name, t.strength FROM iti i LEFT JOIN ititrade t ON i.iti_code = t.iti_code LEFT JOIN ititrade_master m ON t.trade_short = m.trade_short WHERE i.dist_code = :distCode";
    Query query = this.entityManager.createNativeQuery(queryString);
    query.setParameter("distCode", distCode);

    return (List<Object[]>) convertMany(query.getResultList(), true, Object[].class);
  }

  /**
   * AOT generated implementation of {@link ItiRepository#findItiAndTradeNamesByDistrictCodeAndGovt(java.lang.String,java.lang.String)}.
   */
  public List<Object[]> findItiAndTradeNamesByDistrictCodeAndGovt(
      @Param("distCode") String distCode, @Param("govt") String govt) {
    String queryString = "SELECT i.iti_name, m.trade_name, t.strength FROM iti i LEFT JOIN ititrade t ON i.iti_code = t.iti_code LEFT JOIN ititrade_master m ON t.trade_short = m.trade_short WHERE i.dist_code = :distCode AND i.govt = :govt";
    Query query = this.entityManager.createNativeQuery(queryString);
    query.setParameter("distCode", distCode);
    query.setParameter("govt", govt);

    return (List<Object[]>) convertMany(query.getResultList(), true, Object[].class);
  }
}
