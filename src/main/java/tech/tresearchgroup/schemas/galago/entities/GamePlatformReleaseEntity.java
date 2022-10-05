package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;
import tech.tresearchgroup.schemas.galago.enums.GamePlatformEnum;

import java.util.Date;

public class GamePlatformReleaseEntity extends BasicFormObject implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private GamePlatformEnum platform;

    private String releaseDate;

    private Long views;

    public GamePlatformReleaseEntity() {
    }

    public GamePlatformReleaseEntity(@Deserialize("created") Date created,
                                     @Deserialize("updated") Date updated,
                                     @Deserialize("id") Long id,
                                     @Deserialize("lockType") LockType lockType,
                                     @Deserialize("platform") GamePlatformEnum platform,
                                     @Deserialize("releaseDate") String releaseDate,
                                     @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
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
    public LockType getLockType() {
        return lockType;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public GamePlatformEnum getPlatform() {
        return platform;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getReleaseDate() {
        return releaseDate;
    }

    @Serialize(order = 6)
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

    public void setPlatform(GamePlatformEnum platform) {
        this.platform = platform;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
