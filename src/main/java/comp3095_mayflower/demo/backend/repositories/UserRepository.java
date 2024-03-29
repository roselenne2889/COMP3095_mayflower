/**************************************************************************************************
 * Project: <COMP3095_mayflower>
 * Assignment: < assignment #3 >
 * Author(s): <Esther Kim, Beatriz Morales, Alan Pintor, Afsana Bilkis-Ritu>
 * Student Number: <101125413,101159722,101136369,101165654>
 * Date: 2020-12-06
 * Description: This is the repository for our user table. It is a CRUD repository, so it has built in
 functionality for creating, updating and deleting users. There are five custom methods defined here:
 findByEmail,findByPassword,findByRole,findById and findAllByRole, which will be used in
 various controllers.
 ***************************************************************************************************/

package comp3095_mayflower.demo.backend.repositories;
import comp3095_mayflower.demo.backend.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

   User findByEmail(String email);
   User findByPassword(String password);
   List <User> findByRole(String role);
   User findById(int id);
   List<User>findAllByRole(String role);
}

