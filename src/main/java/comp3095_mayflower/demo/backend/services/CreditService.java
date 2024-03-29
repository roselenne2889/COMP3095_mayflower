/**************************************************************************************************
 * Project: <COMP3095_mayflower>
 * Assignment: < assignment #3 >
 * Author(s): <Esther Kim, Beatriz Morales, Alan Pintor, Afsana Bilkis-Ritu>
 * Student Number: <101125413,101159722,101136369,101165654>
 * Date: 2020-12-06
 * Description: This is the credit service class. The repository methods are defined here again so
 they can be used in the CreditServiceImpl class.
 ***************************************************************************************************/

package comp3095_mayflower.demo.backend.services;
import comp3095_mayflower.demo.backend.entities.CreditProfile;
import comp3095_mayflower.demo.backend.entities.User;
import java.util.List;
import java.util.Optional;

public interface CreditService {

  // List getCreditProfilesById(int id);
   Iterable<CreditProfile>findAllByUser_Id(int id);
   CreditProfile findByCardnum(int cardnum);
}
