
package com.api.parking_control.repositories;

import com.api.parking_control.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kaio
 */

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{
    
}
