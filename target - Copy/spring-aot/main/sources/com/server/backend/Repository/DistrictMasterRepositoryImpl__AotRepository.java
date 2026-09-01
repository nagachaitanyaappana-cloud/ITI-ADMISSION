package com.server.backend.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;
import org.springframework.data.repository.query.Param;

/**
 * AOT generated JPA repository implementation for {@link DistrictMasterRepository}.
 */
@Generated
public class DistrictMasterRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public DistrictMasterRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link DistrictMasterRepository#findAllNames()}.
   */
  public List<String> findAllNames() {
    String queryString = "SELECT e.distname FROM dist_master e";
    Query query = this.entityManager.createQuery(queryString);

    return (List<String>) convertMany(query.getResultList(), false, String.class);
  }

  /**
   * AOT generated implementation of {@link DistrictMasterRepository#findCodeByDistrictName(java.lang.String)}.
   */
  public String findCodeByDistrictName(@Param("distName") String distName) {
    String queryString = "SELECT dist_code FROM dist_mst WHERE dist_name = :distName LIMIT 1";
    Query query = this.entityManager.createNativeQuery(queryString);
    query.setParameter("distName", distName);

    return (String) convertOne(query.getSingleResultOrNull(), true, String.class);
  }
}
