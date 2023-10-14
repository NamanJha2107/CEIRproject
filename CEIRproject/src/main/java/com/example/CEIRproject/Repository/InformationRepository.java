package com.example.CEIRproject.Repository;

import com.example.CEIRproject.dto.InternalRequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface InformationRepository  extends JpaRepository<InternalRequest,Long> {



}
