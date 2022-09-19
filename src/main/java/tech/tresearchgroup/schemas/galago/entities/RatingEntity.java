package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.IntIgnoreZeroAdapter;
import tech.tresearchgroup.schemas.galago.enums.MediaTypeEnum;

import java.util.Date;

@Data
@NoArgsConstructor
public class RatingEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private Long user;

    private MediaTypeEnum mediaType;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private Long mediaId;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int value;

    private Long views;

    public RatingEntity(@Deserialize("created") Date created,
                        @Deserialize("updated") Date updated,
                        @Deserialize("id") Long id,
                        @Deserialize("user") Long user,
                        @Deserialize("mediaType") MediaTypeEnum mediaType,
                        @Deserialize("mediaId") Long mediaId,
                        @Deserialize("value") int value,
                        @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.user = user;
        this.mediaType = mediaType;
        this.mediaId = mediaId;
        this.value = value;
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
    public Long getUser() {
        return user;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public MediaTypeEnum getMediaType() {
        return mediaType;
    }

    @Serialize(order = 5)
    public Long getMediaId() {
        return mediaId;
    }

    @Serialize(order = 6)
    public int getValue() {
        return value;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
