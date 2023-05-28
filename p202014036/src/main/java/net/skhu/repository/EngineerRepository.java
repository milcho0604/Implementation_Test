package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.skhu.entity.Engineer;

public interface EngineerRepository extends JpaRepository<Engineer, Integer> {

    Engineer findByEngineerNo(String engineerNo);
    List<Engineer> findByRoleId(int roleId);
    List<Engineer> findByNameStartsWith(String name);
    List<Engineer> findByRoleTitle(String title);
    List<Engineer> findByRoleTitleStartsWith(String title);

    List<Engineer> findAllByOrderByIdAsc();
    List<Engineer> findByOrderByName();
    List<Engineer> findByOrderByNameDesc();

    // exam 4
    @Query("SELECT e FROM Engineer e JOIN e.assignment a WHERE a.project.id = :projectId")
    List<Engineer> findByProEngineer(int projectId);
    // exam 5
    @Query("SELECT e FROM Engineer e JOIN e.assignment a WHERE a.project.id = :projectId")
    List<Engineer>findByManaEngineer(int projectId);
}


