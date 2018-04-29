package hotelReservation.services;

import hotelReservation.domain.ServicesAndAddOns;

import java.util.List;

/**
 * Assignment 6
 * Domain Driven Design
 * Dylan Baadjies
 * 203064690.
 */
public interface ServicesAndAddOnsService {
    public List<ServicesAndAddOns> getAllServicesAndAddOns();
    public boolean createServicesAndAddOns(int serv_extras_id, String extraName, double extraPrice);
    public boolean updateServicesAndAddOns(int serv_extras_id, String extraName, double extraPrice);
    public boolean deleteServicesAndAddOns(int serv_extras_id);
}
