package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;

import java.util.Date;

@Data
@NoArgsConstructor
public class LocationEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String name;

    private String latitude;

    private String longitude;

    private Long views;

    public LocationEntity(@Deserialize("created") Date created,
                          @Deserialize("updated") Date updated,
                          @Deserialize("id") Long id,
                          @Deserialize("name") String name,
                          @Deserialize("latitude") String latitude,
                          @Deserialize("longitude") String longitude,
                          @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.views = views;
    }

    @Serialize(order = 0)
    @SerializeNullable
    public Date getCreated() {
        return created;
    }

    @Serialize(order = 1)
    @SerializeNullable
    public Date getUpdated() {
        return updated;
    }

    @Serialize(order = 2)
    @SerializeNullable
    public Long getId() {
        return id;
    }

    @Serialize(order = 3)
    @SerializeNullable
    public String getName() {
        return name;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public String getLatitude() {
        return latitude;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getLongitude() {
        return longitude;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
