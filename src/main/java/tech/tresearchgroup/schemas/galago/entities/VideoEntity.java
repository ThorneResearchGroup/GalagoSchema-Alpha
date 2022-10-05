package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;
import tech.tresearchgroup.schemas.galago.enums.PlaybackQualityEnum;

import java.util.Date;

public class VideoEntity extends BasicFormObject implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private String title;

    private ImageEntity primaryImage;

    private String filePath;

    private PlaybackQualityEnum playbackQualityEnum;

    private Long views;

    public VideoEntity() {
    }

    public VideoEntity(@Deserialize("created") Date created,
                       @Deserialize("updated") Date updated,
                       @Deserialize("id") Long id,
                       @Deserialize("lockType") LockType lockType,
                       @Deserialize("title") String title,
                       @Deserialize("primaryImage") ImageEntity primaryImage,
                       @Deserialize("filePath") String filePath,
                       @Deserialize("playbackQualityEnum") PlaybackQualityEnum playbackQualityEnum,
                       @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
        this.title = title;
        this.primaryImage = primaryImage;
        this.filePath = filePath;
        this.playbackQualityEnum = playbackQualityEnum;
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
    public String getTitle() {
        return title;
    }

    @Serialize(order = 5)
    public ImageEntity getPrimaryImage() {
        return primaryImage;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getFilePath() {
        return filePath;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public PlaybackQualityEnum getPlaybackQualityEnum() {
        return playbackQualityEnum;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrimaryImage(ImageEntity primaryImage) {
        this.primaryImage = primaryImage;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setPlaybackQualityEnum(PlaybackQualityEnum playbackQualityEnum) {
        this.playbackQualityEnum = playbackQualityEnum;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
