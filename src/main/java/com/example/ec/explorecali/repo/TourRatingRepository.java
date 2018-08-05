package com.example.ec.explorecali.repo;

import com.example.ec.explorecali.domain.Tour;
import com.example.ec.explorecali.domain.TourRating;
import com.example.ec.explorecali.domain.TourRatingPk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TourRatingRepository extends CrudRepository<TourRating,TourRatingPk> {

    List<TourRating> findByPkTourId(Integer tourId);

   // TourRating findByPkTourIdAndPkCustomerId(Integer tourId, Integer customerId);

    Page<TourRating> findByPkTourId(Integer tourId, Pageable pageable);
}
