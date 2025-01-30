package com.MovieTicketBooking.MovieTicketBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MovieTicketBooking.MovieTicketBooking.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
