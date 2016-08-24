package com.chyld.repositories;

import com.chyld.entities.Actor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IActorRepository extends PagingAndSortingRepository<Actor, Integer> {
}
