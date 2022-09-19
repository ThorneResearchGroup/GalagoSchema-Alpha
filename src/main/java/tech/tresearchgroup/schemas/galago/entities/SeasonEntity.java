package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.IntIgnoreZeroAdapter;

import java.util.Date;

@Data
@NoArgsConstructor
public class SeasonEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String name;

    private ImageEntity primaryImage;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int episodeCount;

    private Long views;

    public SeasonEntity(@Deserialize("created") Date created,
                        @Deserialize("updated") Date updated,
                        @Deserialize("id") Long id,
                        @Deserialize("name") String name,
                        @Deserialize("primaryImage") ImageEntity primaryImage,
                        @Deserialize("episodeCount") int episodeCount,
                        @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.name = name;
        this.primaryImage = primaryImage;
        this.episodeCount = episodeCount;
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
    public ImageEntity getPrimaryImage() {
        return primaryImage;
    }

    @Serialize(order = 5)
    public int getEpisodeCount() {
        return episodeCount;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
