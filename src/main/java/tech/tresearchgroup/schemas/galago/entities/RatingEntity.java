package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;
import tech.tresearchgroup.schemas.galago.IntIgnoreZeroAdapter;
import tech.tresearchgroup.schemas.galago.enums.MediaTypeEnum;

import java.util.Date;

public class RatingEntity extends BasicFormObject implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private Long user;

    private MediaTypeEnum mediaType;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private Long mediaId;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int value;

    private Long views;

    public RatingEntity() {
    }

    public RatingEntity(@Deserialize("created") Date created,
                        @Deserialize("updated") Date updated,
                        @Deserialize("id") Long id,
                        @Deserialize("lockType") LockType lockType,
                        @Deserialize("user") Long user,
                        @Deserialize("mediaType") MediaTypeEnum mediaType,
                        @Deserialize("mediaId") Long mediaId,
                        @Deserialize("value") int value,
                        @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
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
    public LockType getLockType() {
        return lockType;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public Long getUser() {
        return user;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public MediaTypeEnum getMediaType() {
        return mediaType;
    }

    @Serialize(order = 6)
    public Long getMediaId() {
        return mediaId;
    }

    @Serialize(order = 7)
    public int getValue() {
        return value;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public Long getViews() {
        return views;
    }

    @Override
    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setLockType(LockType lockType) {
        this.lockType = lockType;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public void setMediaType(MediaTypeEnum mediaType) {
        this.mediaType = mediaType;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
