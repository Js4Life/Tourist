package com.example.ec.explorecali.repo;

import com.example.ec.explorecali.domain.Tour;
import com.example.ec.explorecali.domain.TourPackage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(collectionResourceRel = "packages",path = "packages")
public interface TourPackageRepository extends PagingAndSortingRepository<TourPackage,String> {
   TourPackage findByName(@Param("name") String name);
   Page<Tour> findByTourPackageCode(@Param("code") String code, Pageable pageable);


 @Override
 @RestResource(exported=false)
 <S extends TourPackage> S save(S s);

 @Override
 @RestResource(exported=false)
 <S extends TourPackage> Iterable<S> save(Iterable<S> iterable);

 @Override
 @RestResource(exported=false)
 void delete(String s);

 @Override
 @RestResource(exported=false)
 void delete(TourPackage tourPackage);

 @Override
 @RestResource(exported=false)
 void delete(Iterable<? extends TourPackage> iterable);

 @Override
 @RestResource(exported=false)
 void deleteAll();
}
