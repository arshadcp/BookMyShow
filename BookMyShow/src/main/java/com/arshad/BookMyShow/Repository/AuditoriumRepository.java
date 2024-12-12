package com.arshad.BookMyShow.Repository;

import com.arshad.BookMyShow.Model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium,Integer> {
    Auditorium getAuditoriumByName(String name);
}
