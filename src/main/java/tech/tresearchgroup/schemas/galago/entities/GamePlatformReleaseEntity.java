package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.enums.GamePlatformEnum;

import java.util.Date;

@Data
@NoArgsConstructor
public class GamePlatformReleaseEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private GamePlatformEnum platform;

    private String releaseDate;

    private Long views;

    public GamePlatformReleaseEntity(@Deserialize("created") Date created,
                                     @Deserialize("updated") Date updated,
                                     @Deserialize("id") Long id,
                                     @Deserialize("platform") GamePlatformEnum platform,
                                     @Deserialize("releaseDate") String releaseDate,
                                     @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.platform = platform;
        this.releaseDate = releaseDate;
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
    public GamePlatformEnum getPlatform() {
        return platform;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public String getReleaseDate() {
        return releaseDate;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
