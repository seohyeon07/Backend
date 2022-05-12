package com.j.bizcard.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface BizCardRepository extends MongoRepository<BizCard, String>{}
