package edu.miu.cs590.hoteldetailsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("Hotel")
public class HotelResponseDto implements Serializable {
    private UUID id;
    private String name;
    private String description;
    private String address;
    private String location;
    private String imageName;
    private String bucketName;
    private UUID userId;
    private String feature;
    private String amenity;
    private String cancellationPolicy;
    private String imageURL;
}
