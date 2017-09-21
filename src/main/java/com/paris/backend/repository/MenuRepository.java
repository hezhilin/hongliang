package com.paris.backend.repository;

import com.paris.backend.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("menuRepository")
public interface MenuRepository extends JpaRepository<Menu, Integer> {
    @Override
    List<Menu> findAll();
}
