package com.spinalski.stylist.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spinalski.stylist.data.entities.StylistEntity;

@Repository
public interface StylistRepository extends JpaRepository<StylistEntity, Long> {

}
