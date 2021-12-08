package com.example.backend.repositories;

import example.entities.BankCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BankCardEntityRepository extends JpaRepository<BankCardEntity, Long> {

    BankCardEntity findByCardId (long cardId);

    BankCardEntity findAllByPAN (String PAN);

    BankCardEntity findByEmbossingName (String EmbossingName);

    List<BankCardEntity> findAllByCardExpiry (String CardExpiry);

    List<BankCardEntity> findAllByPublicId (String publicId);

    List<BankCardEntity> findAllByUserId (int userId);

}
