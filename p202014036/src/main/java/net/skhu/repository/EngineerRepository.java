package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.Engineer;

public interface EngineerRepository extends JpaRepository<Engineer, Integer> {

    Engineer findByEngineerNo(String engineerNo);
    List<Engineer> findByName(String name);
    List<Engineer> findByNameStartsWith(String name);
    List<Engineer> findByRoleTitle(String name);
    List<Engineer> findByRoleTitleStartsWith(String name);
    List<Engineer> findAllByOrderByIdAsc();
    List<Engineer> findByOrderByName();
    List<Engineer> findByOrderByNameDesc();
    List<Engineer> findByRoleIdOrderByNameDesc(int id);

}
