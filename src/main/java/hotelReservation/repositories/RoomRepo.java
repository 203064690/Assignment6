package hotelReservation.repositories;

/**
 * Assignment 6
 * Domain Driven Design
 * Dylan Baadjies
 * 203064690.
 */
import hotelReservation.domain.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepo extends CrudRepository<Room, Long>{
    Room delete(Long id);
    Room findOne(Long id);
}
