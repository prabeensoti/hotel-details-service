package edu.miu.cs590.hoteldetailsservice.dto;

import edu.miu.cs590.hoteldetailsservice.model.Hotel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@RedisHash("hotelRoom")
public class HotelRoomResponseDto implements Serializable {
    Hotel hotel;
    List<RoomResponseDto> rooms;

}
